package advertisement.server;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementRepository extends MongoRepository<Advertisement, Integer> {

}
