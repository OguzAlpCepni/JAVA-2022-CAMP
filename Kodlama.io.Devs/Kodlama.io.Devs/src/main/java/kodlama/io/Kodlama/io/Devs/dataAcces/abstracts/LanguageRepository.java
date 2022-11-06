package kodlama.io.Kodlama.io.Devs.dataAcces.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.Language;

public interface LanguageRepository {
	
	List<Language> getAll();
	void add(String name)throws Exception;
	void delete(String name)throws Exception;
	void update(String changeName,String name)throws Exception;
	Language getById(int id) throws Exception;
	
}
