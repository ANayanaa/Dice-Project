public class RollTwo{
	public static void main(String[]args){
		Die first = new Die();
		Die second = new Die();
		int rollnumber  = 0;

			while(first.getValue() +second.getValue() != 2){
				first.roll();
				second.roll();
				rollnumber++;
					System.out.println("Number of rolls: "+rollnumber+" "+first.toString()+" \n "+second.toString()+"\n");
			}
				if(first.getValue() + second.getValue() == 2){
					System.out.print("You got snake eyes!");
				}

	}
}
