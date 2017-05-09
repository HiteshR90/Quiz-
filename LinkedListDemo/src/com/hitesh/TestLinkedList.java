package com.hitesh;

public class TestLinkedList
{
	private static final Node head;

	private TestLinkedList()
	{
	}

	static
	{
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		Node f = new Node(60);
		Node g = new Node(70);

		head = a;
		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
		d.setNext(e);
		e.setNext(f);
		f.setNext(g);
		g.setNext(null);
	}

	public static void main(String[] args)
	{
		System.out.print("Original List - ");
		traverse();

		appendElement(80);

		System.out.print("After appending - ");
		traverse();

		removeTailElement();

		System.out.print("After removing tail element - ");
		traverse();

		removeNodesGreaterThanTargetValue(35);

		System.out.print("After removing Nodes greater than target Value - ");
		traverse();

	}

	private static void removeNodesGreaterThanTargetValue(int targetValue)
	{
		Node node = head;
		Node prev = head;

		while (node.getNext() != null && node.getData() <= targetValue)
		{
			prev = node;
			node = node.getNext();
		}
		prev.setNext(null);
	}

	private static void removeTailElement()
	{
		Node node = head;
		Node prev = head;

		while (node.getNext() != null)
		{
			prev = node;
			node = node.getNext();
		}
		prev.setNext(null);
	}

	private static void appendElement(int data)
	{
		Node newNode = new Node(data);
		newNode.setNext(null);

		Node node = head;
		while (node.getNext() != null)
		{
			node = node.getNext();
		}
		node.setNext(newNode);
	}

	public static void traverse()
	{
		Node node = head;
		while (node.getNext() != null)
		{
			System.out.print(node.getData() + "-->");
			node = node.getNext();
		}
		System.out.print(node.getData());
		System.out.println("");
	}
}
