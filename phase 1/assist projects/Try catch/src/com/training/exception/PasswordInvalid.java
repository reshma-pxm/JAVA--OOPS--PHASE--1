package com.training.exception;

public class PasswordInvalid {
	public class AgeNotValidException extends Exception{
	    private String msg;
	    
	    public AgeNotValidException(String msg) {
	        
	        this.msg=msg;
	    }
	    @Override
	    public String toString() {
	        return "AgeNotValidException [message=" + msg + "]";
	    }
	    
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
