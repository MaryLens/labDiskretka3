package main;

import java.util.Scanner;

public class App {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int nodes;
		System.out.print("������� ����������� ������ �����:\n ");
		nodes = sc.nextInt();
		
		Graph graph = new Graph();
		graph.setNodes(nodes);

		graph.setPList();
		graph.getPList();
		
		System.out.println("����������� ���� �� ��������-������:");
		graph.minBellmanCalab();
		
		System.out.println("������������ ���� �� ��������-������:");
		graph.maxBellmanCalab();
		
		System.out.println("����������� ���� �� �����:");
		graph.minFord();
		graph.printMinFord();		
		sc.close();
		System.out.println();
		System.out.println("������������ ���� �� �����:");
		graph.maxFord();
		graph.printMaxFord();		
		sc.close();
	}
	
	

	// �� -1 1 0 0 0 0 1 -1 0 0 0 -1 0 1 0 1 0 0 -1 0 -1 0 0 0 1 0 0 0 1 -1 0 0 2 0 0
	// �� 0 1 0 0 1 0 0 0 1 0 0 1 1 0 0 1 0 0 0 0 0 0 0 1 0
	//5 7 2 5 0 4 0 2 3 0 1 0 4 0 1
	
	/*
	 1 2 = 3
	 1 3 = 7
	 1 4 = 4
	 2 3 = 4
	 2 6 = 7
	 2 7 = 11
	 3 5 = 1
	 3 6 = 5
	 4 3 = 5
	 4 5 = 5
	 5 6 = 4
	 5 8 = 9
	 5 9 = 14
	 6 7 = 4
	 6 8 = 6
	 7 8 = 2
	 7 9 = 7
	 8 9 = 3
	 0 0 = 0
	 */

}
