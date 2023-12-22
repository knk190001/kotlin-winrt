package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IFlipViewFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.Selector
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
@Signature("rc(Microsoft.UI.Xaml.Controls.FlipView;{96c35e7f-cc48-5acc-b3b4-8ab4bdf1fe17})")
@WinRTByReference(brClass = FlipView.ByReference::class)
public open class FlipView(
  ptr: JNAPointer? = NULL
) : Selector(ptr), IFlipView.WithDefault, IWinRTObject {
  private val __1555416953_Interface: IFlipView.WithDefault by lazy {
    as_1555416953()
  }


  public override val __1555416953_Ptr: JNAPointer? by lazy {
    __1555416953_Interface.__1555416953_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1555416953_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1555416953(): IFlipView.WithDefault {
    if(pointer == NULL) {
      return(IFlipView.ABI.makeIFlipView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlipView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlipView.ABI.makeIFlipView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<FlipView> {
    public override fun getValue() = FlipView(pointer.getPointer(0))

    public fun setValue(value: FlipView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlipView, MemoryAddress> {
    public val IFlipViewStatics_Instance: IFlipViewStatics by lazy {
      createIFlipViewStatics()
    }


    public val IFlipViewFactory_Instance: IFlipViewFactory by lazy {
      createIFlipViewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlipViewStatics(): IFlipViewStatics {
      val refiid = Guid.REFIID(IFlipViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.FlipView".toHandle(),refiid,interfacePtr)
      val result = IFlipViewStatics.ABI.makeIFlipViewStatics(interfacePtr.value)
      return result
    }

    public fun createIFlipViewFactory(): IFlipViewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.FlipView".toHandle(),refiid,factoryActivatorPtr)
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
        ABI.IFlipViewStatics_Instance.get_UseTouchAnimationsForAllNavigationProperty()
  }
}
