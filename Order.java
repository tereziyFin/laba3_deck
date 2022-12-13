package hihi;

public class Order {
	private Card head;
	
	private Card getHead() 
	{
		return head;
	}
	
	private void setHead(Card a)
	{
		head = a;
	}
	
	public void add(Order a)
	{
		if (head == null) 
		{
			head = a.getHead();
		}
		else
		{
			Card n = head;
			while (n.getNext() != null)
				n = n.getNext();
			n.setNext(a.getHead());
		}
		a.setHead(null);
	}
	
	public void add(Card a) // добавление карты в последовательность
	{
		a.setNext(null);
		if (head == null) 
		{
			head = a;
		}
		else
		{
			Card n = head;
			while (n.getNext() != null)
				n = n.getNext();
			n.setNext(a);
		}
	}
	public void out() //печать последовательности
	{
		Card n = head;
		while (n != null) 
			{
				n.out();
				n = n.getNext();
			}
		System.out.println();
	}
	
	public void play(Order a, Order b)
	{
		a.out();
		b.out();
		Card af = a.getHead();
		Card bf = b.getHead();
		a.setHead(af.getNext());
		b.setHead(bf.getNext());
		this.add(af);
		this.add(bf);
		this.out();
		if (af.getName() % 9 > bf.getName( ) % 9)
			a.add(this);
		else
			b.add(this);
		a.out();
		b.out();
	}
}
