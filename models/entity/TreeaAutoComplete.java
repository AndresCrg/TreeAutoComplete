package models.entity;

//172.16.0.72 8080

public class TreeaAutoComplete {
	
	private Node root;
	
	public TreeaAutoComplete() {
		root = new  Node('R');
	}
	
	public int getWeight() {
		return (root != null) ? root.getWeight():0;
	}
	
	public Node getRoot() {
		return root;
	}
}