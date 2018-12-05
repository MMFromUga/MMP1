package fr.uga.projet1.defaultItf;

public interface Interface2 {
	default void m1() {
		System.out.println("itf2:m1");
	}
	
	void m3();
}
