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

@ABIMarker(MobileBroadbandDeviceServiceDataReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceDataReceivedEventArgs;{b6aa13de-1380-40e3-8618-73cbca48138c})")
@WinRTByReference(brClass = MobileBroadbandDeviceServiceDataReceivedEventArgs.ByReference::class)
public class MobileBroadbandDeviceServiceDataReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandDeviceServiceDataReceivedEventArgs.WithDefault, IWinRTObject {
  private val __865766359_Interface: IMobileBroadbandDeviceServiceDataReceivedEventArgs.WithDefault
      by lazy {
    as_865766359()
  }


  public override val __865766359_Ptr: JNAPointer? by lazy {
    __865766359_Interface.__865766359_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__865766359_Interface)

  private fun as_865766359(): IMobileBroadbandDeviceServiceDataReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandDeviceServiceDataReceivedEventArgs.ABI.makeIMobileBroadbandDeviceServiceDataReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandDeviceServiceDataReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandDeviceServiceDataReceivedEventArgs.ABI.makeIMobileBroadbandDeviceServiceDataReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandDeviceServiceDataReceivedEventArgs> {
    public override fun getValue() =
        MobileBroadbandDeviceServiceDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandDeviceServiceDataReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandDeviceServiceDataReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandDeviceServiceDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MobileBroadbandDeviceServiceDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandDeviceServiceDataReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
