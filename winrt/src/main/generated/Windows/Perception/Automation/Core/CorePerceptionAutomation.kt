package Windows.Perception.Automation.Core

import Windows.Foundation.IGetActivationFactory
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

@ABIMarker(CorePerceptionAutomation.ABI::class)
@WinRTByReference(brClass = CorePerceptionAutomation.ByReference::class)
public class CorePerceptionAutomation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CorePerceptionAutomation> {
    public override fun getValue() = CorePerceptionAutomation(pointer.getPointer(0))

    public fun setValue(value: CorePerceptionAutomation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CorePerceptionAutomation, MemoryAddress> {
    public val ICorePerceptionAutomationStatics_Instance: ICorePerceptionAutomationStatics by lazy {
      createICorePerceptionAutomationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICorePerceptionAutomationStatics(): ICorePerceptionAutomationStatics {
      val refiid = Guid.REFIID(ICorePerceptionAutomationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Automation.Core.CorePerceptionAutomation".toHandle(),refiid,interfacePtr)
      val result =
          ICorePerceptionAutomationStatics.ABI.makeICorePerceptionAutomationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CorePerceptionAutomation {
      val address = segment.toRawLongValue()
      return CorePerceptionAutomation(Pointer(address))
    }

    public override fun toNative(obj: CorePerceptionAutomation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SetActivationFactoryProvider(provider: IGetActivationFactory) =
        ABI.ICorePerceptionAutomationStatics_Instance.SetActivationFactoryProvider(provider)
  }
}
