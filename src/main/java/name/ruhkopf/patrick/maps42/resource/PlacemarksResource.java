package name.ruhkopf.patrick.maps42.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import name.ruhkopf.patrick.maps42.kml.Placemark;
import name.ruhkopf.patrick.maps42.kml.Placemarks;
import name.ruhkopf.patrick.maps42.service.KmlService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Web Service Resource to manage maps
 * 
 * @author Patrick Ruhkopf
 */
@Path("/places")
@Component
@Scope("request")
public class PlacemarksResource
{
	/** The map service. */
	private final KmlService kmlService;

	@Context
	private UriInfo uriInfo;

	/**
	 * Instantiates a new maps resource.
	 * 
	 * @param mapService the map service
	 */
	@Autowired
	public PlacemarksResource(KmlService kmlService)
	{
		super();
		this.kmlService = kmlService;
	}

	@POST
	@Consumes({ "application/json", "application/xml" })
	@Produces({ "application/json", "application/xml" })
	public Response createNewPlacemark(Placemark requestPM)
	{
		Placemark responsePM = kmlService.createNewPlacemark(requestPM);
		return Response.created(uriInfo.getAbsolutePath()).entity(responsePM).build();
	}

	@GET
	@Produces({ "application/json", "application/xml" })
	public Response getAllPlacemarks()
	{
		return Response.ok(new Placemarks(kmlService.getAllPlacemarks())).build();
	}

	/**
	 * Gets the placemark service.
	 * 
	 * @return the placemark service
	 */
	public KmlService getKmlService()
	{
		return kmlService;
	}

	public UriInfo getUriInfo()
	{
		return uriInfo;
	}

	public void setUriInfo(UriInfo uriInfo)
	{
		this.uriInfo = uriInfo;
	}

}
