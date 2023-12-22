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

@ABIMarker(MobileBroadbandDeviceService.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandDeviceService;{22be1a52-bd80-40ac-8e1f-2e07836a3dbd})")
@WinRTByReference(brClass = MobileBroadbandDeviceService.ByReference::class)
public class MobileBroadbandDeviceService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandDeviceService.WithDefault, IWinRTObject {
  private val __93469379_Interface: IMobileBroadbandDeviceService.WithDefault by lazy {
    as_93469379()
  }


  public override val __93469379_Ptr: JNAPointer? by lazy {
    __93469379_Interface.__93469379_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__93469379_Interface)

  private fun as_93469379(): IMobileBroadbandDeviceService.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandDeviceService.ABI.makeIMobileBroadbandDeviceService(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandDeviceService>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandDeviceService.ABI.makeIMobileBroadbandDeviceService(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandDeviceService> {
    public override fun getValue() = MobileBroadbandDeviceService(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandDeviceService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandDeviceService, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandDeviceService {
      val address = segment.toRawLongValue()
      return MobileBroadbandDeviceService(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandDeviceService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
