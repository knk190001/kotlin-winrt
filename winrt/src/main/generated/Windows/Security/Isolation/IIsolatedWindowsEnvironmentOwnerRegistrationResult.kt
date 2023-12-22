package Windows.Security.Isolation

import Windows.Foundation.HResult
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

@ABIMarker(IIsolatedWindowsEnvironmentOwnerRegistrationResult.ABI::class)
@Signature("{6dab9451-6169-55df-8f51-790e99d7277d}")
@Guid("6dab9451616955df8f51790e99d7277d")
@WinRTInterface("6dab9451616955df8f51790e99d7277d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentOwnerRegistrationResult.ByReference::class)
public interface IIsolatedWindowsEnvironmentOwnerRegistrationResult : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Status(): IsolatedWindowsEnvironmentOwnerRegistrationStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentOwnerRegistrationResult> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentOwnerRegistrationResult(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentOwnerRegistrationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentOwnerRegistrationResult {
    public val __1980979070_Ptr: Pointer?

    public val _1980979070_VtblPtr: Pointer?
      get() = __1980979070_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): IsolatedWindowsEnvironmentOwnerRegistrationStatus? {
      val fnPtr = _1980979070_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IsolatedWindowsEnvironmentOwnerRegistrationStatus>()
      val hr = fn.invokeHR(arrayOf(__1980979070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IsolatedWindowsEnvironmentOwnerRegistrationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1980979070_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1980979070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IIsolatedWindowsEnvironmentOwnerRegistrationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1980979070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentOwnerRegistrationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6dab9451616955df8f51790e99d7277d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentOwnerRegistrationResult(ptr: Pointer?): WithDefault =
        IIsolatedWindowsEnvironmentOwnerRegistrationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IIsolatedWindowsEnvironmentOwnerRegistrationResult {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentOwnerRegistrationResult(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentOwnerRegistrationResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1980979070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentOwnerRegistrationResult):
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationResult?> = (elements as
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationResult?>).castToImpl<IIsolatedWindowsEnvironmentOwnerRegistrationResult,IIsolatedWindowsEnvironmentOwnerRegistrationResult_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationResult?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentOwnerRegistrationResult_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentOwnerRegistrationResult?>
  }
}
