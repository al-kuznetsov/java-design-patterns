package practice.decorator.validation;

import java.util.List;

public interface RouteValidator {

    /**
     * Return a list of error messages
     *
     * @param routeDto input entity to validate
     * @return a list of error messages
     */
    List<String> validate(RouteDto routeDto);
}
