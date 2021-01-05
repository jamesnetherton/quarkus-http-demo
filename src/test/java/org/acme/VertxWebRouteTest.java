package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class VertxWebRouteTest {

    @Test
    public void testNoContentTypeReturnsUnsupportedMediaType() {
        given()
          .when()
                .post("/test")
          .then()
             .statusCode(415);
    }
}