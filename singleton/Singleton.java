public class Singleton {
    
	private Singleton(){}

	private static Singleton instance;
	// OR: private static SingleTon instance = new SingleTon();
	
	public static Singleton getInstance(){
		
		if (instance==null){
			instance=new SingleTon();
		}
		// OR: nothing
		return instance;
	}
}
