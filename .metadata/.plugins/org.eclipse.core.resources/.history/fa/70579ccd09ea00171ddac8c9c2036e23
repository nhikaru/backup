import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Run2 {
	//車の状態を表示するメソッド
		public static void showData(Bus bus){
			System.out.println("スピード:"+bus.getSpeed()+"km");
			System.out.println("ガソリン:"+bus.getGas()+"L");
			System.out.println("売上金額:"+bus.getSalesAmount()+"円");
			System.out.println("乗車人数:"+bus.getPassengerNumber()+"人");
		}

		public static void main(String[] args)throws Exception {
			// インスタンスを生成する
			Bus bus=new Bus(150);
			//フィールド変数を初期化する
			//car.speed=0;
			//car.gas=20.0;

			//car.init(20.0);

			//現在の状態を表示する
			showData(bus);

			//キーボード入力の準備をする
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

			while(true){
				//操作を入力
				System.out.println("1);加速 2)減速3)給油7)乗車8)降車9)終了:");
				String inputdata=br.readLine();

				//操作によって分岐する
				switch(inputdata){
				case"1":
				//加速する
				bus.speedUp(5);
				showData(bus);
				break;
				case"2":
				//減速する
				bus.speedDown(5);
				showData(bus);
				break;
				case"3":
				//給油する
				bus.setGas(35);
				showData(bus);
				break;
				case"7":
				//乗車する
				String retgetoff=bus.rideToBus(200);
				if(retgetoff==null){
					showData(bus);
				}else{
					System.out.println(retgetoff);
				}
				break;
				case"8":
				//降車する
				String retride=bus.getOffBus();
				if(retride==null){
					showData(bus);
				}else{
					System.out.println(retride);
				}
				break;
				case"9":
				//プログラムを終了する
				return;

				}
			}

		}

}
