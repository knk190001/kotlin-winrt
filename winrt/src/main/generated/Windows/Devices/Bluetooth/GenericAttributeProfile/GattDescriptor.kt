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

@ABIMarker(GattDescriptor.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptor;{92055f2b-8084-4344-b4c2-284de19a8506})")
@WinRTByReference(brClass = GattDescriptor.ByReference::class)
public class GattDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattDescriptor.WithDefault, IGattDescriptor2.WithDefault, IWinRTObject {
  private val __1499513238_Interface: IGattDescriptor.WithDefault by lazy {
    as_1499513238()
  }


  private val __759729928_Interface: IGattDescriptor2.WithDefault by lazy {
    as_759729928()
  }


  public override val __1499513238_Ptr: JNAPointer? by lazy {
    __1499513238_Interface.__1499513238_Ptr
  }


  public override val __759729928_Ptr: JNAPointer? by lazy {
    __759729928_Interface.__759729928_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1499513238_Interface, __759729928_Interface)

  private fun as_1499513238(): IGattDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IGattDescriptor.ABI.makeIGattDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattDescriptor.ABI.makeIGattDescriptor(ref.value))
  }

  private fun as_759729928(): IGattDescriptor2.WithDefault {
    if(pointer == NULL) {
      return(IGattDescriptor2.ABI.makeIGattDescriptor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattDescriptor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattDescriptor2.ABI.makeIGattDescriptor2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GattDescriptor>
      {
    public override fun getValue() = GattDescriptor(pointer.getPointer(0))

    public fun setValue(value: GattDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattDescriptor, MemoryAddress> {
    public val IGattDescriptorStatics_Instance: IGattDescriptorStatics by lazy {
      createIGattDescriptorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattDescriptorStatics(): IGattDescriptorStatics {
      val refiid = Guid.REFIID(IGattDescriptorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattDescriptor".toHandle(),refiid,interfacePtr)
      val result = IGattDescriptorStatics.ABI.makeIGattDescriptorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattDescriptor {
      val address = segment.toRawLongValue()
      return GattDescriptor(Pointer(address))
    }

    public override fun toNative(obj: GattDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ConvertShortIdToUuid(shortId: WinDef.USHORT) =
        ABI.IGattDescriptorStatics_Instance.ConvertShortIdToUuid(shortId)
  }
}
