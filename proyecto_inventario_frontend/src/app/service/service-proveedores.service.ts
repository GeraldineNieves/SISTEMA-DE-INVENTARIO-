import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Proveedores } from '../model/proveedores.interface';


@Injectable({
  providedIn: 'root'
})
export class ServiceProveedoresService {

  private http = inject(HttpClient)

  listarProveedores(){
    return this.http.get<Proveedores[]>('http://localhost:8091/api/proveedores/listarproveedores');
  }

  get( idProveedores: number) {
    return this.http.get<Proveedores>(`http://localhost:8091/api/proveedores/listarproveedores/${idProveedores}`);
  }
  create(proveedores: Proveedores) {
  return this.http.post<Proveedores>('http://localhost:8091/api/proveedores/listarproveedores', proveedores);
}

update(idProveedores: number, proveedores: Proveedores) {
  return this.http.put<Proveedores>(`http://localhost:8091/api/proveedores/listarproveedores/${idProveedores}`, proveedores);
}

   delete(idProveedores: number) {
   return this.http.delete<void>(`http://localhost:9091/api/proveedores/listarproveedores/${idProveedores}`);
}

}



