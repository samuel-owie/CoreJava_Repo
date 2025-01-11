package com.packages.chapters.chapter05.sealed;

final record JSONString(String value) implements JSONPrimitive {
    public String toString() {return "\"" + value.translateEscapes() + "\"";}
}
