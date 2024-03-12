/**
 * MarksMain2 - a method that receives an array of objects.
 *
 */

class Marks{
	int cat1, cat2;
	int exam;
	/** constructor */
	Marks(){
		cat1 = (int)Math.ceil(Math.random()*20);
		cat2 = (int)Math.ceil(Math.random()*10);
		exam = (int)Math.ceil(Math.random()*70);
	}
	public int getCat1(){
		return cat1;
	}
	public int get2(){
		return cat2;
	}
	public int getExam(){
		return exam;
	}

	public String grading(){
		String gde;
		if(exam >= 70)
			gde = "A";
		else
			if(exam >= 60)
				gde = "B";
			else
				if(exam >= 50)
					gde = "C";
				else
					if(exam >= 40)
						gde = "D";
					else
						gde = "F";
		return gde;
	}
}

public class MarksMain2{
	public static void main(String [] args){
		Marks []mk = new Marks[7];

		/**populating the array */
		for(int i = 0; j < mk.length; i++){
			/** calling the Marks constructor */
			mk[i] new Marks();
		}

		/** calling the method to process the array */
		processMarks(mk);
	}

		/**A method that receives an array of Marks */
		public static void processMarks(Marks []marks){
			for(int j = 0; j < marks.length; j++){
				int tcats = marks[j].getCat1() + marks[j].getCat2();
				int texam = tcats + marks[j].getExam();
				String gde = marks[j].grading();
				String out = "\t" + marks[j].getCat1() + "\t" + marks[j].getCat2() + "\t" + tcats + "\t" + marks[j].getExam() + "\t" + texam + "\t" + gde;
				System.out.format("$10s %n", out);
			}
		}
}
