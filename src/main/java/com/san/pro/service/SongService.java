package com.san.pro.service;

import com.san.pro.model.Song;

import javax.ws.rs.core.Response;

/**
 * Created by Administrator on 27-09-2015.
 */
public class SongService {

    public Response insert(Song song) {
    return Response.status(201).entity(song).build();
    }

    public Song read() {
        Song song = new Song();
        song.setTitle("Life Is Beautiful");
        song.setSinger("Sonu Nigam");
        return song;
    }

}
