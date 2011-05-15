package name.ruhkopf.patrick.maps42.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.document.mongodb.MongoTemplate;
import org.springframework.data.document.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

  @Override
  public Mongo mongo() throws Exception {
    return new Mongo("localhost");
  }

  @Override
  public MongoTemplate mongoTemplate() throws Exception {
    return new MongoTemplate(mongo() , "database", "mongoexample");
  }

}