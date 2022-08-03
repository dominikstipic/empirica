package org.doms.rest;

import org.doms.data.Point;
import org.doms.services.PointService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

@Path("/points")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PointsRestApplication {

    @Inject
    private PointService pointService;

    //@POST
   /* @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPoints(List<Point> points){
        pointService.addPoints(points)P;
        return Response.ok().build();
    }*/

    @POST
    @Path("/")
    public Response addPoint(Point point){
        pointService.addPoint(point);
        return Response.ok().build();
    }

    @GET
    @Path("/")
    public List<Point> getPoints(){
        return pointService.getPoints();
    }
}