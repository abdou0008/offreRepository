package com.fagenius.mappers;

import com.fagenius.dtos.DemandeurDTO;
import com.fagenius.model.Demandeur;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DemandeurMapperImpl {
    public DemandeurDTO fromDemandeur(Demandeur demandeur){
        DemandeurDTO demandeurDTO = new DemandeurDTO();
        BeanUtils.copyProperties(demandeur,demandeurDTO);
        return demandeurDTO;

    }
    public Demandeur fromDemandeurDTO(DemandeurDTO demandeurDTO){
        Demandeur demandeur = new Demandeur();
        BeanUtils.copyProperties(demandeurDTO,demandeur);

        return demandeur;

    }
}
