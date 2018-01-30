package NrTelefoninczy;

public class NIPNumberWrongException extends Exception {
    private Integer NIPtoVerify;

    public NIPNumberWrongException(String msg, Integer NIPtoVerify){
        super(msg);
        this.NIPtoVerify = NIPtoVerify;
    }

    public Integer getNIPtoVerify(){
        return NIPtoVerify;
    }
}
