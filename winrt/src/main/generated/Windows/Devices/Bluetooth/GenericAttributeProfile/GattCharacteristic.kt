package Windows.Devices.Bluetooth.GenericAttributeProfile

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GattCharacteristic.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic;{59cb50c1-5934-4f68-a198-eb864fa44e6b})")
@WinRTByReference(brClass = GattCharacteristic.ByReference::class)
public class GattCharacteristic(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattCharacteristic.WithDefault, IGattCharacteristic2.WithDefault,
    IGattCharacteristic3.WithDefault, IWinRTObject {
  private val __1617168618_Interface: IGattCharacteristic.WithDefault by lazy {
    as_1617168618()
  }


  private val __1407380444_Interface: IGattCharacteristic2.WithDefault by lazy {
    as_1407380444()
  }


  private val __1407380445_Interface: IGattCharacteristic3.WithDefault by lazy {
    as_1407380445()
  }


  public override val __1617168618_Ptr: JNAPointer? by lazy {
    __1617168618_Interface.__1617168618_Ptr
  }


  public override val __1407380444_Ptr: JNAPointer? by lazy {
    __1407380444_Interface.__1407380444_Ptr
  }


  public override val __1407380445_Ptr: JNAPointer? by lazy {
    __1407380445_Interface.__1407380445_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1617168618_Interface, __1407380444_Interface, __1407380445_Interface)

  private fun as_1617168618(): IGattCharacteristic.WithDefault {
    if(pointer == NULL) {
      return(IGattCharacteristic.ABI.makeIGattCharacteristic(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattCharacteristic>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattCharacteristic.ABI.makeIGattCharacteristic(ref.value))
  }

  private fun as_1407380444(): IGattCharacteristic2.WithDefault {
    if(pointer == NULL) {
      return(IGattCharacteristic2.ABI.makeIGattCharacteristic2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattCharacteristic2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattCharacteristic2.ABI.makeIGattCharacteristic2(ref.value))
  }

  private fun as_1407380445(): IGattCharacteristic3.WithDefault {
    if(pointer == NULL) {
      return(IGattCharacteristic3.ABI.makeIGattCharacteristic3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattCharacteristic3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattCharacteristic3.ABI.makeIGattCharacteristic3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattCharacteristic> {
    public override fun getValue() = GattCharacteristic(pointer.getPointer(0))

    public fun setValue(value: GattCharacteristic): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattCharacteristic, MemoryAddress> {
    public val IGattCharacteristicStatics_Instance: IGattCharacteristicStatics by lazy {
      createIGattCharacteristicStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattCharacteristicStatics(): IGattCharacteristicStatics {
      val refiid = Guid.REFIID(IGattCharacteristicStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic".toHandle(),refiid,interfacePtr)
      val result = IGattCharacteristicStatics.ABI.makeIGattCharacteristicStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattCharacteristic {
      val address = segment.toRawLongValue()
      return GattCharacteristic(Pointer(address))
    }

    public override fun toNative(obj: GattCharacteristic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ConvertShortIdToUuid(shortId: WinDef.USHORT) =
        ABI.IGattCharacteristicStatics_Instance.ConvertShortIdToUuid(shortId)
  }
}
