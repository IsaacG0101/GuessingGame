
public class InvalidPickException extends RuntimeException  {
			
		public InvalidPickException() {
			System.out.println("invalid pick; must be 1-5.");
		}
		public InvalidPickException(String e) {
			System.out.println(e);
		}
}
