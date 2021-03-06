/*
public class Person {
	private String name=null;
	private int age=0;

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name=name;
	}
	public Person(String name,int age){
		setName(name);
		this.age=age;

	}

}*/

//4つのアクセス修飾子 private public protected 何も書かない
//フィールドの書き方:アクセス修飾子　データ型　変数名　= 値/情報
public class Person{
	//隠蔽部分
	private String name=null;
	private int age=0;
	private String phonenumber=null;
	private String address=null;
	private int salary=0;

	//カプセル化部分
	//getterはフィールド値を単に取得するためのメソッド
	//public 値を取り出すフィールドの型 getフィールド名(){return this.フィールド名}


	public String getName(){
		return this.name;
	}
	//setterはフィールドに値を代入するためのメソッド
	//public void setフィールド名(値を代入するフィールドの型 任意の変数名){this.フィールド=任意のフィールド名}

	public void setName(String name){
		this.name=name;
	}

	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}

	public String getPhonenumber(){
		return this.phonenumber;
	}
	public void setPhonenumber(String phonenumber){
		this.phonenumber=phonenumber;
	}
	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public int getSalary(){
		return this.salary;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}

}
