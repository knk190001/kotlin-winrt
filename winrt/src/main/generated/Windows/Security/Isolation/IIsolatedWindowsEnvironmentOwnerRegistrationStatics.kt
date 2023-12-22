package Windows.Security.Isolation

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IIsolatedWindowsEnvironmentOwnerRegistrationStatics.ABI::class)
@Signature("{10951754-204b-5ec9-9de3-df792d074a61}")
@Guid("10951754204b5ec99de3df792d074a61")
@WinRTInterface("10951754204b5ec99de3df792d074a61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentOwnerRegistrationStatics.ByReference::class)
public interface IIsolatedWindowsEnvironmentOwnerRegistrationStatics : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun Register(ownerName: String?,
      ownerRegistrationData: IsolatedWindowsEnvironmentOwnerRegistrationData?):
      IsolatedWindowsEnvironmentOwnerRegistrationResult?

  @InterfaceMethod(1)
  public fun Unregister(ownerName: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentOwnerRegistrationStatics> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentOwnerRegistrationStatics(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentOwnerRegistrationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentOwnerRegistrationStatics {
    public val __19475456_Ptr: Pointer?

    public val _19475456_VtblPtr: Pointer?
      get() = __19475456_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Register(ownerName: String?,
        ownerRegistrationData: IsolatedWindowsEnvironmentOwnerRegistrationData?):
        IsolatedWindowsEnvironmentOwnerRegistrationResult? {
      val fnPtr = _19475456_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentOwnerRegistrationResult>()
      val hr = fn.invokeHR(arrayOf(__19475456_Ptr, marshalToNative(ownerName),
          marshalToNative(ownerRegistrationData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IsolatedWindowsEnvironmentOwnerRegistrationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Unregister(ownerName: String?): Unit {
      val fnPtr = _19475456_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__19475456_Ptr, marshalToNative(ownerName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIsolatedWindowsEnvironmentOwnerRegistrationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __19475456_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentOwnerRegistrationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10951754204b5ec99de3df792d074a61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentOwnerRegistrationStatics(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentOwnerRegistrationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IIsolatedWindowsEnvironmentOwnerRegistrationStatics {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentOwnerRegistrationStatics(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentOwnerRegistrationStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__19475456_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentOwnerRegistrationStatics):
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationStatics?> = (elements as
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationStatics?>).castToImpl<IIsolatedWindowsEnvironmentOwnerRegistrationStatics,IIsolatedWindowsEnvironmentOwnerRegistrationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationStatics?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentOwnerRegistrationStatics_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationStatics?>
  }
}
