import java.util.ArrayList;
import java.util.Collections;

public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> liste = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        liste.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : liste) {
            if (e.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return liste.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        liste.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : liste)
            System.out.println(e);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(liste); // utilise compareTo()
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(liste, new EmployeComparator());
    }
}
