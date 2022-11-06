package kodlama.io.Kodlama.io.Devs.dataAcces.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.Language;

public class InMemeoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	Iterator<Language> itr = languages.iterator();
	
	public InMemeoryLanguageRepository(List<Language> languages) {
		this.languages = new ArrayList<Language>();
		
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
	public void add(String name)throws Exception {
		int count = 0;
		for(Language language : languages)count++;
			languages.add(new Language(count,"name"));
	}
	@Override
	public void delete(String name) {
		int count = 0;
		for(Language language : languages) {
			if(language.getName() == name)languages.remove(count);
		count++;
		}
		
		
	}

	@Override
	public void update(String changeName,String name) {
		int count = 0;
		for(Language language:languages) {
			if(language.getName()==name)languages.set(count, new Language(language.getId(),changeName));
		count++;
		}
		
	}

	@Override
	public Language getById(int id) throws Exception {
		for(Language language : languages){
            if(language.getId() == id){
                return language;
            }
	}

        throw new Exception("Böyle bir kayıt bulunamadı");
	


	}
}
