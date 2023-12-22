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

@ABIMarker(UserChangedEventArgs.ABI::class)
@Signature("rc(Windows.System.UserChangedEventArgs;{086459dc-18c6-48db-bc99-724fb9203ccc})")
@WinRTByReference(brClass = UserChangedEventArgs.ByReference::class)
public class UserChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserChangedEventArgs.WithDefault, IUserChangedEventArgs2.WithDefault,
    IWinRTObject {
  private val __902384099_Interface: IUserChangedEventArgs.WithDefault by lazy {
    as_902384099()
  }


  private val __2090864053_Interface: IUserChangedEventArgs2.WithDefault by lazy {
    as_2090864053()
  }


  public override val __902384099_Ptr: JNAPointer? by lazy {
    __902384099_Interface.__902384099_Ptr
  }


  public override val __2090864053_Ptr: JNAPointer? by lazy {
    __2090864053_Interface.__2090864053_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__902384099_Interface, __2090864053_Interface)

  private fun as_902384099(): IUserChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserChangedEventArgs.ABI.makeIUserChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserChangedEventArgs.ABI.makeIUserChangedEventArgs(ref.value))
  }

  private fun as_2090864053(): IUserChangedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IUserChangedEventArgs2.ABI.makeIUserChangedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserChangedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserChangedEventArgs2.ABI.makeIUserChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserChangedEventArgs> {
    public override fun getValue() = UserChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserChangedEventArgs {
      val address = segment.toRawLongValue()
      return UserChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
