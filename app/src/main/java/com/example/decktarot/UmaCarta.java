package com.example.decktarot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;
public class UmaCarta extends AppCompatActivity {

    static class Carta {
        int imagemID;
        String nome;
        String texto;

        public Carta(String nome, int imagemID, String texto) {
            this.nome = nome;
            this.imagemID = imagemID;
            this.texto = texto;
        }
    }

    private Button voltar;

    private static final Random rgenerador = new Random();
    private static final Carta[] cartas = {
            new Carta("Ás de espadas", R.drawable.as_espadas, " Pare de ser emocionado, em compensação cuidado com o sentimento da pessoa que você gosta"),
            new Carta("Dois de espadas", R.drawable.dois_espadas, "Se você tem um relacionamento, ele é muito tóxico, e tem tido muitas brigas, que tal repensar essa situação?\n\nSe está sozinho, continue assim, antes só do que mal acompanhado"),
            new Carta("Três de espadas", R.drawable.tres_espadas, "Para de ter medo e deixe as coisas claras, pergunte a pessoa amada qual a intenção dela, arranque o band-aid de uma vez só"),
            new Carta("Quatro de espadas", R.drawable.quatro_espadas, "Pare de mandar mensagem para o seu crush toda hora, deixe ele respirar e respire você também, você também precisa se estruturar emocionalmente"),
            new Carta("Cinco de espadas", R.drawable.cinco_espadas, "Dedique um pouco mais de tempo ao seu crush, procure saber do que ele gosta, e converse sobre a vida dele"),
            new Carta("Seis de espadas", R.drawable.seis_espadas, "Se está solteiro, está na hora de esquecer esse antigo amor que você sabe que nunca vai da certo.\n\nSe está em um relacionamento, você precisa aceitar os defeitos do seu parceiro, afinal, nem você é perfeito"),
            new Carta("Sete de espadas", R.drawable.sete_espadas, "Pare de conversar com todo mundo sobre seu relacionamento e converse diretamente com seu crush, existe muitos recalcados, e nem todo mundo sabe tudo o que passa entre vocês dois"),
            new Carta("Oito de espadas", R.drawable.oito_espadas, "Se o relacionamento está trazendo mais tristeza que alegrias, é hora de abandona-lo"),
            new Carta("Nove de espadas", R.drawable.nove_espadas, "Se seu relacionamento estiver com muitas crises, tente dedicar um tempo e ceder um pouco"),
            new Carta("Dez de espadas", R.drawable.dez_espadas, "Seu relacionamento claramente não está te fazendo bem e é muito aconselhavel que você termine tudo"),
            new Carta("Valete de espadas", R.drawable.valete_espadas, "Pare de cobrar tudo do outro, você não está sempre certo"),
            new Carta("Cavaleiro de espadas", R.drawable.cavaleiro_espadas, "Vocês não são crianças, usem o dialogo maduro para resolver as coisas"),
            new Carta("Rainha de espadas", R.drawable.rainha_espadas, "Seu relacionamento pode chegar ao fim, e ser um periodo melancolico"),
            new Carta("Rei de espadas", R.drawable.rei_espadas, "Você é um pouco frio e distante, isso pode ser confundido com falta de interesse pela pessoa amada"),


            new Carta("Ás de copas", R.drawable.as_copas, "Entre vocês existe ou existirá paixãoo intensa, intimidade e uma forte relação"),
            new Carta("Dois de copas", R.drawable.dois_copas, "Você terá algum outro tipo de parceria para alem do amor com o seu crush"),
            new Carta("Três de copas", R.drawable.tres_copas, "Vocês formam um ótimo casal, e tem grandes chances de funcionarem bem juntos"),
            new Carta("Quatro de copas", R.drawable.quatro_copas, "Esqueça os relacionamentos passados e foque nos novos, não fique comparando , cada um é cada um"),
            new Carta("Cinco de copas", R.drawable.cinco_copas, "Pare de se iludir, dê um passo pra trás para enxergar a que ponto essa relação está"),
            new Carta("Seis de copas", R.drawable.seis_copas, "Curta o jeito que sua relação está agora, tudo muda, nada é pra sempre"),
            new Carta("Sete de copas", R.drawable.sete_copas, "Você está indeciso quanto ao seu relacionamento, não tome nenhuma atitude no momento, deixe como esta"),
            new Carta("Oito de copas", R.drawable.oito_copas, "Pare de medo e busque o romance e estabilidade"),
            new Carta("Nove de copas", R.drawable.nove_copas, "Bons pressagios para o amor, as coisas podem da certo com o crush"),
            new Carta("Dez de copas", R.drawable.dez_copas, "Você vai ser muito feliz em uma relação com essa pessoa"),
            new Carta("Valete de copas", R.drawable.valete_copas, "Tem um amor jovem no ar, mas você precisa parar de ser egoista e pensar na outra pessoa também"),
            new Carta("Cavaleiro de copas", R.drawable.cavaleiro_copas, "Você poderá ficar confuso e apaixonado por mais de uma pessoa "),
            new Carta("Rainha de copas", R.drawable.rainha_copas, "Agora que você está mais maduro emocionalmente, pode se entregar a um amor"),
            new Carta("Rei de copas", R.drawable.rei_copas, "Você terá o amor que sempre quis e merece"),


            new Carta("Ás de paus", R.drawable.as_paus, "Você pode reencontrar alguem do passado"),
            new Carta("Dois de paus", R.drawable.dois_paus, "Vem ai um sofrimento e um amor não correspondido"),
            new Carta("Três de paus", R.drawable.tres_paus, "Você precisa conversar e dialogar mais com o seu crush"),
            new Carta("Quatro de paus", R.drawable.quatro_paus, "Você viverá momentos incriveis com quem você ama"),
            new Carta("Cinco de paus", R.drawable.cinco_paus, "Vocês terão muitas brigas e desentendimentos e você é muito orgulhoso "),
            new Carta("Seis de paus", R.drawable.seis_paus, "Vocês estão no caminho certo, tome cuidado pra não parecer uma pessoa que se acha de mais"),
            new Carta("Sete de paus", R.drawable.sete_paus, "Evite discussões, aja de forma racional, você nao é mais um bebê"),
            new Carta("Oito de paus", R.drawable.oito_paus, "Com tanta briga ou vocês vão terminar, ou uma hora vão acabar deixando as brigas de lado"),
            new Carta("Nove de paus", R.drawable.nove_paus, "Seja confiante para conquistar a pessoa amada"),
            new Carta("Dez de paus", R.drawable.dez_paus, "Tente criar planos com o seu crush para que a relação dê certo"),
            new Carta("Valete de paus", R.drawable.valete_paaus, "Seu relacionamento pode ficar um pouco mais serio"),
            new Carta("Cavaleiro de paus", R.drawable.cavaleiro_paus, "Seu parceiro pode está desapaixonando por você infelizmente, acontece"),
            new Carta("Rainha de paus", R.drawable.rainha_paus, "Tudo dará certo no seu relacionamento"),
            new Carta("Rei de paus", R.drawable.rei_paus, "O seu parceiro é gurreiro e forte e terá uma relação solida com você"),


            new Carta("Ás de ouros", R.drawable.oito_ouros, "Mostre ao seu crush o quanto você gosta dele"),
            new Carta("Dois de ouros", R.drawable.dois_ouros, "Você precisa conversar e abrir seus sentimentos para a pessoa que ama"),
            new Carta("Três de ouros", R.drawable.tres_ouros, "As crises vão acabar"),
            new Carta("Quatro de ouros", R.drawable.quatro_ouros, "Não seja possessivo e assim sua relação ficará mais solida"),
            new Carta("Cinco de ouros", R.drawable.cinco_ouros, "Está na hora de superar algo que não te faz bem"),
            new Carta("Seis de ouros", R.drawable.seis_ouros, "Este relacionamento é mais carnal que emocional"),
            new Carta("Sete de ouros", R.drawable.sete_ouros, "Pare de ser uma pessoa ressentida, perdoe e se equilibre"),
            new Carta("Oito de ouros", R.drawable.oito_ouros, "Não fique cobrando de mais e tudo dará certo"),
            new Carta("Nove de ouros", R.drawable.nove_ouros, "Momentos dificeis virão, mas fortalecerá a união"),
            new Carta("Dez de ouros", R.drawable.dez_ouros, "Amor tranquilo e feliz"),
            new Carta("Valete de ouros", R.drawable.valete_ouros, "Evitem brigas e façam planos juntos"),
            new Carta("Cavaleiro de ouros", R.drawable.cavaleiro_ouros, "Você está muito desconfiado então vá com calma, um passo de cada vez"),
            new Carta("Rainha de ouros", R.drawable.rainha_ouros, "Cuidado, pode existir rivais"),
            new Carta("Rei de ouros", R.drawable.rei_ouros, "Bons momentos entre o casal"),


            new Carta("O Louco", R.drawable.o_louco, "Tudo ainda está muito sem resposta, e muito voltado a diversão"),
            new Carta("O Mago", R.drawable.o_mago, "Apimente mais sua relação"),
            new Carta("A Suma Sacerdotisa", R.drawable.a_papisa, "Surgirá muitos conflitos internos, acredite na sua intuição "),
            new Carta("A Imperatriz", R.drawable.a_imperatriz, "Alta fertilidade, ciume e traição"),
            new Carta("O Imperador", R.drawable.o_imperador, "Estabilidade e confiança no relacionamento"),
            new Carta("O Papa", R.drawable.o_papa, "Relacionamento para a vida inteira, com muita fidelidade"),
            new Carta("Os Enamorados", R.drawable.os_enamorados, "Você está em duvida entre mais de uma pessoa, analise bem qual melhor decisão tomar"),
            new Carta("A Carruagem", R.drawable.o_carrp, "Determinação vindo da pessoa amada para que vocês fiquem juntos"),
            new Carta("A Justiça", R.drawable.a_justica, "Reflita sobre a relação e sobre o lado do parceiro"),
            new Carta("O Eremita", R.drawable.o_eremita, "Pense bem antes de entrar ou permanecer em um relacionamento"),
            new Carta("A Força", R.drawable.a_forca, "O relacionamento está muito forte "),
            new Carta("O Enforcado", R.drawable.o_pendurado, "Enfraquecimento de relações"),
            new Carta("A Morte", R.drawable.a_morte, "Novo ciclo, se ja tem um relacionamento pode ser o fim dele, e se nao tem, pode ser o começo de um"),
            new Carta("A Temperança", R.drawable.a_temperanca, "Harmonia e relacionamento saudável"),
            new Carta("O Diabo", R.drawable.o_diabo, "Essa relação só tem sexo e prazer, nada de amor"),
            new Carta("A Torre", R.drawable.a_torre, "Essa relação tem tudo pra da errado e acabar"),
            new Carta("A Estrela", R.drawable.a_estrela, "Amor verdadeiro"),
            new Carta("A Lua", R.drawable.a_lua, "Existem muitas coisas escondidas que você ainda não sabe"),
            new Carta("O Sol", R.drawable.o_sol, "Harmonia e criaçao de família"),
            new Carta("O Julgamento", R.drawable.o_julgamento, "Existirão mudanças, só nao se sabe se para o bem ou para o mal"),
            new Carta("O Mundo", R.drawable.o_mundo, "Novo amor, estilo conto de fadas")

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uma_carta);

        Carta q = cartas[rgenerador.nextInt(cartas.length)];
        final ImageView iv = (ImageView) findViewById(R.id.imagem_carta);
        final TextView nomeCarta = (TextView) findViewById(R.id.nome_carta);
        final TextView textoCarta = (TextView) findViewById(R.id.texto);
        voltar = findViewById(R.id.button_voltar_taça_uma_carta);

        nomeCarta.setText(q.nome);
        iv.setImageResource(q.imagemID);
        textoCarta.setText(q.texto);

        View nextButton = findViewById(R.id.button_embaralhar_taça_um);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Carta q = cartas[rgenerador.nextInt(cartas.length)];
                nomeCarta.setText(q.nome);
                iv.setImageResource(q.imagemID);
                textoCarta.setText(q.texto);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}