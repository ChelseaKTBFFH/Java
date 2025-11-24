import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private HashMap<Employe, Departement> map = new HashMap<>();

    // Instruction 2
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d);
    }

    // Instruction 3
    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }

    // Instruction 4
    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    // Instruction 5
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        }
    }

    // Instruction 6
    public void afficherEmployes() {
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }

    // Instruction 7
    public void afficherDepartements() {
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }

    // Instruction 8
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    // Instruction 9
    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

    // Instruction 10
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(map);
    }
}
