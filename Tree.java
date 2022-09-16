import java.util.Scanner;
import java.util.*;
class BST
{
	Node root;


	class Node
	{
		int data;
		Node left,right;

		Node(int a)
		{
			data=a;
			left=right=null;
		}

	}

	void insert(int a)
	{
		Node nnode=new Node(a);
		if(root==null)
		{
			root=nnode;
		}

		else
		{
			Node temp=root;
			while(temp.left!=null || temp.right!=null )
			{
				if(nnode.data>=temp.data && temp.right!=null)
				{
					temp=temp.right;
				}
				else if(nnode.data<temp.data && temp.left!=null)
				{
					temp=temp.left;
				}
				else
				{
					break;
				}
			}

			if(nnode.data>=temp.data)
			{
				temp.right=nnode;
			}
			else
			{
				temp.left=nnode;
			}
		}
	}

	void display_Inorder()
	{
		if(root==null)
		{
			System.out.println("Empty--------Empty--------Empty ");
		}
		else
		{
			Node temp=root;
			Stack<Node> st=new Stack<Node>();
			while(temp!=null || st.size()>0)
			{
				while(temp!=null)
				{
					st.push(temp);
					temp=temp.left;
				}
				temp=st.pop();
				System.out.print(temp.data+" ");
				temp=temp.right;
			}
		}
	}

	void display_Preorder()
	{

		Stack<Node> st=new Stack<Node>();
		st.push(root);
		while(st.size()>0)
		{
			Node temp=st.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null)
			{
				st.push(temp.right);
			}

			if(temp.left!=null)
			{
				st.push(temp.left);
			}
		}

	}

	void display_Postorder()
	{
		Stack<Node> st1=new Stack<Node>();
		Stack<Node> st2=new Stack<Node>();
		st1.push(root);
		while(st1.size()>0)
		{
			Node temp=st1.pop();
			st2.push(temp);
			if(temp.left!=null)
			{
				st1.push(temp.left);
			}

			if(temp.right!=null)
			{
				st1.push(temp.right);
			}
		}
		while(st2.size()>0)
		{
			Node temp=st2.pop();
			System.out.print(temp.data+" ");
		}
	}
	void delete_leafnode(int a)
	{
		Node parent=null;
		Node temp=root;
		while(temp!=null && temp.data!=a)
		{
			parent=temp;
			if(a>temp.data)
			{
				temp=temp.right;
			}

			else
			{
				temp=temp.left;
			}
		}

		if(temp.left==null && temp.right==null)
		{
			if(parent.data>temp.data)
			{
				parent.left=null;
			}
			else
			{
				parent.right=null;
			}
		}
	}
}

public class Tree
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		BST obj=new BST();
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
		obj.insert(9);
		obj.insert(7);
		obj.insert(2);
		obj.insert(1);

		System.out.println("Leafnode delete 7");
		obj.delete_leafnode(7); 
		System.out.print("\n");

		System.out.println("Inorder Traversal");
		obj.display_Preorder(); 
		System.out.print("\n");


		System.out.println("Preorder Traversal");
		obj.display_Preorder(); 
		System.out.print("\n");


		System.out.println("Postorder Traversal");
		obj.display_Postorder(); 
		System.out.print("\n");



	}
}