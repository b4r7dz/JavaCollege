package NrTelefoninczy;

public class Firma extends Wpis{

    private String  name,
            address;
    private int     NIP;
    private NrTelefoniczny phoneNumber;

    //exception to if NIP !=11 report

    public Firma(String name, String address, int NIP, int phoneNumber) throws NIPNumberWrongException{
        this.name = name;
        this.address = address;

        try{
            if (!NIPVerify(NIP)) {
                throw new NIPNumberWrongException("NIPNumberWrongException", NIP);
            }else{this.NIP = NIP;}
        }catch(NIPNumberWrongException e )
        {
            e.printStackTrace(System.err);
            System.err.println("e.getNIPtoVerify() = " + e.getNIPtoVerify());
        }

        this.phoneNumber = new NrTelefoniczny(phoneNumber);
    }

    public Firma(String name, String address, int NIP,int prefix, int phoneNumber) throws NIPNumberWrongException{
        this.name = name;
        this.address = address;

        try{
            if (!NIPVerify(NIP)) {
                throw new NIPNumberWrongException("NIPNumberWrongException", NIP);
            }else{this.NIP = NIP;}
        }catch(NIPNumberWrongException e )
        {
            e.printStackTrace(System.err);
            System.err.println("e.getNIPtoVerify() = " + e.getNIPtoVerify());
        }

        this.phoneNumber = new NrTelefoniczny(prefix, phoneNumber);
    }

    public NrTelefoniczny getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", name, address, NIP);
    }

    @Override
    void opis() {
        System.out.println("- - - - - - "
                + "\nName: " + name
                + "\nAddress: " + address
                + "\nNIP: " + NIP
                + "\nPhone num: " + getPhoneNumber());
    }

    public boolean NIPVerify(int unkownNIP){
        boolean answer = false;


        return answer;
    }

}
