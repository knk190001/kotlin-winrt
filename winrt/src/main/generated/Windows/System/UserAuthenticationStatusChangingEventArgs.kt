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

@ABIMarker(UserAuthenticationStatusChangingEventArgs.ABI::class)
@Signature("rc(Windows.System.UserAuthenticationStatusChangingEventArgs;{8c030f28-a711-4c1e-ab48-04179c15938f})")
@WinRTByReference(brClass = UserAuthenticationStatusChangingEventArgs.ByReference::class)
public class UserAuthenticationStatusChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserAuthenticationStatusChangingEventArgs.WithDefault, IWinRTObject {
  private val __44358054_Interface: IUserAuthenticationStatusChangingEventArgs.WithDefault by lazy {
    as_44358054()
  }


  public override val __44358054_Ptr: JNAPointer? by lazy {
    __44358054_Interface.__44358054_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__44358054_Interface)

  private fun as_44358054(): IUserAuthenticationStatusChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserAuthenticationStatusChangingEventArgs.ABI.makeIUserAuthenticationStatusChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserAuthenticationStatusChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserAuthenticationStatusChangingEventArgs.ABI.makeIUserAuthenticationStatusChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserAuthenticationStatusChangingEventArgs> {
    public override fun getValue() =
        UserAuthenticationStatusChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserAuthenticationStatusChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserAuthenticationStatusChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserAuthenticationStatusChangingEventArgs {
      val address = segment.toRawLongValue()
      return UserAuthenticationStatusChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserAuthenticationStatusChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
