package com.packages.chapters.chapter05.sealed;

final record JSONNumber(double value) implements JSONPrimitive {
    public String toString() {return "" + value;}
}
