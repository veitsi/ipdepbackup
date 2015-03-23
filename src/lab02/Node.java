package lab02;

class Node {
	int bits;
	int networkAdress;
	int broadcastAdress;
	boolean busy;

	Node parent;
	Node leftChild;
	Node rightChild;

	Node(int b) {
		this.bits = b;
	}

	void displayBinary() {
		System.out.println("current node has bits " + this.bits);
		System.out.println("binar network="
				+ Integer.toString(this.networkAdress, 2));
		System.out.println("binar network="
				+ Integer.toString(this.broadcastAdress, 2));

	}

	boolean isBusy() {
		return busy;
	}

	boolean hasChildren() {
		return (leftChild != null);
	}

	int hosts() {
		return (1 << bits) - 2;
	}

	int hostsInChild() {
		return (1 << (bits - 1)) - 2;
	}

	boolean isLeftChild() {
		return this == this.parent.leftChild;
	}

	boolean isRightChild() {
		return this == this.parent.rightChild;
	}

	void makeChildren() {
		leftChild = new Node(this.bits - 1);
		leftChild.parent = this;
		leftChild.networkAdress = this.networkAdress;
		leftChild.broadcastAdress = this.networkAdress
				+ (1 + this.broadcastAdress - this.networkAdress) / 2 - 1;
		leftChild.busy = false;

		rightChild = new Node(this.bits - 1);
		rightChild.parent = this;
		rightChild.networkAdress = leftChild.broadcastAdress + 1;
		rightChild.broadcastAdress = this.broadcastAdress;
		rightChild.busy = false;
	}
}
