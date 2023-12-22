package Windows.ApplicationModel.UserDataAccounts

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

@ABIMarker(UserDataAccountStore.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataAccounts.UserDataAccountStore;{2073b0ad-7d0a-4e76-bf45-2368f978a59a})")
@WinRTByReference(brClass = UserDataAccountStore.ByReference::class)
public class UserDataAccountStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataAccountStore.WithDefault, IUserDataAccountStore2.WithDefault,
    IUserDataAccountStore3.WithDefault, IWinRTObject {
  private val __627606157_Interface: IUserDataAccountStore.WithDefault by lazy {
    as_627606157()
  }


  private val __2019045563_Interface: IUserDataAccountStore2.WithDefault by lazy {
    as_2019045563()
  }


  private val __2019045562_Interface: IUserDataAccountStore3.WithDefault by lazy {
    as_2019045562()
  }


  public override val __627606157_Ptr: JNAPointer? by lazy {
    __627606157_Interface.__627606157_Ptr
  }


  public override val __2019045563_Ptr: JNAPointer? by lazy {
    __2019045563_Interface.__2019045563_Ptr
  }


  public override val __2019045562_Ptr: JNAPointer? by lazy {
    __2019045562_Interface.__2019045562_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__627606157_Interface, __2019045563_Interface, __2019045562_Interface)

  private fun as_627606157(): IUserDataAccountStore.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccountStore.ABI.makeIUserDataAccountStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccountStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccountStore.ABI.makeIUserDataAccountStore(ref.value))
  }

  private fun as_2019045563(): IUserDataAccountStore2.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccountStore2.ABI.makeIUserDataAccountStore2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccountStore2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccountStore2.ABI.makeIUserDataAccountStore2(ref.value))
  }

  private fun as_2019045562(): IUserDataAccountStore3.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccountStore3.ABI.makeIUserDataAccountStore3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccountStore3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccountStore3.ABI.makeIUserDataAccountStore3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataAccountStore> {
    public override fun getValue() = UserDataAccountStore(pointer.getPointer(0))

    public fun setValue(value: UserDataAccountStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAccountStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UserDataAccountStore {
      val address = segment.toRawLongValue()
      return UserDataAccountStore(Pointer(address))
    }

    public override fun toNative(obj: UserDataAccountStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
