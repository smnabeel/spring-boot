package com.mna.container.app._3_application;

import java.util.Optional;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mna.container.app._2_presentation.PetApi;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
public class PetApiController implements PetApi {

    private final PetApiDelegate delegate;

    public PetApiController(@Autowired(required = false) PetApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PetApiDelegate() {});
    }

    @Override
    public PetApiDelegate getDelegate() {
        return delegate;
    }

}
