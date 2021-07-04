package user.database.userletters.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.database.userletters.dao.LetterRepository;
import user.database.userletters.dao.entity.Letter;

import java.util.Optional;

@Service
public class LetterManager {

    private final LetterRepository letterRepository;

    @Autowired
    public LetterManager(LetterRepository letterRepository) {
        this.letterRepository = letterRepository;
    }

    public Letter add(Letter letter) {
        return letterRepository.save(letter);
    }

    public Iterable<Letter> findAll(){
        return letterRepository.findAll();
    }

    public Optional<Letter> findById(Long index){
        return letterRepository.findById(index);
    }

    public void deleteById(Long id){
        letterRepository.deleteById(id);
    }
}
