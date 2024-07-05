import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Categorias } from '../model/categorias.interface';

@Injectable({
  providedIn: 'root'
})
export class ServiceCategoriasService {

  private http = inject(HttpClient)

  listarCategorias(){
    return this.http.get<Categorias[]>('http://localhost:8091/api/proveedores/listarcategorias');
  }

  

}

