package com.mna.container.app._3_application;

import java.util.Optional;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mna.container.app._2_presentation.UserApi;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
public class UserApiController implements UserApi {

    private final UserApiDelegate delegate;

    public UserApiController(@Autowired(required = false) UserApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UserApiDelegate() {});
    }

    @Override
    public UserApiDelegate getDelegate() {
        return delegate;
    }

}
