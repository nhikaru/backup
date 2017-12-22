/*
public class Capsule {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Person taro=new Person("山田太郎",20);
			System.out.println(taro.getName());

	}

}*/

public class Capsule{
	public static void main(String[] args){
		Person taro =new Person();
		taro.setName("山田太郎");
		taro.setAge(20);
		taro.setPhonenumber("080-0000-0000");
		taro.setAddress("福岡県○○市");
		taro.setSalary(100000000);
		System.out.println(taro.getName());
		System.out.println(taro.getAge());
		System.out.println(taro.getPhonenumber());
		System.out.println(taro.getAddress());
		System.out.println(taro.getSalary());
	}
}
