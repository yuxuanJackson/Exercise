package experiment3_10_13;

public class Ring {
    int innerRadius;
    int outerRadius;
    String color;
    static double PI;
    static int num;


    public int getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(int innerRadius) {
        this.innerRadius = innerRadius;
    }

    public int getOuterRadius() {
        return outerRadius;
    }

    public void setOuterRadius(int outerRadius) {
        this.outerRadius = outerRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ring(int innerRadius, int outerRadius, String color) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        this.color = color;
    }

    public Ring() {
    }

    public double getArea() {
        return 3.14 * (outerRadius * outerRadius - innerRadius * innerRadius);
    }

    public static void setPI(double PI) {
        Ring.PI = PI;
    }
    public static int displaynum(int num){
        return num;
    }
}
