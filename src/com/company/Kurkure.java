package com.company;

abstract class Kurkure {
    abstract void tedhemedhe();

}
class Chips extends Kurkure{
    @Override
    void tedhemedhe() {
        System.out.println("turture is tastier than chips ");}
    public static void main(String[] args) {
	// write your code here
        Kurkure yammy =new Chips();
        yammy.tedhemedhe();
    }
    }

