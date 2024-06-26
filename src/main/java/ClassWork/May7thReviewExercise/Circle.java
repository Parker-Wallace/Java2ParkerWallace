package ClassWork.May7thReviewExercise;


/**
 * @author Parker Wallace
 */
class Circle extends Shape {
    Double radius;
    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    String getDescription() {
        return String.format("Circle with radius %.2f and area %.2f", this.radius, this.area());
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
