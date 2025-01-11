package com.packages.chapters.chapter05.sealed;

sealed interface JSONPrimitive extends JSONValue permits JSONNumber, JSONBoolean, JSONNull {}
