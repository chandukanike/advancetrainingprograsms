package com.chandu;



	import java.util.LinkedList;
	import java.util.List;
	import java.util.ListIterator;
	import java.util.Scanner;

	public class LinkedListNode {
		
		public static Integer getNthNode(List<Integer> listOfNodes , int N) {
			
			 Integer node = -1;
			 
			 if(N > listOfNodes.size())
				 return node;
			 
			 
			 int count = 1;
			 ListIterator<Integer> listIterator = listOfNodes.listIterator(listOfNodes.size());
			 
			 while(listIterator.hasPrevious()) {
				 
				 node = listIterator.previous();
				 
				 if(count == N) {
					 
					 break;
				 }
				 
				 count+=1;
			 }
			 
			 return node;
		}

		public static void main(String[] args) {
			
			Scanner scannerObj = new Scanner(System.in);
			System.out.print("Enter Number of Test cases : ");
			
			int testCases = scannerObj.nextInt() , count = 1;
			
			System.out.println();
			
			while(true) {
				
				if(count == testCases +1)
					break;
				
				System.out.print("Enter Number of Nodes in the Linked List : ");
				int num = scannerObj.nextInt();
				
				System.out.print("Enter the Nth node which you want to find : ");
				int N = scannerObj.nextInt();
				
				List<Integer> listofNodes = new LinkedList<Integer>();
				
				for(int i=1;i<=num;i+=1) {
					
					System.out.print("Enter Node Number "+i+" : ");
					int node = scannerObj.nextInt();
					listofNodes.add(node);
				}
				
				Integer node = getNthNode(listofNodes, N);
				
				if(node == -1) {
					System.out.println(node+" i.e element doesn't exists!! ");
					count+=1;
					continue;
				}
				System.out.println("Element present at "+N+"th Node of the Linked List : "+listofNodes+" from the end is -> "+node);
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				count+=1;
				
				System.out.println("-------------------------------------");
				
				
			}
			
			scannerObj.close();

		}

	}

	    
