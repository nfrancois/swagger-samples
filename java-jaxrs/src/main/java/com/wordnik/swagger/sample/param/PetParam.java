package com.wordnik.swagger.sample.param;

import javax.ws.rs.PathParam;

public class PetParam {

    @PathParam("petIdInjectParam")
    private Long petId;

    public Long getPetId() {
        return petId;
    }

    public void setPetId(final Long petId) {
        this.petId = petId;
    }
}
