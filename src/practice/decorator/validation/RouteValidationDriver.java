package practice.decorator.validation;

import java.util.List;

public class RouteValidationDriver {

    public static void main(String[] args) {
        RouteDto route1 = new RouteDto("Jaga destination", null);

        RouteValidator routeValidator = new LooseRouteValidator();

        List<String> errors = routeValidator.validate(route1);

        // Loose validator passes OK
        System.out.println(errors.isEmpty() ? "Route validated successfully" : "Route validation " +
                "failed with errors: " + errors);

        routeValidator = new StrictRouteValidator((LooseRouteValidator) routeValidator);

        errors = routeValidator.validate(route1);

        // Validator that decorates Loose validator with String validator fails as expected
        System.out.println(errors.isEmpty() ? "Route validated successfully" : "Route validation " +
                "failed with errors: " + errors);

    }
}
