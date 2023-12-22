package Windows.Security.Authentication.OnlineId

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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

@ABIMarker(OnlineIdSystemAuthenticatorForUser.ABI::class)
@Signature("rc(Windows.Security.Authentication.OnlineId.OnlineIdSystemAuthenticatorForUser;{5798befb-1de4-4186-a2e6-b563f86aaf44})")
@WinRTByReference(brClass = OnlineIdSystemAuthenticatorForUser.ByReference::class)
public class OnlineIdSystemAuthenticatorForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOnlineIdSystemAuthenticatorForUser.WithDefault, IWinRTObject {
  private val __2042988774_Interface: IOnlineIdSystemAuthenticatorForUser.WithDefault by lazy {
    as_2042988774()
  }


  public override val __2042988774_Ptr: JNAPointer? by lazy {
    __2042988774_Interface.__2042988774_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2042988774_Interface)

  private fun as_2042988774(): IOnlineIdSystemAuthenticatorForUser.WithDefault {
    if(pointer == NULL) {
      return(IOnlineIdSystemAuthenticatorForUser.ABI.makeIOnlineIdSystemAuthenticatorForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOnlineIdSystemAuthenticatorForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOnlineIdSystemAuthenticatorForUser.ABI.makeIOnlineIdSystemAuthenticatorForUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OnlineIdSystemAuthenticatorForUser> {
    public override fun getValue() = OnlineIdSystemAuthenticatorForUser(pointer.getPointer(0))

    public fun setValue(value: OnlineIdSystemAuthenticatorForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OnlineIdSystemAuthenticatorForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): OnlineIdSystemAuthenticatorForUser {
      val address = segment.toRawLongValue()
      return OnlineIdSystemAuthenticatorForUser(Pointer(address))
    }

    public override fun toNative(obj: OnlineIdSystemAuthenticatorForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
