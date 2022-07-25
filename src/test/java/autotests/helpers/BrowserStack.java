package autotests.helpers;

import autotests.owner.BrowserstackKeys;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class BrowserStack {

    static BrowserstackKeys config = ConfigFactory.create(BrowserstackKeys.class, System.getProperties());

    public static String
            login = config.login(),
            password = config.password();

    public static String videoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(login,password)
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
