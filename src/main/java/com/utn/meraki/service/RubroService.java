package com.utn.meraki.service;

import java.util.List;
import com.utn.meraki.model.RubroModel;

public interface RubroService {
	
	public abstract RubroModel crearRubro(RubroModel rubroModel);
	
	public abstract RubroModel editarRubro(RubroModel rubroModel);
	
	public abstract List<RubroModel> listRubroVigente();
	
	public abstract RubroModel bajaRubro(String id);

}
