package ui;

import domain.BinaryTree;

public class BinaryTreeDriver {

	public static void main(String[] args) {
		BinaryTree<String> nodeA = new BinaryTree<>("A");
		BinaryTree<String> nodeC = new BinaryTree<>("C");
		BinaryTree<String> nodeE = new BinaryTree<>("E");
		BinaryTree<String> nodeH = new BinaryTree<>("H");


		// knoop A heeft links D en rechts F

		BinaryTree<String> nodeD = new BinaryTree<>("D",nodeC, nodeE);
		BinaryTree<String> nodeB = new BinaryTree<>("B",nodeA,nodeD);
		BinaryTree<String> nodeI = new BinaryTree<>("I",nodeH, null);
		BinaryTree<String> nodeG = new BinaryTree<>("G",null, nodeI);
		// knoop E heeft links H

		// knoop G heeft links E en rechts B


		// boom heeft root C en heeft links A en rechts G
		BinaryTree<String> boom = new BinaryTree<>("F",nodeB, nodeG);
//		boom.printPreorder();
//		boom.printInorder();
//		boom.printPostorder();
		boom.getDepth();
	}


}
