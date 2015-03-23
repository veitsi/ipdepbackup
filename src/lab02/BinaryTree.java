package lab02;

public class BinaryTree {
	Node root;
	BinaryTree(int mask){
		root = new Node(32-mask);	
		root.networkAdress = 0;
		root.broadcastAdress = (1<<root.bits)-1;
	}
}