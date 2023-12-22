package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattWriteRequest.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteRequest;{aeb6a9ed-de2f-4fc2-a9a8-94ea7844f13d})")
@WinRTByReference(brClass = GattWriteRequest.ByReference::class)
public class GattWriteRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattWriteRequest.WithDefault, IWinRTObject {
  private val __784924181_Interface: IGattWriteRequest.WithDefault by lazy {
    as_784924181()
  }


  public override val __784924181_Ptr: JNAPointer? by lazy {
    __784924181_Interface.__784924181_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__784924181_Interface)

  private fun as_784924181(): IGattWriteRequest.WithDefault {
    if(pointer == NULL) {
      return(IGattWriteRequest.ABI.makeIGattWriteRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattWriteRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattWriteRequest.ABI.makeIGattWriteRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattWriteRequest> {
    public override fun getValue() = GattWriteRequest(pointer.getPointer(0))

    public fun setValue(value: GattWriteRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattWriteRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattWriteRequest {
      val address = segment.toRawLongValue()
      return GattWriteRequest(Pointer(address))
    }

    public override fun toNative(obj: GattWriteRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
