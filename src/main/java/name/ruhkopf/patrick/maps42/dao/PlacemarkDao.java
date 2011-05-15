package name.ruhkopf.patrick.maps42.dao;

import name.ruhkopf.patrick.maps42.kml.Placemark;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Data Access Object (DAO) for a {@link Placemark}.
 * 
 * @author Patrick Ruhkopf
 */
@Repository
@Scope("singleton")
public class PlacemarkDao extends AbstractMongoDao<Placemark>
{
	

}
