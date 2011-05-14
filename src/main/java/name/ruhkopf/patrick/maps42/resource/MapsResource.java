
package name.ruhkopf.patrick.maps42.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import name.ruhkopf.patrick.maps42.service.MapService;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MapsResource 
{
	private MapService mapService;
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("text/plain")
    public String getIt() {
        return mapService.sayHi("test");
    }

	public MapService getMapService() {
		return mapService;
	}

	public void setMapService(MapService mapService) {
		this.mapService = mapService;
	}
    
}
