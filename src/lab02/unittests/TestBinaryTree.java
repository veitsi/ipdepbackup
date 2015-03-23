package lab02.unittests;

import static org.junit.Assert.*;
import lab02.BinaryTree;

import org.junit.Test;

public class TestBinaryTree {

	@Test
	public void test() {
		BinaryTree bt = new BinaryTree(24);
		//System.out.println(bt.root.hosts());
		//System.out.println(bt.root.networkAdress);
		//System.out.println(bt.root.broadcastAdress);
		//if (bt.root.parent==null) System.out.println("no parents for root");
		System.out.println(bt.root.leftChild.parent);
		System.out.println(bt.root.leftChild.networkAdress);
		System.out.println(bt.root.leftChild.broadcastAdress);
		System.out.println("network "+ bt.root.rightChild.networkAdress);
		System.out.println("broadcast "+bt.root.rightChild.broadcastAdress);
		bt.root.rightChild.makeChildren();
		System.out.println("network "+ bt.root.rightChild.leftChild.networkAdress);
		System.out.println("broadcast "+bt.root.rightChild.leftChild.broadcastAdress);
		
		//fail("Not yet implemented");
	}

}
