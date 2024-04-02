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
        if (width < 0){
            this.width = 0;
        } else{
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }
}
