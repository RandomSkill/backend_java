
package be.vinci;

import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

/**
 * Root resource (exposed at "myresource" path)
 */
@Singleton
@Path("textresource")
public class TextResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Text> getall(){
return ;
}
}
