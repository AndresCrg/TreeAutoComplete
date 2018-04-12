package models.entity;

import java.util.ArrayList;

public class Node {
	
	 private char letter;
	 private int weight;
	 private Node next;
	 private ArrayList<Node> childList;
	 
	public Node(char letter, int weight) {
		this.letter = letter;
		this.weight = weight;
	}
	
	public Node(char letter) {
		this.letter = letter;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public ArrayList<Node> getChildList() {
		return childList;
	}

	@Override
	public String toString() {
		return "Node [letter=" + letter + ", weight=" + weight + "]";
	}
}