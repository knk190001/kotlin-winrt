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

@ABIMarker(TimedTextRuby.ABI::class)
@Signature("rc(Windows.Media.Core.TimedTextRuby;{10335c29-5b3c-5693-9959-d05a0bd24628})")
@WinRTByReference(brClass = TimedTextRuby.ByReference::class)
public class TimedTextRuby(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedTextRuby.WithDefault, IWinRTObject {
  private val __241819721_Interface: ITimedTextRuby.WithDefault by lazy {
    as_241819721()
  }


  public override val __241819721_Ptr: JNAPointer? by lazy {
    __241819721_Interface.__241819721_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__241819721_Interface)

  private fun as_241819721(): ITimedTextRuby.WithDefault {
    if(pointer == NULL) {
      return(ITimedTextRuby.ABI.makeITimedTextRuby(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedTextRuby>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedTextRuby.ABI.makeITimedTextRuby(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TimedTextRuby>
      {
    public override fun getValue() = TimedTextRuby(pointer.getPointer(0))

    public fun setValue(value: TimedTextRuby): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedTextRuby, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TimedTextRuby {
      val address = segment.toRawLongValue()
      return TimedTextRuby(Pointer(address))
    }

    public override fun toNative(obj: TimedTextRuby): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
