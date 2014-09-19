package pattern.builder;

// This is automated using Eclipse plugins

public class User {
	
	private String ssn;
	private String firstName;
	private String lastName;
	private int age;
	private String country;
    
	public String getSSN() {
		return ssn;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCountry() {
		return country;
	}
	
	public static class Builder {
		
		private final String ssn;
		private String firstName;
		private String lastName;
		private int age;
		private String country;
		
		public Builder(String ssn){
			this.ssn = ssn;
		}
		
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder country(String country) {
			this.country = country;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

	private User(Builder builder) {
		this.ssn = builder.ssn;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.country = builder.country;
	}
}
