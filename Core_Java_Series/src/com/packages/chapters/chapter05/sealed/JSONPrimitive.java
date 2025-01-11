package com.packages.chapters.chapter05.sealed;

sealed interface JSONPrimitive extends JSONValue permits JSONNumber, JSONString, JSONBoolean, JSONNull {}
