using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace WorkerPractice
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        #region Async programming - OLD WAY - Backgrond worker
        //private void btnStart_Click(object sender, RoutedEventArgs e)
        //{
        //    BackgroundWorker bw = new BackgroundWorker(); // Create new thread using Background Worker.
        //    bw.DoWork += custom_work;
        //    bw.RunWorkerAsync();
        //}

        //private void custom_work(object? sender, DoWorkEventArgs e) // Make sure the parameters are in this format since BackgroundWorker.DoWork uses a delegate object.
        //{
        //    Trace.WriteLine("Start: " + DateTime.Now);
        //    Thread.Sleep(10000); // Equivalent of running a large and time consuming query that takes 10 secs to complete.
        //    Trace.WriteLine("Custom work Completed.");
        //    Trace.WriteLine("Stop: " + DateTime.Now);
        //}

        //private void btnStop_Click(object sender, RoutedEventArgs e) // This method will work even if custom_work thread is asleep since main thread is still active.
        //{
        //    Trace.WriteLine("Stop Button Clicked!");
        //}
        #endregion

        #region Async programming - NEW WAY - Task + await
        private async void btnStart_Click(object sender, RoutedEventArgs e)
        {
            await custom_work();
        }

        private async Task custom_work() // After .NET 4.5 'Task' + 'await' keyword is introduced that replaces BackgroundWorker.
        {
            Trace.WriteLine("Start: " + DateTime.Now);
            await Task.Delay(10000);
            Trace.WriteLine("Custom work Completed.");
            Trace.WriteLine("Stop: " + DateTime.Now);
        }

        private void btnStop_Click(object sender, RoutedEventArgs e) // This method will work even if custom_work task is running in background since main thread is still active.
        {
            Trace.WriteLine("Stop Button Clicked!");
        }
        #endregion
    }
}
