package tack2;

import tack3.Art;
import tack3.Books;

public class Margarita  {
    private int price;
    private double weight;
    public Margarita(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }


    public void cookWithMeat(){
        System.out.println("Готовится пицца №2 (Маргарита с мясом)");
    }

    public void cookWithoutMeat(){
        System.out.println("Готовится пицца №2 (Маргарита без мяса) ");
    }


    public void deliver(){
        System.out.println("Пицца: Маргарита" + "\nВес: " + weight + " грамм" +
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





