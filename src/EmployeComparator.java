import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        int cmpNom = e1.getNom().compareToIgnoreCase(e2.getNom());
        if (cmpNom != 0) return cmpNom;

        int cmpDep = e1.getNomDepartement().compareToIgnoreCase(e2.getNomDepartement());
        if (cmpDep != 0) return cmpDep;

        return Integer.compare(e1.getGrade(), e2.getGrade());
    }
}
