package transaction.bank.transaction_bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import transaction.bank.transaction_bank.model.entitie.User;
import transaction.bank.transaction_bank.model.enums.UserType;
import transaction.bank.transaction_bank.repository.UserRepository;

public class TransactionService {

    @Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, double amount) throws Exception{
        if(sender.getUserType() == UserType.MERCHANT){
            throw new Exception("User cannot make transaction");
        }
        if(sender.getAmount() <= 0){
            throw new Exception("user does not have sufficient balance " + sender.getUserName());
        }

    }


    public User findUserById(long id){
        return userRepository.findUserById(id).orElseThrow(() -> new Exception("not found user"));


    }


}
