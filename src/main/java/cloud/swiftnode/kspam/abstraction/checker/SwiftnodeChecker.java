package cloud.swiftnode.kspam.abstraction.checker;

import cloud.swiftnode.kspam.abstraction.SpamChecker;
import cloud.swiftnode.kspam.abstraction.deniable.DeniableInfoAdapter;
import cloud.swiftnode.kspam.util.Static;
import cloud.swiftnode.kspam.util.Tracer;
import cloud.swiftnode.kspam.util.URLs;

import java.net.URL;

/**
 * Created by EntryPoint on 2016-12-30.
 */
public class SwiftnodeChecker extends SpamChecker {
    public SwiftnodeChecker(DeniableInfoAdapter adapter) {
        super(adapter);
    }

    @Override
    public Tracer.Result check() throws Exception {
        URL url = URLs.COMMUNITY_API.toUrl(adapter.getIp());
        String text = Static.readAllText(url);
        if (text.contains("true")) {
            adapter.caching();
            return Tracer.Result.DENY;
        } else if (text.contains("false")) {
            return Tracer.Result.PASS;
        }
        return Tracer.Result.ERROR;
    }

    @Override
    public String name() {
        return "SwiftnodeChecker";
    }
}
