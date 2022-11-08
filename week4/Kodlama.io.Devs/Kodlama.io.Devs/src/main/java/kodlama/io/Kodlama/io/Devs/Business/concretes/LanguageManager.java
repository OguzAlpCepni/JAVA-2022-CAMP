package kodlama.io.Kodlama.io.Devs.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.Business.abstracts.LanguageService;
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
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public void add( Language language) throws Exception{
		if(language.getName().isEmpty()) {
			throw new Exception("language name is null");
		}
		for(Language languageListMember: getAll()){
            if(languageListMember.getId() == language.getId()){
                throw new Exception("Programlama isimleri tekrar edemez");
            }
        }
		languageRepository.add(language);
	}

	@Override
	public void delete(int id) throws Exception{
		
		 languageRepository.delete(id);
		
	}

	@Override
	public void update(Language language, int id) throws Exception{
		 if(languageRepository.getById(id) == null){
	            throw new Exception(" language is not registered");
	        }
	        languageRepository.update(language, id);
	
	}

	@Override
	public Language getById(int id) throws Exception {
        return languageRepository.getById(id);
    }

}
