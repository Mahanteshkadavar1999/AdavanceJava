package servlet_proj1.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_proj1.dto.Studentdao;

@WebServlet("/uid")
public class UpdateById extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String id=req.getParameter("pk");
		int cid=Integer.parseInt(id);
		
		 Studentdao studentdao = new Studentdao();
		 String msg=studentdao.updateById(cid);
		 resp.getWriter().print(msg);
	}

}
