package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ITabViewFactory.ABI.IID
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

@ABIMarker(TabView.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TabView;{07b509e1-1d38-551b-95f4-4732b049f6a6})")
@WinRTByReference(brClass = TabView.ByReference::class)
public open class TabView(
  ptr: JNAPointer? = NULL
) : Control(ptr), ITabView.WithDefault, IWinRTObject {
  private val __792203315_Interface: ITabView.WithDefault by lazy {
    as_792203315()
  }


  public override val __792203315_Ptr: JNAPointer? by lazy {
    __792203315_Interface.__792203315_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__792203315_Interface)

  public constructor() : this(ABI.activate())

  private fun as_792203315(): ITabView.WithDefault {
    if(pointer == NULL) {
      return(ITabView.ABI.makeITabView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITabView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITabView.ABI.makeITabView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TabView> {
    public override fun getValue() = TabView(pointer.getPointer(0))

    public fun setValue(value: TabView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TabView, MemoryAddress> {
    public val ITabViewStatics_Instance: ITabViewStatics by lazy {
      createITabViewStatics()
    }


    public val ITabViewFactory_Instance: ITabViewFactory by lazy {
      createITabViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITabViewStatics(): ITabViewStatics {
      val refiid = Guid.REFIID(ITabViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TabView".toHandle(),refiid,interfacePtr)
      val result = ITabViewStatics.ABI.makeITabViewStatics(interfacePtr.value)
      return result
    }

    public fun createITabViewFactory(): ITabViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TabView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITabViewFactory.ABI.makeITabViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITabViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TabView {
      val address = segment.toRawLongValue()
      return TabView(Pointer(address))
    }

    public override fun toNative(obj: TabView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TabWidthModeProperty() = ABI.ITabViewStatics_Instance.get_TabWidthModeProperty()

    public fun get_TabStripHeaderProperty() =
        ABI.ITabViewStatics_Instance.get_TabStripHeaderProperty()

    public fun get_TabStripHeaderTemplateProperty() =
        ABI.ITabViewStatics_Instance.get_TabStripHeaderTemplateProperty()

    public fun get_TabStripFooterProperty() =
        ABI.ITabViewStatics_Instance.get_TabStripFooterProperty()

    public fun get_TabStripFooterTemplateProperty() =
        ABI.ITabViewStatics_Instance.get_TabStripFooterTemplateProperty()

    public fun get_IsAddTabButtonVisibleProperty() =
        ABI.ITabViewStatics_Instance.get_IsAddTabButtonVisibleProperty()

    public fun get_AddTabButtonCommandProperty() =
        ABI.ITabViewStatics_Instance.get_AddTabButtonCommandProperty()

    public fun get_AddTabButtonCommandParameterProperty() =
        ABI.ITabViewStatics_Instance.get_AddTabButtonCommandParameterProperty()

    public fun get_TabItemsSourceProperty() =
        ABI.ITabViewStatics_Instance.get_TabItemsSourceProperty()

    public fun get_TabItemsProperty() = ABI.ITabViewStatics_Instance.get_TabItemsProperty()

    public fun get_TabItemTemplateProperty() =
        ABI.ITabViewStatics_Instance.get_TabItemTemplateProperty()

    public fun get_TabItemTemplateSelectorProperty() =
        ABI.ITabViewStatics_Instance.get_TabItemTemplateSelectorProperty()

    public fun get_CloseButtonOverlayModeProperty() =
        ABI.ITabViewStatics_Instance.get_CloseButtonOverlayModeProperty()

    public fun get_CanDragTabsProperty() = ABI.ITabViewStatics_Instance.get_CanDragTabsProperty()

    public fun get_CanReorderTabsProperty() =
        ABI.ITabViewStatics_Instance.get_CanReorderTabsProperty()

    public fun get_AllowDropTabsProperty() =
        ABI.ITabViewStatics_Instance.get_AllowDropTabsProperty()

    public fun get_SelectedIndexProperty() =
        ABI.ITabViewStatics_Instance.get_SelectedIndexProperty()

    public fun get_SelectedItemProperty() = ABI.ITabViewStatics_Instance.get_SelectedItemProperty()
  }
}
