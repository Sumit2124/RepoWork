package dsapracticestart;

public class Pen
{
    String color;
    int price;

    public Pen(String color,int price) {
        this.color = color;
        this.price=price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Pen pen1=new Pen("blue",10);
        Pen pen2=new Pen("blue",10);
        boolean b = pen1.equals(pen2);
        System.out.println(b);
    }
}
