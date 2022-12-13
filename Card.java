package hihi;

public class Card {
	private int name;
	private Card next;
	
	public void out () //вывод карты на экран
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
				System.out.print("d"); //diamonds - бубны
				break;
			}
			case 1:
			{
				System.out.print("h"); //hearts -- червы
				break;
			}
			case 2:
			{
				System.out.print("s"); //spades -- пики
				break;
			}
			case 3:
			{
				System.out.print("c"); //clubs -- трефы
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
	
	public void setNext (Card a) //задает след карту
	{
		next = a;
	}
	
	public Card getNext() //возвращает след карту
	{
		return next;
	}
	
}

