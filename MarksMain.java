/**
 * MarksMain - an example of working with array of objects.
 *
 */

class Marks{
	int cat1, cat2;
	int exam;
	/* constructor */
	Marks(){
		cat1 = (int)Math.ceil(Math.random()*20);
		cat2 = (int)Math.ceil(Math.random()*10);
		exam = (int)Math.ceil(Math.random()*70);
	}
	public int getCat1(){
		return cat1;
	}
	public int getCat2(){
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
public class MarksMain{
	public static void main(String [] args){
		Marks []mk = new Marks[7];

		/** populating the array */
		for(int i = 0; i < mk.length; i++){
			mk[i] = new Marks();
		}
		/** processing the array */
		for(int j = 0; j < mk.length; j++){
			int tcats = mk[j].getCat1() + mk[j].getCat();
			int texam = tcats + mk[j].getExam();
			String gde = mk[j].grading();
			String out = "\t" + mk[j].getCat1() + "\t" + mk[j].getCat2() + "\t" + tcats + "\t" + mk[j].getExam() + "\t" + texam + "\t" + gde;
			System.out.format(" $10s %n", out);
		}
	}
}
