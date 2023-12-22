package Windows.ApplicationModel.UserActivities

import Windows.Foundation.IClosable
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

@ABIMarker(UserActivitySession.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserActivities.UserActivitySession;{ae434d78-24fa-44a3-ad48-6eda61aa1924})")
@WinRTByReference(brClass = UserActivitySession.ByReference::class)
public class UserActivitySession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserActivitySession.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1559957141_Interface: IUserActivitySession.WithDefault by lazy {
    as_1559957141()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1559957141_Ptr: JNAPointer? by lazy {
    __1559957141_Interface.__1559957141_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1559957141_Interface, __1260617006_Interface)

  private fun as_1559957141(): IUserActivitySession.WithDefault {
    if(pointer == NULL) {
      return(IUserActivitySession.ABI.makeIUserActivitySession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivitySession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivitySession.ABI.makeIUserActivitySession(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserActivitySession> {
    public override fun getValue() = UserActivitySession(pointer.getPointer(0))

    public fun setValue(value: UserActivitySession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserActivitySession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserActivitySession {
      val address = segment.toRawLongValue()
      return UserActivitySession(Pointer(address))
    }

    public override fun toNative(obj: UserActivitySession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
