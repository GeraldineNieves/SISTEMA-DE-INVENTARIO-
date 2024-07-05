import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Tiposproveedores } from '../model/tiposproveedores.interface';

@Injectable({
  providedIn: 'root'
})
export class ServiceTiposproveedoresService {

  private http = inject(HttpClient)

  listarTiposproveedores(){
    return this.http.get<Tiposproveedores[]>('http://localhost:8091/api/tiposproveedores/listartipop');
  }

  buscarTipsoproveedores( idTipoprov: number) {
    return this.http.get<Tiposproveedores>(`http://localhost:9091/api/tiposproveedores/listartipop/${idTipoprov}`);
  }
  create(tiposproveedores: Tiposproveedores) {
  return this.http.post<Tiposproveedores>('http://localhost:9091/api/tiposproveedores/guardar', tiposproveedores);
}

update(idTipoprov: number, tiposproveedores: Tiposproveedores) {
  return this.http.put<Tiposproveedores>(`http://localhost:9091/api/tiposproveedores/${idTipoprov}`, tiposproveedores);
}

   eliminarTiposproveedores(idTipoprov: number) {
   return this.http.delete<void>(`http://localhost:9091/api/tiposproveedores/eliminar/${idTipoprov}`);
}

}




