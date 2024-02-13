package equalsmethoddemo;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Abhi";
		String str1 = "Abhi";
		System.out.println(str.equals(str1));
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode()+"\n");

		String str2 = new String("Abhi");
		String str3 = new String("Abhi");
		System.out.println(str2.equals(str3));
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode()+"\n");
		
		Sites s =new Sites("Abhi",1);
		Sites s1 = new Sites("Abhi",1);
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
