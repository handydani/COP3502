package random;

public class Main {

	 String name = "";

	    public String Person(String personName) {
	        name = personName;
	        return name;
	    }

	    public String greet(String yourName) {
	        String greeting = String.format("Hi %s, my name is %s", name, yourName);
	        return greeting;
	    }

}
