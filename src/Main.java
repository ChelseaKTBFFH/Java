public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ali", "Karoui", "IT", 3);
        Employe e2 = new Employe(3, "Sana", "Ben Ali", "RH", 2);
        Employe e3 = new Employe(2, "Ali", "Salah", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println(" Liste initiale : ");
        societe.displayEmploye();

        System.out.println("\n Tri par ID : ");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n Tri par Nom, Département, Grade : ");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}
