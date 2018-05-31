package com.panda.entity.auth;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {
	private static final long serialVersionUID = 4034801522671846681L;

	private String name;
	private String password;
	private String mobile;
}
