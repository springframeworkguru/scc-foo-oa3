package guru.springframework.sccfoooa3.controllers;

/**
 * Created by jt on 7/19/18.
 */
public class FooResponse {
    private String foo2;
    private String foo3;
    private String nullValue;

    public FooResponse() {
    }

    public FooResponse(String foo2, String foo3) {
        this.foo2 = foo2;
        this.foo3 = foo3;
    }

    public String getFoo2() {
        return foo2;
    }

    public void setFoo2(String foo2) {
        this.foo2 = foo2;
    }

    public String getFoo3() {
        return foo3;
    }

    public void setFoo3(String foo3) {
        this.foo3 = foo3;
    }

    public String getNullValue() {
        return nullValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }
}
