import { Component, OnInit} from '@angular/core';
import { Injectable, inject } from '@angular/core';
import { ServiceProveedoresService } from '../service/service-proveedores.service';
import { Proveedores } from '../model/proveedores.interface';
import { RouterLink, RouterModule } from '@angular/router';

@Component({
  selector: 'app-lista-proveedores',
  standalone: true,
  imports: [RouterModule, RouterLink],
  templateUrl: './lista-proveedores.component.html',
  styleUrl: './lista-proveedores.component.css'
})
export class ListaProveedoresComponent  implements OnInit {

  private proveedoresService=inject(ServiceProveedoresService);
  proveedores: Proveedores[] = [];

  ngOnInit(): void {
    this.loadAll();
  }
loadAll(){
  this.proveedoresService.listarProveedores()
  .subscribe(proveedores  =>{
    this.proveedores = proveedores;
  });
}

  eliminarProveedores(proveedores: Proveedores){
    this.proveedoresService.delete(proveedores.idProveedores)
    .subscribe(() =>{
      this.loadAll();
    });
  }

}
