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

@ABIMarker(GattServiceProviderAdvertisementStatusChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceProviderAdvertisementStatusChangedEventArgs;{59a5aa65-fa21-4ffc-b155-04d928012686})")
@WinRTByReference(brClass =
    GattServiceProviderAdvertisementStatusChangedEventArgs.ByReference::class)
public class GattServiceProviderAdvertisementStatusChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattServiceProviderAdvertisementStatusChangedEventArgs.WithDefault,
    IWinRTObject {
  private val __2014705935_Interface:
      IGattServiceProviderAdvertisementStatusChangedEventArgs.WithDefault by lazy {
    as_2014705935()
  }


  public override val __2014705935_Ptr: JNAPointer? by lazy {
    __2014705935_Interface.__2014705935_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2014705935_Interface)

  private fun as_2014705935(): IGattServiceProviderAdvertisementStatusChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGattServiceProviderAdvertisementStatusChangedEventArgs.ABI.makeIGattServiceProviderAdvertisementStatusChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattServiceProviderAdvertisementStatusChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattServiceProviderAdvertisementStatusChangedEventArgs.ABI.makeIGattServiceProviderAdvertisementStatusChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattServiceProviderAdvertisementStatusChangedEventArgs> {
    public override fun getValue() =
        GattServiceProviderAdvertisementStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GattServiceProviderAdvertisementStatusChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattServiceProviderAdvertisementStatusChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        GattServiceProviderAdvertisementStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return GattServiceProviderAdvertisementStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GattServiceProviderAdvertisementStatusChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
