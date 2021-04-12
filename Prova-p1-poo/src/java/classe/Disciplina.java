/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;
        

import java.util.ArrayList;
/**
 *
 * @author Isado
 */
<%@include file="WEB-INF/jspf/header.jspf"%>

public class Disciplina {

    private static class disciplina2 {

        public disciplina2() {
        }
    }
    public class Disciplinas {
        private String nome;
        private String ementa;
        private int ciclo;
        private Double p1;
        private Double p2;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmenta() {
            return ementa;
        }

        public void setEmenta(String ementa) {
            this.ementa = ementa;
        }

        public int getCiclo() {
            return ciclo;
        }

        public void setCiclo(int ciclo) {
            this.ciclo = ciclo;
        }

        public Double getP1() {
            return p1;
        }

        public void setP1(Double p1) {
            this.p1 = p1;
        }

        public Double getP2() {
            return p2;
        }

        public void setP2(Double p2) {
            this.p2 = p2;
        }
      
        Private Static ArrayList <Disciplina> disciplina2 {
        public Disciplina(String nome, String ementa, int ciclo) {
            this.nome=nome;
            this.ementa=ementa;
            this.ciclo=ciclo;
        } 
        public static ArrayList<Disciplina>getDisciplina(){
            if(disciplina2 == null) {
            
            disciplina2.add(new Disciplina("Gestão de Projetos","Definição de projeto segundo concepção difundida pelas melhores práticas de gestão de projetos. Histórico do desenvolvimento do conjunto de conhecimentos de gestão de projetos.\n" +
"Comparação ente o gerenciamento por projetos com o gerenciamento tradicional. O ciclo de vida de um projeto. Os fatores de sucesso e insucesso de projetos e sua mensuração.\n" +
"As nove de conhecimento para a gestão de projetos e seus processos : Integração, Escopo, Tempo, Custo, Qualidade, Recursos Humanos, Comunicações, Riscos e Aquisições.",5));
            disciplina2.add(new Disciplina("Laboratório de Banco de Dados","Tecnologias emergentes de mercado que serão aplicadas em laboratório",5));
            disciplina2.add(new Disciplina("Laboratório de engenharia de software","Desenvolvimento de um software utilizando os conhecimentos adquiridos ao longo do curso. \n" +
"A elaboração deve abordar as disciplinas de requisitos, análise e projeto, implementação, implantação e \n" +
"gerência de projetos. O processo de desenvolvimento, assim como a técnica fica a critério de acordo entre professor e aluno.",5));
            disciplina2.add(new Disciplina("Programação para dispositivos móveis","ambientes de programação para dispositivos móveis. Emuladores. Interface gráfica, serviços baseados em localização, \n" +
"armazenamento de dados persistentes, serviços de telefonia e comunicação entre processos. Desenvolvimento de aplicações com J2ME.",5));
            disciplina2.add(new Disciplina("Redes de computadores","Comunicação de Dados. Topologia e Características Físicas de Redes. Redes Locais de Longa Distância.\n" +
" Redes de Alta Velocidade. Protocolos e Serviços de Comunicação. Camadas de Sistemas Abertos. Sistemas Operacionais de Redes. \n" +
"Interconexão de redes. Avaliação de Desempenho. Estrutura e Funcionamento da Internet.",5));
            disciplina2.add(new Disciplina("Segurança da Informação","Requisitos de segurança de aplicações, de base de dados e de comunicações. Segurança de dispositivos móveis.\n" +
" Políticas de segurança. Criptografia. Firewalls. Vulnerabilidades e principais tecnologias de segurança.",5));
            disciplina2.add(new Disciplina("Inglês IV","Aprofundamento da compreensão e produção oral e escrita por meio funções sociais e estruturas mais complexas da língua. \n" +
"Ênfase na oralidade, atendendo às especificidades \n" +
"acadêmico-profissionais da área e abordando aspectos sócio-culturais da língua inglesa.",5));
            disciplina2.add(new Disciplina("Programação Orientada a objetos","Conceitos e evolução da tecnologia de orientação a objetos. Limitações e diferenças entre o paradigma da programação estruturada em relação à orientação a objetos. \n" +
"Conceito de objeto, classe, métodos, atributos, herança, polimorfismo, agregação, associação, dependência, encapsulamento, \n" +
"mensagem e suas respectivas notações na linguagem padrão de representação da orientação a objetos. Implementação de algoritmos orientado \n" +
"a objetos utilizando linguagens de programação. Aplicação e uso das estruturas fundamentais da orientação a objetos.",5));
            disciplina2.add(new Disciplina("Trabalho de graduação I","ementa não disponível",5));
            }   
            
            return disciplina2;
            
} 
        public ArrayList<Disciplina> getDisciplina3(){
return disciplina2;
    }
}
}