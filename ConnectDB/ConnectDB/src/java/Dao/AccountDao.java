/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Context.DBContext;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trinh
 */
public class AccountDao {

    Connection conn = null; // ket noi sql
    PreparedStatement ps = null; // nem cau lenh qua sql
    ResultSet rs = null; // nhan kq tra ve

    public Account checkListAccount(String user) {
        String query;
        query = "SELECT * FROM [Account] where [user] =?;";

        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            ps.setString(1, user);
            rs = ps.executeQuery();// kq tra ve
            while (rs.next()) {
                Account a = new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)); // 1 username 2 password
                return a;

            }
        } catch (Exception e) {
        }
        return null;

    }

    public void SignUp(String user, String pass) {
        String query;
        query = "Insert into Account values (?,?,0,0);";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            ps.setString(1, user); // truyen tham so vao dau cham hoi 1
            ps.setString(2, pass);  // truyen tham so vao dau cham hoi 2
            ps.executeUpdate();// kq tra ve
        } catch (Exception e) {

        }
    }

    public List<Account> getAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from account";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);

            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }

        } catch (Exception e) {

        }
        return list;
    }
    //dem account 

    public int getTotalAccount() {
        String query = "select Count(*) from account";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }

        } catch (Exception e) {

        }
        return 0;
    }

    public List<Account> pagingAccount(int index) {
        List<Account> list = new ArrayList<>();
        String query = "select * from account\n"
                + "order by uID \n"
                + "offset ? rows fetch next 5 row only; ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index-1)*5);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }

        } catch (Exception e) {

        }
        return list;
    }
    public void deleteAccount(String aid){
         String query = "delete from Account where uID = ? ;";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            ps.setString(1, aid); //set cid vao cham hoi 1
            ps.executeUpdate();// kq tra ve
        } catch (Exception e) {

        }

    }
    public static void main(String[] args) {
        AccountDao dao = new AccountDao();
        System.out.println(dao.getTotalAccount());
    }

}
