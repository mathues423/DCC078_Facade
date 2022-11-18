package main;

import java.util.ArrayList;
import java.util.List;

public abstract class CodEspace {

        private List<Usuario> alunosConectados = new ArrayList<Usuario>();

        public void addUsuario(Usuario usuario) {
            this.alunosConectados.add(usuario);
        }

        public boolean verificaUsuario(Usuario usuario) {
            return this.alunosConectados.contains(usuario);
        }
}
