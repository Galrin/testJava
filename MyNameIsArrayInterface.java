
public class MyNameIsArrayInterface {

	public static void main(String[] args) {
		ImplArrayList<String> a = new ImplArrayList<String>();
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
		a.add("6542321");
		a.add("654321!!!qq!");
		a.add("654321!!!qq!");

		System.out.println("----------------------------- ");

		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("----------------------------- ");

		System.out.println("i have public method for you, and i say " + a.get(0) + "_" + a.get(1) + "_" + a.get(2));
		System.out.println("i have size : " + a.size());
		a.remove(1 );
		System.out.println("i have removed 1 item and my size : " + a.size());

		a.remove("123456" );
		System.out.println("i have removed 1 item and my size : " + a.size());

		System.out.println("i have public method for you, and i say " + a.get(0) + "_" + a.get(1) + "_" + a.get(2));
		System.out.println("----------------------------- ");

		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		System.out.println("indexOf !!!! : " + a.indexOf("!!!!"));

		System.out.println("get from indexOf : " + a.get(a.indexOf("!!!!")));

		a.add(5, "lalala");
		System.out.println("i add lalala at position 5, and my size now: " + a.size());


		System.out.println("----------------------------- add lalala at index 5");

		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}


		System.out.println("i have public method for you, and i say " + a.get(22) + "_" + a.get(23) + "_" + a.get(30));
	}
}