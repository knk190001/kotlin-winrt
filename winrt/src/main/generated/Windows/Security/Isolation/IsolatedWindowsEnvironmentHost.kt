package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironmentHost.ABI::class)
@WinRTByReference(brClass = IsolatedWindowsEnvironmentHost.ByReference::class)
public class IsolatedWindowsEnvironmentHost(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentHost> {
    public override fun getValue() = IsolatedWindowsEnvironmentHost(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentHost): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentHost, MemoryAddress> {
    public val IIsolatedWindowsEnvironmentHostStatics_Instance:
        IIsolatedWindowsEnvironmentHostStatics by lazy {
      createIIsolatedWindowsEnvironmentHostStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIsolatedWindowsEnvironmentHostStatics():
        IIsolatedWindowsEnvironmentHostStatics {
      val refiid = Guid.REFIID(IIsolatedWindowsEnvironmentHostStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Isolation.IsolatedWindowsEnvironmentHost".toHandle(),refiid,interfacePtr)
      val result =
          IIsolatedWindowsEnvironmentHostStatics.ABI.makeIIsolatedWindowsEnvironmentHostStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): IsolatedWindowsEnvironmentHost {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentHost(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentHost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsReady() = ABI.IIsolatedWindowsEnvironmentHostStatics_Instance.get_IsReady()

    public fun get_HostErrors() =
        ABI.IIsolatedWindowsEnvironmentHostStatics_Instance.get_HostErrors()
  }
}
