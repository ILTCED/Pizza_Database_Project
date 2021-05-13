package SocratesPizza.Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToppingsInfo {
        @Id
        private int toppingId;

        private String toppingName;
        private int toppingPrice;

        public int getToppingId() {
                return toppingId;
        }

        public void setToppingId(int toppingId) {
                this.toppingId = toppingId;
        }

        public String getToppingName() {
                return toppingName;
        }

        public void setToppingName(String toppingName) {
                this.toppingName = toppingName;
        }

        public int getToppingPrice() {
                return toppingPrice;
        }

        public void setToppingPrice(int toppingPrice) {
                this.toppingPrice = toppingPrice;
        }
}
