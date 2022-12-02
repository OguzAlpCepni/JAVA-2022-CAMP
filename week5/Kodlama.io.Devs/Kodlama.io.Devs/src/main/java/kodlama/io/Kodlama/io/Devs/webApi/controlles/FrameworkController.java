package kodlama.io.Kodlama.io.Devs.webApi.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.Business.abstracts.FrameworkService;
import kodlama.io.Kodlama.io.Devs.Business.requests.framework.CreateFrameworkRequest;
import kodlama.io.Kodlama.io.Devs.Business.requests.framework.DeleteFrameworkRequest;
import kodlama.io.Kodlama.io.Devs.Business.requests.framework.UpdateFrameworkRequest;
import kodlama.io.Kodlama.io.Devs.Business.responses.frameworks.GetAllFrameworksResponse;
import kodlama.io.Kodlama.io.Devs.Business.responses.frameworks.GetByIdFrameworkResponse;

@RestController
@RequestMapping("/api/Framework")
public class FrameworkController {
	private FrameworkService frameworkService;

	@Autowired
	public FrameworkController(FrameworkService frameworkService) {
		super();
		this.frameworkService = frameworkService;
	}
	@PostMapping("/add")
	public void add(CreateFrameworkRequest createFrameworkRequest)throws Exception{
		frameworkService.add(createFrameworkRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteFrameworkRequest deleteFrameworkRequest) throws Exception{
		frameworkService.delete(deleteFrameworkRequest);
	}
	@PutMapping("/update")
	public void update(UpdateFrameworkRequest frameworkRequest)throws Exception{
		frameworkService.update(frameworkRequest);
	}
	@GetMapping("/getall")
	public List<GetAllFrameworksResponse> getAll(){
		return frameworkService.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public GetByIdFrameworkResponse getById(int id) {
		return frameworkService.getById(id);
	}
	

}
