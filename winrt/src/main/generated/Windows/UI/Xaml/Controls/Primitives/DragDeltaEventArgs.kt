package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Primitives.IDragDeltaEventArgsFactory.ABI.IID
import Windows.UI.Xaml.RoutedEventArgs
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
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DragDeltaEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.DragDeltaEventArgs;{2c2dd73c-2806-49fc-aae9-6d792b572b6a})")
@WinRTByReference(brClass = DragDeltaEventArgs.ByReference::class)
public open class DragDeltaEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IDragDeltaEventArgs.WithDefault, IWinRTObject {
  private val __1875642351_Interface: IDragDeltaEventArgs.WithDefault by lazy {
    as_1875642351()
  }


  public override val __1875642351_Ptr: JNAPointer? by lazy {
    __1875642351_Interface.__1875642351_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1875642351_Interface)

  public constructor(horizontalChange: Double, verticalChange: Double) :
      this(ABI.activate(horizontalChange, verticalChange))

  private fun as_1875642351(): IDragDeltaEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDragDeltaEventArgs.ABI.makeIDragDeltaEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragDeltaEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragDeltaEventArgs.ABI.makeIDragDeltaEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragDeltaEventArgs> {
    public override fun getValue() = DragDeltaEventArgs(pointer.getPointer(0))

    public fun setValue(value: DragDeltaEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragDeltaEventArgs, MemoryAddress> {
    public val IDragDeltaEventArgsFactory_Instance: IDragDeltaEventArgsFactory by lazy {
      createIDragDeltaEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDragDeltaEventArgsFactory(): IDragDeltaEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.DragDeltaEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDragDeltaEventArgsFactory.ABI.makeIDragDeltaEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(horizontalChange: Double, verticalChange: Double): JNAPointer? =
        IDragDeltaEventArgsFactory_Instance.CreateInstanceWithHorizontalChangeAndVerticalChange(horizontalChange,
        verticalChange, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DragDeltaEventArgs {
      val address = segment.toRawLongValue()
      return DragDeltaEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DragDeltaEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
