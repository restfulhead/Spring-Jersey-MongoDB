package name.ruhkopf.patrick.maps42.service;

import java.beans.ConstructorProperties;
import java.util.List;

import name.ruhkopf.patrick.maps42.dao.DocumentDao;
import name.ruhkopf.patrick.maps42.dao.KmlDao;
import name.ruhkopf.patrick.maps42.dao.PlacemarkDao;
import name.ruhkopf.patrick.maps42.kml.Placemark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.document.mongodb.query.Query;
import org.springframework.stereotype.Service;

import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Kml;

/**
 * Service to manage KML documents.
 * 
 * @author Patrick Ruhkopf
 */
@Service
@Scope("singleton")
public class KmlService
{
	/** The kml dao. */
	private final KmlDao kmlDao;

	/** The document dao. */
	private final DocumentDao documentDao;

	/** The placemark dao. */
	private final PlacemarkDao placemarkDao;

	/**
	 * Instantiates a new map service.
	 * 
	 * @param documentDao the document dao
	 */
	@Autowired
	@ConstructorProperties({ "kmlDao", "documentDao", "placemarkDao" })
	public KmlService(KmlDao kmlDao, DocumentDao documentDao, PlacemarkDao placemarkDao)
	{
		super();
		this.documentDao = documentDao;
		this.kmlDao = kmlDao;
		this.placemarkDao = placemarkDao;
	}

	/**
	 * Persists a new KML document.
	 * 
	 * @param kml The KML document
	 * @return The persisted document
	 */
	public Kml createNewKmlDocument(Kml kml)
	{
		kmlDao.insert(kml);
		return kml;
	}

	/**
	 * Gets all KML documents.
	 * 
	 * @return A list of KML documents
	 */
	public List<Document> getKmlDocument()
	{
		return documentDao.find(new Query());
	}

	/**
	 * Creates a new document
	 * 
	 * @param name the name
	 * @param coordinates the coordinates
	 * @return The created document
	 */
	public Document createNewDocument(Document document)
	{
		documentDao.insert(document);
		return document;
	}

	/**
	 * Gets all documents.
	 * 
	 * @return A list of documents
	 */
	public List<Document> getAllDocuments()
	{
		return documentDao.find(new Query());
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
