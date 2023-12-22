package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IScrollViewFactory.ABI.IID
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

@ABIMarker(ScrollView.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ScrollView;{8c98c86d-378a-5102-a1e3-3352280fa010})")
@WinRTByReference(brClass = ScrollView.ByReference::class)
public open class ScrollView(
  ptr: JNAPointer? = NULL
) : Control(ptr), IScrollView.WithDefault, IWinRTObject {
  private val __815339495_Interface: IScrollView.WithDefault by lazy {
    as_815339495()
  }


  public override val __815339495_Ptr: JNAPointer? by lazy {
    __815339495_Interface.__815339495_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__815339495_Interface)

  public constructor() : this(ABI.activate())

  private fun as_815339495(): IScrollView.WithDefault {
    if(pointer == NULL) {
      return(IScrollView.ABI.makeIScrollView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollView.ABI.makeIScrollView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ScrollView> {
    public override fun getValue() = ScrollView(pointer.getPointer(0))

    public fun setValue(value: ScrollView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollView, MemoryAddress> {
    public val IScrollViewStatics_Instance: IScrollViewStatics by lazy {
      createIScrollViewStatics()
    }


    public val IScrollViewFactory_Instance: IScrollViewFactory by lazy {
      createIScrollViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollViewStatics(): IScrollViewStatics {
      val refiid = Guid.REFIID(IScrollViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ScrollView".toHandle(),refiid,interfacePtr)
      val result = IScrollViewStatics.ABI.makeIScrollViewStatics(interfacePtr.value)
      return result
    }

    public fun createIScrollViewFactory(): IScrollViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ScrollView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollViewFactory.ABI.makeIScrollViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IScrollViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ScrollView {
      val address = segment.toRawLongValue()
      return ScrollView(Pointer(address))
    }

    public override fun toNative(obj: ScrollView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ContentProperty() = ABI.IScrollViewStatics_Instance.get_ContentProperty()

    public fun get_ScrollPresenterProperty() =
        ABI.IScrollViewStatics_Instance.get_ScrollPresenterProperty()

    public fun get_HorizontalScrollBarVisibilityProperty() =
        ABI.IScrollViewStatics_Instance.get_HorizontalScrollBarVisibilityProperty()

    public fun get_VerticalScrollBarVisibilityProperty() =
        ABI.IScrollViewStatics_Instance.get_VerticalScrollBarVisibilityProperty()

    public fun get_ContentOrientationProperty() =
        ABI.IScrollViewStatics_Instance.get_ContentOrientationProperty()

    public fun get_HorizontalScrollChainModeProperty() =
        ABI.IScrollViewStatics_Instance.get_HorizontalScrollChainModeProperty()

    public fun get_VerticalScrollChainModeProperty() =
        ABI.IScrollViewStatics_Instance.get_VerticalScrollChainModeProperty()

    public fun get_HorizontalScrollRailModeProperty() =
        ABI.IScrollViewStatics_Instance.get_HorizontalScrollRailModeProperty()

    public fun get_VerticalScrollRailModeProperty() =
        ABI.IScrollViewStatics_Instance.get_VerticalScrollRailModeProperty()

    public fun get_HorizontalScrollModeProperty() =
        ABI.IScrollViewStatics_Instance.get_HorizontalScrollModeProperty()

    public fun get_VerticalScrollModeProperty() =
        ABI.IScrollViewStatics_Instance.get_VerticalScrollModeProperty()

    public fun get_ComputedHorizontalScrollBarVisibilityProperty() =
        ABI.IScrollViewStatics_Instance.get_ComputedHorizontalScrollBarVisibilityProperty()

    public fun get_ComputedVerticalScrollBarVisibilityProperty() =
        ABI.IScrollViewStatics_Instance.get_ComputedVerticalScrollBarVisibilityProperty()

    public fun get_ComputedHorizontalScrollModeProperty() =
        ABI.IScrollViewStatics_Instance.get_ComputedHorizontalScrollModeProperty()

    public fun get_ComputedVerticalScrollModeProperty() =
        ABI.IScrollViewStatics_Instance.get_ComputedVerticalScrollModeProperty()

    public fun get_ZoomChainModeProperty() =
        ABI.IScrollViewStatics_Instance.get_ZoomChainModeProperty()

    public fun get_ZoomModeProperty() = ABI.IScrollViewStatics_Instance.get_ZoomModeProperty()

    public fun get_IgnoredInputKindsProperty() =
        ABI.IScrollViewStatics_Instance.get_IgnoredInputKindsProperty()

    public fun get_MinZoomFactorProperty() =
        ABI.IScrollViewStatics_Instance.get_MinZoomFactorProperty()

    public fun get_MaxZoomFactorProperty() =
        ABI.IScrollViewStatics_Instance.get_MaxZoomFactorProperty()

    public fun get_HorizontalAnchorRatioProperty() =
        ABI.IScrollViewStatics_Instance.get_HorizontalAnchorRatioProperty()

    public fun get_VerticalAnchorRatioProperty() =
        ABI.IScrollViewStatics_Instance.get_VerticalAnchorRatioProperty()
  }
}
