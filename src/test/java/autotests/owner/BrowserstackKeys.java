package autotests.owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:config/local.properties"
})
public class BrowserstackKeys extends Config {

    String username();
    String access_key();
    String project();
    String build();
    String name();
    String app();
    String device();
    String osVersion();
    String baseUrl();

}
