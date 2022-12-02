package kodlama.io.Kodlama.io.Devs.Business.responses.frameworks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllFrameworksResponse {
	private int frameworkId;
	private String name;
	private int  languageId;

}
