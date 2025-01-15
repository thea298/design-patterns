package creational.prototype;

import java.util.Date;

public class DeathCertificate extends Certificate{
    public Date deathDate;

    public DeathCertificate(String fullName, Date issueDate, Date expiryDate, String officer) {
        super(fullName, issueDate, expiryDate, officer, officer);
        this.setType("Death");
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    @Override
    public String toString() {
        return "DeathCertificate [deathDate=" + deathDate + "]";
    }

}
