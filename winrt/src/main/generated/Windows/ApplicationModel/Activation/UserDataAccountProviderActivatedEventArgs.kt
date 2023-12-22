package Windows.ApplicationModel.Activation

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

@ABIMarker(UserDataAccountProviderActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.UserDataAccountProviderActivatedEventArgs;{1bc9f723-8ef1-4a51-a63a-fe711eeab607})")
@WinRTByReference(brClass = UserDataAccountProviderActivatedEventArgs.ByReference::class)
public class UserDataAccountProviderActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataAccountProviderActivatedEventArgs.WithDefault,
    IActivatedEventArgs.WithDefault, IWinRTObject {
  private val __1944704806_Interface: IUserDataAccountProviderActivatedEventArgs.WithDefault by
      lazy {
    as_1944704806()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  public override val __1944704806_Ptr: JNAPointer? by lazy {
    __1944704806_Interface.__1944704806_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1944704806_Interface, __1721660047_Interface)

  private fun as_1944704806(): IUserDataAccountProviderActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUserDataAccountProviderActivatedEventArgs.ABI.makeIUserDataAccountProviderActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataAccountProviderActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataAccountProviderActivatedEventArgs.ABI.makeIUserDataAccountProviderActivatedEventArgs(ref.value))
  }

  private fun as_1721660047(): IActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataAccountProviderActivatedEventArgs> {
    public override fun getValue() =
        UserDataAccountProviderActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: UserDataAccountProviderActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataAccountProviderActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UserDataAccountProviderActivatedEventArgs {
      val address = segment.toRawLongValue()
      return UserDataAccountProviderActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UserDataAccountProviderActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
