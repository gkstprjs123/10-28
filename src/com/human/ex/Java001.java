package com.human.ex;

import java.util.Arrays;

public class Java001 {

	public static void main(String[] args) {
		java.util.Scanner scanner
		=new java.util.Scanner(System.in);
		//1.�迭�� 5���� ���ڸ� �Է¹޾� ���� ���� ���� �ϳ��� �Է¹޾�
		//�ش� ���ڰ� ���° �ε����� ��� �ִ��� ����ϴ� ���α׷��� ����� ����.
		/*
		int arr[]=new int[5];
		boolean numFlag=true;
		System.out.print("�迭�� �� ���ڸ� �Է����ּ���:");
		int index0=Integer.parseInt(scanner.nextLine());
		int index1=Integer.parseInt(scanner.nextLine());
		int index2=Integer.parseInt(scanner.nextLine());
		int index3=Integer.parseInt(scanner.nextLine());
		int index4=Integer.parseInt(scanner.nextLine());
		arr[0]=index0;
		arr[1]=index1;
		arr[2]=index2;
		arr[3]=index3;
		arr[4]=index4;
		System.out.print("���ڸ� �Է����ּ���:");
		while(numFlag) {
		int arrNumber=Integer.parseInt(scanner.nextLine());
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==arrNumber) {
					System.out.println("�ش� ���ڴ� "+i+"�ε����� ���ֽ��ϴ�.");
					numFlag=false;
				}
			}
			if(numFlag) {
				System.out.print("���ڸ� �ٽ� �Է����ּ���:");
			}
		}
		
		//2.�迭�� 5���� ���ڸ� �Է¹޾� ���� ���� ���� �ϳ��� �Է¹޾� �ش� ���ڰ� ���° �ε����� ��� �ִ��� ����ϴ� ���α׷��� ����� ����.
		String arr[]=new String[5];
		boolean stringFlag=true;
		System.out.print("�迭�� �� ���ڸ� �Է����ּ���:");
		String index0=(scanner.nextLine());
		String index1=(scanner.nextLine());
		String index2=(scanner.nextLine());
		String index3=(scanner.nextLine());
		String index4=(scanner.nextLine());
		arr[0]=index0;
		arr[1]=index1;
		arr[2]=index2;
		arr[3]=index3;
		arr[4]=index4;
		System.out.print("���ڸ� �Է����ּ���:");
		while(stringFlag) {
		int arrString=Integer.parseInt(scanner.nextLine());
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals(arrString)) {
					System.out.println("�ش� ���ڴ� "+i+"�ε����� ���ֽ��ϴ�.");
					stringFlag=false;
				}
			}
			if(stringFlag) {
				System.out.print("���ڸ� �ٽ� �Է����ּ���:");
			}
		}
		
		
		//3.�迭 ũ�⸦ �Է¹޾� �迭 ũ�� ��ŭ 1,2,3,1,2,3,1,2,3 �� ���ڸ� ������� �迭�ȿ� �������� �迭�� ������ ����� ����.
		System.out.print("�迭�� ũ�⸦ �������ּ���:");
		int arrLength=Integer.parseInt(scanner.nextLine());
		int arr[]=new int[arrLength];
		for(int i=0; i<arrLength; i++) {
			arr[i]=i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//4.�迭�� ����ִ� ������ ������ �������� �����ϴ� ���ο� �迭�� ����� ����� ����.
		int arr[]= {15,62,36,73};
		int arr2[]=new int[arr.length*2];
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int num=0;
					num=arr[i];
					arr[i]=arr[j];
					arr[j]=num;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			arr2[i]=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int num=0;
					num=arr[i];
					arr[i]=arr[j];
					arr[j]=num;
				}
			}
			
		}
		for(int j=4; j<arr2.length; j++) {
			arr2[j]=arr[j-4];
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//5.�迭 1,2,3,4,5,6,7,8,9 ���� �̵�����, �̵�ĭ��, ä����ڸ� �Է� �޾� �迭�� ������ ������ ����غ���.
		//ex)�Է� ���� 3 2 			��� 4,5,6,7,8,9,2,2,2
		//ex)�Է� ������ 3 4 		��� 4,4,4,1,2,3,4,5,6
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.print("�̵� ������ �������ּ���:");
		String move=(scanner.nextLine());
		System.out.print("�̵� ĭ���� �������ּ���:");
		int move2=Integer.parseInt(scanner.nextLine());
		System.out.print("ä�� ���ڸ� �������ּ���:");
		int num=Integer.parseInt(scanner.nextLine());
		int j=0;
		if(move.equals("����")) {
			for(int i=move2; i<arr.length; i++) {
					arr[j]=arr[i];
					j++;
			}
			for(int i=arr.length-move2; i<arr.length; i++) {
				arr[i]=num;
			}
		}else if(move.equals("������")) {
			for(int i=move2; i<arr.length; i++) {
				int zero=0;
				zero=arr[j];
				arr[j]=arr[i];
				arr[i]=zero;
				j++;
		    }
	     	for(int i=0; i<move2; i++) {
			    arr[i]=num;
		    }	
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//6.�迭 1,2,3,4,5,6,7,8,9 ���� ȸ������� ȸ���� �Է¹޾� �迭 ������ ȸ����Ű�� ����غ���.
		//ex)�Է� ���� 2		     ��� 3,4,5,6,7,8,9,1,2
//		ex)�Է� ������ 3		     ��� 7,8,9,1,2,3,4,5,6

		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.print("ȸ�� ������ �������ּ���:");
		String move=(scanner.nextLine());
		System.out.print("ȸ�� ĭ���� �������ּ���:");
		int move2=Integer.parseInt(scanner.nextLine());
		int j=0;
		if(move.equals("����")) {
			int arr2[]=new int[move2];
			for(int i=0; i<move2; i++) {
				arr2[i]=arr[i];
			}
			for(int i=move2; i<arr.length; i++) {
				arr[j]=arr[i];
				j++;
			}
			j=0;
			for(int i=arr.length-move2; i<arr.length; i++) {
				arr[i]=arr2[j];
				j++;
			}
		}else if(move.equals("������")) {
			int arr2[]=new int[move2];
			int arr3[]=new int[arr.length-move2];
			for(int i=0; i<arr2.length; i++) {
				arr2[i]=arr[arr.length-move2+i];
			}
			for(int i=0; i<arr3.length; i++) {
				arr3[i]=arr[i];
			}
			for(int i=move2; i<arr.length; i++) {
				arr[i]=arr3[j];
				j++;
			}
			j=0;
			for(int i=0; i<arr2.length; i++) {
				arr[i]=arr2[j];
				j++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//7.�迭�� 100�� �����Ͽ� 0~99���� ���� ���� i=2 ���� 50���� i�� ������ i�� ����� ���� �ε����� 0�� ���� ���� �迭�� 0�� �ƴ� ���� ����� ����. 
		//��� ����� ��� �Ҽ��ε� ������ ������ ����.
		int arr[]=new int[100];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
		}

		for(int i=2; i<50; i++) {
			int num=i;
			while(num<99) {
				num+=i;
				for(int k=0; k<arr.length; k++) {
					if(arr[k]==num) {
						arr[k]=0;
					}
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				System.out.println(arr[i]);
			}
		}
		
		//8.��ǻ�Ϳ��� �ֻ��������� ���α׷��� �����Ͽ����� ������ ���¼��� ��(ȸ��)�� ���ϴ� ���α׷��� �ۼ��� ����.
		int aX[]= {0,0,0,0,0,0};
		
		for(int i=0; i<30; i++) {
			int a=(int)(Math.random()*6)+1;
			if(a==1) {
				aX[0]++;
			}else if(a==2) {
				aX[1]++;
			}else if(a==3) {
				aX[2]++;
			}else if(a==4) {
				aX[3]++;
			}else if(a==5) {
				aX[4]++;
			}else if(a==6) {
				aX[5]++;
			}
		}
		System.out.println("======30�� ������ ���� ���======");
		System.out.println("1�� ����Ƚ��"+aX[0]);
		System.out.println("2�� ����Ƚ��"+aX[1]);
		System.out.println("3�� ����Ƚ��"+aX[2]);
		System.out.println("4�� ����Ƚ��"+aX[3]);
		System.out.println("5�� ����Ƚ��"+aX[4]);
		System.out.println("6�� ����Ƚ��"+aX[5]);
		
		//9.50���� �л��� �⼮ ������  �����ϴ� �Ʒ��� ���� �޴��� ���� ���α׷��� ����� ����. 
		//�޴�: 1.��ü �⼮���� 2.�Ἦ�� �߰� 3.�⼮�� �߰� 4.������ �߰� 5.������ �߰� 6.���α׷� ����
		int student[]=new int[50];
		int aX=0;
		int cX=0;
		int dX=0;
		int member=0;
		for(;;) {
			System.out.print("1.��ü �⼮���� 2.�Ἦ�� �߰� 3.�⼮�� �߰� 4.������ �߰� 5.������ �߰� 6.���α׷� ����:");
			int menu=Integer.parseInt(scanner.nextLine());
			if(menu==1) {
				System.out.println("=======���� ��� ����========");
				System.out.println("���� ��"+student.length+"��");
				System.out.println("�Ἦ"+aX+"��");
				System.out.println("����"+cX+"��");
				System.out.println("����"+dX+"��");
				System.out.println("�� ���:"+(student.length-member)+"��");
			}else if(menu==2) {
				System.out.print("��� �Ἦ�߽��ϱ�?:");
				int aX1=Integer.parseInt(scanner.nextLine());
				aX+=aX1;
				member+=aX;
			}else if(menu==3) {
				if(aX!=0) {
				   member--;
				}
				if(aX!=0) {
					aX--;
				}
			}else if(menu==4) {
				System.out.print("��� �����߽��ϱ�?:");
				int cX1=Integer.parseInt(scanner.nextLine());
				cX+=cX1;
				member+=cX;
			}else if(menu==5) {
				dX++;
			}else if(menu==6) {
				break;
			}
		}
		*/





	}

}
