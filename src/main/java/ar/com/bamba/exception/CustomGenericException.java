package ar.com.bamba.exception;


public class CustomGenericException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	private String exceptionMsg;
 
	public CustomGenericException(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
	public String getExceptionMsg(){
		return this.exceptionMsg;
	}
	
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
}
