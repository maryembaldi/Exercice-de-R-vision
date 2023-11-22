import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatients;

    public Hopital() {
        this.medecinPatients = new TreeMap<>(Comparator.comparing(Medecin::getNom));
    }

    public void ajouterMedecin(Medecin m) {

        medecinPatients.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatients.containsKey(m)) {
            medecinPatients.get(m).ajouterPatient(p);
        } else {
            ListPatients newListPatients = new ListPatients();
            newListPatients.ajouterPatient(p);
            medecinPatients.put(m, newListPatients);
        }
    }

    public void afficherMap() {
        medecinPatients.forEach((medecin, patients) -> {
            System.out.println("Medecin: " + medecin);
            patients.afficherPatients();
            System.out.println();
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        if (medecinPatients.containsKey(m)) {
            System.out.println("Patients du medecin " + m.getNom() + ":");
            medecinPatients.get(m).afficherPatients();
        } else {
            System.out.println("Ce medecin n'existe pas dans l'hopital.");
        }
    }
}
