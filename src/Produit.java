import java.util.Date;

public class Produit <T>{
    private String code;
    private String designation;
    private double prix;
    private T uniteMesure;
    private Date dateExpiration;

    public Produit(String code, String designation, double prix, T uniteMesure, Date dateExpiration) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.uniteMesure = uniteMesure;
        this.dateExpiration = dateExpiration;
    }

    public Produit() {}

    public Produit(String code, String chocola, double prix, String kg, int i) {
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public T getUniteMesure() {
        return uniteMesure;
    }

    public void setUniteMesure(T uniteMesure) {
        this.uniteMesure = uniteMesure;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "code='" + code + '\'' +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                ", uniteMesure=" + uniteMesure +
                ", dateExpiration=" + dateExpiration +
                '}';
    }
}
