package tack2;

public class LaFinta {
    private int price;
    private double weight;
    public LaFinta(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }


    public void cookWithMushrooms(){
        System.out.println("Готовится пицца №3 (Ла-Финта с грибами)");
    }

    public void cookWithoutMushrooms(){
        System.out.println("Готовится пицца №3 (Ла-ФИнта без грибов)");
    }


    public void deliver(){
        System.out.println("Пицца : Ла-Финта" + "\nВес: " + weight + "грамм" +
                "\nЦена: " + price );
        System.out.println("Пицца будет доставлена ! ");
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
        return "Пицца: Ла-Финта" + "\nВес: " + weight + " грамм" +
                "\nЦена: " + price;
    }
}

