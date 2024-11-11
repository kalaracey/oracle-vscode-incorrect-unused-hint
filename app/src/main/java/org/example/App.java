package org.example;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        Javalin.create(/*config*/)
            .get("/", ctx -> ctx.result("Hello World"))
            .start(7070);
    }
}
