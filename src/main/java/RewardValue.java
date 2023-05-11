
public class RewardValue {
	double cashValue;
	int milesValue;
	
	RewardValue(double cashValue){
		this.cashValue = cashValue;
		milesValue= (int)(cashValue/0.0035);
	}
	RewardValue(int milesValue){
		this.milesValue= milesValue;
		cashValue=milesValue*0.0035;
	}
	
	double getCashValue() {
		return cashValue;
	}
	double getMilesValue() {
		return milesValue;
	}
}
