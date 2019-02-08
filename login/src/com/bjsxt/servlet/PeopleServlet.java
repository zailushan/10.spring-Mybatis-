package com.bjsxt.servlet;

import com.bjsxt.pojo.People;
import com.bjsxt.service.PeopleService;
import com.bjsxt.service.impl.PeopleServiceImpl;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @author: cwenlong
 * @date: 2019-02-07 14:52
 */
@WebServlet("/login")
public class PeopleServlet extends HttpServlet {

    private PeopleService peopleService;

    @Override
    public void init() throws ServletException {
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        peopleService = wac.getBean("peopleService",PeopleServiceImpl.class);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        People users = new People();
        users.setName(req.getParameter("username"));
        People people = peopleService.login(users);
        if(people!=null){
            resp.sendRedirect("main.jsp");
        }else{
            resp.sendRedirect("login.jsp");
        }
    }
}
