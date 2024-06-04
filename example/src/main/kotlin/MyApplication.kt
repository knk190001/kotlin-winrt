import Microsoft.UI.Composition.SystemBackdrops.MicaKind
import Microsoft.UI.Xaml.*
import Microsoft.UI.Xaml.Controls.Button
import Microsoft.UI.Xaml.Controls.StackPanel
import Microsoft.UI.Xaml.Controls.TextBlock
import Microsoft.UI.Xaml.Controls.XamlControlsResources
import Microsoft.UI.Xaml.Markup.IXamlMetadataProvider
import Microsoft.UI.Xaml.Media.MicaBackdrop
import Microsoft.UI.Xaml.XamlTypeInfo.XamlControlsXamlMetaDataProvider
import com.github.knk190001.winrtbinding.runtime.annotations.AggregateImplements
import com.github.knk190001.winrtbinding.runtime.base.IKotlinWinRTAggregate
import java.math.BigInteger

@AggregateImplements([IApplicationOverrides::class, IXamlMetadataProvider::class])
class MyApplication : Application(), IApplicationOverrides, IKotlinWinRTAggregate,
    IXamlMetadataProvider by XamlControlsXamlMetaDataProvider(){
    override fun OnLaunched(args: LaunchActivatedEventArgs?) {
        println("Launch")
        this.get_Resources()!!.get_MergedDictionaries()!! += XamlControlsResources()
        initContents()
    }

    private fun initContents() {
        val buttonText = TextBlock().apply {
            put_Text("Hello world")
        }

        val labelText = TextBlock().apply {
            put_Text("Count : 2")
        }

        var count:BigInteger = 2.toBigInteger()
        val button = Button().apply {
            put_Content(buttonText)
            Click += RoutedEventHandler { _, _ ->
                count *= count
                labelText.put_Text("Count : $count")
            }
        }

        val stackPanel = StackPanel().apply {
            put_HorizontalAlignment(HorizontalAlignment.Center)
            put_VerticalAlignment(VerticalAlignment.Center)
            val children = get_Children()!!
            children += button
            children += labelText

        }

        val w = Window().apply {
            put_Content(stackPanel)
            val backdrop = MicaBackdrop()
            backdrop.put_Kind(MicaKind.Base)
            put_SystemBackdrop(backdrop)
            put_ExtendsContentIntoTitleBar(true)
            put_Title("Hello world from kotlin!")
        }
        w.Activate()
        w.get_DispatcherQueue()!!.RunEventLoop()
    }
}