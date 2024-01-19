package interfaceeg;

public class Patient implements hospital {
    
    @Override
    public void PatientCare() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PatientCare'");
    }

    @Override
    public void AppointMent() {
       System.out.println("For Monday ");
       
    }

    @Override
    public void TreatMent() {
       System.out.println("For Surgery");
    }

    @Override
    public void Information() {
        System.out.println("Name : Kaung Kaung");
        System.out.println("Phone Number: 09969399542");
        System.out.println("Address : Yangon");
    }
    
}
