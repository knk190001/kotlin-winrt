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

@ABIMarker(UserIdentity.ABI::class)
@Signature("rc(Windows.Security.Authentication.OnlineId.UserIdentity;{2146d9cd-0742-4be3-8a1c-7c7ae679aa88})")
@WinRTByReference(brClass = UserIdentity.ByReference::class)
public class UserIdentity(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserIdentity.WithDefault, IWinRTObject {
  private val __1261552879_Interface: IUserIdentity.WithDefault by lazy {
    as_1261552879()
  }


  public override val __1261552879_Ptr: JNAPointer? by lazy {
    __1261552879_Interface.__1261552879_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1261552879_Interface)

  private fun as_1261552879(): IUserIdentity.WithDefault {
    if(pointer == NULL) {
      return(IUserIdentity.ABI.makeIUserIdentity(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserIdentity>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserIdentity.ABI.makeIUserIdentity(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UserIdentity> {
    public override fun getValue() = UserIdentity(pointer.getPointer(0))

    public fun setValue(value: UserIdentity): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserIdentity, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserIdentity {
      val address = segment.toRawLongValue()
      return UserIdentity(Pointer(address))
    }

    public override fun toNative(obj: UserIdentity): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
