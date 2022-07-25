package autotests.helpers;

import autotests.owner.BrowserstackKeys;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class BrowserStack {


    public static String videoUrl(String sessionId) {
        BrowserstackKeys config = ConfigFactory.create(BrowserstackKeys.class);
        String username = config.username();
        String access_key = config.access_key();
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(username,access_key)
                .log().all()
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}
