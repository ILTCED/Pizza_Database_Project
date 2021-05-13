package SocratesPizza.Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DrinkInfo {
    @Id
    private int drinkId;

    private int drinkPrice;
    private String drinkName;

    public int getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(int drinkId) {
        this.drinkId = drinkId;
    }

    public int getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(int drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }
}
