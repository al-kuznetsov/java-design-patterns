package practice.decorator.validation;

public class RouteDto {
    private String destinationPointCode;
    private String originPointCode;

    public RouteDto(String destinationPointCode, String originPointCode) {
        this.destinationPointCode = destinationPointCode;
        this.originPointCode = originPointCode;
    }

    public String getDestinationPointCode() {
        return destinationPointCode;
    }

    public void setDestinationPointCode(String destinationPointCode) {
        this.destinationPointCode = destinationPointCode;
    }

    public String getOriginPointCode() {
        return originPointCode;
    }

    public void setOriginPointCode(String originPointCode) {
        this.originPointCode = originPointCode;
    }
}
