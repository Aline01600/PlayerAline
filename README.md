# PlayerAline - Competidor do Dilema do Prisioneiro
Este projeto contém a implementação da estratégia "punitivo" para o jogo Dilema 
do prisioneiro.

### Estratégia implementada
- Cooperar inicialmente.
- Se o oponente trair ('DEFECT'), punir com 'DEFECT' pou um número crescente de 
rodadas.
- A punição dobra de duração a cada nova traição recebida fora do período de 
punição atual.
- Durante o periodo de punição, ignorar novas traições.
