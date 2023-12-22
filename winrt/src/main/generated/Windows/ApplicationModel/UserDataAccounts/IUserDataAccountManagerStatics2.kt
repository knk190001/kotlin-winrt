package Windows.ApplicationModel.UserDataAccounts

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

@ABIMarker(IUserDataAccountManagerStatics2.ABI::class)
@Signature("{6a3ded88-316b-435e-b534-f7d4b4b7dba6}")
@Guid("6a3ded88316b435eb534f7d4b4b7dba6")
@WinRTInterface("6a3ded88316b435eb534f7d4b4b7dba6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccountManagerStatics2.ByReference::class)
public interface IUserDataAccountManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): UserDataAccountManagerForUser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccountManagerStatics2> {
    public override fun getValue() = ABI.makeIUserDataAccountManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccountManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccountManagerStatics2 {
    public val __1004917382_Ptr: Pointer?

    public val _1004917382_VtblPtr: Pointer?
      get() = __1004917382_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): UserDataAccountManagerForUser? {
      val fnPtr = _1004917382_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataAccountManagerForUser>()
      val hr = fn.invokeHR(arrayOf(__1004917382_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataAccountManagerForUser>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccountManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1004917382_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccountManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a3ded88316b435eb534f7d4b4b7dba6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccountManagerStatics2(ptr: Pointer?): WithDefault =
        IUserDataAccountManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccountManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIUserDataAccountManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccountManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1004917382_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccountManagerStatics2):
        Array<IUserDataAccountManagerStatics2?> = (elements as
        Array<IUserDataAccountManagerStatics2?>).castToImpl<IUserDataAccountManagerStatics2,IUserDataAccountManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccountManagerStatics2?> =
        arrayOfNulls<IUserDataAccountManagerStatics2_Impl>(size) as
        Array<IUserDataAccountManagerStatics2?>
  }
}
