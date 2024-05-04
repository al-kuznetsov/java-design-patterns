package practice.decorator.validation;

import java.util.ArrayList;
import java.util.List;

public class LooseRouteValidator implements RouteValidator {
    @Override
    public List<String> validate(RouteDto routeDto) {
        List<String> errors = new ArrayList<>();
        if (routeDto.getDestinationPointCode() == null || routeDto.getDestinationPointCode().isBlank()) {
            errors.add("You must provide a non-blank destination point code.");
        }
        return errors;
    }
}
