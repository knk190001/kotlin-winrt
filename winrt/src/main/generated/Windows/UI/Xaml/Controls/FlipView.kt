package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IFlipViewFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.Selector
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

@ABIMarker(FlipView.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.FlipView;{a1582f68-3d7d-4d3b-b71d-488eed1e3493})")
@WinRTByReference(brClass = FlipView.ByReference::class)
public open class FlipView(
  ptr: JNAPointer? = NULL
) : Selector(ptr), IFlipView.WithDefault, IFlipView2.WithDefault, IWinRTObject {
  private val __1362571470_Interface: IFlipView.WithDefault by lazy {
    as_1362571470()
  }


  private val __709957340_Interface: IFlipView2.WithDefault by lazy {
    as_709957340()
  }


  public override val __1362571470_Ptr: JNAPointer? by lazy {
    __1362571470_Interface.__1362571470_Ptr
  }


  public override val __709957340_Ptr: JNAPointer? by lazy {
    __709957340_Interface.__709957340_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1362571470_Interface, __709957340_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1362571470(): IFlipView.WithDefault {
    if(pointer == NULL) {
      return(IFlipView.ABI.makeIFlipView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlipView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlipView.ABI.makeIFlipView(ref.value))
  }

  private fun as_709957340(): IFlipView2.WithDefault {
    if(pointer == NULL) {
      return(IFlipView2.ABI.makeIFlipView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlipView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlipView2.ABI.makeIFlipView2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FlipView> {
    public override fun getValue() = FlipView(pointer.getPointer(0))

    public fun setValue(value: FlipView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlipView, MemoryAddress> {
    public val IFlipViewStatics2_Instance: IFlipViewStatics2 by lazy {
      createIFlipViewStatics2()
    }


    public val IFlipViewFactory_Instance: IFlipViewFactory by lazy {
      createIFlipViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlipViewStatics2(): IFlipViewStatics2 {
      val refiid = Guid.REFIID(IFlipViewStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.FlipView".toHandle(),refiid,interfacePtr)
      val result = IFlipViewStatics2.ABI.makeIFlipViewStatics2(interfacePtr.value)
      return result
    }

    public fun createIFlipViewFactory(): IFlipViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.FlipView".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlipViewFactory.ABI.makeIFlipViewFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFlipViewFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FlipView {
      val address = segment.toRawLongValue()
      return FlipView(Pointer(address))
    }

    public override fun toNative(obj: FlipView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_UseTouchAnimationsForAllNavigationProperty() =
        ABI.IFlipViewStatics2_Instance.get_UseTouchAnimationsForAllNavigationProperty()
  }
}
