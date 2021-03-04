package com.engim;

public class Nil extends List{

    @Override
    public String toString() {
        return "";
    }

    @Override
    public List addLast(int x) {
        return new Node(x, this);
    }

    @Override
    public void addLast2(int x) {
    }

    @Override
    public List add(int x, int i) {
        return new Node(x, this);
    }

    @Override
    public List remove(int x) {
        System.out.println("valore non trovato");
        return this;
    }

    @Override
    public List removeAtIndex(int i) {
        System.out.println("indice non trovato");
        return this;
    }

    @Override
    public List doppio() {
        return this;
    }

    @Override
    public boolean pari() {
        return true;
    }

    @Override
    public boolean ordinata(int next) {
        return true;
    }

    @Override
    public boolean ordinataCrescenteDecrescente(Ordine ordine, int value) {
        return true;
    }

}
