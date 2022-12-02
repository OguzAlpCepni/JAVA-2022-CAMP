package kodlama.io.Kodlama.io.Devs.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Kodlama.io.Devs.entities.Language;

public interface LanguageRepository extends JpaRepository<Language,Integer>{ // primary key integer 
	
	// spring jpa sayesinde bu aşağıda kullandığımız fonksiyonlarının hepsini içeriyor !!!! 
	
	//List<Language> getAll();
	//void add(Language language)throws Exception;
	//void delete(int id)throws Exception;
	//void update(Language language, int id)throws Exception;
	//Language getById(int id) throws Exception;
	
}
