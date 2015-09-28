package com.san.pro.resource;

/**
 * Created by Administrator on 27-09-2015.
 */


import com.san.pro.model.Song;
import com.san.pro.service.SongService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/json")
public class SongResource {


    private final SongService songService;

    public SongResource() {
        this.songService = new SongService();
    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Song getSongInJSON() {
        Song result = this.songService.read();
        return result;
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createSongInJSON(Song model) {
        Response result = this.songService.insert(model);
        return result;

    }

}
