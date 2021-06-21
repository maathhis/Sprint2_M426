package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

/**
 * short description
 * <p>
 * M426
 *
 * @author TODO
 * @version 1.0
 * @since 21.06.21
 */

@Path("/m426")
public class M426 {

    @GET
    @Path("world")
    @Produces(MediaType.TEXT_PLAIN)
    public String getClinchedMessage(){
        return "Hello World";
    }
}
