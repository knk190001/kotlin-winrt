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

@ABIMarker(PenTailButtonClickedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.PenTailButtonClickedEventArgs;{5d2fb7b6-6ad3-5d3e-ab29-05ea2410e390})")
@WinRTByReference(brClass = PenTailButtonClickedEventArgs.ByReference::class)
public class PenTailButtonClickedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPenTailButtonClickedEventArgs.WithDefault, IWinRTObject {
  private val __342994800_Interface: IPenTailButtonClickedEventArgs.WithDefault by lazy {
    as_342994800()
  }


  public override val __342994800_Ptr: JNAPointer? by lazy {
    __342994800_Interface.__342994800_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__342994800_Interface)

  private fun as_342994800(): IPenTailButtonClickedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPenTailButtonClickedEventArgs.ABI.makeIPenTailButtonClickedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenTailButtonClickedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenTailButtonClickedEventArgs.ABI.makeIPenTailButtonClickedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PenTailButtonClickedEventArgs> {
    public override fun getValue() = PenTailButtonClickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PenTailButtonClickedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PenTailButtonClickedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PenTailButtonClickedEventArgs {
      val address = segment.toRawLongValue()
      return PenTailButtonClickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PenTailButtonClickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
