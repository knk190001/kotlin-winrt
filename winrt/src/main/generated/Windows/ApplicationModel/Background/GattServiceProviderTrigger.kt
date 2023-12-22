package Windows.ApplicationModel.Background

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GattServiceProviderTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.GattServiceProviderTrigger;{84b3a058-6027-4b87-9790-bdf3f757dbd7})")
@WinRTByReference(brClass = GattServiceProviderTrigger.ByReference::class)
public class GattServiceProviderTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTrigger.WithDefault, IGattServiceProviderTrigger.WithDefault,
    IWinRTObject {
  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  private val __844913469_Interface: IGattServiceProviderTrigger.WithDefault by lazy {
    as_844913469()
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val __844913469_Ptr: JNAPointer? by lazy {
    __844913469_Interface.__844913469_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__54213927_Interface, __844913469_Interface)

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  private fun as_844913469(): IGattServiceProviderTrigger.WithDefault {
    if(pointer == NULL) {
      return(IGattServiceProviderTrigger.ABI.makeIGattServiceProviderTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattServiceProviderTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattServiceProviderTrigger.ABI.makeIGattServiceProviderTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattServiceProviderTrigger> {
    public override fun getValue() = GattServiceProviderTrigger(pointer.getPointer(0))

    public fun setValue(value: GattServiceProviderTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattServiceProviderTrigger, MemoryAddress> {
    public val IGattServiceProviderTriggerStatics_Instance: IGattServiceProviderTriggerStatics by
        lazy {
      createIGattServiceProviderTriggerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGattServiceProviderTriggerStatics(): IGattServiceProviderTriggerStatics {
      val refiid = Guid.REFIID(IGattServiceProviderTriggerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.GattServiceProviderTrigger".toHandle(),refiid,interfacePtr)
      val result =
          IGattServiceProviderTriggerStatics.ABI.makeIGattServiceProviderTriggerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GattServiceProviderTrigger {
      val address = segment.toRawLongValue()
      return GattServiceProviderTrigger(Pointer(address))
    }

    public override fun toNative(obj: GattServiceProviderTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsync(triggerId: String, serviceUuid: Guid.GUID) =
        ABI.IGattServiceProviderTriggerStatics_Instance.CreateAsync(triggerId, serviceUuid)
  }
}
