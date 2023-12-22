package Windows.Security.Authentication.Identity.Provider

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

@ABIMarker(ISecondaryAuthenticationFactorAuthenticationResult.ABI::class)
@Signature("{9cbb5987-ef6d-4bc2-bf49-4617515a0f9a}")
@Guid("9cbb5987ef6d4bc2bf494617515a0f9a")
@WinRTInterface("9cbb5987ef6d4bc2bf494617515a0f9a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryAuthenticationFactorAuthenticationResult.ByReference::class)
public interface ISecondaryAuthenticationFactorAuthenticationResult : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Status(): SecondaryAuthenticationFactorAuthenticationStatus?

  @InterfaceMethod(1)
  public fun get_Authentication(): SecondaryAuthenticationFactorAuthentication?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryAuthenticationFactorAuthenticationResult> {
    public override fun getValue() =
        ABI.makeISecondaryAuthenticationFactorAuthenticationResult(pointer.getPointer(0))

    public fun setValue(value: ISecondaryAuthenticationFactorAuthenticationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryAuthenticationFactorAuthenticationResult {
    public val __626355115_Ptr: Pointer?

    public val _626355115_VtblPtr: Pointer?
      get() = __626355115_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): SecondaryAuthenticationFactorAuthenticationStatus? {
      val fnPtr = _626355115_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryAuthenticationFactorAuthenticationStatus>()
      val hr = fn.invokeHR(arrayOf(__626355115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SecondaryAuthenticationFactorAuthenticationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Authentication(): SecondaryAuthenticationFactorAuthentication? {
      val fnPtr = _626355115_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryAuthenticationFactorAuthentication>()
      val hr = fn.invokeHR(arrayOf(__626355115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SecondaryAuthenticationFactorAuthentication>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryAuthenticationFactorAuthenticationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __626355115_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryAuthenticationFactorAuthenticationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9cbb5987ef6d4bc2bf494617515a0f9a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryAuthenticationFactorAuthenticationResult(ptr: Pointer?): WithDefault =
        ISecondaryAuthenticationFactorAuthenticationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISecondaryAuthenticationFactorAuthenticationResult {
      val address = segment.toRawLongValue()
      return makeISecondaryAuthenticationFactorAuthenticationResult(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryAuthenticationFactorAuthenticationResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__626355115_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryAuthenticationFactorAuthenticationResult):
        Array<ISecondaryAuthenticationFactorAuthenticationResult?> = (elements as
        Array<ISecondaryAuthenticationFactorAuthenticationResult?>).castToImpl<ISecondaryAuthenticationFactorAuthenticationResult,ISecondaryAuthenticationFactorAuthenticationResult_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISecondaryAuthenticationFactorAuthenticationResult?> =
        arrayOfNulls<ISecondaryAuthenticationFactorAuthenticationResult_Impl>(size) as
        Array<ISecondaryAuthenticationFactorAuthenticationResult?>
  }
}
