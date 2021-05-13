package SocratesPizza.Project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CrustInfo {
    @Id
    private int crustId;

    private String crustFlavor;

    public int getCrustId() {
        return crustId;
    }

    public void setCrustId(int crustId) {
        this.crustId = crustId;
    }

    public String getCrustFlavor() {
        return crustFlavor;
    }

    public void setCrustFlavor(String crustFlavor) {
        this.crustFlavor = crustFlavor;
    }
}
