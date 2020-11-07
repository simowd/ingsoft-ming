package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.Transaction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface TransactionDao {
    public Integer create(Transaction transaction);

    public Integer getLastInsertId();

    public void updateUserTransaction(@Param("idUser") Integer idUser, @Param("txId") Integer txId, @Param("txHost") String txHost, @Param("txUserId") Integer txUserId, @Param("txDate") Date txDate);
}
