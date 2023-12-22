package Windows.Security.DataProtection

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(UserDataProtectionManager.ABI::class)
@Signature("rc(Windows.Security.DataProtection.UserDataProtectionManager;{1f13237d-b42e-4a88-9480-0f240924c876})")
@WinRTByReference(brClass = UserDataProtectionManager.ByReference::class)
public class UserDataProtectionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUserDataProtectionManager.WithDefault, IWinRTObject {
  private val __1042337084_Interface: IUserDataProtectionManager.WithDefault by lazy {
    as_1042337084()
  }


  public override val __1042337084_Ptr: JNAPointer? by lazy {
    __1042337084_Interface.__1042337084_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1042337084_Interface)

  private fun as_1042337084(): IUserDataProtectionManager.WithDefault {
    if(pointer == NULL) {
      return(IUserDataProtectionManager.ABI.makeIUserDataProtectionManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserDataProtectionManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserDataProtectionManager.ABI.makeIUserDataProtectionManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDataProtectionManager> {
    public override fun getValue() = UserDataProtectionManager(pointer.getPointer(0))

    public fun setValue(value: UserDataProtectionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDataProtectionManager, MemoryAddress> {
    public val IUserDataProtectionManagerStatics_Instance: IUserDataProtectionManagerStatics by
        lazy {
      createIUserDataProtectionManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserDataProtectionManagerStatics(): IUserDataProtectionManagerStatics {
      val refiid = Guid.REFIID(IUserDataProtectionManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.DataProtection.UserDataProtectionManager".toHandle(),refiid,interfacePtr)
      val result =
          IUserDataProtectionManagerStatics.ABI.makeIUserDataProtectionManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserDataProtectionManager {
      val address = segment.toRawLongValue()
      return UserDataProtectionManager(Pointer(address))
    }

    public override fun toNative(obj: UserDataProtectionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryGetDefault() = ABI.IUserDataProtectionManagerStatics_Instance.TryGetDefault()

    public fun TryGetForUser(user: User) =
        ABI.IUserDataProtectionManagerStatics_Instance.TryGetForUser(user)
  }
}
