package Windows.Devices.Bluetooth.GenericAttributeProfile

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GattPresentationFormat.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormat;{196d0021-faad-45dc-ae5b-2ac3184e84db})")
@WinRTByReference(brClass = GattPresentationFormat.ByReference::class)
public class GattPresentationFormat(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattPresentationFormat.WithDefault, IWinRTObject {
  private val __981460908_Interface: IGattPresentationFormat.WithDefault by lazy {
    as_981460908()
  }


  public override val __981460908_Ptr: JNAPointer? by lazy {
    __981460908_Interface.__981460908_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__981460908_Interface)

  private fun as_981460908(): IGattPresentationFormat.WithDefault {
    if(pointer == NULL) {
      return(IGattPresentationFormat.ABI.makeIGattPresentationFormat(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattPresentationFormat>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattPresentationFormat.ABI.makeIGattPresentationFormat(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattPresentationFormat> {
    public override fun getValue() = GattPresentationFormat(pointer.getPointer(0))

    public fun setValue(value: GattPresentationFormat): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattPresentationFormat, MemoryAddress> {
    public val IGattPresentationFormatStatics_Instance: IGattPresentationFormatStatics by lazy {
      createIGattPresentationFormatStatics()
    }


    public val IGattPresentationFormatStatics2_Instance: IGattPresentationFormatStatics2 by lazy {
      createIGattPresentationFormatStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattPresentationFormatStatics(): IGattPresentationFormatStatics {
      val refiid = Guid.REFIID(IGattPresentationFormatStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormat".toHandle(),refiid,interfacePtr)
      val result =
          IGattPresentationFormatStatics.ABI.makeIGattPresentationFormatStatics(interfacePtr.value)
      return result
    }

    public fun createIGattPresentationFormatStatics2(): IGattPresentationFormatStatics2 {
      val refiid = Guid.REFIID(IGattPresentationFormatStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattPresentationFormat".toHandle(),refiid,interfacePtr)
      val result =
          IGattPresentationFormatStatics2.ABI.makeIGattPresentationFormatStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattPresentationFormat {
      val address = segment.toRawLongValue()
      return GattPresentationFormat(Pointer(address))
    }

    public override fun toNative(obj: GattPresentationFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BluetoothSigAssignedNumbers() =
        ABI.IGattPresentationFormatStatics_Instance.get_BluetoothSigAssignedNumbers()

    public fun FromParts(
      formatType: Byte,
      exponent: Int,
      unit: WinDef.USHORT,
      namespaceId: Byte,
      description: WinDef.USHORT
    ) = ABI.IGattPresentationFormatStatics2_Instance.FromParts(formatType, exponent, unit,
        namespaceId, description)
  }
}
