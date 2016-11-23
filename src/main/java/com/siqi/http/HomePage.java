package com.siqi.http;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;

@Path("/")
public class HomePage {
    private String homePageContent;

    /**
     * Method handling HTTP GET requests. The returned object will be sent to
     * the client as "text/plain" media type.
     * 
     * @return String that will be returned as a text/plain response.
     * @throws IOException
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getIt() throws IOException {
        if (homePageContent == null) {
            homePageContent = IOUtils.toString(getClass().getResourceAsStream("HomePage.html"), "UTF-8");
        }
        return homePageContent;
    }
}
