package tv.codely.mooc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public final class Course {
	private String id;
	private String name;
	private String duration;
}
