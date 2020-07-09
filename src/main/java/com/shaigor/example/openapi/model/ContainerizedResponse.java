package com.shaigor.example.openapi.model;

import java.util.List;

import org.immutables.value.Value;

@Value.Immutable
public abstract class ContainerizedResponse {
    public abstract List<ModelContainer> getContainerizedModels();
    public abstract int getTotalCount();
}
