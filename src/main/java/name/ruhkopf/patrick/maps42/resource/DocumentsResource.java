package name.ruhkopf.patrick.maps42.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import name.ruhkopf.patrick.maps42.service.KmlService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import de.micromata.opengis.kml.v_2_2_0.Document;

/**
 * Web Service Resource to manage maps
 * 
 * @author Patrick Ruhkopf
 */
@Path("/documents")
@Component
@Scope("request")
public class DocumentsResource
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
	public DocumentsResource(KmlService kmlService)
	{
		super();
		this.kmlService = kmlService;
	}

	@POST
	@Consumes({ "application/json", "application/xml" })
	@Produces({ "application/json", "application/xml" })
	public Response createNewKml(Document requestDoc)
	{
		Document responseDoc = kmlService.createNewDocument(requestDoc);
		return Response.created(uriInfo.getAbsolutePath()).entity(responseDoc).build();
	}

	/*
	@GET
	@Produces({ "application/json", "application/xml" })
	public Response getAllDocuments()
	{
		return Response.ok(new Kmls(kmlService.getAllKmls())).build();
	}*/

	/**
	 * Gets the document service.
	 * 
	 * @return the document service
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
