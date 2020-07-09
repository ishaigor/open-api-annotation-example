package com.shaigor.example.openapi.model;

import java.util.Optional;

import org.immutables.value.Value;

@Value.Immutable
public abstract class ModelContainer {
    public abstract Optional<Model> getModel();
    public abstract int getId();
    public abstract String getText();
}
