import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BrandTest {
        public static void testSelectAll() throws Exception{
            Properties prop=new Properties();
            prop.load(new FileInputStream("D:\\c\\ceshijava\\src\\druid.properties"));

            DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
            Connection conn=dataSource.getConnection();
            String sql="select * from tb_brand;";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs=pstmt.executeQuery();
            Brand brand=null;
            List<Brand>brands=new ArrayList<>();
            while(rs.next()){
                int id=rs.getInt("id");
                String brandName = rs.getString("brand_name");
                String companyName = rs.getString("company_name");
                int ordered = rs.getInt("ordered");
                String description = rs.getString("description");
                int status = rs.getInt("status");
                brand=new Brand();
                brand.setId(id);
                        brand.setBrand_name(brandName);
                brand.setCompany_name(companyName);
                        brand.setOrdered(ordered);
                brand.setDescription(description);
                        brand.setStatus(status);
                brands.add(brand);

            }
            System.out.println(brands);
            rs.close();
            pstmt.close();
            conn.close();

        }
    public static void testAdd() throws Exception{
        String brandName="niuzi";
        String companyName="dsds";
        int ordered=1;
        String  description="sb";
        int status=1;
        Properties prop=new Properties();
        prop.load(new FileInputStream("D:\\c\\ceshijava\\src\\druid.properties"));
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        Connection conn=dataSource.getConnection();
        String sql="insert into tb_brand(brand_name,company_name,ordered,description,status)values (?,?,?,?,?);";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);
        int count=pstmt.executeUpdate();
        System.out.println(count>0);
//        ResultSet rs=pstmt.executeQuery();
//        Brand brand=null;
//        List<Brand>brands=new ArrayList<>();
//        while(rs.next()){
//            int id=rs.getInt("id");
//            String brandName = rs.getString("brand_name");
//            String companyName = rs.getString("company_name");
//            int ordered = rs.getInt("ordered");
//            String description = rs.getString("description");
//            int status = rs.getInt("status");
//            brand=new Brand();
//            brand.setId(id);
//            brand.setBrand_name(brandName);
//            brand.setCompany_name(companyName);
//            brand.setOrdered(ordered);
//            brand.setDescription(description);
//            brand.setStatus(status);
//            brands.add(brand);
//
//        }
//        System.out.println(brands);
//        rs.close();
        pstmt.close();
        conn.close();

    }
    public static void testUpdate() throws Exception{
        String brandName="niui";
        String companyName="dsds";
        int ordered=1000;
        String  description="sboaugsfio";
        int status=1;
        int id=4;
        Properties prop=new Properties();
        prop.load(new FileInputStream("D:\\c\\ceshijava\\src\\druid.properties"));
        DataSource dataSource= DruidDataSourceFactory.createDataSource(prop);
        Connection conn=dataSource.getConnection();
        String sql="update tb_brand set brand_name=?, company_name=?, ordered=?,description=?,status=? where id=?;";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);
        pstmt.setInt(6,id);
        int count=pstmt.executeUpdate();
        System.out.println(count>0);
        pstmt.close();
        conn.close();
    }
}
