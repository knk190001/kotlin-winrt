package Windows.System.RemoteDesktop

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

@ABIMarker(InteractiveSession.ABI::class)
@WinRTByReference(brClass = InteractiveSession.ByReference::class)
public class InteractiveSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractiveSession> {
    public override fun getValue() = InteractiveSession(pointer.getPointer(0))

    public fun setValue(value: InteractiveSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractiveSession, MemoryAddress> {
    public val IInteractiveSessionStatics_Instance: IInteractiveSessionStatics by lazy {
      createIInteractiveSessionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInteractiveSessionStatics(): IInteractiveSessionStatics {
      val refiid = Guid.REFIID(IInteractiveSessionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.RemoteDesktop.InteractiveSession".toHandle(),refiid,interfacePtr)
      val result = IInteractiveSessionStatics.ABI.makeIInteractiveSessionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InteractiveSession {
      val address = segment.toRawLongValue()
      return InteractiveSession(Pointer(address))
    }

    public override fun toNative(obj: InteractiveSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsRemote() = ABI.IInteractiveSessionStatics_Instance.get_IsRemote()
  }
}
