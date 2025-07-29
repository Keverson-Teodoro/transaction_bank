package transaction.bank.transaction_bank.model.entitie;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "transaction")
@EqualsAndHashCode()
@ToString
public class transaction {

    @Column(name = "id_transaction")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long idTransaction;

    @Column(name = "sender_id")
    @ManyToOne
    private User sender;

    @Column(name = "receiver_id")
    @ManyToOne
    private User receiver;
}
