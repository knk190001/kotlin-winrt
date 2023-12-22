package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.INavigationViewTemplateSettingsFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(NavigationViewTemplateSettings.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.NavigationViewTemplateSettings;{2956cbc4-0528-55d5-b2d1-eae807aea6da})")
@WinRTByReference(brClass = NavigationViewTemplateSettings.ByReference::class)
public open class NavigationViewTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), INavigationViewTemplateSettings.WithDefault, IWinRTObject {
  private val __1059919570_Interface: INavigationViewTemplateSettings.WithDefault by lazy {
    as_1059919570()
  }


  public override val __1059919570_Ptr: JNAPointer? by lazy {
    __1059919570_Interface.__1059919570_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1059919570_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1059919570(): INavigationViewTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewTemplateSettings.ABI.makeINavigationViewTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewTemplateSettings.ABI.makeINavigationViewTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewTemplateSettings> {
    public override fun getValue() = NavigationViewTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: NavigationViewTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewTemplateSettings, MemoryAddress> {
    public val INavigationViewTemplateSettingsStatics_Instance:
        INavigationViewTemplateSettingsStatics by lazy {
      createINavigationViewTemplateSettingsStatics()
    }


    public val INavigationViewTemplateSettingsFactory_Instance:
        INavigationViewTemplateSettingsFactory by lazy {
      createINavigationViewTemplateSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewTemplateSettingsStatics():
        INavigationViewTemplateSettingsStatics {
      val refiid = Guid.REFIID(INavigationViewTemplateSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.NavigationViewTemplateSettings".toHandle(),refiid,interfacePtr)
      val result =
          INavigationViewTemplateSettingsStatics.ABI.makeINavigationViewTemplateSettingsStatics(interfacePtr.value)
      return result
    }

    public fun createINavigationViewTemplateSettingsFactory():
        INavigationViewTemplateSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.NavigationViewTemplateSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationViewTemplateSettingsFactory.ABI.makeINavigationViewTemplateSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        INavigationViewTemplateSettingsFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NavigationViewTemplateSettings {
      val address = segment.toRawLongValue()
      return NavigationViewTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TopPaddingProperty() =
        ABI.INavigationViewTemplateSettingsStatics_Instance.get_TopPaddingProperty()

    public fun get_OverflowButtonVisibilityProperty() =
        ABI.INavigationViewTemplateSettingsStatics_Instance.get_OverflowButtonVisibilityProperty()

    public fun get_PaneToggleButtonVisibilityProperty() =
        ABI.INavigationViewTemplateSettingsStatics_Instance.get_PaneToggleButtonVisibilityProperty()

    public fun get_BackButtonVisibilityProperty() =
        ABI.INavigationViewTemplateSettingsStatics_Instance.get_BackButtonVisibilityProperty()

    public fun get_TopPaneVisibilityProperty() =
        ABI.INavigationViewTemplateSettingsStatics_Instance.get_TopPaneVisibilityProperty()

    public fun get_LeftPaneVisibilityProperty() =
        ABI.INavigationViewTemplateSettingsStatics_Instance.get_LeftPaneVisibilityProperty()

    public fun get_SingleSelectionFollowsFocusProperty() =
        ABI.INavigationViewTemplateSettingsStatics_Instance.get_SingleSelectionFollowsFocusProperty()
  }
}
