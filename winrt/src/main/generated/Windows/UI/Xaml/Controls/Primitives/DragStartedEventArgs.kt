package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Primitives.IDragStartedEventArgsFactory.ABI.IID
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

@ABIMarker(DragStartedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.DragStartedEventArgs;{9f915dd0-a124-4366-bd85-2408214aeed4})")
@WinRTByReference(brClass = DragStartedEventArgs.ByReference::class)
public open class DragStartedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IDragStartedEventArgs.WithDefault, IWinRTObject {
  private val __2110650042_Interface: IDragStartedEventArgs.WithDefault by lazy {
    as_2110650042()
  }


  public override val __2110650042_Ptr: JNAPointer? by lazy {
    __2110650042_Interface.__2110650042_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2110650042_Interface)

  public constructor(horizontalOffset: Double, verticalOffset: Double) :
      this(ABI.activate(horizontalOffset, verticalOffset))

  private fun as_2110650042(): IDragStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDragStartedEventArgs.ABI.makeIDragStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragStartedEventArgs.ABI.makeIDragStartedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragStartedEventArgs> {
    public override fun getValue() = DragStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DragStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragStartedEventArgs, MemoryAddress> {
    public val IDragStartedEventArgsFactory_Instance: IDragStartedEventArgsFactory by lazy {
      createIDragStartedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDragStartedEventArgsFactory(): IDragStartedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.DragStartedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDragStartedEventArgsFactory.ABI.makeIDragStartedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(horizontalOffset: Double, verticalOffset: Double): JNAPointer? =
        IDragStartedEventArgsFactory_Instance.CreateInstanceWithHorizontalOffsetAndVerticalOffset(horizontalOffset,
        verticalOffset, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DragStartedEventArgs {
      val address = segment.toRawLongValue()
      return DragStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DragStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
