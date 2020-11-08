package edu.smg;

public class Cards_8 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int[] deck = new int[52];  //съзадаваме тесте с 52 карти
		for(int i = 0; i < 52; i++) {
			deck[i] = i;
		}
		// 0-12 spades пика
		// 13-25 < 3   купа
		// 26-38 <>    каро
		// 39-51 clubs спатия
		
		// shuffle deck
		for(int i = 0; i < 52; i++) { //разбъркване на тестето //from Randomiser_08  
			int randomIndex = (int) (Math.random() * 10); //index from 0 to 9 
			int swap = deck[randomIndex];     //сменяне на стойност на карта на рандъм индекс с място на карта на място с индекс i 
			deck[randomIndex] = deck[i];      //i заема стойност от 0 до 51 последователно
			deck[i] = swap;
		}
		//draw 4 cards
		int[] drawnCards = new int[4]; //теглим 4 карти без да има повтаряща се
		for(int i = 0; i < 4; i++) {   // from LeftShift (измества ги с едно наляво)
			int randomIndex = (int) (Math.random() * (52 - i)); //index from 0 to the end of the deck
			drawnCards[i] = deck[randomIndex];
			for (int j = randomIndex; j < deck.length - i; j++) { 
				deck[j] = deck[j+1];
			}
			deck[ deck.length - i - 1] = -1; //-1 невалидна стойност
			}
			
			//convert numbers to cards //превръщане на изтегленото число в карта
			for (int i = 0; i < 4; i++) {
				int colorIndex = drawnCards[i] / 13;
				int valueIndex = drawnCards[i] % 13;
				String cardColor = "";
				String cardValue = "";
				switch(colorIndex) {
				case 0: cardColor = "spades";break;
				case 1: cardColor = "hearts";break;
				case 2: cardColor = "diamonds";break;
				case 3: cardColor = "clubs";break;
				}
				switch(valueIndex) {   
				case 0: cardValue = "2";break;
				case 1: cardValue = "3";break;
				case 2: cardValue = "4";break;
				case 3: cardValue = "5";break;
				case 4: cardValue = "6";break;
				case 5: cardValue = "7";break;
				case 6: cardValue = "8";break;
				case 7: cardValue = "9";break;
				case 8: cardValue = "10";break;
				case 9: cardValue = "J";break;
				case 10: cardValue = "Q";break;
				case 11: cardValue = "K";break;
				case 12: cardValue = "A";break;
				}
				
				System.out.print( cardValue + " " + cardColor + "= ");

				}
			}
		}
	
