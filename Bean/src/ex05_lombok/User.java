package ex05_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString 
@NoArgsConstructor // no argument constructor
@AllArgsConstructor // generate constructor using field
@Getter
@Setter
public class User {
	private String id;
	private String pw;
}
