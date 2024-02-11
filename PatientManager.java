public class PatientManager {
    public Patient[] patients;



    public PatientManager() {
        this.patients = new Patient[10];
    }



    public int placePatient(Patient patient) {
        for (int i = 0; i < patients.length; i++) {
            if (null == patients[i]) {
                patients[i] = patient;
                return i;
            }
        }

        return -1;
    }



    public Patient rmPatient(int index) {
        Patient ret = patients[index];
        patients[index] = null;
        return ret;
    }



    public void caffeineAbsorption() {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                if (patients[i].mgCaf - 130 > 0 ) {
                    patients[i].mgCaf =patients[i].mgCaf - 130;
                } else {
                    rmPatient(i);
                }
            }
        }
    }



    public String toString() {
        String str = "";
        
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] != null) {
                str += "" + patients[i].idNumber + " " + patients[i].mgCaf + "\n";
            }

            
        }

        if (str.length() == 0) {
            str = "Empty";
        }

        return str;
    }
}