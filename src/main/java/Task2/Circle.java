package Task2;

import java.util.List;

public class Circle {
    private Float centerx;
    private Float centery;
    private Float radius;
    private List<Float> coordinatesx;
    private List<Float> coordinatesy;

    public Circle(Float centerx, Float centery, Float radius) {
        this.centerx = centerx;
        this.centery = centery;
        this.radius = radius;
    }

    public List<Float> getCoordinatesx() {
        return coordinatesx;
    }

    public void setCoordinatesx(List<Float> coordinatesx) {
        this.coordinatesx = coordinatesx;
    }

    public List<Float> getCoordinatesy() {
        return coordinatesy;
    }

    public void setCoordinatesy(List<Float> coordinatesy) {
        this.coordinatesy = coordinatesy;
    }

    public Float getCenterx() {
        return centerx;
    }

    public void setCenterx(Float centerx) {
        this.centerx = centerx;
    }

    public Float getCentery() {
        return centery;
    }

    public void setCentery(Float centery) {
        this.centery = centery;
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }
}
