# *1.1 - TEXTO* 📄

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.


## COMENTARIO 💬

O texto mostra que há diferenças entre a programação e engenharia de software. Na engenharia de software, os engenheiros são focados no tempo e nas mudanças necessárias no projeto. Na engenharia de software, é necessario priorizar a escala e eficiência para produzir, e também tomar decisões importantes e complexas, geralmente baseadas no tempo e tamanho.


# *1.2 - TEXTO* 📄

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

## COMENTARIO 💬

O texto mostra que com o Google, as vezes dizemos que a engenharia de software é a programação integrada com o tempo. A programação é uma parte significante da engenharia de software, depois de tudo, a programacão é como você cria um novo software, em primeiro lugar. Se você aceita essa distinção, fica mais claro que precisamos delinear entre tarefas de programação (desenvolvimento) e tarefas da engenharia de software (desenvolvimento, modificação, manutenção). A implementação de tempo adiciona uma importante nova dimenção para programação. Cubos não são quadrados, distancia não é velocidade. Engenharia de software não é programação.


# *2.1 - Exemplos de Trade-Offs*
  1. Ao planejar o desenvolvimento de um aplicativo, desenvolver em uma tecnologia como flutter, resultará numa aplicação para ambos os sistemas IOS e Android, porém nos dois pode apresentar problemas, diferente de uma tecnologia voltada a um só sistema, como o Kotlin (Android).
  2. Utilizar sistemas mais simples para desenvolver, pode acarretar num problema de quantidade de usuarios ao mesmo tempo na aplicacao.
  3. O sistema operacional Linux é mais completo e personalizavel, porém sua complexidade para utilizar, afasta sua popularidade para leigos em tecnologia, enquanto o Windows é mais lúdico e simples, indicado para aqueles que apenas desejam utilizar programas sem complicações.

# *2.2 - Exemplo de sistemas que se sobressaem por requisitos não funcionais*
O sistema operacional para dispositivos moveis IOS se sobressai em relação ao Android, pois seus requisitos funcionam melhor. Diferente do Android, que foi desenvolvido majoritariamente em Java e é open source, o IOS foi planejado e desenvolvido de forma precisa, com diversas criptografias e funcionalidades exclusivas, tornando assim mais veloz, acessivei e seguro.

# *3 - HEURISTICA*

1. Visibilidade do Status do Sistema
   - Erro: Mensagens de status obvias podem entediar o usuário a continuar utilizando o sistema.
     
     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/7842dad7-fa87-49ea-9c85-744754d3a287)

   - Acerto: Sistemas de loading informam o usuário se o procedimento esta longe ou perto do fim, não deixando dúvidas no tempo.
     
     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/53df0875-01b4-4530-bf7c-6326af1ac47e)

     
2. Ligação entre o mundo real e o sistema
   - Erro: Erros do sistema informado diretamente ao usuário, sem tratamento, gerará confusão.
     
     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/b078f119-06c5-4334-9a2f-64e83119868b)

   - Acerto: A implementação de diferentes línguas trarão um conforto maior para alguns usuários, que não precisarão traduzir para entender.
     
     ![MultilanguageSite](https://github.com/AndreMeneses0103/bertoti/assets/89109574/dc050cbf-4274-4b1d-ada1-391ce8e09754)

     
3. Controle do usuário e liberdade
   - Erro: Aplicativos que demandam de diversas decisôes, a falta de histórico das escolhas pode acabar frustando o usuário.
  
     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/160bd666-7a63-4a41-b64d-ff1c8f79228d)

     
   - Acerto: O botão de cancelar com uma boa visibilidade trará ao usuário a liberdade de tomar a decisão de desfazer as ações.
     
     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/09b11378-ddb1-49e8-aa2b-f2f57020df49)

     
4. Conscistencia e estandarte
   - Erro: Atualizações forçadas podem desagradar o usuário, que necessita utilizar o software no momento exato.

     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/a21a439c-c9b3-410d-bab3-6fe9d7b04e2a)

   - Acerto: Em sites de compras online, o catálogo de categorias localizado no início traz conforto ao usuário que tem um produto específico em mente, pois ele acessará as opções de forma simples e rápida.
  
     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/9d5e885d-1da2-44d1-96ff-293637787857)

     
