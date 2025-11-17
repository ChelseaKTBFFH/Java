public class Departement implements Comparable<Departement> {
    private int id;
    private String nom;

    public Departement() {}

    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    @Override
    public int compareTo(Departement d) {
        return Integer.compare(this.id, d.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return id == that.id && nom.equalsIgnoreCase(that.nom);
    }

    @Override
    public int hashCode() {
        return id + nom.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ", nom='" + nom + '\'' + '}';
    }
}
