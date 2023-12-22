package Windows.UI.UIAutomation.Core

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

@ABIMarker(CoreAutomationRegistrar.ABI::class)
@WinRTByReference(brClass = CoreAutomationRegistrar.ByReference::class)
public class CoreAutomationRegistrar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreAutomationRegistrar> {
    public override fun getValue() = CoreAutomationRegistrar(pointer.getPointer(0))

    public fun setValue(value: CoreAutomationRegistrar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreAutomationRegistrar, MemoryAddress> {
    public val ICoreAutomationRegistrarStatics_Instance: ICoreAutomationRegistrarStatics by lazy {
      createICoreAutomationRegistrarStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreAutomationRegistrarStatics(): ICoreAutomationRegistrarStatics {
      val refiid = Guid.REFIID(ICoreAutomationRegistrarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.UIAutomation.Core.CoreAutomationRegistrar".toHandle(),refiid,interfacePtr)
      val result =
          ICoreAutomationRegistrarStatics.ABI.makeICoreAutomationRegistrarStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreAutomationRegistrar {
      val address = segment.toRawLongValue()
      return CoreAutomationRegistrar(Pointer(address))
    }

    public override fun toNative(obj: CoreAutomationRegistrar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RegisterAnnotationType(guid: Guid.GUID) =
        ABI.ICoreAutomationRegistrarStatics_Instance.RegisterAnnotationType(guid)

    public fun UnregisterAnnotationType(registration: AutomationAnnotationTypeRegistration) =
        ABI.ICoreAutomationRegistrarStatics_Instance.UnregisterAnnotationType(registration)
  }
}
