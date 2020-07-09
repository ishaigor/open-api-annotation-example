package com.shaigor.example.openapi.model;

import java.util.Optional;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Model {
    // this is the ID of the review
    public abstract int getId();

    public abstract String getText();

    public abstract String getTitle();

    public abstract boolean isActive();

    public abstract Optional<String> getOptionalString();

    public abstract Optional<Model> getParent();
}
