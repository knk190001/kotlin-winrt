package Windows.Devices.Bluetooth

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

@ABIMarker(BluetoothLEAppearance.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.BluetoothLEAppearance;{5d2079f2-66a8-4258-985e-02b4d9509f18})")
@WinRTByReference(brClass = BluetoothLEAppearance.ByReference::class)
public class BluetoothLEAppearance(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAppearance.WithDefault, IWinRTObject {
  private val __1644799476_Interface: IBluetoothLEAppearance.WithDefault by lazy {
    as_1644799476()
  }


  public override val __1644799476_Ptr: JNAPointer? by lazy {
    __1644799476_Interface.__1644799476_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1644799476_Interface)

  private fun as_1644799476(): IBluetoothLEAppearance.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAppearance.ABI.makeIBluetoothLEAppearance(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAppearance>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAppearance.ABI.makeIBluetoothLEAppearance(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAppearance> {
    public override fun getValue() = BluetoothLEAppearance(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAppearance): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAppearance, MemoryAddress> {
    public val IBluetoothLEAppearanceStatics_Instance: IBluetoothLEAppearanceStatics by lazy {
      createIBluetoothLEAppearanceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothLEAppearanceStatics(): IBluetoothLEAppearanceStatics {
      val refiid = Guid.REFIID(IBluetoothLEAppearanceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothLEAppearance".toHandle(),refiid,interfacePtr)
      val result =
          IBluetoothLEAppearanceStatics.ABI.makeIBluetoothLEAppearanceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothLEAppearance {
      val address = segment.toRawLongValue()
      return BluetoothLEAppearance(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAppearance): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromRawValue(rawValue: WinDef.USHORT) =
        ABI.IBluetoothLEAppearanceStatics_Instance.FromRawValue(rawValue)

    public fun FromParts(appearanceCategory: WinDef.USHORT, appearanceSubCategory: WinDef.USHORT) =
        ABI.IBluetoothLEAppearanceStatics_Instance.FromParts(appearanceCategory,
        appearanceSubCategory)
  }
}
