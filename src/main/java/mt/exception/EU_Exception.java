package mt.exception;

/**
 * Created by Marco on 16/03/2017.
 */
public class EU_Exception extends Exception{

    private String msg;

    public EU_Exception(){
    }

    public EU_Exception(String msg){
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
