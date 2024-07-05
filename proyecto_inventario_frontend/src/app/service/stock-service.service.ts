import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Stock } from '../model/stock.interface';

@Injectable({
  providedIn: 'root'
})
export class StockServiceService {

  private http = inject(HttpClient)

  listarStock(){
    return this.http.get<Stock[]>('http://localhost:8091/api/proveedores/listarstock');
  }

  
}
