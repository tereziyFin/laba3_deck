package hihi;

import java.util.Random;

public class Deck {
	private Card[] cards;
	
	Deck() //создание колоды
	{
		cards = new Card[36];
		for (int i = 0; i < 36; i++)
				cards[i] = new Card(i);
	}
	public void out () //вывод колоды
	{
		for (int i = 0; i < 36; i++)
			cards[i].out();
		System.out.println();
	}
	
	public void shuffle () //перемешивание колоды
	{
		Random r = new Random();
		for (int i = 0; i < 36; i++)
		{
			int f = r.nextInt(65536) % 36;
			Card c = cards[i];
			cards[i] = cards[f];
			cards[f] = c;	
		}
	}
	
	public void deal (Order a, Order b) //назначение последовательности для игроков
	{
		int i = 0;
		while (i < 36)
		{
			a.add(cards[i]);
			i++;
			b.add(cards[i]);
			i++;
		}
	}
}

