package edu.mission0130;

import java.util.Scanner;

class car{
	Scanner sc = new Scanner(System.in);
	private int num = 0;
	private int velocity = 0;
	private String name = null;
	private String color = null;
	private String address = null;
	
	public void name_setter() {
		System.out.print("�� �̸��� �Է��Ͻÿ�.:");
		name=sc.next();
		}
	public void color_setter() {
		System.out.print("�� ���� �Է��Ͻÿ�.:");
		color=sc.next();
		}
	public void num_setter() {
		System.out.print("���� ��ȣ�� �Է��Ͻÿ�.:");
		num=sc.nextInt();
		}
	public void address_setter() {
		System.out.print("������ �ּҸ� �Է��Ͻÿ�.:");
		sc.nextLine();
		address=sc.nextLine();
		}
	public void velocity_setter() {
		System.out.print("�ӵ��� �Է��Ͻÿ�.:");
		velocity=sc.nextInt();
		}
	public String name_getter() {
		return name;
		}
	public String color_getter() {
		return color;
		}
	public int num_getter() {
		return num;
		}
	public String address_getter() {
		return address;
		}
	public int velocity_getter() {
		return velocity;
		}
}



public class mission0130_2 {

	public static void main(String[] args) {
		car grandeur = new car();
		grandeur.name_setter();
		grandeur.color_setter();
		grandeur.num_setter();
		grandeur.address_setter();
		grandeur.velocity_setter();
		System.out.printf("�� �̸� : %s\n", grandeur.name_getter());
		System.out.printf("�� �� : %s\n", grandeur.color_getter());
		System.out.printf("���� ��ȣ : %d\n", grandeur.num_getter());
		System.out.printf("������ �ּ� : %s\n", grandeur.address_getter());
		System.out.printf("�ӵ� : %d", grandeur.velocity_getter());

	}

}
