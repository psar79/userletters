package user.database.userletters.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import user.database.userletters.dao.entity.Letter;

@Repository
public interface LetterRepository extends CrudRepository<Letter, Long> {

}
