package com.packages.chapters.chapter05.sealed;

sealed interface JSONValue permits JSONArray, JSONObject, JSONPrimitive {

    public default String type(){
        if(this instanceof JSONArray) return "array";
        else if(this instanceof JSONObject) return "object";
        else if(this instanceof JSONNumber) return "number";
        else if(this instanceof JSONString) return "string";
        else if(this instanceof JSONBoolean) return "boolean";
        else return "null";
    }
}
