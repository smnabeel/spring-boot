package com.mna.container.app._3_application;

import java.util.Optional;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mna.container.app._2_presentation.StoreApi;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
public class StoreApiController implements StoreApi {

    private final StoreApiDelegate delegate;

    public StoreApiController(@Autowired(required = false) StoreApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new StoreApiDelegate() {});
    }

    @Override
    public StoreApiDelegate getDelegate() {
        return delegate;
    }

}
