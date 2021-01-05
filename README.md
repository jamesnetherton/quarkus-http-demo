Demo app to show how Quarkus RESTEasy can impact other routes configured on the Vert.x Web router.

Observe the Vert.x router configuration in class `RouterConfig` and unit test in `VertxWebRouteTest`.

1. Run project tests `mvn clean test`. Note the incorrect status code `404`. It should be `415`.
2. Remove the `@Path` annotation from `GreetingResource`. Rerun tests `mvn clean test`. Note this time tests pass since the status code was the expected `415`.
