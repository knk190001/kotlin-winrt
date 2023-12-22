package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandTransmissionStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandTransmissionStateChangedEventArgs;{612e3875-040a-4f99-a4f9-61d7c32da129})")
@WinRTByReference(brClass = MobileBroadbandTransmissionStateChangedEventArgs.ByReference::class)
public class MobileBroadbandTransmissionStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandTransmissionStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __2045045428_Interface: IMobileBroadbandTransmissionStateChangedEventArgs.WithDefault
      by lazy {
    as_2045045428()
  }


  public override val __2045045428_Ptr: JNAPointer? by lazy {
    __2045045428_Interface.__2045045428_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2045045428_Interface)

  private fun as_2045045428(): IMobileBroadbandTransmissionStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandTransmissionStateChangedEventArgs.ABI.makeIMobileBroadbandTransmissionStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandTransmissionStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandTransmissionStateChangedEventArgs.ABI.makeIMobileBroadbandTransmissionStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandTransmissionStateChangedEventArgs> {
    public override fun getValue() =
        MobileBroadbandTransmissionStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandTransmissionStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandTransmissionStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandTransmissionStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return MobileBroadbandTransmissionStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandTransmissionStateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
