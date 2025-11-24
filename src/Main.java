public class Main {
    public static void main(String[] args) {


        SocieteArrayList societe = new SocieteArrayList();
        Employe e1 = new Employe(1, "Ali", "Karoui", "IT", 3);
        Employe e2 = new Employe(3, "Sana", "Ben Ali", "RH", 2);
        Employe e3 = new Employe(2, "Ali", "Salah", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("===== LISTE INITIALE DES EMPLOYES =====");
        societe.displayEmploye();

        System.out.println("\n===== TRI PAR ID =====");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n===== TRI PAR NOM, DEPARTEMENT, GRADE =====");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();


        // ============================================
        //     GESTION DES DEPARTEMENTS (HashSet)
        // ============================================
        DepartementHashSet depHash = new DepartementHashSet();
        Departement d1 = new Departement(2, "IT");
        Departement d2 = new Departement(1, "RH");
        Departement d3 = new Departement(3, "Finance");

        depHash.ajouterDepartement(d1);
        depHash.ajouterDepartement(d2);
        depHash.ajouterDepartement(d3);

        System.out.println("\n===== LISTE DES DEPARTEMENTS =====");
        depHash.displayDepartement();

        System.out.println("\n===== DEPARTEMENTS TRIES PAR ID =====");
        for (Departement d : depHash.trierDepartementById()) {
            System.out.println(d);
        }


        System.out.println("\n===== AFFECTATION DES EMPLOYES AUX DEPARTEMENTS =====");

        AffectationHashMap affect = new AffectationHashMap();

        affect.ajouterEmployeDepartement(e1, d1);
        affect.ajouterEmployeDepartement(e2, d2);
        affect.ajouterEmployeDepartement(e3, d1);

        System.out.println("\n--- Affichage initial des affectations ---");
        affect.afficherEmployesEtDepartements();

        // TEST: ajouter le même employé dans un autre département
        affect.ajouterEmployeDepartement(e1, d3);

        System.out.println("\n--- Après modification du département de e1 ---");
        affect.afficherEmployesEtDepartements();

        // Test des méthodes supplémentaires
        System.out.println("\n===== RECHERCHE =====");
        System.out.println("Employe e2 existe ? " + affect.rechercherEmploye(e2));
        System.out.println("Departement Finance existe ? " + affect.rechercherDepartement(d3));

        System.out.println("\n===== LISTE DES EMPLOYES SEULEMENT =====");
        affect.afficherEmployes();

        System.out.println("\n===== LISTE DES DEPARTEMENTS SEULEMENT =====");
        affect.afficherDepartements();

        // Test suppression
        System.out.println("\n===== SUPPRESSION e3 =====");
        affect.supprimerEmploye(e3);
        affect.afficherEmployesEtDepartements();

        System.out.println("\n===== TRI DE LA MAP PAR ID D’EMPLOYE =====");
        for (var entry : affect.trierMap().entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        System.out.println("\n===== FIN DU PROGRAMME =====");
    }
}
