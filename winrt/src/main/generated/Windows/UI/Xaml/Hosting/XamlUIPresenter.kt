package Windows.UI.Xaml.Hosting

import Windows.Foundation.Rect
import Windows.Foundation.Size
import Windows.UI.Xaml.Controls.Primitives.FlyoutPlacementMode
import Windows.UI.Xaml.FrameworkElement
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(XamlUIPresenter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Hosting.XamlUIPresenter;{a714944a-1619-4fc6-b31b-89512ef022a2})")
@WinRTByReference(brClass = XamlUIPresenter.ByReference::class)
public class XamlUIPresenter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlUIPresenter.WithDefault, IWinRTObject {
  private val __51056838_Interface: IXamlUIPresenter.WithDefault by lazy {
    as_51056838()
  }


  public override val __51056838_Ptr: JNAPointer? by lazy {
    __51056838_Interface.__51056838_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__51056838_Interface)

  private fun as_51056838(): IXamlUIPresenter.WithDefault {
    if(pointer == NULL) {
      return(IXamlUIPresenter.ABI.makeIXamlUIPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlUIPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlUIPresenter.ABI.makeIXamlUIPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlUIPresenter> {
    public override fun getValue() = XamlUIPresenter(pointer.getPointer(0))

    public fun setValue(value: XamlUIPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlUIPresenter, MemoryAddress> {
    public val IXamlUIPresenterStatics2_Instance: IXamlUIPresenterStatics2 by lazy {
      createIXamlUIPresenterStatics2()
    }


    public val IXamlUIPresenterStatics_Instance: IXamlUIPresenterStatics by lazy {
      createIXamlUIPresenterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlUIPresenterStatics2(): IXamlUIPresenterStatics2 {
      val refiid = Guid.REFIID(IXamlUIPresenterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Hosting.XamlUIPresenter".toHandle(),refiid,interfacePtr)
      val result = IXamlUIPresenterStatics2.ABI.makeIXamlUIPresenterStatics2(interfacePtr.value)
      return result
    }

    public fun createIXamlUIPresenterStatics(): IXamlUIPresenterStatics {
      val refiid = Guid.REFIID(IXamlUIPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Hosting.XamlUIPresenter".toHandle(),refiid,interfacePtr)
      val result = IXamlUIPresenterStatics.ABI.makeIXamlUIPresenterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XamlUIPresenter {
      val address = segment.toRawLongValue()
      return XamlUIPresenter(Pointer(address))
    }

    public override fun toNative(obj: XamlUIPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetFlyoutPlacementTargetInfo(
      placementTarget: FrameworkElement,
      preferredPlacement: FlyoutPlacementMode,
      targetPreferredPlacement: Windows.UI.Xaml.Controls.Primitives.FlyoutPlacementMode.ByReference,
      allowFallbacks: Boolean
    ) = ABI.IXamlUIPresenterStatics2_Instance.GetFlyoutPlacementTargetInfo(placementTarget,
        preferredPlacement, targetPreferredPlacement, allowFallbacks)

    public fun GetFlyoutPlacement(
      placementTargetBounds: Rect,
      controlSize: Size,
      minControlSize: Size,
      containerRect: Rect,
      targetPreferredPlacement: FlyoutPlacementMode,
      allowFallbacks: Boolean,
      chosenPlacement: Windows.UI.Xaml.Controls.Primitives.FlyoutPlacementMode.ByReference
    ) = ABI.IXamlUIPresenterStatics2_Instance.GetFlyoutPlacement(placementTargetBounds, controlSize,
        minControlSize, containerRect, targetPreferredPlacement, allowFallbacks, chosenPlacement)

    public fun get_CompleteTimelinesAutomatically() =
        ABI.IXamlUIPresenterStatics_Instance.get_CompleteTimelinesAutomatically()

    public fun put_CompleteTimelinesAutomatically(value: Boolean) =
        ABI.IXamlUIPresenterStatics_Instance.put_CompleteTimelinesAutomatically(value)

    public fun SetHost(host: IXamlUIPresenterHost) =
        ABI.IXamlUIPresenterStatics_Instance.SetHost(host)

    public fun NotifyWindowSizeChanged() =
        ABI.IXamlUIPresenterStatics_Instance.NotifyWindowSizeChanged()
  }
}
