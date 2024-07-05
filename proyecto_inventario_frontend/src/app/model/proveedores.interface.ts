import { Tiposproveedores } from "./tiposproveedores.interface";


export interface Proveedores {

  idProveedores: number;
  nombre: string;
  telefono: string;
  direccion: string;
  email: string;
  tiposproveedores: Tiposproveedores;
}