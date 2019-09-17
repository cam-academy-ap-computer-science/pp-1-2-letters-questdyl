public class Letters {

	public static void main(String[] args) {
		// The House That Jack Built
		System.out.println("This is the house that Jack built.");
		System.out.println("\nThis is the malt");
		house();
		System.out.println("\nThis is the rat,");
		malt();
		System.out.println("\nThis is the cat,");
		rat();
		System.out.println("\nThis is the dog,");
		cat();
		System.out.println("\nThis is the cow with the crumpled horn,");
		dog();
		System.out.println("\nThis is the maiden all forlorn");
		cow();
	}
	public static void house() {
		System.out.println("That lay in the house that Jack built.");
	}
	public static void malt() {
		System.out.println("That ate the malt");
		house();
	}
	public static void rat() {
		System.out.println("That killed the rat,");
		malt();
	}
	public static void cat() {
		System.out.println("That worried the cat,");
		rat();
	}
	public static void dog() {
		System.out.println("That tossed the dog,");
		cat();
	}
	public static void cow() {
		System.out.println("That milked the cow with the crumpled horn,");
		dog();
	}
}
