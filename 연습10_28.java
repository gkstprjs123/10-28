package src;

public class 연습10_28 {

	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		int people[]= {1,2,3,4,5};
		for(int i=1; i<=people.length; i++) {
			bank(i);
		}

	}
	public static void bank(int a) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
//		int people[]=new int [5];
//		for(int i=0; i<people.length; i++) {
//			people[i]=i+1;
//		}
		int money=0;
		System.out.println(a+"번 손님 업무시작");
			for(;;) {
				   System.out.println("=====무엇을 이용하시겠습니까?======");
				   System.out.print("1.입금 2.출금 3.계좌이체 4.잔액조회 5.종료:");
				   int bankService=Integer.parseInt(scanner.nextLine());
				   if(bankService==1) {
					   System.out.print("얼마를 입금하시겠습니까?:");
					   int cash=Integer.parseInt(scanner.nextLine());		   
					   money+=cash;
				   }else if(bankService==2) {
					   System.out.print("얼마를 출금하시겠습니까?:");
					   int cash=Integer.parseInt(scanner.nextLine());		   
					   if(money>0) {
						   money-=cash;
					   }else {
						   System.out.println("잔액부족:");
					   }
				   }else if(bankService==3) {
					   System.out.print("이체하실 은행을 말씀해주세요:");
					   String bank2=(scanner.nextLine());
					   System.out.print("계좌번호를 말씀해주세요(-빼고 입력):");
					   String toss=(scanner.nextLine());
					   System.out.print("얼마를 출금하시겠습니까?:");
					   int cash=Integer.parseInt(scanner.nextLine());
					   System.out.println("홍길동님에게 "+cash+" 원 이체하시는게 맞습니까?:");
					   System.out.print("1.예 2.아니오:");
					   int yesOrNo=Integer.parseInt(scanner.nextLine());
					   if(money>0&&yesOrNo==1) {
						   money-=cash;
						   System.out.println("홍길동님에게 "+cash+"원 이체성공");
					   }else if(money<=0){
						   System.out.println("잔액부족");
					   }else if(yesOrNo==2) {
						   System.out.println("승인거부");
					   }
				   }else if(bankService==4) {
					   System.out.println("고객님의 현재 잔고는 총"+money+"원 입니다");
				   }else if(bankService==5) {
					   System.out.println("이용해주셔서 감사합니다.");
				       break;
				   }
			}
		
		       
	}
	
	

}
