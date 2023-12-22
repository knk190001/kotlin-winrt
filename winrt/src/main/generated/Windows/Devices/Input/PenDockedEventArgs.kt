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

@ABIMarker(PenDockedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.PenDockedEventArgs;{fd4277c6-ca63-5d4e-9ed3-a28a54521c8c})")
@WinRTByReference(brClass = PenDockedEventArgs.ByReference::class)
public class PenDockedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPenDockedEventArgs.WithDefault, IWinRTObject {
  private val __588769081_Interface: IPenDockedEventArgs.WithDefault by lazy {
    as_588769081()
  }


  public override val __588769081_Ptr: JNAPointer? by lazy {
    __588769081_Interface.__588769081_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__588769081_Interface)

  private fun as_588769081(): IPenDockedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPenDockedEventArgs.ABI.makeIPenDockedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPenDockedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPenDockedEventArgs.ABI.makeIPenDockedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PenDockedEventArgs> {
    public override fun getValue() = PenDockedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PenDockedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PenDockedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PenDockedEventArgs {
      val address = segment.toRawLongValue()
      return PenDockedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PenDockedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
