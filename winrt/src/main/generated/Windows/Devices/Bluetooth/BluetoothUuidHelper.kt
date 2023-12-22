package Windows.Devices.Bluetooth

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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothUuidHelper.ABI::class)
@WinRTByReference(brClass = BluetoothUuidHelper.ByReference::class)
public class BluetoothUuidHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothUuidHelper> {
    public override fun getValue() = BluetoothUuidHelper(pointer.getPointer(0))

    public fun setValue(value: BluetoothUuidHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothUuidHelper, MemoryAddress> {
    public val IBluetoothUuidHelperStatics_Instance: IBluetoothUuidHelperStatics by lazy {
      createIBluetoothUuidHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothUuidHelperStatics(): IBluetoothUuidHelperStatics {
      val refiid = Guid.REFIID(IBluetoothUuidHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothUuidHelper".toHandle(),refiid,interfacePtr)
      val result =
          IBluetoothUuidHelperStatics.ABI.makeIBluetoothUuidHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothUuidHelper {
      val address = segment.toRawLongValue()
      return BluetoothUuidHelper(Pointer(address))
    }

    public override fun toNative(obj: BluetoothUuidHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromShortId(shortId: WinDef.UINT) =
        ABI.IBluetoothUuidHelperStatics_Instance.FromShortId(shortId)

    public fun TryGetShortId(uuid: Guid.GUID) =
        ABI.IBluetoothUuidHelperStatics_Instance.TryGetShortId(uuid)
  }
}
