package family_tree;
import model.FamilyTreeModel;
import view.FamilyTreeView;
public class Presenter {
    private FamilyTreeModel model;
    private FamilyTreeView view;

    public FamilyTreePresenter(FamilyTreeModel model, FamilyTreeView view) {
        this.model = model;
        this.view = view;
    }
}
