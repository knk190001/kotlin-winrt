package Windows.Devices.Bluetooth.Background

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

@ABIMarker(GattServiceProviderConnection.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Background.GattServiceProviderConnection;{7fa1b9b9-2f13-40b5-9582-8eb78e98ef13})")
@WinRTByReference(brClass = GattServiceProviderConnection.ByReference::class)
public class GattServiceProviderConnection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattServiceProviderConnection.WithDefault, IWinRTObject {
  private val __1325806805_Interface: IGattServiceProviderConnection.WithDefault by lazy {
    as_1325806805()
  }


  public override val __1325806805_Ptr: JNAPointer? by lazy {
    __1325806805_Interface.__1325806805_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1325806805_Interface)

  private fun as_1325806805(): IGattServiceProviderConnection.WithDefault {
    if(pointer == NULL) {
      return(IGattServiceProviderConnection.ABI.makeIGattServiceProviderConnection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattServiceProviderConnection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattServiceProviderConnection.ABI.makeIGattServiceProviderConnection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattServiceProviderConnection> {
    public override fun getValue() = GattServiceProviderConnection(pointer.getPointer(0))

    public fun setValue(value: GattServiceProviderConnection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattServiceProviderConnection, MemoryAddress> {
    public val IGattServiceProviderConnectionStatics_Instance: IGattServiceProviderConnectionStatics
        by lazy {
      createIGattServiceProviderConnectionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattServiceProviderConnectionStatics():
        IGattServiceProviderConnectionStatics {
      val refiid = Guid.REFIID(IGattServiceProviderConnectionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Background.GattServiceProviderConnection".toHandle(),refiid,interfacePtr)
      val result =
          IGattServiceProviderConnectionStatics.ABI.makeIGattServiceProviderConnectionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattServiceProviderConnection {
      val address = segment.toRawLongValue()
      return GattServiceProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: GattServiceProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AllServices() =
        ABI.IGattServiceProviderConnectionStatics_Instance.get_AllServices()
  }
}
