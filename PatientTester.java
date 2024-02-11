public class PatientTester {

    public static void main(String [] args) {
        PatientManager manager = new PatientManager();
        System.out.println(manager);

        for (int i = 1; i < 5; i ++) {
            manager.placePatient(new Patient(i,i * 200.0));
        }

        System.out.println(manager);

        manager.caffeineAbsorption();
        manager.caffeineAbsorption();

        System.out.println(manager);

        int max = -1;
        for (int i = 0; i < manager.patients.length; i++) {
            if (manager.patients[i] != null && max == -1) max = i;
            if (manager.patients[i] != null) {
                if (manager.patients[max].mgCaf < manager.patients[i].mgCaf) max = i;
            }
        }
        manager.rmPatient(max);
        System.out.println(manager);

    }
}