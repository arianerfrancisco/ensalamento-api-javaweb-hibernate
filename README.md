
# ⛏ Aplicação Web - Hibernate + MySql

<h1> Estrtura do projeto - segue preceitos MVC ( Model, View e Controller) </h1> 

<h2>🟢 DAO: </h2> 
- Classes de acesso aos dados da aplicação. Responsabilidade: ter métodos que interage com os mecanismos de persistência.
<h2> 🟢 Entity </h2> 
- Entidades do Sistemas
<h2> 🟢 Service </h2> 
- Contém os serviços - lógica da regra de negócio. Nestas classes, pode-se utilizar outros serviços e as classes do pacote DAO
<h2> 🟢 Util </h2> 
- Contém os utilitários do Hibernate
<h2> 🟢 Action </h2> 
- Classes que correspondem as ações do sistema
<h2> 🟢 Servlet </h2> 
- Desempenha o papel de ponto de acesso aos dados, dispachando as requisições para as classes com suas respectivas funcionalidades, que estão
no pacote Action
<h2> 🟢 Diretório WebContent </h2> 
- Contém os arquivos JSP, que são responsáveis por gerar páginas dinâmicas

<h3> 📓 Repositório criado para fins de Estudo </h3>
