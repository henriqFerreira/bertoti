> "We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency,both for the software we produce as well as for the organization that is producing it. Finally as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, "Software engineering is programming integrated over time." Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also become clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren't squares, distance isn't velocity. Software engineering isn't programming."
>
> *Titus Winters, Software Engineering at Google*

São diferenças cruciais que diferenciam o papel essencial de cada papel. Embora o desenvolvedor seja focado mais na parte do desenvolvimento e toda a criação do projeto em si, o engenheiro de software, além de fazer o mesmo que o desenvolvedor, acaba tendo mais tarefas além do próprio processo de criação, tais como manutenção, melhorias, e qualquer outra decisão que esteja além do código ou que envolva o projeto. Ou seja, a principal diferença entre o desenvolvedor e o engenheiro de software, é que o desenvolvedor pensa no tempo atual do projeto, e o engenheiro de software pensa além disso tudo, no tempo, na escala e nos trade-offs.

> O que é um trade-off no projeto da API do segundo semestre?

Pelo fato do projeto ser um desktop, acaba perdendo a vantagem de ser multiplataforma, ou seja, além de desktop, também ser web e mobile. Mas em troca disso, a aplicação desktop permite maior flexibilidade de uso e gerenciamento do que um web/mobile forneceria por suas limitações, fazedo com que o usuário tenha mais opções e flexibilidade de uso em troca de portabilidade.

<br><br>

# Projeto em atividade
Desenvolvimento de um estudo baseado na criação de um projeto. O tema é uma aplicação de gerenciamento de transportes por vans.

## Atividade de Requisitos

<br>

### Requisitos Funcionais

<small>Quando mencionado usuário, ao invés de cliente ou motorista em específico, se faz referência a ambos juntos.</small>

| Requisito Funcional | Descrição |
|:--------------------:|:----------:|
| Cadastro de usuário **(cliente e motorista)** | O usuário poderá criar uma conta no aplicativo |
| Login do usuário **(cliente e motorista)** | O usuário poderá logar em sua conta previamente criada |
| Busca por vans disponíveis **(cliente)** | O cliente poderá buscar por vans disponíveis em sua área |
| Solicitar um contrato com uma van **(cliente)** | O cliente poderá solicitar um contrato com uma van para que a mesma possa realizar seus serviços a esse cliente |
| Cancelar um contrato com uma van (cliente) | O cliente poderá cancelar um contrato com uma van para encerrar o serviço oferecido |
| In-app-payment | O usuário poderá realizar pagamentos no próprio aplicativo |