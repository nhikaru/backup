/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="0120-00-2222";
		taro.address="福岡県○○市";
		taro.job="プロ野球選手";
		taro.salary=100000000;

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		System.out.println(taro.job);
		System.out.println("年収"+taro.salary+"円");

		Person hikaru=new Person();
		hikaru.name="永田光";
		hikaru.age=25;
		hikaru.phoneNumber="080-0000-0000";
		hikaru.address="埼玉県○○市";
		hikaru.job="IT系";
		hikaru.salary=3000000;
		System.out.println(hikaru.name);
		System.out.println(hikaru.age);
		System.out.println(hikaru.phoneNumber);
		System.out.println(hikaru.address);
		System.out.println(hikaru.job);
		System.out.println("年収"+hikaru.salary+"円");

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="090-0000-0000";
		jiro.address="北海道○○市";
		jiro.job="ベーシスト";
		jiro.salary=250000000;
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println(jiro.job);
		System.out.println("年収"+jiro.salary+"円");

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="050-0000-0000";
		hanako.address="千葉県○○市";
		hanako.job="公務員";
		hanako.salary=2500000;
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(hanako.job);
		System.out.println("年収"+hanako.salary+"円");

		taro.talk();
		hikaru.run();
		hanako.walk();

		Robot aibo=new Robot();
		aibo.name="aibo";
		Robot asimo=new Robot();
		asimo.name="asimo";
		Robot pepper=new Robot();
		pepper.name="pepper";
		Robot doraemon=new Robot();
		doraemon.name="doraemon";

		doraemon.talk();
		doraemon.run();
		asimo.talk();
		asimo.walk();
		pepper.talk();
		aibo.run();


	}

}
