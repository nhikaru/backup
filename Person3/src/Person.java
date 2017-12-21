
public class Person {
	//フィールド変数↓コンストラクタ内・メソッド内で好きなように使っていい
	public String name=null;
	public int age=0;

	//コンストラクタ①
	public Person(){}

	//コンストラクタ②
	public Person(String name,int age){//ローカル変数：コンストラクタ内のみ有効
	this.name/*this.nameでフィールド変数を指定してくれる*/ =name;
	this.age=age;
	}

	//コンストラクタ③
	public Person(String name){
		this.name=name;
		this.age=0;//this.age=0でフィールド変数の上書き
	}

	//コンストラクタ④
	public Person(int age){
		this.name="名前なし";
		this.age=age;
	}

	//コンストラクタ⑤
	public Person(int age,String name){
		this.name=name;
		this.age=age;
	}
}