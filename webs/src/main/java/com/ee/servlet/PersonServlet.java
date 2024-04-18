package com.ee.servlet;



import java.io.IOException;
import java.util.function.Supplier;

import com.ee.entity.Person.Person;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@WebServlet("/person")
public class PersonServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Supplier<String> person = () -> "Ivan";
        System.out.println(person);
        
        Person persona = new Person();
        persona.setPname("Jessica");
        System.out.println(persona);
        super.doGet(req, resp);
    }
}
