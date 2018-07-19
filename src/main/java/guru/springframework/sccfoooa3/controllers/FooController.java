package guru.springframework.sccfoooa3.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jt on 7/19/18.
 */
@RestController
public class FooController {

    @PutMapping
    ResponseEntity<FooResponse> putHander(@RequestParam(name = "a", required = false) String paramA,
                             @RequestParam(name = "b", required = false) String paramB,
                             @RequestHeader(name = "foo", required = false) String fooHeader,
                             @RequestHeader(name = "fooReq", required = false) String fooReqHeader,
                             @CookieValue(name = "foo", required = false) String fooCookie,
                             @CookieValue(name = "fooReq", required = false) String fooReqCookie,
                                          HttpServletResponse response){

        Cookie cookieFoo2 = new Cookie("foo2", "bar");
        Cookie cookieFoo3 = new Cookie("foo3", "predefined" );

        response.addCookie(cookieFoo2);
        response.addCookie(cookieFoo3);

        FooResponse fooResponse = new FooResponse();

        fooResponse.setFoo2("bar");
        fooResponse.setFoo3("baz");

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("foo2", "bar");
        httpHeaders.add("foo3", "foo33");
        httpHeaders.add("fooRes", "baz");

        ResponseEntity<FooResponse> responseEntity = new ResponseEntity<>(fooResponse, httpHeaders, HttpStatus.OK);

        return responseEntity;

    }
}
