/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restservice;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;

/**
 * REST Web Service
 *
 * @author usuario
 */
@Path("generic")
@RequestScoped
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of restservice.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object
        return "<?xml version=\" 1.0 \" encoding=\" UTF-8 \" standalone= \" yes \"?>\n"
                + "<ficha>\n"
                + "<nombre> Nombre: Alejandro </nombre>\n"
                + "<apellido> Apellidos: Suárez Ocampo </apellido>\n"
                + "<direccion> Dirección: Alfredo Vargas #36 </direccion>\n"
                + "</ficha>\n"
                + "\n"
                + "URL del artículo: http://www.ejemplode.com/21-xml/35-ejemplo_de_estructura_xml.html\n"
                + "Nota completa: ejemplos de Estructura XML";
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
