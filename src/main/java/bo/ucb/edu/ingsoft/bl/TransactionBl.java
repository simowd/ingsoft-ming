package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dto.Transaction;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class TransactionBl {

    private final TransactionDao transactionDao;

    public Transaction createTransaction (Transaction transaction) {
        // Registramos la transacción en la Base de Datos
        this.transactionDao.create(transaction);

        // Obtenemos la llave primaria generada
        Integer lastPrimaryKey = this.transactionDao.getLastInsertId();

        transaction.setTxId(lastPrimaryKey);
        return transaction;
    }
}
