package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.Transaction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface TransactionDao {
    //Create a new Transaction
     Integer create(Transaction transaction);

    //Get the last Id
     Integer getLastInsertId();

    //Update de user's transaction
     void updateUserTransaction(@Param("idUser") Integer idUser, @Param("txId") Integer txId, @Param("txHost") String txHost, @Param("txUserId") Integer txUserId, @Param("txDate") Date txDate);

    //Update table transaction
     void updateTablesTransaction(@Param("tableName") String tableName, @Param("idUser") Integer idUser, @Param("txId") Integer txId, @Param("txHost") String txHost, @Param("txUserId") Integer txUserId, @Param("txDate") Date txDate);
}
