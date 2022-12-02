package kodlama.io.Kodlama.io.Devs.Business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.Business.requests.framework.CreateFrameworkRequest;
import kodlama.io.Kodlama.io.Devs.Business.requests.framework.DeleteFrameworkRequest;
import kodlama.io.Kodlama.io.Devs.Business.requests.framework.UpdateFrameworkRequest;
import kodlama.io.Kodlama.io.Devs.Business.responses.frameworks.GetAllFrameworksResponse;
import kodlama.io.Kodlama.io.Devs.Business.responses.frameworks.GetByIdFrameworkResponse;

public interface FrameworkService {
	List<GetAllFrameworksResponse>getAll();
	void add(CreateFrameworkRequest createFrameworkRequest)throws Exception;
	void delete(DeleteFrameworkRequest DeleteFrameworkRequest)throws Exception;
	void update(UpdateFrameworkRequest updateFrameworkRequest)throws Exception;
	GetByIdFrameworkResponse getById(int id);
	boolean isValid(CreateFrameworkRequest createFrameworkRequest);
	
}
