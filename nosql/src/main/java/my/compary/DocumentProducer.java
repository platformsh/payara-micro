package my.compary;

import com.mongodb.MongoClient;
import jakarta.nosql.document.DocumentCollectionManager;
import org.eclipse.jnosql.diana.mongodb.document.MongoDBDocumentCollectionManagerFactory;
import org.eclipse.jnosql.diana.mongodb.document.MongoDBDocumentConfiguration;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import sh.platform.config.Config;
import sh.platform.config.MongoDB;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

@ApplicationScoped
public class DocumentProducer {


    @Inject
    @ConfigProperty(name = "document")
    private DocumentCollectionManager manager;

    @Produces
    public DocumentCollectionManager getManager() {
        return manager;
    }

    public void destroy(@Disposes DocumentCollectionManager manager) {
        manager.close();
    }
}
