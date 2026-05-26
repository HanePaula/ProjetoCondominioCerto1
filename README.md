# Projeto Condomínio Certo 🏢

Sistema de Gestão de Condomínio desenvolvido em **Java Swing** seguindo as melhores práticas de orientação a objetos, organização arquitetural MVC e padrões premium de interface de usuário (ERP).

---

## ✨ Diferenciais e Melhorias de UX/UI
O projeto passou por um processo completo de **refatoração visual e usabilidade**, corrigindo problemas crônicos de dimensionamento e alinhamento gerados originalmente pelo editor Matisse (NetBeans):
- **Design de ERP Premium:** Otimização do espaçamento, alinhamento perfeitamente simétrico de labels e inputs, e uniformização das janelas.
- **Campos E-mail e CNJ Livres:** Distribuição harmônica inteligente de larguras horizontais para evitar que campos à extrema direita fossem espremidos a largura zero pelo Swing.
- **Rodapé com Botões 100% Visíveis:** Ajuste da altura do painel de botões em todas as 10 telas do sistema (de `43px` para `54px`) garantindo que as bordas, textos e ícones nunca sejam cortados pelo gerenciador de janelas do sistema operacional (como Gnome/Linux).
- **Tratamento Dinâmico de Janelas:** Implementação de destravamento e retravamento temporário horizontal para garantir que os tamanhos da janela respeitem perfeitamente o layout sem congelamento.
- **Campos ERP Somente-Leitura:** Campos de ID e Status visíveis mas completamente protegidos (`setEnabled(false)` e `setEditable(false)`), com preenchimento intuitivo:
  - **ID:** `(Novo Autogerado)`
  - **Status:** `ATIVO`

---

## 🛠️ Tecnologias Utilizadas
- **Java SE (Swing)** - Interface gráfica nativa.
- **Ant** - Automação de compilação.
- **Git** - Controle de versão.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
Certifique-se de ter o JDK (Java Development Kit) e o Apache Ant instalados em sua máquina.

### 📦 Compilação
Para compilar todos os arquivos do projeto de forma limpa:
```bash
ant compile
```

### 🖥️ Executando as Telas
Você pode rodar qualquer uma das telas de cadastro diretamente pelo terminal a partir da pasta compilada:

* **Cadastro de Fornecedor:**
  ```bash
  java -cp build/classes view.TelaCadastroFornecedor
  ```

* **Cadastro de Proprietário:**
  ```bash
  java -cp build/classes view.TelaCadastroProprietario
  ```

* **Cadastro de Síndico Profissional:**
  ```bash
  java -cp build/classes view.TelaCadastroSindicoProfissional
  ```

* **Cadastro de Movimento de Caixa:**
  ```bash
  java -cp build/classes view.TelaCadastroMovimentoCaixa
  ```

* **Cadastro de Função de Mandato:**
  ```bash
  java -cp build/classes view.TelaCadastroFuncaoMandato
  ```

---

## 📁 Estrutura de Pastas
- `src/model/` - Modelos de dados e lógica de negócios (Entidades).
- `src/view/` - Interfaces visuais Swing (.java e metadados .form).
- `src/imagens/` - Conjunto de recursos e ícones de alta qualidade do sistema.
- `nbproject/` - Configurações do projeto para integração direta com NetBeans.
