

import Microsoft.UI.Composition.SystemBackdrops.MicaKind
import Microsoft.UI.Xaml.*
import Microsoft.UI.Xaml.Controls.*
import Microsoft.UI.Xaml.Markup.IXamlMetadataProvider
import Microsoft.UI.Xaml.Media.MicaBackdrop
import Microsoft.UI.Xaml.XamlTypeInfo.XamlControlsXamlMetaDataProvider
import com.github.knk190001.winrtbinding.runtime.annotations.AggregateImplements
import com.github.knk190001.winrtbinding.runtime.base.IKotlinWinRTAggregate
import java.math.BigInteger

@AggregateImplements([IApplicationOverrides::class, IXamlMetadataProvider::class])
class MyApplication : Application(), IApplicationOverrides, IKotlinWinRTAggregate,
    IXamlMetadataProvider by XamlControlsXamlMetaDataProvider() {
    override fun OnLaunched(args: LaunchActivatedEventArgs?) {
        println("Launch")
        val xamlControlsResources = XamlControlsResources()
        super.OnLaunched(args)
        this.Resources!!.MergedDictionaries!! += xamlControlsResources
        initContents()
    }

    private fun initContents() {
        val buttonText = TextBlock().apply {
            Text = "Hello world"
        }

        val labelText = TextBlock().apply {
            Text = "Count : 2"
        }

        var count:BigInteger = 2.toBigInteger()
        val button = Button().apply {
            Content = buttonText
            Click += RoutedEventHandler { _, _ ->
                count *= count
                labelText.Text = "Count : $count"
            }
        }

        val toggle = ToggleSwitch().apply {
            Header = "Header"
        }

        val stackPanel = StackPanel().apply {
            HorizontalAlignment = Microsoft.UI.Xaml.HorizontalAlignment.Center
            VerticalAlignment = Microsoft.UI.Xaml.VerticalAlignment.Center
            val children = Children!!
            children += button
            children += labelText
            children += toggle
        }

        val w = Window().apply {
            Content = stackPanel
            val backdrop = MicaBackdrop()
            backdrop.Kind = MicaKind.Base
            SystemBackdrop = backdrop
            ExtendsContentIntoTitleBar = true
            Title = "Hello world from kotlin!"
        }
        w.Activate()
        w.DispatcherQueue!!.RunEventLoop()
    }
}