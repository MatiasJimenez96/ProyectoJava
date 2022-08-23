package org.matiasjimenez.proyectousuario;

import org.matiasjimenez.proyectousuario.model.Usuario;
import org.matiasjimenez.proyectousuario.repositorio.Repositorio;
import org.matiasjimenez.proyectousuario.repositorio.usuarioRepositorioImpl;

import java.util.Scanner;

public class EjemploProyectoUsuario {
    public static void main(String[] args) {

        Repositorio<Usuario> repositorio = new usuarioRepositorioImpl();

        Scanner scanner = new Scanner(System.in);
        Usuario nuevoUsuario = new Usuario();
        boolean continuar = true;

        do {
            switch (imprimirMenu()) {
                case 1 -> { //Create usuario

                    System.out.println("Agregando usuario: ");
                    System.out.println();
                    System.out.print("    Ingresar nombre: ");
                    nuevoUsuario.setNombre(scanner.nextLine());
                    System.out.print("    Ingresar contrasena: ");
                    nuevoUsuario.setPassword(scanner.nextLine());
                    System.out.print("    Ingresar emal: ");
                    nuevoUsuario.setEmail(scanner.nextLine());
                    System.out.println();
                    repositorio.agregarUsuario(nuevoUsuario);
                    System.out.println("Usuario agregado con exito!");
                    pause();
                }
                case 2 -> { // Read usuario
                    System.out.println();
                    System.out.println("----Listando usuarios----");
                    System.out.println();
                    repositorio.listarUsuarios().forEach(System.out::println);
                    System.out.println();
                    pause();
                }
                case 3 -> { // Update usuario

                    System.out.print("   Elegir ID a actualizar: ");
                    nuevoUsuario.setId(Long.parseLong(scanner.nextLine()));
                    System.out.print("      Ingresar nuevo nombre: ");
                    nuevoUsuario.setNombre(scanner.nextLine());
                    System.out.print("        Ingresar nuevo Email: ");
                    nuevoUsuario.setEmail(scanner.nextLine());
                    System.out.print("          Ingresar nuevo Password: ");
                    nuevoUsuario.setPassword(scanner.nextLine());
                    repositorio.actualizarUsuario(nuevoUsuario);
                    System.out.println("   Usuario actualizado  ");
                    System.out.println();
                    pause();
                }
                case 4 -> { //Delete usuario

                    System.out.print("   Elegir ID a eliminar: ");
                    repositorio.eliminarUsuario(scanner.nextLong());
                    System.out.println("*** Usuario eliminado con exito! ***");
                    pause();
                }
                case 5 -> { // Salir
                    System.out.println("Seguro quiere salir? escribir 'si'");
                    String salida = scanner.nextLine().toUpperCase();
                    if (salida.equals("SI")) {
                        continuar = false;
                    }
                    System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("Caso incorrecto, volviendo al menu...");
                    pause();
                }
            }
        } while (continuar);

    }

    public static int imprimirMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ...::: Bienvenidos al menu de usuarios :::...");
        System.out.println();
        System.out.println("1) Agregar usuario");
        System.out.println("2) Listar usuarios");
        System.out.println("3) Actualizar usuario por ID");
        System.out.println("4) Eliminar un usuario por iD");
        System.out.println("5) Salir");
        return scanner.nextInt();
    }


    public static void pause() {
        Scanner s = new Scanner(System.in);
        System.out.println("Presione una tecla para continuar...");
        s.nextLine();
    }

}
