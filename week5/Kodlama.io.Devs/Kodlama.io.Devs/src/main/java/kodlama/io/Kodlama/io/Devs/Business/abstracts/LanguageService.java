package kodlama.io.Kodlama.io.Devs.Business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.Business.requests.Language.LanguageRequest;
import kodlama.io.Kodlama.io.Devs.Business.responses.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.entities.Language;

public interface LanguageService {
	List<GetAllLanguagesResponse> getAll();
	void add(LanguageRequest languageRequest)throws Exception;
	void delete(int id)throws Exception;
	void update(Language language, int id)throws Exception;
	//Language getById(int id) throws Exception;
}
