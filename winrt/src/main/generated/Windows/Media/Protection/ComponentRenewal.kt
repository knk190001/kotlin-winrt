package Windows.Media.Protection

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

@ABIMarker(ComponentRenewal.ABI::class)
@WinRTByReference(brClass = ComponentRenewal.ByReference::class)
public class ComponentRenewal(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ComponentRenewal> {
    public override fun getValue() = ComponentRenewal(pointer.getPointer(0))

    public fun setValue(value: ComponentRenewal): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComponentRenewal, MemoryAddress> {
    public val IComponentRenewalStatics_Instance: IComponentRenewalStatics by lazy {
      createIComponentRenewalStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIComponentRenewalStatics(): IComponentRenewalStatics {
      val refiid = Guid.REFIID(IComponentRenewalStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.ComponentRenewal".toHandle(),refiid,interfacePtr)
      val result = IComponentRenewalStatics.ABI.makeIComponentRenewalStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ComponentRenewal {
      val address = segment.toRawLongValue()
      return ComponentRenewal(Pointer(address))
    }

    public override fun toNative(obj: ComponentRenewal): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RenewSystemComponentsAsync(information: RevocationAndRenewalInformation) =
        ABI.IComponentRenewalStatics_Instance.RenewSystemComponentsAsync(information)
  }
}
