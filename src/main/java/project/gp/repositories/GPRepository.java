package project.gp.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import project.gp.entities.GP;

import java.util.List;

public interface GPRepository extends MongoRepository<GP, String> {

    List<GP> findBy_id(ObjectId _id);

    List<GP> findByName(String name);

    List<GP> findByAdmin(String admin);
    List<GP> findByBorough(String borough);

    // Find MIN Value
    List<GP> findFirstByBoroughAndNameNotLikeOrderByCurrentcapacity(String borough, String primaryGP);

    //findByStatusCodeNot(String statusCode);
    //findFirstOrderByCounter
    //List<Person> findByNameAndNickname(String name, String nickname);

    //@Query("{'address.state' : ?0}")
    //List<Person> findByState(String state);

    List<GP> findByNameContains(String keyword);
}
