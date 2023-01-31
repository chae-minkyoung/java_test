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
		System.out.print("차 이름을 입력하시오.:");
		name=sc.next();
		}
	public void color_setter() {
		System.out.print("차 색을 입력하시오.:");
		color=sc.next();
		}
	public void num_setter() {
		System.out.print("차량 번호를 입력하시오.:");
		num=sc.nextInt();
		}
	public void address_setter() {
		System.out.print("운전자 주소를 입력하시오.:");
		sc.nextLine();
		address=sc.nextLine();
		}
	public void velocity_setter() {
		System.out.print("속도를 입력하시오.:");
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
		System.out.printf("차 이름 : %s\n", grandeur.name_getter());
		System.out.printf("차 색 : %s\n", grandeur.color_getter());
		System.out.printf("차량 번호 : %d\n", grandeur.num_getter());
		System.out.printf("운전자 주소 : %s\n", grandeur.address_getter());
		System.out.printf("속도 : %d", grandeur.velocity_getter());

	}

}
