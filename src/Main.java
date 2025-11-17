public class Main {
    public static void main(String[] args) {

        // Gestion des employés
        SocieteArrayList societe = new SocieteArrayList();
        Employe e1 = new Employe(1, "Ali", "Karoui", "IT", 3);
        Employe e2 = new Employe(3, "Sana", "Ben Ali", "RH", 2);
        Employe e3 = new Employe(2, "Ali", "Salah", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste initiale des employés :");
        societe.displayEmploye();

        System.out.println("\nTri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTri par Nom, Département, Grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // Gestion des départements
        DepartementHashSet depHash = new DepartementHashSet();
        Departement d1 = new Departement(2, "IT");
        Departement d2 = new Departement(1, "RH");
        Departement d3 = new Departement(3, "Finance");

        depHash.ajouterDepartement(d1);
        depHash.ajouterDepartement(d2);
        depHash.ajouterDepartement(d3);

        System.out.println("\nListe des départements :");
        depHash.displayDepartement();

        System.out.println("\nDépartements triés par ID :");
        for (Departement d : depHash.trierDepartementById()) {
            System.out.println(d);
        }
    }
}
