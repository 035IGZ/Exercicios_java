package entities;

public class Rectangle {
    public double Width;
    public double Height;

    public double area(){
        return Width * Height;
    }
    public double perimeter(){
        return 2 * (Width + Height);
    }
    public double diagonal(){
        return Math.sqrt((Width * Width) + (Height * Height));
    }
    public String toString() {
        return "AREA = "
                + String.format("%.2f", area())
                + "\nPERIMETER = "
                + String.format("%.2f", perimeter())
                + "\nDIAGONAL = "
                + String.format("%.2f", diagonal());
    }
}
