package com.shaigor.example.openapi.model;

import java.util.Optional;

import io.swagger.v3.oas.annotations.media.Schema;
import org.immutables.value.Value;

@Value.Immutable
public abstract class Model {
    // this is the ID of the review
    public abstract int getId();

    public abstract String getText();

    public abstract String getTitle();

    public abstract boolean isActive();

    public abstract Optional<String> getOptionalString();

    // Uncomment to work around the missing property @Schema
    public abstract Optional<Model> getParent();
}
