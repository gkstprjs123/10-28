package com.human.ex;

import java.util.Arrays;

public class Java001 {

	public static void main(String[] args) {
		java.util.Scanner scanner
		=new java.util.Scanner(System.in);
		//1.배열에 5개의 숫자를 입력받아 넣은 다음 숫자 하나를 입력받아
		//해당 숫자가 몇번째 인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.
		/*
		int arr[]=new int[5];
		boolean numFlag=true;
		System.out.print("배열에 들어갈 숫자를 입력해주세요:");
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
		System.out.print("숫자를 입력해주세요:");
		while(numFlag) {
		int arrNumber=Integer.parseInt(scanner.nextLine());
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==arrNumber) {
					System.out.println("해당 숫자는 "+i+"인덱스에 들어가있습니다.");
					numFlag=false;
				}
			}
			if(numFlag) {
				System.out.print("숫자를 다시 입력해주세요:");
			}
		}
		
		//2.배열에 5개의 문자를 입력받아 넣은 다음 문자 하나를 입력받아 해당 문자가 몇번째 인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.
		String arr[]=new String[5];
		boolean stringFlag=true;
		System.out.print("배열에 들어갈 문자를 입력해주세요:");
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
		System.out.print("문자를 입력해주세요:");
		while(stringFlag) {
		int arrString=Integer.parseInt(scanner.nextLine());
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals(arrString)) {
					System.out.println("해당 문자는 "+i+"인덱스에 들어가있습니다.");
					stringFlag=false;
				}
			}
			if(stringFlag) {
				System.out.print("숫자를 다시 입력해주세요:");
			}
		}
		
		
		//3.배열 크기를 입력받아 배열 크기 만큼 1,2,3,1,2,3,1,2,3 … 숫자를 순서대로 배열안에 넣은다음 배열의 내용을 출력해 보자.
		System.out.print("배열의 크기를 말씀해주세요:");
		int arrLength=Integer.parseInt(scanner.nextLine());
		int arr[]=new int[arrLength];
		for(int i=0; i<arrLength; i++) {
			arr[i]=i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//4.배열에 들어있는 내용을 정순과 역순으로 저장하는 새로운 배열을 만들어 출력해 보자.
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
		
		//5.배열 1,2,3,4,5,6,7,8,9 에서 이동방향, 이동칸수, 채울수자를 입력 받아 배열의 내용을 변경후 출력해보자.
		//ex)입력 왼쪽 3 2 			결과 4,5,6,7,8,9,2,2,2
		//ex)입력 오른쪽 3 4 		결과 4,4,4,1,2,3,4,5,6
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.print("이동 방향을 말씀해주세요:");
		String move=(scanner.nextLine());
		System.out.print("이동 칸수를 말씀해주세요:");
		int move2=Integer.parseInt(scanner.nextLine());
		System.out.print("채울 숫자를 말씀해주세요:");
		int num=Integer.parseInt(scanner.nextLine());
		int j=0;
		if(move.equals("왼쪽")) {
			for(int i=move2; i<arr.length; i++) {
					arr[j]=arr[i];
					j++;
			}
			for(int i=arr.length-move2; i<arr.length; i++) {
				arr[i]=num;
			}
		}else if(move.equals("오른쪽")) {
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
		//6.배열 1,2,3,4,5,6,7,8,9 에서 회전방향과 회수를 입력받아 배열 내용을 회전시키고 출력해보자.
		//ex)입력 왼쪽 2		     결과 3,4,5,6,7,8,9,1,2
//		ex)입력 오른쪽 3		     결과 7,8,9,1,2,3,4,5,6

		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.print("회전 방향을 말씀해주세요:");
		String move=(scanner.nextLine());
		System.out.print("회전 칸수를 말씀해주세요:");
		int move2=Integer.parseInt(scanner.nextLine());
		int j=0;
		if(move.equals("왼쪽")) {
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
		}else if(move.equals("오른쪽")) {
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
		
		//7.배열을 100개 선언하여 0~99까지 넣은 다음 i=2 부터 50까지 i를 제외한 i의 배수와 같은 인덱스에 0를 넣은 다음 배열에 0이 아닌 수를 출력해 보자. 
		//출력 결과가 모두 소수인데 이유를 생각해 보자.
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
		
		//8.컴퓨터에서 주사위던지는 프로그램을 구현하였을때 던져서 나온수의 빈도(회수)를 구하는 프로그램을 작성해 보자.
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
		System.out.println("======30번 던져서 나온 결과======");
		System.out.println("1이 나온횟수"+aX[0]);
		System.out.println("2가 나온횟수"+aX[1]);
		System.out.println("3이 나온횟수"+aX[2]);
		System.out.println("4가 나온횟수"+aX[3]);
		System.out.println("5가 나온횟수"+aX[4]);
		System.out.println("6이 나온횟수"+aX[5]);
		
		//9.50명의 학생의 출석 사항을  저장하는 아래와 같은 메뉴를 가진 프로그램을 만들어 보자. 
		//메뉴: 1.전체 출석사항 2.결석자 추가 3.출석자 추가 4.조퇴자 추가 5.지각자 추가 6.프로그램 종료
		int student[]=new int[50];
		int aX=0;
		int cX=0;
		int dX=0;
		int member=0;
		for(;;) {
			System.out.print("1.전체 출석사항 2.결석자 추가 3.출석자 추가 4.조퇴자 추가 5.지각자 추가 6.프로그램 종료:");
			int menu=Integer.parseInt(scanner.nextLine());
			if(menu==1) {
				System.out.println("=======현재 출결 사항========");
				System.out.println("정원 총"+student.length+"명");
				System.out.println("결석"+aX+"명");
				System.out.println("조퇴"+cX+"명");
				System.out.println("지각"+dX+"명");
				System.out.println("총 출결:"+(student.length-member)+"명");
			}else if(menu==2) {
				System.out.print("몇명 결석했습니까?:");
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
				System.out.print("몇명 조퇴했습니까?:");
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
