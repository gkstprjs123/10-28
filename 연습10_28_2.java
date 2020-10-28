package src;

public class 연습10_28_2 {//숫자 맞추기 힌트1번 기회 10번 맞추면 승리
	public static void main(String[] args) {
		random();
		
	}
	
	public static void random() {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		int randomNum=(int)(Math.random()*500)+1;
		int score=0;
		int chance=0;
		for(;;) {
		  if(chance==0) {
			  System.out.print("힌트를 사용하시겠습니까? 1.예 2.아니오:");
			  int yesOrNo=Integer.parseInt(scanner.nextLine());
			  if(yesOrNo==1) {
				  chance++;
				  for(int i=0; i<500; i+=100) {
					  if(randomNum>i&&randomNum<i+100) {
						  System.out.println("숫자는"+i+"이랑"+(i+100)+"사이에 있습니다.");
					  }
				  }
			  }
		 }
	  	 System.out.print("숫자 입력:");
		 int number=Integer.parseInt(scanner.nextLine());
		 if(number<randomNum) {
			 System.out.println("up");
			 score++;
		 }else if(number>randomNum) {
			 System.out.println("down");
			 score++;
		 }else if(number==randomNum) {
			 System.out.println("승리!");
			 break;
		 }
		 if(score>=10) {
			 System.out.println("패배");
			 break;
		 }
		 
			
		}
	}

}
