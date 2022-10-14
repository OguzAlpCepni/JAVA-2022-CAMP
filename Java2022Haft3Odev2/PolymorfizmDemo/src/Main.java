
public class Main {

	public static void main(String[] args) {
		//BaseLogger [] loggers = new BaseLogger[] {new FileLogger(),new DataBaseLogger(),new EmailLogger()};
		
		//for(BaseLogger logger :loggers) {
		//	logger.log("log message");
		//}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
