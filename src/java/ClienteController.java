/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import clase.ClienteModell;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author GERARD
 */
@WebServlet(urlPatterns = {"/ClienteController"})
public class ClienteController extends HttpServlet {

    ClienteModell clientemodell;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            clientemodell =new ClienteModell();
            
            clientemodell.setCodigo(request.getParameter("codigo"));
            clientemodell.setNombre(request.getParameter("nombre"));
            clientemodell.setApellido(request.getParameter("apellido"));
            clientemodell.setDireccion(request.getParameter("direccion"));
            clientemodell.setCorreo(request.getParameter("correo"));
            clientemodell.setTelefono(request.getParameter("telefono"));
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClienteController</title>");   
            
           
             

            out.println("</head>");
            out.println("<body background=\"https://img.freepik.com/fotos-premium/fondo-beige-monocromatico-minimo_23-2148667764.jpg?w=2000\">");
     
            out.println("<h1 style='text-align:center;color:coral'>DATOS DEL CLIENTE REGISTRADO</h1>");
            out.println("<h2 style='text-align:center; color:darkslategray'>Codigo del cliente</h2>");
            out.println("<h3 style='text-align:center; color:seagreen'>"+ clientemodell.getCodigo()  +"</h3>");
            out.println("<h2 style='text-align:center; color:darkslategray'>Nombre del cliente</h2>");
            out.println("<h3 style='text-align:center; color:seagreen'>"+ clientemodell.getNombre()  +"</h3>");
            out.println("<h2 style='text-align:center; color:darkslategray'>Apellido del cliente</h2>");
            out.println("<h3 style='text-align:center; color:seagreen'>"+ clientemodell.getApellido()  +"</h3>");
            out.println("<h2 style='text-align:center; color:darkslategray'>Direccion del cliente</h2>");
            out.println("<h3 style='text-align:center; color:seagreen'>"+ clientemodell.getDireccion()  +"</h3>");
            out.println("<h2 style='text-align:center; color:darkslategray'>Correo del cliente</h2>");
            out.println("<h3 style='text-align:center; color:seagreen'>"+ clientemodell.getCorreo()  +"</h3>");
            out.println("<h2 style='text-align:center; color:darkslategray'>Telefono del cliente</h2>");
            out.println("<h3 style='text-align:center; color:seagreen'>"+ clientemodell.getTelefono()  +"</h3>");
          
            out.println("<a href=\"http://localhost:8090/Andy0909178512/ \" >VOLVER AL INICIO</a>");
            
         
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
