

<h1>Fullstack App - Autenticação JWT com Angular + Spring Boot</h1>

<p>Este é um projeto fullstack desenvolvido com <strong>Angular</strong> no frontend e <strong>Spring Boot</strong> no backend. Ele implementa uma <strong>autenticação segura via JWT</strong> (JSON Web Token), permitindo o login, logout e acesso a áreas protegidas com base no token gerado após autenticação.</p>

<hr>

<h2>🧩 Tecnologias Utilizadas</h2>

<h3>Frontend (Angular)</h3>
<ul>
  <li>Angular 17+</li>
  <li>Angular Material</li>
  <li>RxJS</li>
  <li>SCSS</li>
  <li>HTTP Interceptors</li>
  <li>Angular Guards</li>
</ul>

<h3>Backend (Java Spring Boot)</h3>
<ul>
  <li>Spring Boot 3+</li>
  <li>Spring Security</li>
  <li>JWT (JSON Web Token)</li>
  <li>BCryptPasswordEncoder</li>
  <li>JPA (Hibernate)</li>
  <li>PostgreSQL</li>
</ul>

<hr>

<h2>📌 Funcionalidades</h2>

<h3>🔒 Autenticação</h3>
<ul>
  <li>Cadastro de usuário</li>
  <li>Login com geração de JWT</li>
  <li>Validação do token em todas as requisições protegidas</li>
  <li>Logout com remoção de token do armazenamento local</li>
</ul>

<h3>👤 Gestão de Usuário</h3>
<ul>
  <li>Endpoints públicos e protegidos</li>
  <li>Acesso restrito com base no token JWT</li>
  <li>Validação automática no backend usando Spring Security</li>
</ul>

<h3>🧪 Segurança</h3>
<ul>
  <li>Senhas criptografadas com BCrypt</li>
  <li>Tokens expirando após tempo configurável</li>
  <li>CORS configurado para o Angular consumir a API</li>
</ul>

<hr>

<h2>🚀 Como Executar o Projeto</h2>

<h3>1. Clone o repositório</h3>
<pre><code>git clone https://github.com/sucloudflare/java-login.git
cd java-login
</code></pre>

<h3>2. Backend (Spring Boot)</h3>
<p>Configurar banco de dados (PostgreSQL):</p>
<pre><code>spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
</code></pre>

<p>Rodar a aplicação:</p>
<pre><code>./mvnw spring-boot:run
</code></pre>
<p>A API estará disponível em: <code>http://localhost:8080</code></p>

<h3>3. Frontend (Angular)</h3>
<p>Instale as dependências:</p>
<pre><code>cd front
npm install
</code></pre>

<p>Rode o servidor Angular:</p>
<pre><code>ng serve
</code></pre>
<p>A aplicação estará em: <code>http://localhost:4200</code></p>

<hr>

<h2>🛠 Estrutura do Projeto</h2>

<pre><code>backend-service/
├── config/
│   └── SecurityConfig.java
├── controller/
│   └── AuthController.java
├── dto/
│   └── LoginDTO.java
├── entity/
│   └── Usuario.java
├── repository/
│   └── UsuarioRepository.java
├── service/
│   └── UsuarioService.java
└── util/
    └── JwtUtil.java

front/
├── app/
│   ├── core/
│   │   └── auth/
│   │       └── auth.service.ts
│   ├── modules/
│   │   └── home/
│   │       └── signin/
│   │           └── signin.component.ts
│   └── shared/
│       └── models/
│           └── signin.model.ts
</code></pre>

<hr>

<h2>📫 Contato</h2>
<p>Se você quiser sugerir melhorias ou reportar bugs, sinta-se à vontade para abrir uma <em>issue</em> ou enviar um PR!</p>

<h2>⚖️ Licença</h2>
<p>Este projeto está licenciado sob a licença MIT. Veja o arquivo <code>LICENSE</code> para mais detalhes.</p>


