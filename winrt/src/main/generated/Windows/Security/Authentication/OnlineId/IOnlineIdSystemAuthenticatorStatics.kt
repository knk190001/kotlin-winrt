package Windows.Security.Authentication.OnlineId

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

@ABIMarker(IOnlineIdSystemAuthenticatorStatics.ABI::class)
@Signature("{85047792-f634-41e3-96a4-5164e902c740}")
@Guid("85047792f63441e396a45164e902c740")
@WinRTInterface("85047792f63441e396a45164e902c740")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOnlineIdSystemAuthenticatorStatics.ByReference::class)
public interface IOnlineIdSystemAuthenticatorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Default(): OnlineIdSystemAuthenticatorForUser?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): OnlineIdSystemAuthenticatorForUser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOnlineIdSystemAuthenticatorStatics> {
    public override fun getValue() =
        ABI.makeIOnlineIdSystemAuthenticatorStatics(pointer.getPointer(0))

    public fun setValue(value: IOnlineIdSystemAuthenticatorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOnlineIdSystemAuthenticatorStatics {
    public val __823994487_Ptr: Pointer?

    public val _823994487_VtblPtr: Pointer?
      get() = __823994487_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Default(): OnlineIdSystemAuthenticatorForUser? {
      val fnPtr = _823994487_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OnlineIdSystemAuthenticatorForUser>()
      val hr = fn.invokeHR(arrayOf(__823994487_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OnlineIdSystemAuthenticatorForUser>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): OnlineIdSystemAuthenticatorForUser? {
      val fnPtr = _823994487_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OnlineIdSystemAuthenticatorForUser>()
      val hr = fn.invokeHR(arrayOf(__823994487_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OnlineIdSystemAuthenticatorForUser>(result.getValue())
      return resultValue
    }
  }

  public class IOnlineIdSystemAuthenticatorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __823994487_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOnlineIdSystemAuthenticatorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85047792f63441e396a45164e902c740")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOnlineIdSystemAuthenticatorStatics(ptr: Pointer?): WithDefault =
        IOnlineIdSystemAuthenticatorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOnlineIdSystemAuthenticatorStatics {
      val address = segment.toRawLongValue()
      return makeIOnlineIdSystemAuthenticatorStatics(Pointer(address))
    }

    public override fun toNative(obj: IOnlineIdSystemAuthenticatorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__823994487_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOnlineIdSystemAuthenticatorStatics):
        Array<IOnlineIdSystemAuthenticatorStatics?> = (elements as
        Array<IOnlineIdSystemAuthenticatorStatics?>).castToImpl<IOnlineIdSystemAuthenticatorStatics,IOnlineIdSystemAuthenticatorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOnlineIdSystemAuthenticatorStatics?> =
        arrayOfNulls<IOnlineIdSystemAuthenticatorStatics_Impl>(size) as
        Array<IOnlineIdSystemAuthenticatorStatics?>
  }
}
