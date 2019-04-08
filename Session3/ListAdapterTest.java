package comcalcula.example.a97053.test;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListAdapterTest extends RecyclerView.Adapter<ListAdapterTest.TestViewHolder>{

    QuestionClass[] qs;
    Context context;

    ListAdapterTest(QuestionClass[] qs1, Context context1){
        qs = qs1;
        context = context1;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view =
        LayoutInflater.from(context).inflate(R.layout.item_list, viewGroup, false);
        return new TestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder vh, int i) {
        vh.questionTV.setText(    qs[i].question   );
        vh.answerTV.setText(    qs[i].answer   );
    }

    @Override
    public int getItemCount() {
        return qs.length;
    }

    public class TestViewHolder extends RecyclerView.ViewHolder{
        TextView questionTV;
        TextView answerTV;
        TestViewHolder(@NonNull View view){
            super(view);
            questionTV = view.findViewById(R.id.question);
            answerTV = view.findViewById(R.id.correct_answer);
        }
    }
}

