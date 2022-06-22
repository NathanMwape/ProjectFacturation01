import java.util.concurrent.atomic.AtomicReference;

public class DocumentCommercial {
    private long numero;
    private Client client;
    private Detail detail;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public double getTotal(){
        AtomicReference<Double> somme = new AtomicReference<>(0.0);
         detail.lignes.forEach(ligne -> somme.updateAndGet(v -> (double) (v + ligne.getPrixTotal())));
        return somme.get();
    }

    public double getTVA(){
        return (getTotal() * 16) / 100;
    }

    @Override
    public String toString() {
        return "DocumentCommercial{" +
                "numero=" + this.numero +
                ", client=" + this.client +
                ", detail=" + this.detail +
                '}';
    }
}

