package hihi;

public class Card {
	private int name;
	private Card next;
	
	public void out () //����� ����� �� �����
	{
		switch (name % 9)
		{
			case 0:
			{
				System.out.printf("%3d",6);
				break;
			}
			case 1:
			{
				System.out.printf("%3d",7);
				break;
			}
			case 2:
			{
				System.out.printf("%3d",8);
				break;
			}
			case 3:
			{
				System.out.printf("%3d",9);
				break;
			}
			case 4:
			{
				System.out.printf("%3d",10);
				break;
			}
			case 5:
			{
				System.out.printf("%3c", 'J');
				break;
			}
			case 6:
			{
				System.out.printf("%3c", 'Q');
				break;
			}
			case 7:
			{
				System.out.printf("%3c", 'K');
				break;
			}
			case 8:
			{
				System.out.printf("%3c", 'A');
				break;
			}
		}
		switch (name % 4)
		{
			case 0:
			{
				System.out.print("d"); //diamonds - �����
				break;
			}
			case 1:
			{
				System.out.print("h"); //hearts -- �����
				break;
			}
			case 2:
			{
				System.out.print("s"); //spades -- ����
				break;
			}
			case 3:
			{
				System.out.print("c"); //clubs -- �����
				break;
			}
		}
	}
	
	public int getName()
	{
		return name;
	}
	
	Card (int a)
	{
		name = a;
	}
	
	public void setNext (Card a) //������ ���� �����
	{
		next = a;
	}
	
	public Card getNext() //���������� ���� �����
	{
		return next;
	}
	
}

