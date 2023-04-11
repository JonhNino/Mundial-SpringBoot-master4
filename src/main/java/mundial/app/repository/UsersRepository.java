package mundial.app.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import mundial.app.Entity.Usuarios;



public interface UsersRepository extends MongoRepository<Usuarios, String>{
	public Optional<Usuarios> findByUsername(String username);
}
