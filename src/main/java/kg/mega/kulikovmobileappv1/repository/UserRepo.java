package kg.mega.kulikovmobileappv1.repository;

import kg.mega.kulikovmobileappv1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}
