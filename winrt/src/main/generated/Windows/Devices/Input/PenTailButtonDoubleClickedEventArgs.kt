package Windows.Devices.Input

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

@ABIMarker(PenTailButtonDoubleClickedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.PenTailButtonDoubleClickedEventArgs;{846321a2-618a-5478-b04c-b358231da4a7})")
@WinRTByReference(brClass = PenTailButtonDoubleClickedEventArgs.ByReference::class)
public class PenTailButtonDoubleClickedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPenTailButtonDoubleClickedEventArgs.WithDefault, IWinRTObject {
  private val __2089879169_Interface: IPenTailButtonDoubleClickedEventArgs.WithDefault by lazy {
    as_2089879169()
  }


  public override val __2089879169_Ptr: JNAPointer? by lazy {
    __2089879169_Interface.__2089879169_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2089879169_Interface)

  private fun as_2089879169(): IPenTailButtonDoubleClickedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPenTailButtonDoubleClickedEventArgs.ABI.makeIPenTailButtonDoubleClickedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenTailButtonDoubleClickedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenTailButtonDoubleClickedEventArgs.ABI.makeIPenTailButtonDoubleClickedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PenTailButtonDoubleClickedEventArgs> {
    public override fun getValue() = PenTailButtonDoubleClickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PenTailButtonDoubleClickedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PenTailButtonDoubleClickedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PenTailButtonDoubleClickedEventArgs {
      val address = segment.toRawLongValue()
      return PenTailButtonDoubleClickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PenTailButtonDoubleClickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
