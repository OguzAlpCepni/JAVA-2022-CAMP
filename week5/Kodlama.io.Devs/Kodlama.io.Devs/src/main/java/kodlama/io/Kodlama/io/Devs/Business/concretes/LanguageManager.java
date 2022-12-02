package kodlama.io.Kodlama.io.Devs.Business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.Business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.Business.requests.Language.LanguageRequest;
import kodlama.io.Kodlama.io.Devs.Business.responses.GetAllLanguagesResponse;
import kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.Language;
@Service
public class LanguageManager implements LanguageService{
	
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languageResponse = new ArrayList<GetAllLanguagesResponse>();
		for(Language language : languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languageResponse.add(responseItem);
					
		}
		return languageResponse;
	}

	

	@Override
	public void delete(int id) throws Exception{
		
		 languageRepository.deleteById(id);
		
	}

	@Override
	public void update(Language language, int id) throws Exception{
		 if(languageRepository.findById(id).isEmpty()){
	            throw new Exception(" language is not registered");
	        }
	        languageRepository.save(language);
	
	}

	@Override
	public void add(LanguageRequest languageRequest) throws Exception {
		Language language = new Language();
		language.setName(languageRequest.getName());
		
		this.languageRepository.save(language);	
		
	}

	//@Override
	//public Language getById(int id) throws Exception {
   //     return languageRepository.);
   // }

}