5. Prevenção de erros
   - Erro: Uma interface confusa em um software pode confundir o usuário e levar ele a cometer erros.
  
     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/fe8df18d-e2d4-4550-b380-e145b39619df)

   - Acerto: Em cadastros nos sites de lojas online, o bloqueio para realizar a ação caso um dado não seja preenchido, previne que erros ocorram no sistema.

     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/e16284f7-db48-4ef4-ae1c-cff021b217f0)

     
6. Reconhecimento em vez de lembrança
   - Erro: Formulários extensos podem desanimar o usuário, pois ele terá que lembrar de muitas informações para completa-lo.

     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/5fc1ba8d-7bc3-4961-bc43-03bad3c1fef1)

   - Acerto: Sistemas que dão sugestões para o usuário de acordo com o que ele completa, o anima a preencher todas as informações.

     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/e67037d3-ca0c-43ce-84d7-2c8583e32013)

     
7. Flexibilidade e eficiencia no uso
   - Erro: A falta de recursos em um sistema podem afastar usuários experientes.

     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/56a34ab0-d51a-435b-ae67-dcfc2f0f236c)

     
   - Acerto: Atalhos no teclado em sistemas facilitam a agilidade no uso.
  
     ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/3534c2e8-635f-4c41-b6e4-c397c12bb78f)

     
8. Design Minimalista
    - Erro: Em um site, a quantidade exagerada de informações podem acabar desestimulando o usuário.

      ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/284cf5a0-d3b6-4dbe-b699-484cda2d6bd0)

    - Acerto: Sistemas do Google não possuem muitas informações de uma vez, facilitando a experiencia do usuario.

      ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/52d0661d-af26-4738-8ac1-6cc3c9ec25dc)

      
9. Ajuda aos usuarios para recognizar, diagnosticar e recuperar de erros
    - Erro: Oferecer apenas a opção de contatar os administradores do sistema quando um erro ocorrer, pois nem sempre o usuário terá tempo para retorner um feedback do erro.

      ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/1c4a432f-7a8f-4b35-a38a-9edb24f08dbf)

    - Acerto: Oferecer um botão para o usuário voltar a tela inicial quando algum erro ocorrer no sistema.

      ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/3a252b39-a2a8-4215-a117-b1aa57d14566)

      
10. Ajuda e Documentação
    - Erro: Em um software complexo, a falta da documentação não ajudará a sanar as duvidas que o usuário terá.
      ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/bd4f175a-3bc1-423a-91f9-0132f858ea19)

    - Acerto: A existência de documentações e ajuda traz confiabilidade do usuário ao sistema.

      ![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/7fa80fd4-4115-46f5-b4f3-18fa56180ca0)



# *4 - DIAGRAMA CASO DE USO*

## Gerenciamento de Escola

![DiagramaCasoUsoCorreto](https://github.com/AndreMeneses0103/bertoti/assets/89109574/5c022cbe-1348-4993-8583-a9772f6bd161)


# *5 - DIAGRAMA DE CLASSE*
### V1
![Escola](https://github.com/AndreMeneses0103/bertoti/assets/89109574/1e35b3a8-2326-446b-8be5-9e06ec6ab32c)

### V2
![Diagrama_Gerenciamento drawio](https://github.com/AndreMeneses0103/bertoti/assets/89109574/c746efbd-80a4-44d5-af7f-bba516cbdb48)

### V3
![Novo_Diagrama](https://github.com/AndreMeneses0103/bertoti/assets/89109574/da6e6b32-db9c-49fd-8fae-81d4ed9e50d5)

# *6 - CÓDIGOS JAVA*

***Os códigos Java estão na pasta junto com o Readme***

# Testes automatizados

### Técnica Utilizada: Classe de Equivalência

## Testes na Classe Escola

![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/a44b329e-319d-4b4b-9f05-ab293d97d296)

## Testes na Classe Matéria

![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/61448bcb-eae9-41ca-a0de-5395a000d258)

## Testes na Classe Aluno

![image](https://github.com/AndreMeneses0103/bertoti/assets/89109574/4ca1077e-fb71-4eb8-9ced-6595ee10ed43)


