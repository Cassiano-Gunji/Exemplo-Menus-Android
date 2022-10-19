package br.edu.cruzeirodosul.exemplomenus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        boolean saida = true;
        switch (item.getItemId()){
            case R.id.menuItemMensagem:
                exibaMensagem();
                break;
            case R.id.menuItemNavegador:
                exibaNavegador();
                break;
            case R.id.menuItemSobre:
                exibaSobre();
                break;
            default:
                saida = super.onOptionsItemSelected(item);
        }
        return saida;
    }

    private void exibaMensagem(){
        Toast.makeText(this, R.string.mensgem, Toast.LENGTH_SHORT).show();
    }

    private void exibaNavegador(){
        Uri uri = Uri.parse("https://www.cruzeirodosul.edu.br");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void exibaSobre(){
        Intent intent = new Intent(this, SobreActivity.class);
        startActivity(intent);
    }
}