package src;

public class ����10_28 {

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
		System.out.println(a+"�� �մ� ��������");
			for(;;) {
				   System.out.println("=====������ �̿��Ͻðڽ��ϱ�?======");
				   System.out.print("1.�Ա� 2.��� 3.������ü 4.�ܾ���ȸ 5.����:");
				   int bankService=Integer.parseInt(scanner.nextLine());
				   if(bankService==1) {
					   System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�?:");
					   int cash=Integer.parseInt(scanner.nextLine());		   
					   money+=cash;
				   }else if(bankService==2) {
					   System.out.print("�󸶸� ����Ͻðڽ��ϱ�?:");
					   int cash=Integer.parseInt(scanner.nextLine());		   
					   if(money>0) {
						   money-=cash;
					   }else {
						   System.out.println("�ܾ׺���:");
					   }
				   }else if(bankService==3) {
					   System.out.print("��ü�Ͻ� ������ �������ּ���:");
					   String bank2=(scanner.nextLine());
					   System.out.print("���¹�ȣ�� �������ּ���(-���� �Է�):");
					   String toss=(scanner.nextLine());
					   System.out.print("�󸶸� ����Ͻðڽ��ϱ�?:");
					   int cash=Integer.parseInt(scanner.nextLine());
					   System.out.println("ȫ�浿�Կ��� "+cash+" �� ��ü�Ͻô°� �½��ϱ�?:");
					   System.out.print("1.�� 2.�ƴϿ�:");
					   int yesOrNo=Integer.parseInt(scanner.nextLine());
					   if(money>0&&yesOrNo==1) {
						   money-=cash;
						   System.out.println("ȫ�浿�Կ��� "+cash+"�� ��ü����");
					   }else if(money<=0){
						   System.out.println("�ܾ׺���");
					   }else if(yesOrNo==2) {
						   System.out.println("���ΰź�");
					   }
				   }else if(bankService==4) {
					   System.out.println("������ ���� �ܰ�� ��"+money+"�� �Դϴ�");
				   }else if(bankService==5) {
					   System.out.println("�̿����ּż� �����մϴ�.");
				       break;
				   }
			}
		
		       
	}
	
	

}
