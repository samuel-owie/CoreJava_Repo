package com.packages.chapters.chapter05.sealed;

enum JSONBoolean implements JSONPrimitive {
    FALSE, TRUE;
    public String toString() { return super.toString().toLowerCase();}
}
