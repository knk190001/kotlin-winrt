package Windows.Media.Core

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

@ABIMarker(TimedTextSourceResolveResultEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.TimedTextSourceResolveResultEventArgs;{48907c9c-dcd8-4c33-9ad3-6cdce7b1c566})")
@WinRTByReference(brClass = TimedTextSourceResolveResultEventArgs.ByReference::class)
public class TimedTextSourceResolveResultEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedTextSourceResolveResultEventArgs.WithDefault, IWinRTObject {
  private val __1585221336_Interface: ITimedTextSourceResolveResultEventArgs.WithDefault by lazy {
    as_1585221336()
  }


  public override val __1585221336_Ptr: JNAPointer? by lazy {
    __1585221336_Interface.__1585221336_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1585221336_Interface)

  private fun as_1585221336(): ITimedTextSourceResolveResultEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITimedTextSourceResolveResultEventArgs.ABI.makeITimedTextSourceResolveResultEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedTextSourceResolveResultEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedTextSourceResolveResultEventArgs.ABI.makeITimedTextSourceResolveResultEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimedTextSourceResolveResultEventArgs> {
    public override fun getValue() = TimedTextSourceResolveResultEventArgs(pointer.getPointer(0))

    public fun setValue(value: TimedTextSourceResolveResultEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedTextSourceResolveResultEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TimedTextSourceResolveResultEventArgs {
      val address = segment.toRawLongValue()
      return TimedTextSourceResolveResultEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TimedTextSourceResolveResultEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
