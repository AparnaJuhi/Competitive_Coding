package L58_BST;

public class BSTClient {

	public static void main(String[] args) {
		
		
		int[] in = {10,20,30,40,50,60,70};
		BST bst = new BST(in);
		bst.display();
		//System.out.println(bst.find(50));
		//bst.replaceWithSumLarger();
		bst.add1(35);
		bst.display();
		
		
		

	}

}
