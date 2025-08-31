
# Relógios físicos

- Relógios físicos: 
	- Baseiam-se em hardware (relógio do sistema) de cada máquina.
  - Cada computador tem seu próprio relógio, mas eles nunca estão perfeitamente sincronizados devido a diferenças de cristal, atrasos e falhas.
  - Servem para manter uma aproximação do tempo real do mundo físico.

- Relógios lógicos:
  - Não dependem do tempo real, mas da ordem de ocorrência dos eventos.
  - Incrementam um contador a cada evento e usam mensagens carimbadas com valores para manter a consistência.
  - Introduzidos por Lamport (1978) com os timestamps lógicos, permitem definir uma relação de causalidade entre eventos.


---

# Exclusão mútua e eleição
- **Exclusão mútua:**
	- A exclusão mútua garante que **apenas um processo ou thread por vez** tenha acesso a um recurso crítico ou a uma **seção crítica** (ex.: variável compartilhada, arquivo, banco de dados). Isso evita condições de corrida (race conditions) e mantém a consistência dos dados.

	Exemplos
	- **Caixa eletrônico**: apenas um usuário pode alterar o saldo de uma conta naquele momento.
	- **Impressora compartilhada**: várias pessoas podem solicitar impressão, mas uma só impressão é processada de cada vez.



- **Eleição:**
	- A eleição **ocorre em sistemas distribuídos** quando é necessário escolher um **coordenador/líder para coordenar tarefas** (como gerenciar SC, organizar recursos, ou tomar decisões centralizadas).
	Exemplos:
	- **Videoconferência**: um usuário pode ser eleito como "host" para controlar permissões.
	- **Cluster de servidores**: se o servidor principal falha, os outros precisam eleger automaticamente um novo líder.


Ou seja:
**Exclusão mútua:** Tem o objetivo de impedir mais de um processo/thread na seção crítica
**Eleição: Escolher:** um coordenador ou líder .

---
# Relacionando com a metáfora do Banheiro  

**Situação:**  
4 pessoas querem usar o banheiro ao mesmo tempo.  
Mas só existe **1 pia** e **1 vaso**.  

###  Exclusão Mútua  
- O banheiro só comporta **1 pessoa por vez**.  
- Os outros precisam **esperar na fila** do banheiro.  
- Só um processo entra na **seção crítica** (banheiro).  

###  Relógios Físicos e Lógicos  
- Cada pessoa poderia usar o **relógio de pulso físico** para dizer quem chegou primeiro.  
- Problema: os relógios podem estar **desajustados**.  
- Então a família define uma **ordem lógica fixa**:

- Essa ordem substitui o relógio físico, e todos aceitam a sequência.  

### Eleição  
- A família decide que **alguém deve coordenar a fila**.  
- Regra da eleição:  
1. O **Pai** é coordenador.  
2. Se o Pai não estiver, passa para a **Mãe**.  
3. Se a Mãe não estiver, passa para o **Filho**.  
4. Se também não, sobra para a **Filha**.  

 Assim, **sempre existe um coordenador** para organizar quem vai ao banheiro.  
