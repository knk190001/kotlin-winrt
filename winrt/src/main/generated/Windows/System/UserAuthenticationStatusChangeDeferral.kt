package Windows.System

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

@ABIMarker(UserAuthenticationStatusChangeDeferral.ABI::class)
@Signature("rc(Windows.System.UserAuthenticationStatusChangeDeferral;{88b59568-bb30-42fb-a270-e9902e40efa7})")
@WinRTByReference(brClass = UserAuthenticationStatusChangeDeferral.ByReference::class)
public class UserAuthenticationStatusChangeDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserAuthenticationStatusChangeDeferral.WithDefault, IWinRTObject {
  private val __145975361_Interface: IUserAuthenticationStatusChangeDeferral.WithDefault by lazy {
    as_145975361()
  }


  public override val __145975361_Ptr: JNAPointer? by lazy {
    __145975361_Interface.__145975361_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__145975361_Interface)

  private fun as_145975361(): IUserAuthenticationStatusChangeDeferral.WithDefault {
    if(pointer == NULL) {
      return(IUserAuthenticationStatusChangeDeferral.ABI.makeIUserAuthenticationStatusChangeDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserAuthenticationStatusChangeDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserAuthenticationStatusChangeDeferral.ABI.makeIUserAuthenticationStatusChangeDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserAuthenticationStatusChangeDeferral> {
    public override fun getValue() = UserAuthenticationStatusChangeDeferral(pointer.getPointer(0))

    public fun setValue(value: UserAuthenticationStatusChangeDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserAuthenticationStatusChangeDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserAuthenticationStatusChangeDeferral {
      val address = segment.toRawLongValue()
      return UserAuthenticationStatusChangeDeferral(Pointer(address))
    }

    public override fun toNative(obj: UserAuthenticationStatusChangeDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
