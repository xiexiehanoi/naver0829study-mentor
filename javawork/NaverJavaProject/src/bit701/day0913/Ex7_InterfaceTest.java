package bit701.day0913;

import java.util.Scanner;

interface Board
{
	public void process();
}
//총 4개의 sub class 구현



///////////////////////////////
public class Ex7_InterfaceTest {
	
	public static void process(Board b)
	{
		b.process();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		Board b=null;
		Exit:
		while(true)
		{
			System.out.println("1.글쓰기  2.글삭제  3.글수정  4.글목록  5.종료");
			System.out.print("선택>");
			num=Integer.parseInt(sc.nextLine());
			switch(num)
			{
			case 1:
				b=new Insert();
				break;
			case 2:
				b=new Delete();
				break;
			case 3:
				b=new Update();
				break;
			case 4:
				b=new List();
				break;
			default:
				System.out.println("게시판 관리 종료!!");
				break Exit;
			}
			process(b);
			System.out.println();
		}

	}

}










