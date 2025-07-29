package transaction.bank.transaction_bank.model.entitie;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import transaction.bank.transaction_bank.model.enums.UserType;

import java.math.BigDecimal;


@Entity
@Getter
@Setter
@Table(name = "user_bank")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "email")
    private String email;

    @Column(name = "amount")
    private double amount;

    @Column(name = "user_type")
    private UserType userType;


    public User(){

    }


    public User(String userName, String cpf, String email) {
        this.userName = userName;
        this.cpf = cpf;
        this.email = email;
    }


}
