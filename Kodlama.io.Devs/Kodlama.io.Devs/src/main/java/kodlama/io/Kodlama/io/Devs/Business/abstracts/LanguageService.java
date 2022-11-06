package kodlama.io.Kodlama.io.Devs.Business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.Language;

public interface LanguageService {
	List<Language> getAll();
	void add(String name)throws Exception;
	void delete(String name)throws Exception;
	void update(String changeName,String name)throws Exception;
	Language getById(int id) throws Exception;
}
