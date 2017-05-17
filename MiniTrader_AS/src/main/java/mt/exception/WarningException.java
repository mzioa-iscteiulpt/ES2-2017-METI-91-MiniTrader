package mt.exception;

public class WarningException extends Exception {
	private static final long serialVersionUID = 1L;
		
		private String msg;
		
		public WarningException(){
		}
		
		public WarningException(String msg){
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
