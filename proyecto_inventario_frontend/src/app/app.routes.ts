import { RouterModule, Routes } from '@angular/router';
import { ListaProveedoresComponent } from './lista-proveedores/lista-proveedores.component';

import { ListaTiposproveedoresComponent } from './lista-tiposproveedores/lista-tiposproveedores.component';
import { NgModule } from '@angular/core';
import RegistrarProveedoresComponent from './registrar-proveedores/registrar-proveedores.component';
import { RegistrarTiposproveedoresComponent } from './registrar-tiposproveedores/registrar-tiposproveedores.component';
import { ListarCategoriasComponent } from './listar-categorias/listar-categorias.component';
import { ListarStockComponent } from './listar-stock/listar-stock.component';
import { ListarProductosComponent } from './listar-productos/listar-productos.component';


export const routes: Routes = [
    { path: 'proveedores', component: ListaProveedoresComponent }, 
    { path: 'tiposproveedores', component: ListaProveedoresComponent }, 
    { path: 'proveedores/registrar-proveedores', component: RegistrarProveedoresComponent },
    { path: 'tiposproveedores/registrar-tiposproveedores', component: RegistrarTiposproveedoresComponent },
    { path: 'tiposproveedores/listartipop', component: ListaTiposproveedoresComponent },
   {path: 'proveedores/listarcategorias', component: ListarCategoriasComponent},
   {path: 'proveedores/listarstock', component: ListarStockComponent},
   {path: 'proveedores/listarproductos', component: ListarProductosComponent},
    { path: '', redirectTo: '/proveedores', pathMatch: 'full' },
    { path: '', redirectTo: '/tiposproveedores', pathMatch: 'full' },

    


   

    
];


