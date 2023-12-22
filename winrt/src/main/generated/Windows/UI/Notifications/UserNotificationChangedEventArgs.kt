package Windows.UI.Notifications

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

@ABIMarker(UserNotificationChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Notifications.UserNotificationChangedEventArgs;{b6bd6839-79cf-4b25-82c0-0ce1eef81f8c})")
@WinRTByReference(brClass = UserNotificationChangedEventArgs.ByReference::class)
public class UserNotificationChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserNotificationChangedEventArgs.WithDefault, IWinRTObject {
  private val __865632041_Interface: IUserNotificationChangedEventArgs.WithDefault by lazy {
    as_865632041()
  }


  public override val __865632041_Ptr: JNAPointer? by lazy {
    __865632041_Interface.__865632041_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__865632041_Interface)

  private fun as_865632041(): IUserNotificationChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserNotificationChangedEventArgs.ABI.makeIUserNotificationChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserNotificationChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserNotificationChangedEventArgs.ABI.makeIUserNotificationChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserNotificationChangedEventArgs> {
    public override fun getValue() = UserNotificationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserNotificationChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserNotificationChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserNotificationChangedEventArgs {
      val address = segment.toRawLongValue()
      return UserNotificationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserNotificationChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
