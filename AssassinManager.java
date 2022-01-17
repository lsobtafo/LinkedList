package hw3;
import java.util.*;

import hw3.AssassinManager.AssassinNode;

public class AssassinManager {
	private int size;
	private AssassinNode head;
	
	
	public class AssassinNode{
		private String name;
		private AssassinNode next;
		public AssassinNode(String name) 
		{
			this.name = name;
			this.next = next;
		}
		public AssassinNode(Object data, AssassinNode head) {
			// TODO Auto-generated constructor stub
			
		}
		//private String name;
		//private AssassinNode next;
	}
	

	public AssassinManager(List<String> names) 
	{
		if(names==null||names.size()==0)
			throw new IllegalArgumentException("List is empty");
		
			for(String name:names)
			{
				addLast(name);
			}
		//if (names.isEmpty())
			//throw new IllegalArgumentException("the list is empty");
			
			
			
		// this.size = 0;
		// this.head = null;
		// AssassinNode newNode = new AssassinNode(data,null);
		/*for (String i : names) {
			AssassinNode cur = null;
			AssassinNode newNode = new AssassinNode(i);
			if (this.size == 0)
			{
				this.head = newNode;
			}
			else {
				while (cur.next != null) {
					cur = cur.next;
				}
														
				cur.next = newNode;
			}
			// this.head = newNode;
			this.size++;
		}
		//if(names==null||names.size()==0)
			//throw new IllegalArgumentException("List is empty");
		
			//for(String name:names)
			//{
				
			//}
*/
	}

	public boolean gameOver() 
	{
		if(this.size==1)
		{
			return true;
		}
		return false;
	}

	public String winner() 
	{
		String result = " ";
		for(AssassinNode cur= this.head; cur!= null ; cur=cur.next)
		{
			result += cur.name + "\n";
		}
		return result;
	}

	public void printGraveyard() 
	{
		AssassinNode prev;
		for(AssassinNode cur= this.head; cur!= null ; cur=cur.next)
		{
			prev = cur;
			cur = cur.next;
			System.out.println("Current graveyard: /n");
			System.out.println("    " + cur + " was killed " + prev);
		}
		
	}

	public void printKillRing() 
	{
		AssassinNode prev;
		for(AssassinNode cur= this.head; cur!= null ; cur=cur.next)
		{
			prev = cur;
			cur = cur.next;
			System.out.println("Current kill ring: /n");
			System.out.println("    " + prev + " is stalking " + cur);
		}
		
		
		
	}

	public boolean graveyardContains(String name) 
	{
		for(AssassinNode cur =this.head; cur!=null;cur=cur.next)
		{
			if(cur.name==name)
				return true;
			
		}
		return false;
	}

	public boolean killRingContains(String name) 
	{
		for(AssassinNode cur =this.head; cur!=null;cur=cur.next)
		{
			if(cur.name==name)
				return true;
			
		}
	
		
		return false;
	}

	public void kill(String name) 
	{
		if(gameOver())
			throw new IllegalStateException("The game is over");
		if(killRingContains(name))
		{
			for(AssassinNode cur=this.head;cur!=null;cur=cur.next)
			{
				if(cur.name == name)
					remove(cur);
			}
		}
		
			
		
	}
		
		
	
	public void addFirst(Object data)
	{
		AssassinNode newNode = new AssassinNode(data, this.head);
		this.head = newNode;
		this.size++;
	}
	public void addLast(Object data)
	{
		if(this.isEmpty())
			addFirst(data);
		else
		{
			AssassinNode newNode = new AssassinNode(data,null);
			AssassinNode cur = this.head;
			while(cur.next!=null)
			{
				cur = cur.next;
			}
			cur.next = newNode;
			this.size++;
		}
	}
		public boolean remove(Object data) {
			AssassinNode cur,prev;
			for(prev=null,cur=this.head;cur!=null && cur.name.equals(data); cur=cur.next)
			{
				prev=cur;
			}
			if(cur.next==null) {
				if(cur.equals(data))
				{
				prev.next = null;
				}
			if(cur==this.head)
				this.head=this.head.next;
			else {
				prev.next =cur.next;
			}
			this.size--;
			return true;
			}//added
			return false;//added
			}//added	

		public boolean isEmpty()
		{
			if(this.head==null)
				return false;
			else return true;
		}
}


