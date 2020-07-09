package com.shaigor.example.openapi.model;

import java.util.Map;

import org.immutables.value.Value;

@Value.Immutable
public abstract class ByIdResponse {
    public abstract Map<Integer, Model> getModelsById();
}
