package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
		Backpack backpack = new Backpack();
		Pencil lead = null;
		backpack.putInBackpack(lead);
		Ruler inch = null;
		backpack.putInBackpack(inch);
	}
}
