package kodlama.io.Kodlama.io.Devs.Business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.Language;

public interface LanguageService {
	List<Language> getAll();
	void add(Language language)throws Exception;
	void delete(int id)throws Exception;
	void update(Language language, int id)throws Exception;
	Language getById(int id) throws Exception;
}
