package fr.adaming.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="toto",urlPatterns={"/ser","/suggest","/titi"})
public class MaServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		String[] mots={"toto","titi","tutu","tata","inti","nomane","nounou"};
		
		String saisie=req.getParameter("pSaisie");
		
		StringBuilder s=new StringBuilder();
		
		if(!saisie.equals("")){
			for(int i=0;i<mots.length;i++){
				String preLettre=String.valueOf(mots[i].charAt(0)).toLowerCase();
				
				if(saisie.toLowerCase().equals(preLettre)){
					s.append(mots[i]);
					s.append(" ");
				}
			}
			
			if(s.length()>0){
				resp.setContentType("text/plain");
				resp.getWriter().write(s.toString());
			}else{
				resp.setContentType("text/plain");
				resp.getWriter().write("pas de suggestion!!!");
			}
		}
		
		
	}
	
}
