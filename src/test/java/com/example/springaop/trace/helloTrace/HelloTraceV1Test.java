package com.example.springaop.trace.helloTrace;

import com.example.springaop.trace.TraceStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTraceV1Test {

    @Test
    void beginEnd(){
        HelloTraceV1 h = new HelloTraceV1();
        TraceStatus hello = h.begin("Hello");
        h.end(hello);
    }

    @Test
    public void beginException() throws Exception{
        HelloTraceV1 h = new HelloTraceV1();
        TraceStatus hello = h.begin("Hello");
        h.exception(hello,new IllegalStateException("예외"));
    }
}