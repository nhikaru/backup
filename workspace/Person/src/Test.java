
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*Person jiro =new Person();
		Person hanako=new Person();
		Person hikaru=new Person();
		jiro.name="木村次郎";
		jiro.age=20;
		jiro.phoneNumber="0120-00-2222";
		jiro.address="北海道";
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="0120-00-0123";
		hanako.address="福島";
		hikaru.name="永田光";
		hikaru.age=25;
		hikaru.phoneNumber="080-5388-0456";
		hikaru.address="埼玉";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(hikaru.name);
		System.out.println(hikaru.age);
		System.out.println(hikaru.phoneNumber);
		System.out.println(hikaru.address);
		jiro.talk();
		hanako.walk();
		hikaru.run();*/
		Person taro=new Person();
		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro =new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person saburo=new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person hisashi=new Person(0);
		System.out.println(hisashi.name);
		System.out.println(hisashi.age);

		Person hanako=new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);

	}

}
