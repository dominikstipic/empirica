package org.doms.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("/")
public class ApplicationController extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(
                PointsRestApplication.class
        );
    }
}
