package oops__Concept;


class Team{
	public void dev()
	{
		System.out.println("Full Stack Java.");
	}
}

class Frontend extends Team{
	public void frontDev()
	{
		System.out.println("Web  Develpoer.");
	}
}

class Backend extends Team{
	public void backDev()
	{
		System.out.println("Android Developer. ");
	}
}
public class Hierarchical_inheritance {

	public static void main(String[] args) {
		Frontend fe = new Frontend();
		Backend be = new Backend();
		fe.frontDev();
		fe.dev();
		be.backDev();
		be.dev();
	}

}