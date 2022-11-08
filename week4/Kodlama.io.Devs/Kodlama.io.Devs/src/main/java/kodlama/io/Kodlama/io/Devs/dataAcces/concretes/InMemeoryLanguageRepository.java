package kodlama.io.Kodlama.io.Devs.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.Language;
@Repository
public class InMemeoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	
	public InMemeoryLanguageRepository(){
		languages = new ArrayList<Language>();
		languages.add(new Language(1," c++ "));
		languages.add(new Language(2," c "));
		languages.add(new Language(3," c# "));
		languages.add(new Language(4," java "));
		languages.add(new Language(5," php "));
		languages.add(new Language(6," python "));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void add(Language language)throws Exception {
		languages.add(language);
		
		
	}
	@Override
	public void delete(int id) throws Exception {
        Language language1 = getById(id);
        languages.remove(language1);
    }
		
		
	

	@Override
	public void update(Language language, int id) throws Exception {
        Language language1 = getById(language.getId());
        language1.setName(language.getName());
    }

	@Override
	public Language getById(int id) throws Exception {
		for(Language language : languages){
            if(language.getId() == id){
                return language;
            }
	}

        throw new Exception("not registered");
	


	}
}
