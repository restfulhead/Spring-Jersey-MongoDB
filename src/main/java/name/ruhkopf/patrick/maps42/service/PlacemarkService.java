package name.ruhkopf.patrick.maps42.service;

import java.beans.ConstructorProperties;
import java.util.List;

import name.ruhkopf.patrick.maps42.dao.PlacemarkDao;
import name.ruhkopf.patrick.maps42.kml.Placemark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.document.mongodb.query.Query;
import org.springframework.stereotype.Service;

/**
 * Service to manage placemarks.
 * 
 * @author Patrick Ruhkopf
 */
@Service
@Scope("singleton")
public class PlacemarkService
{
	/** The placemark dao. */
	private final PlacemarkDao placemarkDao;

	/**
	 * Instantiates a new map service.
	 * 
	 * @param placemarkDao the placemark dao
	 */
	@Autowired
	@ConstructorProperties({ "placemarkDao" })
	public PlacemarkService(PlacemarkDao placemarkDao)
	{
		super();
		this.placemarkDao = placemarkDao;
	}

	/**
	 * Creates a new placemark
	 * 
	 * @param name the name
	 * @param coordinates the coordinates
	 * @return The created Placemark
	 */
	public Placemark createNewPlacemark(Placemark placemark)
	{
		placemarkDao.insert(placemark);
		return placemark;
	}

	/**
	 * Gets all placemarks.
	 * 
	 * @return A list of placemarks
	 */
	public List<Placemark> getAllPlacemarks()
	{
		return placemarkDao.find(new Query());
	}

}
