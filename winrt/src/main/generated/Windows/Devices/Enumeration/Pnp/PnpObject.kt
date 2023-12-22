package Windows.Devices.Enumeration.Pnp

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(PnpObject.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.Pnp.PnpObject;{95c66258-733b-4a8f-93a3-db078ac870c1})")
@WinRTByReference(brClass = PnpObject.ByReference::class)
public class PnpObject(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPnpObject.WithDefault, IWinRTObject {
  private val __1692552983_Interface: IPnpObject.WithDefault by lazy {
    as_1692552983()
  }


  public override val __1692552983_Ptr: JNAPointer? by lazy {
    __1692552983_Interface.__1692552983_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1692552983_Interface)

  private fun as_1692552983(): IPnpObject.WithDefault {
    if(pointer == NULL) {
      return(IPnpObject.ABI.makeIPnpObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPnpObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPnpObject.ABI.makeIPnpObject(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PnpObject> {
    public override fun getValue() = PnpObject(pointer.getPointer(0))

    public fun setValue(value: PnpObject): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PnpObject, MemoryAddress> {
    public val IPnpObjectStatics_Instance: IPnpObjectStatics by lazy {
      createIPnpObjectStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPnpObjectStatics(): IPnpObjectStatics {
      val refiid = Guid.REFIID(IPnpObjectStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Enumeration.Pnp.PnpObject".toHandle(),refiid,interfacePtr)
      val result = IPnpObjectStatics.ABI.makeIPnpObjectStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PnpObject {
      val address = segment.toRawLongValue()
      return PnpObject(Pointer(address))
    }

    public override fun toNative(obj: PnpObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromIdAsync(
      type: PnpObjectType,
      id: String,
      requestedProperties: IIterable<String?>
    ) = ABI.IPnpObjectStatics_Instance.CreateFromIdAsync(type, id, requestedProperties)

    public fun FindAllAsync(type: PnpObjectType, requestedProperties: IIterable<String?>) =
        ABI.IPnpObjectStatics_Instance.FindAllAsync(type, requestedProperties)

    public fun FindAllAsync(
      type: PnpObjectType,
      requestedProperties: IIterable<String?>,
      aqsFilter: String
    ) = ABI.IPnpObjectStatics_Instance.FindAllAsync(type, requestedProperties, aqsFilter)

    public fun CreateWatcher(type: PnpObjectType, requestedProperties: IIterable<String?>) =
        ABI.IPnpObjectStatics_Instance.CreateWatcher(type, requestedProperties)

    public fun CreateWatcher(
      type: PnpObjectType,
      requestedProperties: IIterable<String?>,
      aqsFilter: String
    ) = ABI.IPnpObjectStatics_Instance.CreateWatcher(type, requestedProperties, aqsFilter)
  }
}
