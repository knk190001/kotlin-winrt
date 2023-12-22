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

@ABIMarker(MobileBroadbandDeviceServiceCommandResult.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceCommandResult;{b0f46abb-94d6-44b9-a538-f0810b645389})")
@WinRTByReference(brClass = MobileBroadbandDeviceServiceCommandResult.ByReference::class)
public class MobileBroadbandDeviceServiceCommandResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandDeviceServiceCommandResult.WithDefault, IWinRTObject {
  private val __1701545659_Interface: IMobileBroadbandDeviceServiceCommandResult.WithDefault by
      lazy {
    as_1701545659()
  }


  public override val __1701545659_Ptr: JNAPointer? by lazy {
    __1701545659_Interface.__1701545659_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1701545659_Interface)

  private fun as_1701545659(): IMobileBroadbandDeviceServiceCommandResult.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandDeviceServiceCommandResult.ABI.makeIMobileBroadbandDeviceServiceCommandResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandDeviceServiceCommandResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandDeviceServiceCommandResult.ABI.makeIMobileBroadbandDeviceServiceCommandResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandDeviceServiceCommandResult> {
    public override fun getValue() =
        MobileBroadbandDeviceServiceCommandResult(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandDeviceServiceCommandResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandDeviceServiceCommandResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandDeviceServiceCommandResult {
      val address = segment.toRawLongValue()
      return MobileBroadbandDeviceServiceCommandResult(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandDeviceServiceCommandResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
