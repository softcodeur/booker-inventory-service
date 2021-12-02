package com.fstg.bookerinventoryservice.domain.commande.delete;

import com.fstg.bookerinventoryservice.domain.core.AbstractProcessInput;

public class CommandeDeleteInput extends AbstractProcessInput {
    String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

}
