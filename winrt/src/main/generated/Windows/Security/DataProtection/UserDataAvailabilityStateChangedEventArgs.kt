package Windows.Security.DataProtection

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

@ABIMarker(UserDataAvailabilityStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Security.DataProtection.UserDataAvailabilityStateChangedEventArgs;{a76582c9-06a2-4273-a803-834c9f87fbeb})")
@WinRTByReference(brClass = UserDataAvailabilityStateChangedEventArgs.ByReference::class)
public class UserDataAvailabilityStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataAvailabilityStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __97976063_Interface: IUserDataAvailabilityStateChangedEventArgs.WithDefault by lazy {
    as_97976063()
  }


  public override val __97976063_Ptr: JNAPointer? by lazy {
    __97976063_Interface.__97976063_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__97976063_Interface)

  private fun as_97976063(): IUserDataAvailabilityStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAvailabilityStateChangedEventArgs.ABI.makeIUserDataAvailabilityStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAvailabilityStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAvailabilityStateChangedEventArgs.ABI.makeIUserDataAvailabilityStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataAvailabilityStateChangedEventArgs> {
    public override fun getValue() =
        UserDataAvailabilityStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserDataAvailabilityStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAvailabilityStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataAvailabilityStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return UserDataAvailabilityStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserDataAvailabilityStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
