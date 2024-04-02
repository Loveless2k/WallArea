public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = Math.max(width, 0); // Utiliza Math.max para garantizar un valor no negativo.
        this.height = Math.max(height, 0); // Aplica el mismo principio para la altura.
    }

    public double getArea(){
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }
}
