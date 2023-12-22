package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.INavigationViewItemPresenterTemplateSettingsFactory.ABI.IID
import Microsoft.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NavigationViewItemPresenterTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.NavigationViewItemPresenterTemplateSettings;{a5119750-fa71-56f2-bfa4-799d9f304cb8})")
@WinRTByReference(brClass = NavigationViewItemPresenterTemplateSettings.ByReference::class)
public open class NavigationViewItemPresenterTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), INavigationViewItemPresenterTemplateSettings.WithDefault, IWinRTObject {
  private val __1634747288_Interface: INavigationViewItemPresenterTemplateSettings.WithDefault by
      lazy {
    as_1634747288()
  }


  public override val __1634747288_Ptr: JNAPointer? by lazy {
    __1634747288_Interface.__1634747288_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1634747288_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1634747288(): INavigationViewItemPresenterTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemPresenterTemplateSettings.ABI.makeINavigationViewItemPresenterTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemPresenterTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemPresenterTemplateSettings.ABI.makeINavigationViewItemPresenterTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItemPresenterTemplateSettings> {
    public override fun getValue() =
        NavigationViewItemPresenterTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItemPresenterTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItemPresenterTemplateSettings, MemoryAddress> {
    public val INavigationViewItemPresenterTemplateSettingsStatics_Instance:
        INavigationViewItemPresenterTemplateSettingsStatics by lazy {
      createINavigationViewItemPresenterTemplateSettingsStatics()
    }


    public val INavigationViewItemPresenterTemplateSettingsFactory_Instance:
        INavigationViewItemPresenterTemplateSettingsFactory by lazy {
      createINavigationViewItemPresenterTemplateSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewItemPresenterTemplateSettingsStatics():
        INavigationViewItemPresenterTemplateSettingsStatics {
      val refiid = Guid.REFIID(INavigationViewItemPresenterTemplateSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.NavigationViewItemPresenterTemplateSettings".toHandle(),refiid,interfacePtr)
      val result =
          INavigationViewItemPresenterTemplateSettingsStatics.ABI.makeINavigationViewItemPresenterTemplateSettingsStatics(interfacePtr.value)
      return result
    }

    public fun createINavigationViewItemPresenterTemplateSettingsFactory():
        INavigationViewItemPresenterTemplateSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.NavigationViewItemPresenterTemplateSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationViewItemPresenterTemplateSettingsFactory.ABI.makeINavigationViewItemPresenterTemplateSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        INavigationViewItemPresenterTemplateSettingsFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress):
        NavigationViewItemPresenterTemplateSettings {
      val address = segment.toRawLongValue()
      return NavigationViewItemPresenterTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItemPresenterTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IconWidthProperty() =
        ABI.INavigationViewItemPresenterTemplateSettingsStatics_Instance.get_IconWidthProperty()

    public fun get_SmallerIconWidthProperty() =
        ABI.INavigationViewItemPresenterTemplateSettingsStatics_Instance.get_SmallerIconWidthProperty()
  }
}
