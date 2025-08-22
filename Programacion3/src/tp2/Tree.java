package ProgramacionIII.tp2;

public class Tree {

	private TreeNode root;
	
	public Tree() {
		this.root = null;
	}
	
	public void add(Integer value) {
		if (this.root == null)
			this.root = new TreeNode(value);
		else
			this.add(this.root,value);
	}
	
	private void add(TreeNode actual, Integer value) {
		if (actual.getValue() > value) {
			if (actual.getLeft() == null) { 
				TreeNode temp = new TreeNode(value);
				actual.setLeft(temp);
			} else {
				add(actual.getLeft(),value);
			}
		} else if (actual.getValue() < value) {
			if (actual.getRight() == null) { 
				TreeNode temp = new TreeNode(value);
				actual.setRight(temp);
			} else {
				add(actual.getRight(),value);
			}
		}
	}
	public TreeNode getRoot(){
		return this.root;
	}
	public boolean hasElem(Integer elem){
		if(this.root==null){
			return false;
		}
		if (elem.equals(this.root.getValue())){
			return true;
		} else {
			return hasElem(elem, this.root);
		}
	}
	private boolean hasElem(Integer elem, TreeNode nodo){
		if (elem.equals(nodo.getValue())){
			return true;
		}if (elem< nodo.getValue()&&nodo.getLeft()!=null){
			return hasElem(elem, nodo.getLeft());
		}
		if(elem>nodo.getValue()&&nodo.getRight()!=null){
			return hasElem(elem, nodo.getRight());

		}
		return false;


	}
	public boolean isEmpty(){
		return this.root==null;
	}
	public boolean delete(Integer valor) {
		if (this.root == null || !hasElem(valor)) {
			return false;
		}
		this.root = delete(valor, this.root);
		return true;
	}

	private TreeNode delete(Integer valor, TreeNode nodo) {
		if (nodo == null) {
			return null;
		}

		// Navigate to the target node
		if (valor < nodo.getValue()) {
			nodo.setLeft(delete(valor, nodo.getLeft()));
		} else if (valor > nodo.getValue()) {
			nodo.setRight(delete(valor, nodo.getRight()));
		} else {
			// Node found: Handling deletion cases

			// Case 1: Leaf node
			if (nodo.getLeft() == null && nodo.getRight() == null) {
				return null;
			}
			// Case 2: One child
			if (nodo.getLeft() == null) {
				return nodo.getRight();
			}
			if (nodo.getRight() == null) {
				return nodo.getLeft();
			}
			// Case 3: Two children
			TreeNode successor = findMin(nodo.getRight()); // Find in-order successor
			nodo.setValue(successor.getValue()); // Replace current node value with successor’s value
			nodo.setRight(delete(successor.getValue(), nodo.getRight())); // Remove successor node
		}

		return nodo;
	}
	private TreeNode findMin(TreeNode nodo) {
		while (nodo.getLeft() != null) {
			nodo = nodo.getLeft();
		}
		return nodo;
	}
	public int getHeight(){
		int contador=0;
		if (this.root==null){
			return -1;
		}
		return getHeight(this.root);
	}
	private int getHeight(TreeNode nodo){
		if (nodo==null){
			return -1;
		}
		int alturaIzq=getHeight(nodo.getLeft());
		int alturaDer=getHeight(nodo.getRight());
		return 1+ Math.max(alturaDer, alturaIzq);

	}

	public void printPosOrder() {
		if (this.root != null) {
			printPosOrder(this.root);
		}
	}

	private void printPosOrder(TreeNode nodo) {
		if (nodo != null) {
			printPosOrder(nodo.getLeft());
			printPosOrder(nodo.getRight());
			System.out.println(nodo.getValue() + " ");
		}
	}


}
