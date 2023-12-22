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

@ABIMarker(MobileBroadbandDeviceServiceInformation.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceInformation;{53d69b5b-c4ed-45f0-803a-d9417a6d9846})")
@WinRTByReference(brClass = MobileBroadbandDeviceServiceInformation.ByReference::class)
public class MobileBroadbandDeviceServiceInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandDeviceServiceInformation.WithDefault, IWinRTObject {
  private val __532060777_Interface: IMobileBroadbandDeviceServiceInformation.WithDefault by lazy {
    as_532060777()
  }


  public override val __532060777_Ptr: JNAPointer? by lazy {
    __532060777_Interface.__532060777_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__532060777_Interface)

  private fun as_532060777(): IMobileBroadbandDeviceServiceInformation.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandDeviceServiceInformation.ABI.makeIMobileBroadbandDeviceServiceInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandDeviceServiceInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandDeviceServiceInformation.ABI.makeIMobileBroadbandDeviceServiceInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandDeviceServiceInformation> {
    public override fun getValue() = MobileBroadbandDeviceServiceInformation(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandDeviceServiceInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandDeviceServiceInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MobileBroadbandDeviceServiceInformation {
      val address = segment.toRawLongValue()
      return MobileBroadbandDeviceServiceInformation(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandDeviceServiceInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
