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

@ABIMarker(PenTailButtonLongPressedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.PenTailButtonLongPressedEventArgs;{f37c606e-c60a-5f42-b818-a53112406c13})")
@WinRTByReference(brClass = PenTailButtonLongPressedEventArgs.ByReference::class)
public class PenTailButtonLongPressedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPenTailButtonLongPressedEventArgs.WithDefault, IWinRTObject {
  private val __297263505_Interface: IPenTailButtonLongPressedEventArgs.WithDefault by lazy {
    as_297263505()
  }


  public override val __297263505_Ptr: JNAPointer? by lazy {
    __297263505_Interface.__297263505_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__297263505_Interface)

  private fun as_297263505(): IPenTailButtonLongPressedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPenTailButtonLongPressedEventArgs.ABI.makeIPenTailButtonLongPressedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenTailButtonLongPressedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenTailButtonLongPressedEventArgs.ABI.makeIPenTailButtonLongPressedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PenTailButtonLongPressedEventArgs> {
    public override fun getValue() = PenTailButtonLongPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PenTailButtonLongPressedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PenTailButtonLongPressedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PenTailButtonLongPressedEventArgs {
      val address = segment.toRawLongValue()
      return PenTailButtonLongPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PenTailButtonLongPressedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
