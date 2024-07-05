import { Component, inject, OnInit } from '@angular/core';
import { RouterLink, RouterModule } from '@angular/router';
import { ServiceProductosService } from '../service/service-productos.service';
import { Productos } from '../model/productos.interface';

@Component({
  selector: 'app-listar-productos',
  standalone: true,
  imports: [RouterModule, RouterLink],
  templateUrl: './listar-productos.component.html',
  styleUrl: './listar-productos.component.css'
})
export class ListarProductosComponent implements OnInit {

  private productosService=inject(ServiceProductosService);
  productos: Productos[] = [];

  ngOnInit(): void {
    this.loadAll();
  }
loadAll(){
  this.productosService.listarProductos()
  .subscribe(productos  =>{
    this.productos = productos;
  });
}

}
