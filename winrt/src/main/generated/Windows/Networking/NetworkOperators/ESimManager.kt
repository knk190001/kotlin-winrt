package Windows.Networking.NetworkOperators

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ESimManager.ABI::class)
@WinRTByReference(brClass = ESimManager.ByReference::class)
public class ESimManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ESimManager> {
    public override fun getValue() = ESimManager(pointer.getPointer(0))

    public fun setValue(value: ESimManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimManager, MemoryAddress> {
    public val IESimManagerStatics_Instance: IESimManagerStatics by lazy {
      createIESimManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIESimManagerStatics(): IESimManagerStatics {
      val refiid = Guid.REFIID(IESimManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.ESimManager".toHandle(),refiid,interfacePtr)
      val result = IESimManagerStatics.ABI.makeIESimManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ESimManager {
      val address = segment.toRawLongValue()
      return ESimManager(Pointer(address))
    }

    public override fun toNative(obj: ESimManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ServiceInfo() = ABI.IESimManagerStatics_Instance.get_ServiceInfo()

    public fun TryCreateESimWatcher() = ABI.IESimManagerStatics_Instance.TryCreateESimWatcher()

    public fun add_ServiceInfoChanged(handler: EventHandler<IUnknown?>) =
        ABI.IESimManagerStatics_Instance.add_ServiceInfoChanged(handler)

    public fun remove_ServiceInfoChanged(token: EventRegistrationToken) =
        ABI.IESimManagerStatics_Instance.remove_ServiceInfoChanged(token)
  }
}
