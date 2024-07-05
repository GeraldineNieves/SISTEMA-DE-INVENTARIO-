import { Component, inject, OnInit } from '@angular/core';
import { StockServiceService } from '../service/stock-service.service';
import { Stock } from '../model/stock.interface';

@Component({
  selector: 'app-listar-stock',
  standalone: true,
  imports: [],
  templateUrl: './listar-stock.component.html',
  styleUrl: './listar-stock.component.css'
})
export class ListarStockComponent  implements OnInit{
  private  stockService=inject(StockServiceService);
  stock: Stock[] = [];

  ngOnInit(): void {
    this.loadAll();
  }
loadAll(){
  this.stockService.listarStock()
  .subscribe(stock =>{
    this.stock = stock;
  });
}

}