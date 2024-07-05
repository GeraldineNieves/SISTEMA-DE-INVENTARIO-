import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Productos } from '../model/productos.interface';

@Injectable({
  providedIn: 'root'
})
export class ServiceProductosService {

  private http = inject(HttpClient)

  listarProductos(){
    return this.http.get<Productos[]>('http://localhost:8091/api/proveedores/listarproductos');
  }

  
}
