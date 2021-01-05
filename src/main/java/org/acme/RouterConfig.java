package org.acme;

import io.vertx.ext.web.Router;

import javax.enterprise.event.Observes;

public class RouterConfig {

    public void init (@Observes Router router) {
        router.post("/test")
                .consumes("application/json")
                .produces("application/json")
                .handler(context -> context.response().end("{\"message\": \"Hello World\"}"));
    }
}
