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
import name.ruhkopf.patrick.maps42.service.PlacemarkService;

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
	private final PlacemarkService placemarkService;

	@Context
	private UriInfo uriInfo;

	/**
	 * Instantiates a new maps resource.
	 * 
	 * @param mapService the map service
	 */
	@Autowired
	public PlacemarksResource(PlacemarkService placemarkService)
	{
		super();
		this.placemarkService = placemarkService;
	}

	@POST
	@Consumes({ "application/json", "application/xml" })
	@Produces({ "application/json", "application/xml" })
	public Response createNewPlacemark(Placemark requestPM)
	{
		Placemark responsePM = placemarkService.createNewPlacemark(requestPM);
		return Response.created(uriInfo.getAbsolutePath()).entity(responsePM).build();
	}

	@GET
	@Produces({ "application/json", "application/xml" })
	public Response getAllPlacemarks()
	{
		return Response.ok(new Placemarks(placemarkService.getAllPlacemarks())).build();
	}
	/**
	 * Gets the map service.
	 * 
	 * @return the map service
	 */
	public PlacemarkService getMapService()
	{
		return placemarkService;
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
