
import Windows.ApplicationModel.Activation.*
import Windows.Foundation.IPropertyValue
import Windows.UI.Xaml.IApplicationOverrides
import Windows.UI.Xaml.WindowCreatedEventArgs
import com.github.knk190001.winrtbinding.runtime.annotations.ObjectImplements
import com.github.knk190001.winrtbinding.runtime.base.KotlinWinRTObject
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.instanceOf
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestClassImpl {

    @Test
    fun testQueryInterface() {
        val app = TestApplication()
        Assertions.assertTrue(app.instanceOf<IApplicationOverrides>())
    }

    @Test
    fun testAnyABI() {
        val str = "Hello"
        val native = com.github.knk190001.winrtbinding.runtime.AnyABI.toNative(str)
        Assertions.assertTrue(IUnknown.ABI.fromNative(native).instanceOf<IPropertyValue>())
    }
}

@ObjectImplements([IApplicationOverrides::class])
class TestApplication: KotlinWinRTObject(), IApplicationOverrides{

    override fun OnActivated(args: IActivatedEventArgs?) {
        TODO("Not yet implemented")
    }

    override fun OnLaunched(args: LaunchActivatedEventArgs?) {
        TODO("Not yet implemented")
    }

    override fun OnFileActivated(args: FileActivatedEventArgs?) {
        TODO("Not yet implemented")
    }

    override fun OnSearchActivated(args: SearchActivatedEventArgs?) {
        TODO("Not yet implemented")
    }

    override fun OnShareTargetActivated(args: ShareTargetActivatedEventArgs?) {
        TODO("Not yet implemented")
    }

    override fun OnFileOpenPickerActivated(args: FileOpenPickerActivatedEventArgs?) {
        TODO("Not yet implemented")
    }

    override fun OnFileSavePickerActivated(args: FileSavePickerActivatedEventArgs?) {
        TODO("Not yet implemented")
    }

    override fun OnCachedFileUpdaterActivated(args: CachedFileUpdaterActivatedEventArgs?) {
        TODO("Not yet implemented")
    }

    override fun OnWindowCreated(args: WindowCreatedEventArgs?) {
        TODO("Not yet implemented")
    }
}
