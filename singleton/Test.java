public class Test {

	public static void main(String args[]){
		
    	Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s1==s2){
            System.out.println("the same object");
        } else {
            System.out.println("not the same object");
        }
    }
}

