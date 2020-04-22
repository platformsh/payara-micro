package my.compary;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Path("fishes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class FishResource {

    @Inject
    private FishRepository repository;

    @POST
    public void create(Fish fish) {
        repository.save(fish);
    }

    @GET
    public List<Fish> getAll() {
        return repository.query();
    }

    @GET
    @Path("{id}")
    public Fish findByID(@PathParam("id") String id) {
        final Optional<Fish> fish = repository.findById(id);
        return fish.orElseThrow(() -> new WebApplicationException(Response.Status.NOT_FOUND));
    }

}
