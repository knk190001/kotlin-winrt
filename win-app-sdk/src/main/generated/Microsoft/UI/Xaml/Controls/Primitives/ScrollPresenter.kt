package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.IScrollAnchorProvider
import Microsoft.UI.Xaml.Controls.Primitives.IScrollPresenterFactory.ABI.IID
import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(ScrollPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ScrollPresenter;{424b8afd-f7aa-5e5b-9d0b-5f0ea4e1a56e})")
@WinRTByReference(brClass = ScrollPresenter.ByReference::class)
public open class ScrollPresenter(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IScrollPresenter.WithDefault, IScrollAnchorProvider.WithDefault,
    IWinRTObject {
  private val __41495062_Interface: IScrollPresenter.WithDefault by lazy {
    as_41495062()
  }


  private val __673059898_Interface: IScrollAnchorProvider.WithDefault by lazy {
    as_673059898()
  }


  public override val __41495062_Ptr: JNAPointer? by lazy {
    __41495062_Interface.__41495062_Ptr
  }


  public override val __673059898_Ptr: JNAPointer? by lazy {
    __673059898_Interface.__673059898_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__41495062_Interface, __673059898_Interface)

  public constructor() : this(ABI.activate())

  private fun as_41495062(): IScrollPresenter.WithDefault {
    if(pointer == NULL) {
      return(IScrollPresenter.ABI.makeIScrollPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollPresenter.ABI.makeIScrollPresenter(ref.value))
  }

  private fun as_673059898(): IScrollAnchorProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollAnchorProvider.ABI.makeIScrollAnchorProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollAnchorProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollAnchorProvider.ABI.makeIScrollAnchorProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollPresenter> {
    public override fun getValue() = ScrollPresenter(pointer.getPointer(0))

    public fun setValue(value: ScrollPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollPresenter, MemoryAddress> {
    public val IScrollPresenterStatics_Instance: IScrollPresenterStatics by lazy {
      createIScrollPresenterStatics()
    }


    public val IScrollPresenterFactory_Instance: IScrollPresenterFactory by lazy {
      createIScrollPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollPresenterStatics(): IScrollPresenterStatics {
      val refiid = Guid.REFIID(IScrollPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ScrollPresenter".toHandle(),refiid,interfacePtr)
      val result = IScrollPresenterStatics.ABI.makeIScrollPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIScrollPresenterFactory(): IScrollPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ScrollPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollPresenterFactory.ABI.makeIScrollPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IScrollPresenterFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScrollPresenter {
      val address = segment.toRawLongValue()
      return ScrollPresenter(Pointer(address))
    }

    public override fun toNative(obj: ScrollPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BackgroundProperty() =
        ABI.IScrollPresenterStatics_Instance.get_BackgroundProperty()

    public fun get_ContentProperty() = ABI.IScrollPresenterStatics_Instance.get_ContentProperty()

    public fun get_ContentOrientationProperty() =
        ABI.IScrollPresenterStatics_Instance.get_ContentOrientationProperty()

    public fun get_HorizontalScrollChainModeProperty() =
        ABI.IScrollPresenterStatics_Instance.get_HorizontalScrollChainModeProperty()

    public fun get_VerticalScrollChainModeProperty() =
        ABI.IScrollPresenterStatics_Instance.get_VerticalScrollChainModeProperty()

    public fun get_HorizontalScrollRailModeProperty() =
        ABI.IScrollPresenterStatics_Instance.get_HorizontalScrollRailModeProperty()

    public fun get_VerticalScrollRailModeProperty() =
        ABI.IScrollPresenterStatics_Instance.get_VerticalScrollRailModeProperty()

    public fun get_HorizontalScrollModeProperty() =
        ABI.IScrollPresenterStatics_Instance.get_HorizontalScrollModeProperty()

    public fun get_VerticalScrollModeProperty() =
        ABI.IScrollPresenterStatics_Instance.get_VerticalScrollModeProperty()

    public fun get_ComputedHorizontalScrollModeProperty() =
        ABI.IScrollPresenterStatics_Instance.get_ComputedHorizontalScrollModeProperty()

    public fun get_ComputedVerticalScrollModeProperty() =
        ABI.IScrollPresenterStatics_Instance.get_ComputedVerticalScrollModeProperty()

    public fun get_ZoomChainModeProperty() =
        ABI.IScrollPresenterStatics_Instance.get_ZoomChainModeProperty()

    public fun get_ZoomModeProperty() = ABI.IScrollPresenterStatics_Instance.get_ZoomModeProperty()

    public fun get_IgnoredInputKindsProperty() =
        ABI.IScrollPresenterStatics_Instance.get_IgnoredInputKindsProperty()

    public fun get_MinZoomFactorProperty() =
        ABI.IScrollPresenterStatics_Instance.get_MinZoomFactorProperty()

    public fun get_MaxZoomFactorProperty() =
        ABI.IScrollPresenterStatics_Instance.get_MaxZoomFactorProperty()

    public fun get_HorizontalAnchorRatioProperty() =
        ABI.IScrollPresenterStatics_Instance.get_HorizontalAnchorRatioProperty()

    public fun get_VerticalAnchorRatioProperty() =
        ABI.IScrollPresenterStatics_Instance.get_VerticalAnchorRatioProperty()
  }
}
