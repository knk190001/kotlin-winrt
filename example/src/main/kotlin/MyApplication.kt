import Microsoft.UI.Composition.SystemBackdrops.MicaKind
import Microsoft.UI.Xaml.*
import Microsoft.UI.Xaml.Controls.Button
import Microsoft.UI.Xaml.Controls.StackPanel
import Microsoft.UI.Xaml.Controls.TextBlock
import Microsoft.UI.Xaml.Controls.XamlControlsResources
import Microsoft.UI.Xaml.Markup.IXamlMetadataProvider
import Microsoft.UI.Xaml.Markup.IXamlType
import Microsoft.UI.Xaml.Markup.XmlnsDefinition
import Microsoft.UI.Xaml.Media.MicaBackdrop
import Microsoft.UI.Xaml.XamlTypeInfo.XamlControlsXamlMetaDataProvider
import Windows.UI.Xaml.Interop.TypeName

import com.github.knk190001.winrtbinding.runtime.annotations.AggregateImplements
import com.github.knk190001.winrtbinding.runtime.base.IKotlinWinRTAggregate
import com.github.knk190001.winrtbinding.runtime.com.IUnknown

@Suppress("DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE")
@AggregateImplements([IApplicationOverrides::class, IXamlMetadataProvider::class])
class MyApplication : Application(), IApplicationOverrides, IKotlinWinRTAggregate,
    IXamlMetadataProvider by XamlControlsXamlMetaDataProvider(){
    override fun OnLaunched(args: LaunchActivatedEventArgs?) {
        println("Launch")
        this.get_Resources()!!.get_MergedDictionaries()!!.Append(XamlControlsResources())
        initContents()
    }

    private fun initContents() {
        val buttonText = TextBlock().apply {
            put_Text("Hello world")
        }

        val labelText = TextBlock().apply {
            put_Text("Count : 0")
        }

        var count = 0
        val button = Button().apply {
            put_Content(buttonText)
            add_Click(RoutedEventHandler { _, _ ->
                count++
                labelText.put_Text("Count : $count")
            })
        }

        val stackPanel = StackPanel().apply {
            put_HorizontalAlignment(HorizontalAlignment.Center)
            put_VerticalAlignment(VerticalAlignment.Center)
            val children = get_Children()!!
            children.Append(button)
            children.Append(labelText)
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