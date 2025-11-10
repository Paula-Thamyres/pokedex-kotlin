# Pokedex Kotlin

Um aplicativo Android desenvolvido em **Kotlin**, inspirado na Pokedex, para exibir detalhes de Pokémon, suas características e estatísticas.  

O projeto segue o padrão **MVVM** com separação clara entre **View**, **Repository** e **Domain**, utilizando **coroutines** para chamadas assíncronas e **Glide** para carregamento de imagens.

---

## Package principal

```text
br.com.paulafemina.android.pokedex_kotlin
Arquitetura do Projeto
graphql

br.com.paulafemina.android.pokedex_kotlin/
│
├─ api/                    # Comunicação com API REST Pokémon
│   ├─ PokemonRepository.kt
│   └─ model/              # Classes de resposta da API
│       └─ PokemonApiResult.kt
│
├─ domain/                 # Modelos de domínio
│   └─ Pokemon.kt
│
├─ util/                   # Utilitários do app
│   └─ TypeColorUtil.kt    # Cores baseadas no tipo do Pokémon
│
├─ view/                   # Activities e layouts
│   ├─ MainActivity.kt
│   ├─ PokemonDetailActivity.kt
│   └─ adapter/            # Adapters para RecyclerView
│       └─ PokemonAdapter.kt
│
├─ res/
│   ├─ layout/             # XML de layouts
│   │   ├─ activity_main.xml
│   │   └─ activity_pokemon_detail.xml
│   ├─ drawable/           # Ícones e imagens
│   ├─ values/             # Cores, dimensões e strings
│   └─ menu/               # Menu do app (drawer/menu)
│
└─ build.gradle            # Configurações do projeto
```

Funcionalidades
Listagem de Pokémon com RecyclerView.

Tela de detalhe do Pokémon:

Imagem em card circular.

Nome, número e tipos em card centralizado (type_steel).

Características e stats em card separado abaixo.

Tipos exibidos com cores correspondentes.

Carregamento de imagens com Glide.

Uso de coroutines (lifecycleScope) para chamadas assíncronas à API.

Toolbar personalizada com botão de voltar.

Tecnologias e Bibliotecas
Kotlin

AndroidX

Material Components

Glide

Coroutines

MVVM

RecyclerView

MaterialCardView

Layout e UI
activity_main.xml

Lista de Pokémon com RecyclerView.

Cada item possui nome, imagem e tipo.

activity_pokemon_detail.xml

Imagem do Pokémon em card circular com sombra.

Card com nome, número e tipos (centralizado).

Card separado para características e stats.

ScrollView/NestedScrollView para conteúdo rolável.

Observações
Toda lógica de cores por tipo é gerenciada em TypeColorUtil.kt.

O PokemonRepository.kt faz chamadas à API REST Pokémon.

Os dados de características são buscados de forma assíncrona e exibidos com fallback caso não estejam disponíveis.

Como executar
Clone o repositório:

bash
Copiar código
git clone https://github.com/seu_usuario/pokedex-kotlin.git
Abra no Android Studio.

Configure o SDK mínimo e compile o projeto.

Rode em um dispositivo ou emulador com Android 6.0+.

Aproveite a Pokedex!
