package Windows.ApplicationModel.UserDataAccounts

import Windows.Foundation.IAsyncOperation
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataAccountManagerForUser.ABI::class)
@Signature("{56a6e8db-db8f-41ab-a65f-8c5971aac982}")
@Guid("56a6e8dbdb8f41aba65f8c5971aac982")
@WinRTInterface("56a6e8dbdb8f41aba65f8c5971aac982")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountManagerForUser.ByReference::class)
public interface IUserDataAccountManagerForUser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestStoreAsync(storeAccessType: UserDataAccountStoreAccessType?):
      IAsyncOperation<UserDataAccountStore?>?

  @InterfaceMethod(1)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountManagerForUser> {
    public override fun getValue() = ABI.makeIUserDataAccountManagerForUser(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountManagerForUser {
    public val __1112863643_Ptr: Pointer?

    public val _1112863643_VtblPtr: Pointer?
      get() = __1112863643_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestStoreAsync(storeAccessType: UserDataAccountStoreAccessType?):
        IAsyncOperation<UserDataAccountStore?>? {
      val fnPtr = _1112863643_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataAccountStore?>>()
      val hr = fn.invokeHR(arrayOf(__1112863643_Ptr, marshalToNative(storeAccessType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UserDataAccountStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_User(): User? {
      val fnPtr = _1112863643_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1112863643_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccountManagerForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1112863643_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountManagerForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56a6e8dbdb8f41aba65f8c5971aac982")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountManagerForUser(ptr: Pointer?): WithDefault =
        IUserDataAccountManagerForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccountManagerForUser {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1112863643_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountManagerForUser):
        Array<IUserDataAccountManagerForUser?> = (elements as
        Array<IUserDataAccountManagerForUser?>).castToImpl<IUserDataAccountManagerForUser,IUserDataAccountManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountManagerForUser?> =
        arrayOfNulls<IUserDataAccountManagerForUser_Impl>(size) as
        Array<IUserDataAccountManagerForUser?>
  }
}
