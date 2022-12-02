package kodlama.io.Kodlama.io.Devs.Business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.Business.abstracts.FrameworkService;
import kodlama.io.Kodlama.io.Devs.Business.requests.framework.CreateFrameworkRequest;
import kodlama.io.Kodlama.io.Devs.Business.requests.framework.DeleteFrameworkRequest;
import kodlama.io.Kodlama.io.Devs.Business.requests.framework.UpdateFrameworkRequest;
import kodlama.io.Kodlama.io.Devs.Business.responses.frameworks.GetAllFrameworksResponse;
import kodlama.io.Kodlama.io.Devs.Business.responses.frameworks.GetByIdFrameworkResponse;
import kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.FrameworkRepository;
import kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.Frameworks;
import kodlama.io.Kodlama.io.Devs.entities.Language;

@Service
public class FrameworkManager implements FrameworkService{
	private FrameworkRepository frameworkRepository;
	private LanguageRepository languageRepository;
	
	@Autowired
	public FrameworkManager(FrameworkRepository frameworkRepository, LanguageRepository languageRepository) {
		super();
		this.frameworkRepository = frameworkRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllFrameworksResponse> getAll() {
		List<Frameworks> frameworks = frameworkRepository.findAll();
		List<GetAllFrameworksResponse> frameworksResponse = new ArrayList<GetAllFrameworksResponse>();
		for(Frameworks framework : frameworks) {
			GetAllFrameworksResponse responseItem = new GetAllFrameworksResponse();
			responseItem.setFrameworkId(framework.getFrameworkId());
			responseItem.setName(framework.getName());
			responseItem.setLanguageId(framework.getLanguages().getId());
			frameworksResponse.add(responseItem);
			
		}
		return frameworksResponse;
	}

	@Override
	public void add(CreateFrameworkRequest createFrameworkRequest) throws Exception {
		Language language = new Language();
		Frameworks frameworks = new Frameworks();
		if(createFrameworkRequest.getName().isEmpty())throw new Exception("please type a framework");
		else if(this.isValid(createFrameworkRequest))throw new Exception("framework already exists");
		else {
			language.setId(createFrameworkRequest.getLanguageId());
			frameworks.setName(createFrameworkRequest.getName());
			frameworks.setLanguages(language);
			this.frameworkRepository.save(frameworks);
		}
		
	}

	@Override
	public void delete(DeleteFrameworkRequest DeleteFrameworkRequest) throws Exception {
		frameworkRepository.deleteById(DeleteFrameworkRequest.getFrameworkId());
		
	}

	@Override
	public void update(UpdateFrameworkRequest updateFrameworkRequest) throws Exception {
		Language language = languageRepository.findById(updateFrameworkRequest.getProgrammingLanguageId()).get();
		Frameworks frameworks =frameworkRepository.findById(updateFrameworkRequest.getId()).get();
		frameworks.setName(updateFrameworkRequest.getName());
		frameworks.setLanguages(language);
		frameworkRepository.save(frameworks);
		
	}

	@Override
	public GetByIdFrameworkResponse getById(int id) {
		Frameworks frameworks = frameworkRepository.findById(id).get();
		GetByIdFrameworkResponse getByIdFrameworkResponse = new GetByIdFrameworkResponse();
		getByIdFrameworkResponse.setName(frameworks.getName());
		return getByIdFrameworkResponse;
	}

	@Override
	public boolean isValid(CreateFrameworkRequest createFrameworkRequest) {
		
		return false;
	}
	
	
}
