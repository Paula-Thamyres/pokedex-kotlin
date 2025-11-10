🐾 Pokedex Kotlin

Um aplicativo Android desenvolvido em Kotlin, inspirado na Pokedex, para exibir detalhes de Pokémon, suas características e estatísticas.

O projeto segue o padrão MVVM com separação clara entre View, Repository e Domain, utilizando coroutines para chamadas assíncronas e Glide para carregamento de imagens.

🗂️ Package principal
br.com.paulafemina.android.pokedex_kotlin

Arquitetura do Projeto
graphql
```text
br.com.paulafemina.android.pokedex_kotlin/
│
├─ api/                    # 🌐 Comunicação com API REST Pokémon
│   ├─ PokemonRepository.kt
│   └─ model/              # 📦 Classes de resposta da API
│       └─ PokemonApiResult.kt
│
├─ domain/                 # 🎯 Modelos de domínio
│   └─ Pokemon.kt
│
├─ util/                   # 🧰 Utilitários do app
│   └─ TypeColorUtil.kt    # 🎨 Cores baseadas no tipo do Pokémon
│
├─ view/                   # 👁️ Telas e UI
│   ├─ MainActivity.kt
│   ├─ PokemonDetailActivity.kt
│   └─ adapter/            # 🔁 Adapter da RecyclerView
│       └─ PokemonAdapter.kt
│
├─ res/
│   ├─ layout/             # 🧱 Layouts XML
│   │   ├─ activity_main.xml
│   │   └─ activity_pokemon_detail.xml
│   ├─ drawable/           # 🎨 Ícones e imagens
│   ├─ values/             # 📌 Cores, dimensões e strings
│   └─ menu/               # 🍔 Menus do app
│
└─ build.gradle            # ⚙️ Configurações do projeto
```
✨ Funcionalidades

📜 Listagem de Pokémon com RecyclerView

🔍 Tela de detalhe do Pokémon:

🟡 Imagem em card circular

🔢 Nome, número e tipos

🎨 Tipos exibidos com cores correspondentes

🖼️ Carregamento de imagens com Glide

⚡ Uso de coroutines para chamadas assíncronas

🎛️ Toolbar personalizada com botão de voltar

🧱 Tecnologias e Bibliotecas
Tecnologia	Finalidade
🧑‍💻 Kotlin	Linguagem principal
🧩 AndroidX	Suporte ao Android moderno
🎨 Material Components	UI moderna
🖼️ Glide	Carregamento de imagens
⚡ Coroutines	Concorrência assíncrona
🧠 MVVM	Organização da arquitetura
🔁 RecyclerView	Lista eficiente
📦 MaterialCardView	Estilização de cards
🖼️ Layout e UI
activity_main.xml

Lista de Pokémon com:

🖼️ imagem

🔤 nome

🎨 tipo

activity_pokemon_detail.xml

Card circular com imagem e sombra

Card com nome, número e tipos

Card separado para stats e características

Rolagem com ScrollView/NestedScrollView

📝 Observações

🎨 Todas as cores de tipo são aplicadas via TypeColorUtil.kt

🌐 PokemonRepository.kt realiza chamadas à API REST Pokémon

🧵 Dados carregados de forma assíncrona com fallback para dados indisponíveis

▶️ Como executar

Clone o repositório:

git clone https://github.com/seu_usuario/pokedex-kotlin.git


Abra no Android Studio.

Configure o SDK mínimo e compile o projeto.

Rode no emulador ou dispositivo Android 6.0+.
