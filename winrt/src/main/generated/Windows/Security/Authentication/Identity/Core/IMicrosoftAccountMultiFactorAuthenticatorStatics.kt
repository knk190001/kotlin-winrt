package Windows.Security.Authentication.Identity.Core

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

@ABIMarker(IMicrosoftAccountMultiFactorAuthenticatorStatics.ABI::class)
@Signature("{d964c2e6-f446-4c71-8b79-6ea4024aa9b8}")
@Guid("d964c2e6f4464c718b796ea4024aa9b8")
@WinRTInterface("d964c2e6f4464c718b796ea4024aa9b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMicrosoftAccountMultiFactorAuthenticatorStatics.ByReference::class)
public interface IMicrosoftAccountMultiFactorAuthenticatorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): MicrosoftAccountMultiFactorAuthenticationManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMicrosoftAccountMultiFactorAuthenticatorStatics> {
    public override fun getValue() =
        ABI.makeIMicrosoftAccountMultiFactorAuthenticatorStatics(pointer.getPointer(0))

    public fun setValue(value: IMicrosoftAccountMultiFactorAuthenticatorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMicrosoftAccountMultiFactorAuthenticatorStatics {
    public val __67432558_Ptr: Pointer?

    public val _67432558_VtblPtr: Pointer?
      get() = __67432558_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): MicrosoftAccountMultiFactorAuthenticationManager? {
      val fnPtr = _67432558_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MicrosoftAccountMultiFactorAuthenticationManager>()
      val hr = fn.invokeHR(arrayOf(__67432558_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MicrosoftAccountMultiFactorAuthenticationManager>(result.getValue())
      return resultValue
    }
  }

  public class IMicrosoftAccountMultiFactorAuthenticatorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __67432558_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMicrosoftAccountMultiFactorAuthenticatorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d964c2e6f4464c718b796ea4024aa9b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMicrosoftAccountMultiFactorAuthenticatorStatics(ptr: Pointer?): WithDefault =
        IMicrosoftAccountMultiFactorAuthenticatorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMicrosoftAccountMultiFactorAuthenticatorStatics {
      val address = segment.toRawLongValue()
      return makeIMicrosoftAccountMultiFactorAuthenticatorStatics(Pointer(address))
    }

    public override fun toNative(obj: IMicrosoftAccountMultiFactorAuthenticatorStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__67432558_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMicrosoftAccountMultiFactorAuthenticatorStatics):
        Array<IMicrosoftAccountMultiFactorAuthenticatorStatics?> = (elements as
        Array<IMicrosoftAccountMultiFactorAuthenticatorStatics?>).castToImpl<IMicrosoftAccountMultiFactorAuthenticatorStatics,IMicrosoftAccountMultiFactorAuthenticatorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMicrosoftAccountMultiFactorAuthenticatorStatics?>
        = arrayOfNulls<IMicrosoftAccountMultiFactorAuthenticatorStatics_Impl>(size) as
        Array<IMicrosoftAccountMultiFactorAuthenticatorStatics?>
  }
}
