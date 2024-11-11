package org.example;

import io.avaje.http.api.Controller;
import io.avaje.http.api.Post;

@Controller("/foo")
public class FooController {
    @Post
    int post() {
        return 1;
    }
}
