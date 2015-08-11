package chapter.seven;

public class ExamEighteen {

	public static void action(Robot r){
		if (r instanceof DanceRobot) ((DanceRobot) r).dance();
		else if (r instanceof SingRobot) ((SingRobot) r).sing();
		else ((DrawRobot) r).draw();
	}
	public static void main(String[] args) {
		 Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		 
		 for(int i=0; i< arr.length; i++)
			 action(arr[i]);
		
	}

}
