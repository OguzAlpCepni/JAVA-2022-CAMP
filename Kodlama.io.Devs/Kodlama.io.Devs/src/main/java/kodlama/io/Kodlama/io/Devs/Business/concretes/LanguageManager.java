package kodlama.io.Kodlama.io.Devs.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
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
	public void add( String name) throws Exception{
		if(Language.class.getName().isEmpty()) {
			throw new Exception("please enter language name");
		}
		for(Language language : getAll()) {
			for(Language language1 :getAll()) {
				if(language.getName()==language1.getName()) {
					throw new Exception("Language name doesn't try");
				}
			}
			
		}
		languageRepository.add(name);
		
	}

	@Override
	public void delete( String name) throws Exception{
		
		languageRepository.delete(name);
		
	}

	@Override
	public void update(String changeName,@PathVariable() String name) throws Exception{
		languageRepository.update(changeName, name);
	
	}

	@Override
	public Language getById(int id) throws Exception {
        return languageRepository.getById(id);
    }

}
