import java.util.ArrayList;
public class DiceHolder{

 		private Die die = new Die();


	ArrayList<Die> holder = new ArrayList<>();


		 public DiceHolder(){

}
		public int addDie(Die die){
			if((holder.size()>=0)&&(holder.size()!=6)){
				holder.add(die);
			return 1;
		}
			else
			return -1;

			}
			 int x;

		public void shake(){
			x= (int)(Math.random()*6)+1;

			for(int i = 0; i<holder.size(); i++){
			holder.set(x,holder.get(i));
		}
		}









}