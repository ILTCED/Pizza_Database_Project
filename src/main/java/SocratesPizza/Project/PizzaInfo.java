package SocratesPizza.Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PizzaInfo {

    @Id
    private int pizzaId;

    private String pizzaName;
    private double pizzaPrice;

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
}
