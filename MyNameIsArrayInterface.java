
public class MyNameIsArrayInterface {

	public static void main(String[] args) {
		ImplArrayList a = new ImplArrayList();
		a.add("123456");
		a.add("654321");
		a.add("654321!!!!");
		a.add("123456wwww");
		a.add("654321e");
		a.add("654321dddddd!!!!");
		a.add("123456vvvvv");
		a.add("654321zzzzz");
		a.add("654321qqq!!!!");
		a.add("123456");
		a.add("654321");
		a.add("654321!!!!");
		a.add("123456");
		a.add("654321");
		a.add("654321!!!!");
		a.add("123456");
		a.add("654321");
		a.add("!!!!");
		a.add("123456");
		a.add("654321");
		a.add("654321!!!qq!");
		System.out.println("i have public method for you, and i say " + a.get(0) + "_" + a.get(1) + "_" + a.get(2));
		a.remove(1 );		a.remove("123456" );
		System.out.println("i have public method for you, and i say " + a.get(0) + "_" + a.get(1) + "_" + a.get(2));
		System.out.println(""+ a.size());

		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		System.out.println("indexOf : " + a.indexOf("!!!!"));

		System.out.println("get from indexOf : " + a.get(a.indexOf("!!!!")));

		a.add(5, "lalala");


		System.out.println("----------------------------- add lalala at index 5");

		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}