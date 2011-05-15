package name.ruhkopf.patrick.maps42.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.document.mongodb.MongoOperations;
import org.springframework.data.document.mongodb.query.Query;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Generic abstract Data Access Object (DAO) that uses MongoDB.
 * </p>
 * <p>
 * <p>
 * The goal is to centralize all data access through DAOs. It does not try to completely isolate MongoDB dependencies.
 * </p>
 * 
 * @author Patrick Ruhkopf
 */
@Repository
@Scope("singleton")
public abstract class AbstractMongoDao<T extends Object>
{
	private final Class<T> clazzOfItem;
	
	@Autowired
	private MongoOperations mongoOps;
	
	@SuppressWarnings("unchecked")
	public AbstractMongoDao()
	{
		super();

		// get the Class of T
		this.clazzOfItem = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}
	
	public T findOne(Query query)
	{
		return mongoOps.findOne(query, clazzOfItem);
	}

	public List<T> find(Query query)
	{
		return mongoOps.find(query, clazzOfItem);
	}

	public void insert(T object)
	{
		mongoOps.insert(object);
	}

	public void setMongoOps(MongoOperations mongoOps)
	{
		this.mongoOps = mongoOps;
	}


}
