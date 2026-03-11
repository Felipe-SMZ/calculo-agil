# 📱 Cálculo Ágil

Aplicativo Android desenvolvido para facilitar cálculos científicos e matemáticos do dia a dia, voltado para estudantes de exatas.

---

## 📸 Funcionalidades

| Módulo | Descrição |
|---|---|
| ⚡ Equação de Torricelli | Calcula a velocidade final usando `v² = v₀² + 2aΔs` |
| 🧪 Diluição de Soluções | Resolve a fórmula `C1·V1 = C2·V2` para qualquer variável |
| 📐 Cálculo de Área | Calcula área a partir de dimensões fornecidas |
| 👤 Cadastro | Tela de cadastro de usuário com nome, telefone e e-mail |

---

## 🚀 Como rodar o projeto

### Pré-requisitos
- [Android Studio](https://developer.android.com/studio) instalado
- JDK 11 ou superior
- Dispositivo Android ou emulador (API 24+)

### Passos

```bash
# 1. Clone o repositório
git clone https://github.com/Felipe-SMZ/calculo-agil.git

# 2. Abra o Android Studio
# File → Open → selecione a pasta clonada

# 3. Aguarde o Gradle sincronizar

# 4. Rode no dispositivo ou emulador (Shift+F10)
```

---

## 🛠️ Tecnologias utilizadas

- **Linguagem:** Kotlin
- **SDK mínimo:** API 24 (Android 7.0)
- **UI:** ConstraintLayout + Material Design
- **IDE:** Android Studio

---

## 📁 Estrutura do projeto

```
app/
├── src/main/
│   ├── java/com/example/calculo_agil/
│   │   ├── MainActivity.kt
│   │   ├── EquacaodeTorricelliActivity.kt
│   │   ├── DiluicaoActivity.kt
│   │   ├── AreaActivity.kt
│   │   ├── CadastroActivity.kt
│   │   └── TelaResposta.kt
│   └── res/
│       ├── layout/
│       └── values/
```

---

## 📐 Fórmulas implementadas

### Equação de Torricelli
```
v² = v₀² + 2·a·Δs
v = √(v₀² + 2·a·Δs)
```

### Diluição de Soluções
```
C1·V1 = C2·V2
```
O app resolve para qualquer uma das 4 variáveis deixando um campo vazio.

---

## 🎨 Design

- Tema escuro com fundo azul `#060D6A`
- Botões verdes `#00C853` para contraste e identidade visual
- Textos brancos para legibilidade

---

## 👨‍💻 Autor

**Felipe Shimizu**  
[![GitHub](https://img.shields.io/badge/GitHub-Felipe--SMZ-181717?style=flat&logo=github)](https://github.com/Felipe-SMZ)  
[![Portfólio](https://img.shields.io/badge/Portfólio-devfelipeshimizu.me-0A66C2?style=flat&logo=google-chrome&logoColor=white)](https://www.devfelipeshimizu.me)

