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

@ABIMarker(MobileBroadbandDeviceServiceDataSession.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceDataSession;{dad62333-8bcf-4289-8a37-045c2169486a})")
@WinRTByReference(brClass = MobileBroadbandDeviceServiceDataSession.ByReference::class)
public class MobileBroadbandDeviceServiceDataSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandDeviceServiceDataSession.WithDefault, IWinRTObject {
  private val __932758327_Interface: IMobileBroadbandDeviceServiceDataSession.WithDefault by lazy {
    as_932758327()
  }


  public override val __932758327_Ptr: JNAPointer? by lazy {
    __932758327_Interface.__932758327_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__932758327_Interface)

  private fun as_932758327(): IMobileBroadbandDeviceServiceDataSession.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandDeviceServiceDataSession.ABI.makeIMobileBroadbandDeviceServiceDataSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandDeviceServiceDataSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandDeviceServiceDataSession.ABI.makeIMobileBroadbandDeviceServiceDataSession(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandDeviceServiceDataSession> {
    public override fun getValue() = MobileBroadbandDeviceServiceDataSession(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandDeviceServiceDataSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandDeviceServiceDataSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandDeviceServiceDataSession {
      val address = segment.toRawLongValue()
      return MobileBroadbandDeviceServiceDataSession(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandDeviceServiceDataSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
