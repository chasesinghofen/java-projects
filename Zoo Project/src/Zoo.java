
public class Zoo {

	public static void main (String[]args)
	{
		Bear bear = new Bear();
		String name = bear.getName();
		System.out.println("name");
		
		Tiger tiger = new Tiger();
		tiger.setName("Tigger");
		String tigerName = tiger.getName();
		System.out.println("tigerName");
	}

}
