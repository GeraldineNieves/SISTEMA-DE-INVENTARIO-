import { Component, inject, OnInit } from '@angular/core';
import { RouterLink, RouterModule } from '@angular/router';
import { ServiceCategoriasService } from '../service/service-categorias.service';
import { Categorias } from '../model/categorias.interface';

@Component({
  selector: 'app-listar-categorias',
  standalone: true,
  imports: [RouterModule, RouterLink],
  templateUrl: './listar-categorias.component.html',
  styleUrl: './listar-categorias.component.css'
})
export class ListarCategoriasComponent implements OnInit{
  private categoriasService=inject(ServiceCategoriasService);
  categorias: Categorias[] = [];

  ngOnInit(): void {
    this.loadAll();
  }
loadAll(){
  this.categoriasService.listarCategorias()
  .subscribe(categorias  =>{
    this.categorias = categorias;
  });
}

}
