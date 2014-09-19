package pattern.builder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        User xiaoming = new User.Builder("345678")
                                .age(18)
                                .country("US")
                                .firstName("xiaoming")
                                .lastName("wang")
                                .build();
        
        System.out.println(xiaoming.getCountry()); // which will show 'US'
	}

}
