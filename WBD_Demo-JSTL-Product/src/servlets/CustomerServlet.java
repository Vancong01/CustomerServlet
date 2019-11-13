package servlets;

import models.Customer;
import models.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://salt.tikicdn.com/cache/w1200/ts/product/65/af/4a/7e9fbfeb44a9cb39e96a180ba4f1caca.jpg"));
        customers.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Đinh","https://salt.tikicdn.com/cache/w1200/ts/product/65/af/4a/7e9fbfeb44a9cb39e96a180ba4f1caca.jpg"));
        customers.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây","https://salt.tikicdn.com/cache/w1200/ts/product/65/af/4a/7e9fbfeb44a9cb39e96a180ba4f1caca.jpg"));
        customers.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","https://salt.tikicdn.com/cache/w1200/ts/product/65/af/4a/7e9fbfeb44a9cb39e96a180ba4f1caca.jpg"));


        req.setAttribute("danh_sach_khach_hang", customers);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("customers.jsp");
        requestDispatcher.forward(req,resp);
    }
}
