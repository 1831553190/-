package cn.edu.guet.coursetable.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 M2\u00020\u0001:\u0003MNOB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u00109\u001a\u00020:J\u0006\u0010;\u001a\u00020:J&\u0010<\u001a\u0004\u0018\u00010(2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u00020:H\u0016J\u001a\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u00020(2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0016\u0010F\u001a\u00020:2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HH\u0007J\u0010\u0010J\u001a\u00020:2\u0006\u0010K\u001a\u00020LH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u00a8\u0006P"}, d2 = {"Lcn/edu/guet/coursetable/ui/FragmentCourse;", "Landroidx/fragment/app/Fragment;", "()V", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getBottomSheetDialog", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setBottomSheetDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "bottomView", "Lcn/edu/guet/coursetable/databinding/DialogCourseDetailBinding;", "getBottomView", "()Lcn/edu/guet/coursetable/databinding/DialogCourseDetailBinding;", "setBottomView", "(Lcn/edu/guet/coursetable/databinding/DialogCourseDetailBinding;)V", "courseList", "Ljava/util/ArrayList;", "Lcom/zhuangfei/timetable/model/Schedule;", "getCourseList", "()Ljava/util/ArrayList;", "curWeek", "", "getCurWeek", "()I", "setCurWeek", "(I)V", "dbViewModel", "Lcn/edu/guet/coursetable/viewmodel/DBViewModel;", "getDbViewModel", "()Lcn/edu/guet/coursetable/viewmodel/DBViewModel;", "setDbViewModel", "(Lcn/edu/guet/coursetable/viewmodel/DBViewModel;)V", "listAdapter", "Lcn/edu/guet/coursetable/ui/FragmentCourse$ListAdapter;", "getListAdapter", "()Lcn/edu/guet/coursetable/ui/FragmentCourse$ListAdapter;", "setListAdapter", "(Lcn/edu/guet/coursetable/ui/FragmentCourse$ListAdapter;)V", "mDialogBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "getMDialogBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setMDialogBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "mView", "Lcn/edu/guet/coursetable/databinding/FragmentCourseBinding;", "getMView", "()Lcn/edu/guet/coursetable/databinding/FragmentCourseBinding;", "setMView", "(Lcn/edu/guet/coursetable/databinding/FragmentCourseBinding;)V", "timeTable", "Lcom/zhuangfei/timetable/TimetableView;", "getTimeTable", "()Lcom/zhuangfei/timetable/TimetableView;", "setTimeTable", "(Lcom/zhuangfei/timetable/TimetableView;)V", "DBObserver", "", "initBottomSheet", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "updateCourseTable", "list", "", "Lcom/zhuangfei/timetable/model/ScheduleEnable;", "updateSpinnerText", "week", "", "Companion", "Holder", "ListAdapter", "app_release"})
public final class FragmentCourse extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.zhuangfei.timetable.TimetableView timeTable;
    @org.jetbrains.annotations.NotNull()
    public cn.edu.guet.coursetable.viewmodel.DBViewModel dbViewModel;
    @org.jetbrains.annotations.NotNull()
    public cn.edu.guet.coursetable.databinding.FragmentCourseBinding mView;
    @org.jetbrains.annotations.NotNull()
    public cn.edu.guet.coursetable.databinding.DialogCourseDetailBinding bottomView;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.zhuangfei.timetable.model.Schedule> courseList = null;
    @org.jetbrains.annotations.NotNull()
    public cn.edu.guet.coursetable.ui.FragmentCourse.ListAdapter listAdapter;
    private int curWeek = 1;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> mDialogBehavior;
    @org.jetbrains.annotations.Nullable()
    private static androidx.fragment.app.Fragment fragment;
    public static final cn.edu.guet.coursetable.ui.FragmentCourse.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.zhuangfei.timetable.TimetableView getTimeTable() {
        return null;
    }
    
    public final void setTimeTable(@org.jetbrains.annotations.NotNull()
    com.zhuangfei.timetable.TimetableView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.edu.guet.coursetable.viewmodel.DBViewModel getDbViewModel() {
        return null;
    }
    
    public final void setDbViewModel(@org.jetbrains.annotations.NotNull()
    cn.edu.guet.coursetable.viewmodel.DBViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.edu.guet.coursetable.databinding.FragmentCourseBinding getMView() {
        return null;
    }
    
    public final void setMView(@org.jetbrains.annotations.NotNull()
    cn.edu.guet.coursetable.databinding.FragmentCourseBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.edu.guet.coursetable.databinding.DialogCourseDetailBinding getBottomView() {
        return null;
    }
    
    public final void setBottomView(@org.jetbrains.annotations.NotNull()
    cn.edu.guet.coursetable.databinding.DialogCourseDetailBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zhuangfei.timetable.model.Schedule> getCourseList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cn.edu.guet.coursetable.ui.FragmentCourse.ListAdapter getListAdapter() {
        return null;
    }
    
    public final void setListAdapter(@org.jetbrains.annotations.NotNull()
    cn.edu.guet.coursetable.ui.FragmentCourse.ListAdapter p0) {
    }
    
    public final int getCurWeek() {
        return 0;
    }
    
    public final void setCurWeek(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomsheet.BottomSheetDialog getBottomSheetDialog() {
        return null;
    }
    
    public final void setBottomSheetDialog(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> getMDialogBehavior() {
        return null;
    }
    
    public final void setMDialogBehavior(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void DBObserver() {
    }
    
    public final void initBottomSheet() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void updateCourseTable(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.zhuangfei.timetable.model.ScheduleEnable> list) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void updateSpinnerText(@org.jetbrains.annotations.NotNull()
    java.lang.String week) {
    }
    
    public FragmentCourse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\u0016\u0010 \u001a\u00020\u00192\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcn/edu/guet/coursetable/ui/FragmentCourse$ListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcn/edu/guet/coursetable/ui/FragmentCourse$Holder;", "()V", "curWeek", "", "getCurWeek", "()I", "setCurWeek", "(I)V", "itemCourse", "Lcn/edu/guet/coursetable/databinding/ItemCourseDetailBinding;", "getItemCourse", "()Lcn/edu/guet/coursetable/databinding/ItemCourseDetailBinding;", "setItemCourse", "(Lcn/edu/guet/coursetable/databinding/ItemCourseDetailBinding;)V", "list", "", "Lcom/zhuangfei/timetable/model/Schedule;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshList", "ls", "setWeek", "currentWeek", "app_release"})
    public static final class ListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<cn.edu.guet.coursetable.ui.FragmentCourse.Holder> {
        @org.jetbrains.annotations.NotNull()
        public java.util.List<? extends com.zhuangfei.timetable.model.Schedule> list;
        @org.jetbrains.annotations.NotNull()
        public cn.edu.guet.coursetable.databinding.ItemCourseDetailBinding itemCourse;
        private int curWeek = 1;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.zhuangfei.timetable.model.Schedule> getList() {
            return null;
        }
        
        public final void setList(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.zhuangfei.timetable.model.Schedule> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final cn.edu.guet.coursetable.databinding.ItemCourseDetailBinding getItemCourse() {
            return null;
        }
        
        public final void setItemCourse(@org.jetbrains.annotations.NotNull()
        cn.edu.guet.coursetable.databinding.ItemCourseDetailBinding p0) {
        }
        
        public final int getCurWeek() {
            return 0;
        }
        
        public final void setCurWeek(int p0) {
        }
        
        public final void setWeek(int currentWeek) {
        }
        
        public final void refreshList(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.zhuangfei.timetable.model.Schedule> ls) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public cn.edu.guet.coursetable.ui.FragmentCourse.Holder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        cn.edu.guet.coursetable.ui.FragmentCourse.Holder holder, int position) {
        }
        
        public ListAdapter() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcn/edu/guet/coursetable/ui/FragmentCourse$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_release"})
    public static final class Holder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public Holder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcn/edu/guet/coursetable/ui/FragmentCourse$Companion;", "", "()V", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "(Landroidx/fragment/app/Fragment;)V", "getInstance", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        public final void setFragment(@org.jetbrains.annotations.Nullable()
        androidx.fragment.app.Fragment p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}