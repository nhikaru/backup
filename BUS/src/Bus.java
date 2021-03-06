
public class Bus extends Car{
	//フィールド
	private int salesAmount;	//運賃
	private int passengerNumber;	//乗客人数

	//コンストラクタ
	public Bus(){
		this(100);
	}

	public Bus(double gas){
		super(gas);
		this.salesAmount=0;
		this.passengerNumber=0;
	}

	//メソッド
	//乗車させるメソッド
	public String rideToBus(int fare){
	//走行中かどうか
	if(this.getSpeed()!=0){
		return "停車してください。";
	}

	//満席かどうか
	if(this.passengerNumber>=50){
		return "満席のため、停車できません。";
	}

	//料金と、乗車人数を加算
	this.salesAmount+=fare;
	this.passengerNumber++;
	return null;
	}

	//降車させるメソッド
	public String getOffBus(){
	//走行中かどうか
	if(this.getSpeed()!=0){
		return "停車してください。";
	}
	//乗客がいるかどうか
	if(this.passengerNumber==0){
		return "乗客はいません。";
	}

	//乗車人数を減算
	this.passengerNumber--;
	return null;
	}

	//フィールドのgetterの準備
	public int getSalesAmount(){
		return this.salesAmount;
	}

	public int getPassengerNumber(){
		return this.passengerNumber;
	}

	//加速させるメソッド
	public void speedUp(int sp){
		//スピードが60km以下なら加速する
		if((this.getSpeed()+sp)<=60){
			super.speedUp(sp);
		}
	}

}
