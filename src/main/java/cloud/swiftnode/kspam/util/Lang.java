package cloud.swiftnode.kspam.util;

import org.bukkit.ChatColor;

import java.text.MessageFormat;

/**
 * Created by EntryPoint on 2016-12-17.
 */
public enum Lang {
    PREFIX("&c&l[ K-SPAM ] &f"),
    INTRO("\n" +
            "#                                                                  \n" +
            "#                                                                  \n" +
            "#  `7MMF' `YMM'      .M\"\"\"bgd   `7MM\"\"\"Mq.   db      `7MMM.    ,MMF'\n" +
            "#    MM   .M'       ,MI    \"Y    MM   `MM. ;MM:       MMMb   dPMM  \n" +
            "#    MM .d\"         `MMb.       MM   ,M9 ,V^MM.      M YM  ,M MM  \n" +
            "#    MMMMM.           `YMMNq.   MMmmdM9 ,M  `MM      M  Mb  M' MM  \n" +
            "#    MM  VMA        .     `MM   MM      AbmmmqMA     M  YM.P'  MM  \n" +
            "#    MM   `MM.      Mb     dM   MM     A'      VML    M  `YM'   MM  \n" +
            "#  .JMML.   MMb.    P\"Ybmmd\"  .JMML. .AMA.   .AMMA..JML. `'  .JMML.\n" +
            "#                                                                  \n\n" +
            " &c&l[K-SPAM Community Edition]\n"),
    ERROR("정보 조회 중 에러가 발생했습니다. 검증받지 못한 플레이어들: &e{0}\n" +
            "&f본 메세지를 끄려면 /kspam 명령어를 입력해주세요."),
    SWITCH("&e{0} &f로 설정했습니다."),
    NO_PERM("권한이 없습니다."),
    KICKED("&e{0} &f님이 차단되었습니다."),
    KICK("당신의 아이피는 K-SPAM 블랙리스트에 추가되어 있어 \n" +
            "본 서버에 접속하실 수 없습니다.");
    private final String msg;

    Lang(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(Object... value) {
        return ChatColor.translateAlternateColorCodes('&',
                MessageFormat.format(msg, value));
    }
}