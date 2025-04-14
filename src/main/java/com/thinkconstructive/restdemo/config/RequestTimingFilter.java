package com.thinkconstructive.restdemo.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RequestTimingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        long startTime = System.currentTimeMillis();
        chain.doFilter(request, response);
        long duration = System.currentTimeMillis() - startTime;

        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("Request to " + req.getRequestURI() + " took " + duration + " ms");
    }
}
