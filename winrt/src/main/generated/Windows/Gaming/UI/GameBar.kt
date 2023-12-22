package Windows.Gaming.UI

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

@ABIMarker(GameBar.ABI::class)
@WinRTByReference(brClass = GameBar.ByReference::class)
public class GameBar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GameBar> {
    public override fun getValue() = GameBar(pointer.getPointer(0))

    public fun setValue(value: GameBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GameBar, MemoryAddress> {
    public val IGameBarStatics_Instance: IGameBarStatics by lazy {
      createIGameBarStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGameBarStatics(): IGameBarStatics {
      val refiid = Guid.REFIID(IGameBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Gaming.UI.GameBar".toHandle(),refiid,interfacePtr)
      val result = IGameBarStatics.ABI.makeIGameBarStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GameBar {
      val address = segment.toRawLongValue()
      return GameBar(Pointer(address))
    }

    public override fun toNative(obj: GameBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_VisibilityChanged(handler: EventHandler<IUnknown?>) =
        ABI.IGameBarStatics_Instance.add_VisibilityChanged(handler)

    public fun remove_VisibilityChanged(token: EventRegistrationToken) =
        ABI.IGameBarStatics_Instance.remove_VisibilityChanged(token)

    public fun add_IsInputRedirectedChanged(handler: EventHandler<IUnknown?>) =
        ABI.IGameBarStatics_Instance.add_IsInputRedirectedChanged(handler)

    public fun remove_IsInputRedirectedChanged(token: EventRegistrationToken) =
        ABI.IGameBarStatics_Instance.remove_IsInputRedirectedChanged(token)

    public fun get_Visible() = ABI.IGameBarStatics_Instance.get_Visible()

    public fun get_IsInputRedirected() = ABI.IGameBarStatics_Instance.get_IsInputRedirected()
  }
}
