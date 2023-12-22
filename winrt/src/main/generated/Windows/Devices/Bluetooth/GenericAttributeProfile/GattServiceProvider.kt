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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GattServiceProvider.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceProvider;{7822b3cd-2889-4f86-a051-3f0aed1c2760})")
@WinRTByReference(brClass = GattServiceProvider.ByReference::class)
public class GattServiceProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattServiceProvider.WithDefault, IWinRTObject {
  private val __1115232853_Interface: IGattServiceProvider.WithDefault by lazy {
    as_1115232853()
  }


  public override val __1115232853_Ptr: JNAPointer? by lazy {
    __1115232853_Interface.__1115232853_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1115232853_Interface)

  private fun as_1115232853(): IGattServiceProvider.WithDefault {
    if(pointer == NULL) {
      return(IGattServiceProvider.ABI.makeIGattServiceProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattServiceProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattServiceProvider.ABI.makeIGattServiceProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattServiceProvider> {
    public override fun getValue() = GattServiceProvider(pointer.getPointer(0))

    public fun setValue(value: GattServiceProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattServiceProvider, MemoryAddress> {
    public val IGattServiceProviderStatics_Instance: IGattServiceProviderStatics by lazy {
      createIGattServiceProviderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattServiceProviderStatics(): IGattServiceProviderStatics {
      val refiid = Guid.REFIID(IGattServiceProviderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceProvider".toHandle(),refiid,interfacePtr)
      val result =
          IGattServiceProviderStatics.ABI.makeIGattServiceProviderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattServiceProvider {
      val address = segment.toRawLongValue()
      return GattServiceProvider(Pointer(address))
    }

    public override fun toNative(obj: GattServiceProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsync(serviceUuid: Guid.GUID) =
        ABI.IGattServiceProviderStatics_Instance.CreateAsync(serviceUuid)
  }
}
