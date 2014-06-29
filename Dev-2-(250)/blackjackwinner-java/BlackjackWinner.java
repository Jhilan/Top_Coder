public class BlackjackWinner {
	public int winnings(int bet, int dealer, int dealerBlackjack, int player, int blackjack) {
		int ans=0;
         if((player > dealer || dealer > 21) && player <= 21)ans= bet;
         if(player <= 21 && dealer == player) ans= 0;
         if((player < dealer || player > 21) && ans ==0)ans= bet * -1;
         
         if(dealerBlackjack ==0  && blackjack ==0 ) return ans;
         if(dealerBlackjack ==1  && blackjack ==0 ) return  bet * -1;
         if(dealerBlackjack ==0  && blackjack ==1 ) return  bet +(bet/2);
         if(dealerBlackjack ==1  && blackjack ==1 ) return 0;
       
		return ans;
	}
}
