package com.example.exception;

import javax.persistence.EntityNotFoundException;

public class MusicianNotFoundException extends EntityNotFoundException{
	public MusicianNotFoundException() {}
	public MusicianNotFoundException(String msg) {
		super(msg);
	}

}
