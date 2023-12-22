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

@ABIMarker(KnownNotificationBindings.ABI::class)
@WinRTByReference(brClass = KnownNotificationBindings.ByReference::class)
public class KnownNotificationBindings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownNotificationBindings> {
    public override fun getValue() = KnownNotificationBindings(pointer.getPointer(0))

    public fun setValue(value: KnownNotificationBindings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownNotificationBindings, MemoryAddress> {
    public val IKnownNotificationBindingsStatics_Instance: IKnownNotificationBindingsStatics by
        lazy {
      createIKnownNotificationBindingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownNotificationBindingsStatics(): IKnownNotificationBindingsStatics {
      val refiid = Guid.REFIID(IKnownNotificationBindingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.KnownNotificationBindings".toHandle(),refiid,interfacePtr)
      val result =
          IKnownNotificationBindingsStatics.ABI.makeIKnownNotificationBindingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownNotificationBindings {
      val address = segment.toRawLongValue()
      return KnownNotificationBindings(Pointer(address))
    }

    public override fun toNative(obj: KnownNotificationBindings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ToastGeneric() =
        ABI.IKnownNotificationBindingsStatics_Instance.get_ToastGeneric()
  }
}
