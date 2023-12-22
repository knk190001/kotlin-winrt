package Windows.Devices.SerialCommunication

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

@ABIMarker(PinChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.SerialCommunication.PinChangedEventArgs;{a2bf1db0-fc9c-4607-93d0-fa5e8343ee22})")
@WinRTByReference(brClass = PinChangedEventArgs.ByReference::class)
public class PinChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPinChangedEventArgs.WithDefault, IWinRTObject {
  private val __247616085_Interface: IPinChangedEventArgs.WithDefault by lazy {
    as_247616085()
  }


  public override val __247616085_Ptr: JNAPointer? by lazy {
    __247616085_Interface.__247616085_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__247616085_Interface)

  private fun as_247616085(): IPinChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPinChangedEventArgs.ABI.makeIPinChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPinChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPinChangedEventArgs.ABI.makeIPinChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PinChangedEventArgs> {
    public override fun getValue() = PinChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PinChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PinChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PinChangedEventArgs {
      val address = segment.toRawLongValue()
      return PinChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PinChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
