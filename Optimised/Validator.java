package Optimised;

public class Validator {
    public Validator(){

    }

    private boolean isValid(String data){
        return true;
    }

    public String validateFormat(String data){
        if (isValid(data)){
            return "valid";
        }
        return "invalid";
    }
}
