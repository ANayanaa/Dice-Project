public class Die{
	private int val;
	private int side;
		public Die(){
			val = (int)(Math.random()*6)+1;
			side = 6;
		}
		public Die(int val, int side){
			this.val = (int)(Math.random()*6)+1;
			this.side = side;
		}
		public int getValue(){
			return val;
		}
		public void roll(){
			val = (int)(Math.random()*6)+1;
		}
		public String toString(){
			return "Number of sides: "+side+", Value: "+val;
		}

	}