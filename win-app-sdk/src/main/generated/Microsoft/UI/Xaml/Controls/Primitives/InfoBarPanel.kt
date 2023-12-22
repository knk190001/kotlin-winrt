package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Panel
import Microsoft.UI.Xaml.Controls.Primitives.IInfoBarPanelFactory.ABI.IID
import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Thickness
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

@ABIMarker(InfoBarPanel.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.InfoBarPanel;{4d2fd5fe-cb75-52ff-b57f-a992912383cc})")
@WinRTByReference(brClass = InfoBarPanel.ByReference::class)
public open class InfoBarPanel(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IInfoBarPanel.WithDefault, IWinRTObject {
  private val __803908432_Interface: IInfoBarPanel.WithDefault by lazy {
    as_803908432()
  }


  public override val __803908432_Ptr: JNAPointer? by lazy {
    __803908432_Interface.__803908432_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__803908432_Interface)

  public constructor() : this(ABI.activate())

  private fun as_803908432(): IInfoBarPanel.WithDefault {
    if(pointer == NULL) {
      return(IInfoBarPanel.ABI.makeIInfoBarPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInfoBarPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInfoBarPanel.ABI.makeIInfoBarPanel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InfoBarPanel> {
    public override fun getValue() = InfoBarPanel(pointer.getPointer(0))

    public fun setValue(value: InfoBarPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InfoBarPanel, MemoryAddress> {
    public val IInfoBarPanelStatics_Instance: IInfoBarPanelStatics by lazy {
      createIInfoBarPanelStatics()
    }


    public val IInfoBarPanelFactory_Instance: IInfoBarPanelFactory by lazy {
      createIInfoBarPanelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInfoBarPanelStatics(): IInfoBarPanelStatics {
      val refiid = Guid.REFIID(IInfoBarPanelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.InfoBarPanel".toHandle(),refiid,interfacePtr)
      val result = IInfoBarPanelStatics.ABI.makeIInfoBarPanelStatics(interfacePtr.value)
      return result
    }

    public fun createIInfoBarPanelFactory(): IInfoBarPanelFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.InfoBarPanel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInfoBarPanelFactory.ABI.makeIInfoBarPanelFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IInfoBarPanelFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InfoBarPanel {
      val address = segment.toRawLongValue()
      return InfoBarPanel(Pointer(address))
    }

    public override fun toNative(obj: InfoBarPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HorizontalOrientationPaddingProperty() =
        ABI.IInfoBarPanelStatics_Instance.get_HorizontalOrientationPaddingProperty()

    public fun get_VerticalOrientationPaddingProperty() =
        ABI.IInfoBarPanelStatics_Instance.get_VerticalOrientationPaddingProperty()

    public fun SetHorizontalOrientationMargin(`object`: DependencyObject, value: Thickness) =
        ABI.IInfoBarPanelStatics_Instance.SetHorizontalOrientationMargin(`object`, value)

    public fun GetHorizontalOrientationMargin(`object`: DependencyObject) =
        ABI.IInfoBarPanelStatics_Instance.GetHorizontalOrientationMargin(`object`)

    public fun get_HorizontalOrientationMarginProperty() =
        ABI.IInfoBarPanelStatics_Instance.get_HorizontalOrientationMarginProperty()

    public fun SetVerticalOrientationMargin(`object`: DependencyObject, value: Thickness) =
        ABI.IInfoBarPanelStatics_Instance.SetVerticalOrientationMargin(`object`, value)

    public fun GetVerticalOrientationMargin(`object`: DependencyObject) =
        ABI.IInfoBarPanelStatics_Instance.GetVerticalOrientationMargin(`object`)

    public fun get_VerticalOrientationMarginProperty() =
        ABI.IInfoBarPanelStatics_Instance.get_VerticalOrientationMarginProperty()
  }
}
