/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Context.DBContext;
import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trinh
 */
public class ProductDao {

    Connection conn = null; // ket noi sql
    PreparedStatement ps = null; // nem cau lenh qua sql
    ResultSet rs = null; // nhan kq tra ve

    // tra ve danh sach san pham
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        // query lay tat ca san pham co trong database qlbh
        String query = "SELECT * FROM [product];";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            rs = ps.executeQuery();// kq tra ve
            while (rs.next()) {

                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));

            }

        } catch (Exception e) {

        }

        return list;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        // query lay tat  ca loai san pham co trong database qlbh
        String query = "SELECT * FROM [Category];";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            rs = ps.executeQuery();// kq tra ve
            while (rs.next()) {

                list.add(new Category(
                        rs.getInt(1),
                        rs.getString(2)));

            }

        } catch (Exception e) {

        }

        return list;
    }

    public Product getLastProduct() {
        String query = "SELECT top 1 * FROM [product] order by id desc ;";
        // lay ra san pham dc them moi nhat
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            rs = ps.executeQuery();// kq tra ve
            while (rs.next()) {

                return new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6));

            }

        } catch (Exception e) {

        }
        return null;
    }

    public List<Product> getProductByCID(String cid) {
        List<Product> list = new ArrayList<>();
        // query lay tat ca san pham co trong database qlbh co cateId =cid
        String query = "SELECT * FROM [product] where cateID=? ;";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            ps.setString(1, cid); //set cid vao cham hoi 1
            rs = ps.executeQuery();// kq tra ve
            while (rs.next()) {

                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));

            }

        } catch (Exception e) {

        }

        return list;
    }

    public Product getProductByID(String id) {

        // query lay tat ca san pham co id bang id da cho co trong database qlbh
        String query = "SELECT * FROM [product] where id=?;";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            ps.setString(1, id); //set cid vao cham hoi 1
            rs = ps.executeQuery();// kq tra ve
            while (rs.next()) {

                return new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6));

            }

        } catch (Exception e) {

        }

        return null;
    }

    public List<Product> searchByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        // query lay tat ca san pham co ten nhu yeu cau co trong database qlbh
        String query = "SELECT  * FROM [product] where [name] like ? ;";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            ps.setString(1, "%" + txtSearch + "%"); //set cid vao cham hoi 1
            rs = ps.executeQuery();// kq tra ve
            while (rs.next()) {

                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));

            }

        } catch (Exception e) {

        }

        return list;
    }

    public List<Product> getProductBySellID(int id) {
        List<Product> list = new ArrayList<>();
        // query lay tat ca san pham theo sell id
        String query = "select * from product where sell_ID =?;";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            ps.setInt(1, id); //set cid vao cham hoi 1
            rs = ps.executeQuery();// kq tra ve
            while (rs.next()) {

                list.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)));

            }

        } catch (Exception e) {

        }

        return list;
    }

    public void deleteProduct(String pid) {
        String query = "delete from product where id = ? ;";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            ps.setString(1, pid); //set cid vao cham hoi 1
            ps.executeUpdate();// kq tra ve
        } catch (Exception e) {

        }

    }

    public void insertProduct(String pname, String pimage, String pprice,
            String ptile, String pdescription, String pcategory, int sellId) {
        String query = "INSERT [dbo].[product] ([name], [image], [price], [title], [description], [cateID], [sell_ID]) \n"
                + "VALUES (?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            ps.setString(1, pname); //set cid vao cham hoi 1
            ps.setString(2, pimage);
            ps.setString(3, pprice);
            ps.setString(4, ptile);
            ps.setString(5, pdescription);
            ps.setString(6, pcategory);
            ps.setInt(7, sellId);

            ps.executeUpdate();// kq tra ve
        } catch (Exception e) {

        }
    }
    public void EditProduct(String pname, String pimage, String pprice,
            String ptile, String pdescription, String pcategory, String pid) {
        String query = "update product \n" +
"set \n" +
"[name] = ?, [image] = ?, [price] = ?, [title] = ? , [description] = ?, [cateID] =?\n" +
"where id = ?";
        try {
            conn = new DBContext().getConnection(); // mo ket noi sql
            ps = conn.prepareStatement(query); // nem cau lenh vao sql
            ps.setString(1, pname); //set cid vao cham hoi 1
            ps.setString(2, pimage);
            ps.setString(3, pprice);
            ps.setString(4, ptile);
            ps.setString(5, pdescription);
            ps.setString(6, pcategory);
            ps.setString(7, pid);

            ps.executeUpdate();// kq tra ve
        } catch (Exception e) {

        }
    }
    
    

//         kiem tra list product Category lastProduct
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();

        Product p = productDao.getProductByID("5");
        System.out.println(p);

    }
}
