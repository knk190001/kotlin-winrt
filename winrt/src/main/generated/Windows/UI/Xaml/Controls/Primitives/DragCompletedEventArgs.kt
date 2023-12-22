package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Primitives.IDragCompletedEventArgsFactory.ABI.IID
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DragCompletedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.DragCompletedEventArgs;{b04f29a1-bd16-48f6-a511-9c2763641331})")
@WinRTByReference(brClass = DragCompletedEventArgs.ByReference::class)
public open class DragCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IDragCompletedEventArgs.WithDefault, IWinRTObject {
  private val __2047841604_Interface: IDragCompletedEventArgs.WithDefault by lazy {
    as_2047841604()
  }


  public override val __2047841604_Ptr: JNAPointer? by lazy {
    __2047841604_Interface.__2047841604_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2047841604_Interface)

  public constructor(
    horizontalChange: Double,
    verticalChange: Double,
    canceled: Boolean
  ) : this(ABI.activate(horizontalChange, verticalChange, canceled))

  private fun as_2047841604(): IDragCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDragCompletedEventArgs.ABI.makeIDragCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragCompletedEventArgs.ABI.makeIDragCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragCompletedEventArgs> {
    public override fun getValue() = DragCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DragCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragCompletedEventArgs, MemoryAddress> {
    public val IDragCompletedEventArgsFactory_Instance: IDragCompletedEventArgsFactory by lazy {
      createIDragCompletedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDragCompletedEventArgsFactory(): IDragCompletedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.DragCompletedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDragCompletedEventArgsFactory.ABI.makeIDragCompletedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      horizontalChange: Double,
      verticalChange: Double,
      canceled: Boolean
    ): JNAPointer? =
        IDragCompletedEventArgsFactory_Instance.CreateInstanceWithHorizontalChangeVerticalChangeAndCanceled(horizontalChange,
        verticalChange, canceled, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DragCompletedEventArgs {
      val address = segment.toRawLongValue()
      return DragCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DragCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
