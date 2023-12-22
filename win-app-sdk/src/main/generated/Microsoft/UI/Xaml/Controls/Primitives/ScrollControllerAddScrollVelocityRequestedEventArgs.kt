package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Primitives.IScrollControllerAddScrollVelocityRequestedEventArgsFactory.ABI.IID
import Windows.Foundation.IReference
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
import kotlin.Float
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ScrollControllerAddScrollVelocityRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ScrollControllerAddScrollVelocityRequestedEventArgs;{317bbc1a-0cf7-5815-a8a7-bd7e6eef966a})")
@WinRTByReference(brClass = ScrollControllerAddScrollVelocityRequestedEventArgs.ByReference::class)
public class ScrollControllerAddScrollVelocityRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScrollControllerAddScrollVelocityRequestedEventArgs.WithDefault, IWinRTObject
    {
  private val __773200122_Interface:
      IScrollControllerAddScrollVelocityRequestedEventArgs.WithDefault by lazy {
    as_773200122()
  }


  public override val __773200122_Ptr: JNAPointer? by lazy {
    __773200122_Interface.__773200122_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__773200122_Interface)

  public constructor(offsetVelocity: Float, inertiaDecayRate: IReference<Float>) :
      this(ABI.activate(offsetVelocity, inertiaDecayRate))

  private fun as_773200122(): IScrollControllerAddScrollVelocityRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IScrollControllerAddScrollVelocityRequestedEventArgs.ABI.makeIScrollControllerAddScrollVelocityRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollControllerAddScrollVelocityRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollControllerAddScrollVelocityRequestedEventArgs.ABI.makeIScrollControllerAddScrollVelocityRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScrollControllerAddScrollVelocityRequestedEventArgs> {
    public override fun getValue() =
        ScrollControllerAddScrollVelocityRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ScrollControllerAddScrollVelocityRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScrollControllerAddScrollVelocityRequestedEventArgs, MemoryAddress> {
    public val IScrollControllerAddScrollVelocityRequestedEventArgsFactory_Instance:
        IScrollControllerAddScrollVelocityRequestedEventArgsFactory by lazy {
      createIScrollControllerAddScrollVelocityRequestedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIScrollControllerAddScrollVelocityRequestedEventArgsFactory():
        IScrollControllerAddScrollVelocityRequestedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ScrollControllerAddScrollVelocityRequestedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IScrollControllerAddScrollVelocityRequestedEventArgsFactory.ABI.makeIScrollControllerAddScrollVelocityRequestedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(offsetVelocity: Float, inertiaDecayRate: IReference<Float>): JNAPointer? =
        IScrollControllerAddScrollVelocityRequestedEventArgsFactory_Instance.CreateInstance(offsetVelocity,
        inertiaDecayRate)?.pointer

    public override fun fromNative(segment: MemoryAddress):
        ScrollControllerAddScrollVelocityRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ScrollControllerAddScrollVelocityRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ScrollControllerAddScrollVelocityRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
