package interfaceeg;

public class Doctor implements hospital {

    @Override
    public void PatientCare() {
        
    }

    @Override
    public void AppointMent() {
        System.out.println("Monday to Friday");
        
    }

    @Override
    public void TreatMent() {
        System.out.println("Surgery");
        System.out.println("Diagnostic Test");

    }

    @Override
    public void Information() {
        System.out.println("Phone Number: 091213934");
        System.out.println("Name : Ye Ye");
        System.out.println("Yangon");
    }
    
}
