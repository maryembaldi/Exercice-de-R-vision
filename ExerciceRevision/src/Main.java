
public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient(122, "Maryem", "Baldi", 265);
        Patient patient2 = new Patient(123, "Zayneb", "Yaich", 8911);
        Patient patient3 = new Patient(125, "Yecine", "yaich", 3113);

        Medecin medecin1 = new Medecin(1, "Dr.ali", "Amine", 1001);
        Medecin medecin2 = new Medecin(202, "Dr.chehid", "Ahmed", 1002);

        Hopital hopital = new Hopital();
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);

        hopital.ajouterPatient(medecin1, patient1);
        hopital.ajouterPatient(medecin1, patient2);
        hopital.ajouterPatient(medecin2, patient3);

        hopital.afficherMap();
        // Searching for a patient in the hospital
        Patient PatientCherché = new Patient(003, "fatma", "Rezgui", 2222);
        System.out.println("Is patient existe : " + hopital.medecinPatients.get(medecin1).rechercherPatient(PatientCherché));

        hopital.afficherMedcinPatients(medecin1);
    }
}