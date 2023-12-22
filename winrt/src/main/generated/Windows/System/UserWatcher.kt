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

@ABIMarker(UserWatcher.ABI::class)
@Signature("rc(Windows.System.UserWatcher;{155eb23b-242a-45e0-a2e9-3171fc6a7fbb})")
@WinRTByReference(brClass = UserWatcher.ByReference::class)
public class UserWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserWatcher.WithDefault, IWinRTObject {
  private val __1507792734_Interface: IUserWatcher.WithDefault by lazy {
    as_1507792734()
  }


  public override val __1507792734_Ptr: JNAPointer? by lazy {
    __1507792734_Interface.__1507792734_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1507792734_Interface)

  private fun as_1507792734(): IUserWatcher.WithDefault {
    if(pointer == NULL) {
      return(IUserWatcher.ABI.makeIUserWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserWatcher.ABI.makeIUserWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UserWatcher> {
    public override fun getValue() = UserWatcher(pointer.getPointer(0))

    public fun setValue(value: UserWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserWatcher {
      val address = segment.toRawLongValue()
      return UserWatcher(Pointer(address))
    }

    public override fun toNative(obj: UserWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
