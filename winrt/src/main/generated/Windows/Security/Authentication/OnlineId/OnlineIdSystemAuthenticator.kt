package Windows.Security.Authentication.OnlineId

import Windows.System.User
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

@ABIMarker(OnlineIdSystemAuthenticator.ABI::class)
@WinRTByReference(brClass = OnlineIdSystemAuthenticator.ByReference::class)
public class OnlineIdSystemAuthenticator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OnlineIdSystemAuthenticator> {
    public override fun getValue() = OnlineIdSystemAuthenticator(pointer.getPointer(0))

    public fun setValue(value: OnlineIdSystemAuthenticator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OnlineIdSystemAuthenticator, MemoryAddress> {
    public val IOnlineIdSystemAuthenticatorStatics_Instance: IOnlineIdSystemAuthenticatorStatics by
        lazy {
      createIOnlineIdSystemAuthenticatorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIOnlineIdSystemAuthenticatorStatics(): IOnlineIdSystemAuthenticatorStatics {
      val refiid = Guid.REFIID(IOnlineIdSystemAuthenticatorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.OnlineId.OnlineIdSystemAuthenticator".toHandle(),refiid,interfacePtr)
      val result =
          IOnlineIdSystemAuthenticatorStatics.ABI.makeIOnlineIdSystemAuthenticatorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): OnlineIdSystemAuthenticator {
      val address = segment.toRawLongValue()
      return OnlineIdSystemAuthenticator(Pointer(address))
    }

    public override fun toNative(obj: OnlineIdSystemAuthenticator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Default() = ABI.IOnlineIdSystemAuthenticatorStatics_Instance.get_Default()

    public fun GetForUser(user: User) =
        ABI.IOnlineIdSystemAuthenticatorStatics_Instance.GetForUser(user)
  }
}
