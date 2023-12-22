package Windows.Devices.Bluetooth.GenericAttributeProfile

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(GattDescriptorUuids.ABI::class)
@WinRTByReference(brClass = GattDescriptorUuids.ByReference::class)
public class GattDescriptorUuids(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattDescriptorUuids> {
    public override fun getValue() = GattDescriptorUuids(pointer.getPointer(0))

    public fun setValue(value: GattDescriptorUuids): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattDescriptorUuids, MemoryAddress> {
    public val IGattDescriptorUuidsStatics_Instance: IGattDescriptorUuidsStatics by lazy {
      createIGattDescriptorUuidsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattDescriptorUuidsStatics(): IGattDescriptorUuidsStatics {
      val refiid = Guid.REFIID(IGattDescriptorUuidsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptorUuids".toHandle(),refiid,interfacePtr)
      val result =
          IGattDescriptorUuidsStatics.ABI.makeIGattDescriptorUuidsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattDescriptorUuids {
      val address = segment.toRawLongValue()
      return GattDescriptorUuids(Pointer(address))
    }

    public override fun toNative(obj: GattDescriptorUuids): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CharacteristicAggregateFormat() =
        ABI.IGattDescriptorUuidsStatics_Instance.get_CharacteristicAggregateFormat()

    public fun get_CharacteristicExtendedProperties() =
        ABI.IGattDescriptorUuidsStatics_Instance.get_CharacteristicExtendedProperties()

    public fun get_CharacteristicPresentationFormat() =
        ABI.IGattDescriptorUuidsStatics_Instance.get_CharacteristicPresentationFormat()

    public fun get_CharacteristicUserDescription() =
        ABI.IGattDescriptorUuidsStatics_Instance.get_CharacteristicUserDescription()

    public fun get_ClientCharacteristicConfiguration() =
        ABI.IGattDescriptorUuidsStatics_Instance.get_ClientCharacteristicConfiguration()

    public fun get_ServerCharacteristicConfiguration() =
        ABI.IGattDescriptorUuidsStatics_Instance.get_ServerCharacteristicConfiguration()
  }
}
