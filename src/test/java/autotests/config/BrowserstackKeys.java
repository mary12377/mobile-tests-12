package autotests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local.properties"
})
public class BrowserstackKeys implements Config {
     public String username() ;

    public String access_key();

    String project() ;

    String build() ;


    String name() ;


    String app() ;


    String device() ;


    String osVersion();


    String baseUrl() ;

}
