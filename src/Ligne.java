public class Ligne {
        private int numero;
        private int quantite;
        private Produit produit;

        public Ligne(int numero, int quantite, Produit produit) {
                this.numero = numero;
                this.quantite = quantite;
                this.produit = produit;
        }

        public int getNumero() {
                return numero;
        }

        public void setNumero(int numero) {
                this.numero = numero;
        }

        public int getQuantite() {
                return quantite;
        }

        public void setQuantite(int quantite) {
                this.quantite = quantite;
        }

        public Produit getProduit() {
                return produit;
        }

        public void setProduit(Produit produit) {
                this.produit = produit;
        }

        public double getPrixTotal(){
                return produit.getPrix() * getQuantite();
        }

        @Override
        public String toString() {
                return "Ligne{" +
                        "numero=" + numero +
                        ", quantite=" + quantite +
                        ", produit=" + produit +
                        '}';
        }
}
