public class DiceRunner{
	public static void main (String[]args){

		Die dies = new Die();
		System.out.println(dies);
		DiceHolder die = new DiceHolder();
		System.out.println(die.addDie());
	}
}
