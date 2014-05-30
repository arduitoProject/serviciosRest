package ar.com.bamba.exception;


/**
 * Exception custom
 */
public class CustomGenericException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	private String exceptionMsg;
 
	//cosntru parametrizado
	public CustomGenericException(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
	//setters & getters
	public String getExceptionMsg(){
		return this.exceptionMsg;
	}
	
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
}
