package cloud.swiftnode.kspam.storage;

import cloud.swiftnode.kspam.util.Result;
import cloud.swiftnode.kspam.util.Static;
import cloud.swiftnode.kspam.util.Type;

import java.net.InetAddress;

/**
 * Created by EntryPoint on 2016-12-20.
 */
public class SpamStorage {
    private Result result;
    private Type type;
    private String ip;

    public SpamStorage(Result result, String ip) {
        this.result = result;
        this.ip = ip;
    }

    public SpamStorage(Result result, InetAddress addr) {
        this(result, Static.convertToIp(addr));
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        if (result != Result.ERROR) {
            this.result = result;
        }
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
