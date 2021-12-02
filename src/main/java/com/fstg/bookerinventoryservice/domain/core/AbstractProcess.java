package com.fstg.bookerinventoryservice.domain.core;

public interface AbstractProcess<T extends AbstractProcessInput> {
    Result execute(T abstractProcessInput);
}
