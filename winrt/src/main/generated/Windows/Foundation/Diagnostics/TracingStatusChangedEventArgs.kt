package Windows.Foundation.Diagnostics

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TracingStatusChangedEventArgs.ABI::class)
@Signature("rc(Windows.Foundation.Diagnostics.TracingStatusChangedEventArgs;{410b7711-ff3b-477f-9c9a-d2efda302dc3})")
@WinRTByReference(brClass = TracingStatusChangedEventArgs.ByReference::class)
public class TracingStatusChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITracingStatusChangedEventArgs.WithDefault, IWinRTObject {
  private val __1064234442_Interface: ITracingStatusChangedEventArgs.WithDefault by lazy {
    as_1064234442()
  }


  public override val __1064234442_Ptr: JNAPointer? by lazy {
    __1064234442_Interface.__1064234442_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1064234442_Interface)

  private fun as_1064234442(): ITracingStatusChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITracingStatusChangedEventArgs.ABI.makeITracingStatusChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITracingStatusChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITracingStatusChangedEventArgs.ABI.makeITracingStatusChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TracingStatusChangedEventArgs> {
    public override fun getValue() = TracingStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TracingStatusChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TracingStatusChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TracingStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return TracingStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TracingStatusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
