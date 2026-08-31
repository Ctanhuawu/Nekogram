package tw.nekomimi.nekogram;

import org.telegram.messenger.BuildConfig;

import java.util.List;

import tw.nekomimi.nekogram.helpers.UserHelper;
import tw.nekomimi.nekogram.helpers.remote.ConfigHelper;

public class Extra {

    public static int APP_ID = BuildConfig.API_ID;
    public static String APP_HASH = BuildConfig.API_HASH;

    public static final String PLAYSTORE_APP_URL = "";

    public static String WS_USER_AGENT = "";
    public static String WS_CONN_HASH = "";
    public static String WS_DEFAULT_DOMAIN = "";

    public static String TWPIC_BOT_USERNAME = null;

    public static boolean FORCE_ANALYTICS = "play".equals(BuildConfig.BUILD_TYPE);

    public static String TLV_URL = "";

    private static final UserHelper.BotInfo HELPER_BOT = new UserHelper.BotInfo() {
        @Override
        public long getId() {
            return BuildConfig.HELPER_BOT_ID;
        }

        @Override
        public String getUsername() {
            return BuildConfig.HELPER_BOT_USERNAME;
        }
    };

    public static UserHelper.BotInfo getHelperBot() {
        if (BuildConfig.HELPER_BOT_USERNAME == null || BuildConfig.HELPER_BOT_USERNAME.isEmpty()) {
            return null;
        }
        return HELPER_BOT;
    }

    public static UserHelper.UserInfoBot getUserInfoBot(boolean fallback) {
        return null;
    }

    public static boolean isDirectApp() {
        return "release".equals(BuildConfig.BUILD_TYPE) || "debug".equals(BuildConfig.BUILD_TYPE);
    }

    public static List<ConfigHelper.News> getDefaultNews() {
        return null;
    }

    public static boolean isTrustedBot(long id) {
        return id != 0 && id == BuildConfig.HELPER_BOT_ID;
    }
}
