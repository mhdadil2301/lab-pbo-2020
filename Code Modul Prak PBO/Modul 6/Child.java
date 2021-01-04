/*public class Child extends Parent {
	int x;
	
	public Child() {
	x = 5;
	super();
	}
}

/*
penjelasan code:
Code diatas akan error jika dikompilasikan, karena pemanggilan method
super() nya tidak dibaris pertama.
Maka kita ubah codenya seperti dibawah ini :
*/

public class Child extends Parent {
	int x;

	public Child() {
	super();
	x = 5;
	}
}

/*
Pada class ini tidak menghasilkan error disebabkan 
pemanggilan method super() nya dibaris pertama.
*/
