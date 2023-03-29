AlertDialog.Builder builder = new AlertDialog.Builder(context);
builder.setTitle("Dialog Title")
       .setMessage("Dialog Message");

AlertDialog dialog = builder.create();

WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
layoutParams.copyFrom(dialog.getWindow().getAttributes());
layoutParams.width = (int) (context.getResources().getDisplayMetrics().widthPixels * 0.9);
layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
dialog.getWindow().setAttributes(layoutParams);

dialog.show();
