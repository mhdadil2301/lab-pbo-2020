/**
*Return the mobey in the balance.
*The balance is cleared.
*/
public class RefundBalance {
    public int refBalance(){
	int amountToRefund;
	amountToRefund = balance;
	balance = 0;
	return amountToRefund;
    }
}
