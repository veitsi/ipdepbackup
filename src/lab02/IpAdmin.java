package lab02;

public class IpAdmin {
	int subnets;
	long AbsAdress = 0xC0A80100L; // 192.168.1.0 network
	Node cn;
	int[] h = { 18, 9, 2, 3, 2 };
	int i;
	IPdep p;

	public static void main() {
		System.out.println(Math.pow(2, 8));
	}

	public String adr2ip(int adress) {
		long fullAdress = this.AbsAdress + (long) adress;
		int b1 = (int) (fullAdress / 256 / 256 / 256);
		fullAdress -= (long) b1 * 256 * 256 * 256;
		int b2 = (int) (fullAdress / 256 / 256);
		fullAdress -= (long) b2 * 256 * 256;
		int b3 = (int) (fullAdress / 256);
		fullAdress -= (long) b3 * 256;
		int b4 = (int) fullAdress;
		return "" + b1 + "." + b2 + "." + b3 + "." + b4;
	}

	void displaySubnet() {
		System.out.println("bits for host part " + cn.bits);
		System.out.println("hosts in subnet " + h[i] + " from " + cn.hosts());
		System.out.println("network " + this.adr2ip(cn.networkAdress));
		System.out.println("broadcast " + this.adr2ip(cn.broadcastAdress));
		System.out.println("-----------");
	}

	public void propogateState() {
		while (cn.isRightChild()) {
			cn = cn.parent;
			cn.busy = true;
		}
	}

	public boolean feed(RequestLog r, int bits) {

		if (bits < 2 || bits > 24)
			return false;
		subnets = r.acceptedRequests();
		subnets = 3;

		if (subnets < 2)
			return false;

		// System.out.println("Let's start dividing "+h[0]);

		// for (int i=0;i<subnets;i++) d[i].hosts = h[i];

		BinaryTree bt = new BinaryTree(bits);
		i = 0;
		int hosts;

		// boolean repeat=false;
		cn = bt.root;

		while (i < subnets) {
			hosts = h[i];
			if (cn.isBusy()) {
				System.out.println("no more space!");
				return false;
			}

			if (hosts > cn.hostsInChild()) {// coin stays in this cell
				cn.busy = true;
				// cn.displayBinary();
				this.displaySubnet();
				propogateState();
				i++;
				cn = bt.root;
				continue;
			} else {
				if (!cn.hasChildren())
					cn.makeChildren();
				if (!cn.leftChild.isBusy()) {
					cn = cn.leftChild;
					continue;
				}
				if (!cn.rightChild.isBusy()) {
					cn = cn.rightChild;
					continue;
				}
			}
			; // end if
		}
		; // end while

		return true;
	} // end feed

} // end IPAdmin
