package Windows.UI.Notifications

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

@ABIMarker(KnownAdaptiveNotificationHints.ABI::class)
@WinRTByReference(brClass = KnownAdaptiveNotificationHints.ByReference::class)
public class KnownAdaptiveNotificationHints(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownAdaptiveNotificationHints> {
    public override fun getValue() = KnownAdaptiveNotificationHints(pointer.getPointer(0))

    public fun setValue(value: KnownAdaptiveNotificationHints): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownAdaptiveNotificationHints, MemoryAddress> {
    public val IKnownAdaptiveNotificationHintsStatics_Instance:
        IKnownAdaptiveNotificationHintsStatics by lazy {
      createIKnownAdaptiveNotificationHintsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownAdaptiveNotificationHintsStatics():
        IKnownAdaptiveNotificationHintsStatics {
      val refiid = Guid.REFIID(IKnownAdaptiveNotificationHintsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.KnownAdaptiveNotificationHints".toHandle(),refiid,interfacePtr)
      val result =
          IKnownAdaptiveNotificationHintsStatics.ABI.makeIKnownAdaptiveNotificationHintsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownAdaptiveNotificationHints {
      val address = segment.toRawLongValue()
      return KnownAdaptiveNotificationHints(Pointer(address))
    }

    public override fun toNative(obj: KnownAdaptiveNotificationHints): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Style() = ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_Style()

    public fun get_Wrap() = ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_Wrap()

    public fun get_MaxLines() = ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_MaxLines()

    public fun get_MinLines() = ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_MinLines()

    public fun get_TextStacking() =
        ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_TextStacking()

    public fun get_Align() = ABI.IKnownAdaptiveNotificationHintsStatics_Instance.get_Align()
  }
}
