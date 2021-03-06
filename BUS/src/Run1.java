import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Run1 {
	//車の状態を表示するメソッド
	public static void showData(Car car){
		//System.out.println("スピード:"+car.speed+"km");
		System.out.println("スピード:"+car.getSpeed()+"km");
		//System.out.println("ガソリン:"+car.gas+"L");
		System.out.println("ガソリン:"+car.getGas()+"L");
	}

	public static void main(String[] args)throws Exception {
		// インスタンスを生成する
		Car car=new Car(40);
		//フィールド変数を初期化する
		//car.speed=0;
		//car.gas=20.0;

		//car.init(20.0);

		//現在の状態を表示する
		showData(car);

		//キーボード入力の準備をする
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		while(true){
			//操作を入力
			System.out.println("1);加速 2)減速3)給油4)メーカー紹介 9)終了:");
			String inputdata=br.readLine();

			//操作によって分岐する
			switch(inputdata){
			case"1":
			//加速する
			car.speedUp(5);
			showData(car);
			break;
			case"2":
			//減速する
			car.speedDown(5);
			showData(car);
			break;
			case"3":
			//給油する
			car.setGas(35);
			showData(car);
			break;
			case"4":
			//メーカーを表示する
			System.out.println(Car.introductionMaker());
			break;
			case"9":
			//プログラムを終了する
			return;

			}
		}

	}

}
