package com.yk.contact.dao;

import java.util.List;

import com.yk.contact.model.Contact;

public interface ContactDAO {
	public int save(Contact contact);

	public int update(Contact contact);

	public Contact get(Integer id);

	public int delete(Integer id);

	public List<Contact> list();
}
