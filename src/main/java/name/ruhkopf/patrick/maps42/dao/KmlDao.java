package name.ruhkopf.patrick.maps42.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import de.micromata.opengis.kml.v_2_2_0.Kml;

/**
 * Data Access Object (DAO) for a {@link Kml}.
 * 
 * @author Patrick Ruhkopf
 */
@Repository
@Scope("singleton")
public class KmlDao extends AbstractMongoDao<Kml>
{
	

}
