package com.usa.misiontic.MasterClass3.repository.crudRepository;

import com.usa.misiontic.MasterClass3.entities.Product;
import com.usa.misiontic.MasterClass3.entities.Reservas;
import org.springframework.data.repository.CrudRepository;

public interface ReservasCrudRepository extends CrudRepository<Reservas,Integer> {
}
