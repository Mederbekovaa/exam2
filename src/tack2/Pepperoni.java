package tack2;

public class Pepperoni {
    private int price;
    private double weight;
    public Pepperoni(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }


    public static void cook(){
        System.out.println("Готовится пицца № 1 (не острая)" );
    }

    public static void cookSpicy(){
        System.out.println("Готовится пицца № 1 (острая)");
    }


    public void deliver(){
        System.out.println("Пицца: Пипперони" + "\nВес: " + weight + " грамм" +
                "\nЦена: " + price);
        System.out.println("Пицца будет доставлена! ");
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Пицца: Пипперони" + "\nВес: " + weight + " грамм" +
                "\nЦена: " + price;
    }
}

