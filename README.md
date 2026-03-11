# 📱 Cálculo Ágil

Aplicativo Android desenvolvido em Kotlin como projeto prático da disciplina de **Desenvolvimento Mobile**, ministrada pelo **Prof. Mário de Jesus**. O app reúne calculadoras científicas e matemáticas voltadas para estudantes de exatas.

---

## 📸 Funcionalidades

| Módulo | Fórmula | Descrição |
|---|---|---|
| ⚡ Velocidade | `v = d / t` | Calcula velocidade a partir de distância e tempo |
| 💪 Força | `F = m * a` | Calcula força a partir de massa e aceleração |
| ⚡ Energia Cinética | `E = (m * v²) / 2` | Calcula energia cinética |
| 🌡️ Fahrenheit → Celsius | `C = 5 * (F-32) / 9` | Converte temperatura de °F para °C |
| 🌡️ Celsius → Fahrenheit | `F = (9 * C + 160) / 5` | Converte temperatura de °C para °F |
| 📐 Área do Paralelepípedo | `V = a * b * c` | Calcula volume com 3 dimensões |
| 🏎️ Equação de Torricelli | `v² = v₀² + 2·a·Δs` | Calcula velocidade final no MUV |
| 🧪 Diluição de Soluções | `C1·V1 = C2·V2` | Resolve para qualquer uma das 4 variáveis |

---

## 🏗️ Arquitetura do App

O app conta com navegação entre múltiplas telas (Activities), tela de splash, passagem de dados via Bundle/Intent e validação de campos.

```
TelaSplash (Launcher)
    └── MainActivity (Menu principal)
            ├── VelocidadeActivity
            ├── ForcaActivity
            ├── EnergiaActivity
            ├── CelsiusActivity
            ├── FahrenheitActivity
            ├── AreaActivity
            ├── EquacaodeTorricelliActivity
            ├── DiluicaoActivity
            └── CadastroActivity
                    └── TelaResposta
```

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

### Testar no celular físico
1. Vá em **Configurações → Sobre o telefone**
2. Toque **7 vezes** em "Número da versão"
3. Ative **Depuração USB** nas Opções do desenvolvedor
4. Conecte o cabo USB e clique em ▶️ no Android Studio

---

## 🛠️ Tecnologias utilizadas

- **Linguagem:** Kotlin
- **SDK mínimo:** API 24 (Android 7.0)
- **UI:** ConstraintLayout + LinearLayout + Material Design
- **Navegação:** Intent + Bundle
- **IDE:** Android Studio

---

## 📚 Conceitos estudados

Este projeto foi desenvolvido como exercício prático cobrindo os seguintes conteúdos:

- Ciclo de vida de uma Activity (`onCreate`, `onStart`, `onResume`...)
- Navegação entre telas com `Intent`
- Tela de Splash com `Handler` e `Looper`
- Passagem de dados entre telas com `Bundle`
- `companion object` para constantes estáticas
- `AlertDialog.Builder` para caixas de alerta
- `ImageView` e pasta `drawable`
- `LinearLayout` com `layout_weight`
- Opacidade hexadecimal em cores

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
