package com.shaigor.example.openapi.model;

import java.util.List;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Response {
    public abstract List<Model> getModels();

    public abstract int getCount();
}
