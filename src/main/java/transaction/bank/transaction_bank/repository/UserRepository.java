package transaction.bank.transaction_bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import transaction.bank.transaction_bank.model.entitie.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById (long id);
}
