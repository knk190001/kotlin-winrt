package Windows.ApplicationModel.UserActivities

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

@ABIMarker(UserActivityRequestedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserActivities.UserActivityRequestedEventArgs;{a4cc7a4c-8229-4cfd-a3bc-c61d318575a4})")
@WinRTByReference(brClass = UserActivityRequestedEventArgs.ByReference::class)
public class UserActivityRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserActivityRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1433850518_Interface: IUserActivityRequestedEventArgs.WithDefault by lazy {
    as_1433850518()
  }


  public override val __1433850518_Ptr: JNAPointer? by lazy {
    __1433850518_Interface.__1433850518_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1433850518_Interface)

  private fun as_1433850518(): IUserActivityRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserActivityRequestedEventArgs.ABI.makeIUserActivityRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserActivityRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserActivityRequestedEventArgs.ABI.makeIUserActivityRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserActivityRequestedEventArgs> {
    public override fun getValue() = UserActivityRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserActivityRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserActivityRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserActivityRequestedEventArgs {
      val address = segment.toRawLongValue()
      return UserActivityRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserActivityRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
