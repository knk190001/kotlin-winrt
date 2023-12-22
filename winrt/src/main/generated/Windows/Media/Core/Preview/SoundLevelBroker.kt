package Windows.Media.Core.Preview

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

@ABIMarker(SoundLevelBroker.ABI::class)
@WinRTByReference(brClass = SoundLevelBroker.ByReference::class)
public class SoundLevelBroker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SoundLevelBroker> {
    public override fun getValue() = SoundLevelBroker(pointer.getPointer(0))

    public fun setValue(value: SoundLevelBroker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SoundLevelBroker, MemoryAddress> {
    public val ISoundLevelBrokerStatics_Instance: ISoundLevelBrokerStatics by lazy {
      createISoundLevelBrokerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISoundLevelBrokerStatics(): ISoundLevelBrokerStatics {
      val refiid = Guid.REFIID(ISoundLevelBrokerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.Preview.SoundLevelBroker".toHandle(),refiid,interfacePtr)
      val result = ISoundLevelBrokerStatics.ABI.makeISoundLevelBrokerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SoundLevelBroker {
      val address = segment.toRawLongValue()
      return SoundLevelBroker(Pointer(address))
    }

    public override fun toNative(obj: SoundLevelBroker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SoundLevel() = ABI.ISoundLevelBrokerStatics_Instance.get_SoundLevel()

    public fun add_SoundLevelChanged(handler: EventHandler<IUnknown?>) =
        ABI.ISoundLevelBrokerStatics_Instance.add_SoundLevelChanged(handler)

    public fun remove_SoundLevelChanged(token: EventRegistrationToken) =
        ABI.ISoundLevelBrokerStatics_Instance.remove_SoundLevelChanged(token)
  }
}
