
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setP(int n){

		System.out.println("��⺹�������ҡ���  "+n+" �� "+(bonusCalculator.computeBonus(n)));
	}
}
