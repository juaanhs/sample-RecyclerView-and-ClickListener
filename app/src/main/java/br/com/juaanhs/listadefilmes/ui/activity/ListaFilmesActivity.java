package br.com.juaanhs.listadefilmes.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.juaanhs.listadefilmes.R;
import br.com.juaanhs.listadefilmes.model.Filme;
import br.com.juaanhs.listadefilmes.ui.adapter.Adapter;

public class ListaFilmesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);

        recyclerView = findViewById(R.id.reciclerView);

        //configurando adapter
        Adapter adapter = new Adapter(listaFilmes);

        //listagem filme
        criarFilmes();


        // Configurando  RecyclerView
        configuraRecyclerView(adapter);


    }

    private void configuraRecyclerView(Adapter adapter) {
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true); //otimizando recycler view definindo tamanho fixo
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
    }

    public void criarFilmes(){
        Filme filme = new Filme("Homem Aranha - De volta ao lar", "Ação", "2017");
        listaFilmes.add(filme);

        filme = new Filme("Coraline", "Animação/Terror", "2009");
        listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha", "Ação", "2017");
        listaFilmes.add(filme);

        filme = new Filme("Liga da Justiça", "Ficção", "2017");
        listaFilmes.add(filme);

        filme = new Filme("Capitão América - Guerra Civíl", "Aventura/Ficção", "2016");
        listaFilmes.add(filme);

        filme = new Filme("It: A Coisa", "Drama/Terror", "2017");
        listaFilmes.add(filme);

        filme = new Filme("Pica-Pau: O Filme", "Comédia/Animação", "2017");
        listaFilmes.add(filme);

        filme = new Filme("A Múmia", "Terror", "2017");
        listaFilmes.add(filme);

        filme = new Filme("A Bela e a Fera", "Romance", "2017");
        listaFilmes.add(filme);

        filme = new Filme("Meu malvado favorito 3", "Comédia", "2017");
        listaFilmes.add(filme);

        filme = new Filme("Carros 3", "Comédia", "2017");
        listaFilmes.add(filme);
    }
}
