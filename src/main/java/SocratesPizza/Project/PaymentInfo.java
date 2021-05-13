package SocratesPizza.Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentInfo {
    @Id
    private int cardNumber;

    private String payerName;
    private String cardName;
    private int securityNum;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getSecurityNum() {
        return securityNum;
    }

    public void setSecurityNum(int securityNum) {
        this.securityNum = securityNum;
    }
}
