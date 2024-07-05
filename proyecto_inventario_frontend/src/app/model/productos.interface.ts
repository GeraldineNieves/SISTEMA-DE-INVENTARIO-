import { Categorias } from "./categorias.interface";
import { Proveedores } from "./proveedores.interface";
import { Stock } from "./stock.interface";
import { Tiposproveedores } from "./tiposproveedores.interface";


export interface Productos {

  idProductos: number;
  codProductos: number;
  descripcion: String; 
  preciounitario: number;
  stock : Stock;
  categorias: Categorias;
  proveedores: Proveedores;
  
}