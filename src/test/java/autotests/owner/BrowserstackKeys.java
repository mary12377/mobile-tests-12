package autotests.owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local.properties"
})
public interface BrowserstackKeys extends Config {

    String login();

    String password();

    String project();

    String build();

    String name();

    String app();

    String device();

    String osVersion();

    String baseUrl();

}
