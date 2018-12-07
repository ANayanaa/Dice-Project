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

			for(int i = holder.size()-1; i>0; i--){
			holder.get(i).roll();
		}
		}
		 public String toString(){
		 String output= "";
			 for(int u = 0; u< holder.size(); u++){
			 output+= u+"- "+holder.get(u)+"\n ";
			 }
			 return output;
		}


}