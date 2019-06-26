package alura.com.br.agenda;

import android.os.AsyncTask;
import android.widget.Toast;

import java.util.List;

import alura.com.br.agenda.converter.AlunoConverter;
import alura.com.br.agenda.dao.AlunoDAO;
import alura.com.br.agenda.model.Aluno;

public class EnviaAlunosTask extends AsyncTask {

    @Override
    protected Object doInBackground(Object[] objects) {
/*
        AlunoDAO dao = new AlunoDAO(this);
        List<Aluno> alunos = dao.buscaAlunos();
        dao.close();

        AlunoConverter converter = new AlunoConverter();
        String json = converter.toJson(alunos);
        Toast.makeText(this, json, Toast.LENGTH_LONG).show();

        WebClient client = new WebClient();
        client.post(json);
        */
        return null;

    }
}
