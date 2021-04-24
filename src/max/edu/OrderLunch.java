package max.edu;/*
@USER: Java02
@DATE: 24.04.2021
@NAME: OrderLunch
*/

public class OrderLunch implements IBill{
    private String saladName;
    private Integer saladPrice;
    private String firstDish;
    private Integer firstDishPrice;
    private String secondDish;
    private Integer secondDishPrice;
    private String dessertName;
    private Integer dessertNamePrice;

    public OrderLunch() {
    }

    public OrderLunch(String saladName, Integer saladPrice, String firstDish, Integer firstDishPrice, String secondDish,
                      Integer secondDishPrice, String dessertName, Integer dessertNamePrice) {
        this.saladName = saladName;
        this.saladPrice = saladPrice;
        this.firstDish = firstDish;
        this.firstDishPrice = firstDishPrice;
        this.secondDish = secondDish;
        this.secondDishPrice = secondDishPrice;
        this.dessertName = dessertName;
        this.dessertNamePrice = dessertNamePrice;
    }

    public String getSaladName() {
        return saladName;
    }

    public void setSaladName(String saladName) {
        this.saladName = saladName;
    }

    public Integer getSaladPrice() {
        return saladPrice;
    }

    public void setSaladPrice(Integer saladPrice) {
        this.saladPrice = saladPrice;
    }

    public String getFirstDish() {
        return firstDish;
    }

    public void setFirstDish(String firstDish) {
        this.firstDish = firstDish;
    }

    public Integer getFirstDishPrice() {
        return firstDishPrice;
    }

    public void setFirstDishPrice(Integer firstDishPrice) {
        this.firstDishPrice = firstDishPrice;
    }

    public String getSecondDish() {
        return secondDish;
    }

    public void setSecondDish(String secondDish) {
        this.secondDish = secondDish;
    }

    public Integer getSecondDishPrice() {
        return secondDishPrice;
    }

    public void setSecondDishPrice(Integer secondDishPrice) {
        this.secondDishPrice = secondDishPrice;
    }

    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    public Integer getDessertNamePrice() {
        return dessertNamePrice;
    }

    public void setDessertNamePrice(Integer dessertNamePrice) {
        this.dessertNamePrice = dessertNamePrice;
    }

    @Override
    public String toString() {
        return "OrderLunch{" +
                "saladName='" + saladName + '\'' +
                ", saladPrice=" + saladPrice +
                ", firstDish='" + firstDish + '\'' +
                ", firstDishPrice=" + firstDishPrice +
                ", secondDish='" + secondDish + '\'' +
                ", secondDishPrice=" + secondDishPrice +
                ", dessertName='" + dessertName + '\'' +
                ", dessertNamePrice=" + dessertNamePrice +
                '}';
    }

    @Override
    public Integer getBill() {
        return this.getDessertNamePrice()
                + this.getSaladPrice()
                + this.getFirstDishPrice()
                + this.getSecondDishPrice()
                + this.getDessertNamePrice()
                + 20;
    }
}
