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

@ABIMarker(GattSubscribedClient.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattSubscribedClient;{736e9001-15a4-4ec2-9248-e3f20d463be9})")
@WinRTByReference(brClass = GattSubscribedClient.ByReference::class)
public class GattSubscribedClient(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattSubscribedClient.WithDefault, IWinRTObject {
  private val __1918205056_Interface: IGattSubscribedClient.WithDefault by lazy {
    as_1918205056()
  }


  public override val __1918205056_Ptr: JNAPointer? by lazy {
    __1918205056_Interface.__1918205056_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1918205056_Interface)

  private fun as_1918205056(): IGattSubscribedClient.WithDefault {
    if(pointer == NULL) {
      return(IGattSubscribedClient.ABI.makeIGattSubscribedClient(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattSubscribedClient>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattSubscribedClient.ABI.makeIGattSubscribedClient(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattSubscribedClient> {
    public override fun getValue() = GattSubscribedClient(pointer.getPointer(0))

    public fun setValue(value: GattSubscribedClient): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattSubscribedClient, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattSubscribedClient {
      val address = segment.toRawLongValue()
      return GattSubscribedClient(Pointer(address))
    }

    public override fun toNative(obj: GattSubscribedClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
