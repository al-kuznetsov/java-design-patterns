package practice.decorator.validation;

import java.util.List;

public class StrictRouteValidator implements RouteValidator {
    private LooseRouteValidator looseRouteValidator;

    public StrictRouteValidator(LooseRouteValidator looseRouteValidator) {
        this.looseRouteValidator = looseRouteValidator;
    }

    @Override
    public List<String> validate(RouteDto routeDto) {
        List<String> errors = looseRouteValidator.validate(routeDto);

        if (routeDto.getOriginPointCode() == null || routeDto.getOriginPointCode().isBlank()) {
            errors.add("You must provide a non-blank origin point code.");
        }
        return errors;
    }
}
