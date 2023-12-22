package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothDeviceId
import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(GattSession.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattSession;{d23b5143-e04e-4c24-999c-9c256f9856b1})")
@WinRTByReference(brClass = GattSession.ByReference::class)
public class GattSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattSession.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1659859323_Interface: IGattSession.WithDefault by lazy {
    as_1659859323()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1659859323_Ptr: JNAPointer? by lazy {
    __1659859323_Interface.__1659859323_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1659859323_Interface, __1260617006_Interface)

  private fun as_1659859323(): IGattSession.WithDefault {
    if(pointer == NULL) {
      return(IGattSession.ABI.makeIGattSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattSession.ABI.makeIGattSession(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GattSession> {
    public override fun getValue() = GattSession(pointer.getPointer(0))

    public fun setValue(value: GattSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattSession, MemoryAddress> {
    public val IGattSessionStatics_Instance: IGattSessionStatics by lazy {
      createIGattSessionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattSessionStatics(): IGattSessionStatics {
      val refiid = Guid.REFIID(IGattSessionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattSession".toHandle(),refiid,interfacePtr)
      val result = IGattSessionStatics.ABI.makeIGattSessionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattSession {
      val address = segment.toRawLongValue()
      return GattSession(Pointer(address))
    }

    public override fun toNative(obj: GattSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromDeviceIdAsync(deviceId: BluetoothDeviceId) =
        ABI.IGattSessionStatics_Instance.FromDeviceIdAsync(deviceId)
  }
}
