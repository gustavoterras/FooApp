# Prova de Conceito Aplicação em módulos.

#### Esta prova de conceito, foi desenvolvida para levantar todos os prós e contras para o desenvolvimento de um aplicação modular.

> Distribuir funcionalidades em módulos Android.

> Disponibilizar esses módulos através de um binary repository [JitPack](https://jitpack.io).

> Validar se é possível utilizar tecnologias como kotlin, databinding, retrofit, rx.

### Módulos do Projeto

> [Módulo Core:](https://github.com/gustavoterras/FooCore) Responsável pelas camadas de conexão, persistência, autenticação. Não possui dependências de interface.

> [Módulo Common:](https://github.com/gustavoterras/FooCommon) Possui dependências de interface, contém componentes de UI, classes e métodos que são comuns entre outros módulos.

> [Módulo Feature:](https://github.com/gustavoterras/FooFeature) Contém a feature desenvolvida pelo time.

### Meetup realizado - Android Devs POA #4 [<img src="https://bit.ly/2zvpQ88" width="18">](https://docs.google.com/presentation/d/1CQ2x5maMXcpCI8OdETJWsLsBSCvnI5XLXLveW-xsjCY/edit?usp=sharing)
