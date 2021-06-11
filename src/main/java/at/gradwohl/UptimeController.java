
package at.gradwohl;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/uptimeCalculation")

public class UptimeController {


    @GET
    @Path("/{uptime}")
    @Produces(MediaType.TEXT_PLAIN)

    public String calculateUptime(@PathParam("uptime") double uptime) {

        double minutesPerMonth = 60*24*30;
        double definedUptimeInPercent = uptime / 100;
        double uptimeInMinutesPerMonth = minutesPerMonth * definedUptimeInPercent;

        return String.format("%.2f", uptimeInMinutesPerMonth);

    }

}
