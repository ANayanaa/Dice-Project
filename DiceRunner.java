import java.util.ArrayList;
public class DiceRunner{
	public static void main (String[]args){



		ArrayList <Die> list = new ArrayList<>();

		DiceHolder diceholder = new DiceHolder();
		int c = 1;
		do{
				int sizes = (int)(Math.random()*20)+4;
				int value = (int)(Math.random()*(sizes-1))+1;
			Die dices = new Die(value,sizes);

			diceholder.addDie(new Die());
			System.out.println(diceholder);

}while(c==1);


	}
}
