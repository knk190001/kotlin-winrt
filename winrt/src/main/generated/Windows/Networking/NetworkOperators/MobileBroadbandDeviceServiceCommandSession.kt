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

@ABIMarker(MobileBroadbandDeviceServiceCommandSession.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandSession;{fc098a45-913b-4914-b6c3-ae6304593e75})")
@WinRTByReference(brClass = MobileBroadbandDeviceServiceCommandSession.ByReference::class)
public class MobileBroadbandDeviceServiceCommandSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandDeviceServiceCommandSession.WithDefault, IWinRTObject {
  private val __320866706_Interface: IMobileBroadbandDeviceServiceCommandSession.WithDefault by
      lazy {
    as_320866706()
  }


  public override val __320866706_Ptr: JNAPointer? by lazy {
    __320866706_Interface.__320866706_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__320866706_Interface)

  private fun as_320866706(): IMobileBroadbandDeviceServiceCommandSession.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandDeviceServiceCommandSession.ABI.makeIMobileBroadbandDeviceServiceCommandSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandDeviceServiceCommandSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandDeviceServiceCommandSession.ABI.makeIMobileBroadbandDeviceServiceCommandSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandDeviceServiceCommandSession> {
    public override fun getValue() =
        MobileBroadbandDeviceServiceCommandSession(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandDeviceServiceCommandSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandDeviceServiceCommandSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandDeviceServiceCommandSession {
      val address = segment.toRawLongValue()
      return MobileBroadbandDeviceServiceCommandSession(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandDeviceServiceCommandSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
