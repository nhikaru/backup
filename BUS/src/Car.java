
public class Car {
//フィールド
private int speed;
private double gas;
private static String maker="ダッシュ";
public Car(){
	this(20);
}

public Car(double gas){
	this.speed=0;
	this.gas=gas;
}

//メソッド
//加速させるメソッド
public void speedUp(int sp){
	//ガソリンを減らす
	this.gas -= sp/10.0;
	if(this.gas<0){//ガソリンがマイナスになる場合
	//ガソリンを0に補正し、スピードを増やさない
	this.gas = 0;
	}else{
		//スピードを増やす
		this.speed += sp;
	}
}
//減速させるメソッド
public void speedDown(int sp){
	//スピードを減らす
	this.speed-=sp;
	if(this.speed<0){	//スピードがマイナスになる場合
		//スピードを0に補正する
		this.speed=0;
	}
}
//初期化を行うメソッド
//public void init(double gas){
	//this.speed=0;
	//this.gas=gas;
//}

//スピードを取得する
public int getSpeed(){
	return this.speed;
}

//ガソリン量を取得する
public double getGas(){
	return this.gas;
	}
//ガソリンを給油するメソッド
public void setGas(){
	//オーバーロードしているメソッドを呼び出す
	this.setGas(20);
	}
public void setGas(double gas){
	//止まっている場合は指定したガソリン量を給油
	if(this.speed==0){
		this.gas+=gas;
	}
}
//メーカーを紹介するメソッド
public static String introductionMaker(){
	return "この車は"+maker+"製です。";
	}


}