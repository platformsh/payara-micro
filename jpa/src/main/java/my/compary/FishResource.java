package my.compary;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("fishes")
@Stateless
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FishResource extends AbstractFacade<Fish> {

    @PersistenceContext(unitName = "JPADatasourceExamplePU")
    private EntityManager entityManager;

    public FishResource() {
        super(Fish.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @POST
    @Override
    public void create(Fish entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") String id, Fish entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    public Fish find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    public List<Fish> findAll() {
        return super.findAll();
    }

}
