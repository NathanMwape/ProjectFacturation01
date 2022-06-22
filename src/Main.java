/**
 * Membres du groupe
 *
 * BATINGALA JOSUE JOSUE MSI
 * BAKARI MWEZI LEVI MSI
 * MPETI MWAPE NATHAN SI
 * MALENG A TSHIMWANG MARC MSI
 * NGOIE MBUYA ORNELLA MSI
 * NTONDA LOBE WIGHENS MSI
 * NZINGA SHIKAY MANASSE MSI
 * PAUL LWINGA PAUL MSI
 * KYANDA KIBOKO ALLIANCE MSI
 */


public class Main {
    public static void main(String[] args) {

        Ligne ligne1 = new Ligne(23,4,(new Produit<>("001","chocola",2010.0,"kg",01/03/2022)));
        Ligne ligne2 = new Ligne(12,10,(new Produit<>("012","Simba",5000,"cl",01/03/2022)));


        Detail detail= new Detail();

        detail.lignes.add(ligne1);
        detail.lignes.add(ligne2);



    }
}
