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

@ABIMarker(ISecondaryAuthenticationFactorRegistrationResult.ABI::class)
@Signature("{a4fe35f0-ade3-4981-af6b-ec195921682a}")
@Guid("a4fe35f0ade34981af6bec195921682a")
@WinRTInterface("a4fe35f0ade34981af6bec195921682a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryAuthenticationFactorRegistrationResult.ByReference::class)
public interface ISecondaryAuthenticationFactorRegistrationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): SecondaryAuthenticationFactorRegistrationStatus?

  @InterfaceMethod(1)
  public fun get_Registration(): SecondaryAuthenticationFactorRegistration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryAuthenticationFactorRegistrationResult> {
    public override fun getValue() =
        ABI.makeISecondaryAuthenticationFactorRegistrationResult(pointer.getPointer(0))

    public fun setValue(value: ISecondaryAuthenticationFactorRegistrationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryAuthenticationFactorRegistrationResult {
    public val __626487850_Ptr: Pointer?

    public val _626487850_VtblPtr: Pointer?
      get() = __626487850_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): SecondaryAuthenticationFactorRegistrationStatus? {
      val fnPtr = _626487850_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryAuthenticationFactorRegistrationStatus>()
      val hr = fn.invokeHR(arrayOf(__626487850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SecondaryAuthenticationFactorRegistrationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Registration(): SecondaryAuthenticationFactorRegistration? {
      val fnPtr = _626487850_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryAuthenticationFactorRegistration>()
      val hr = fn.invokeHR(arrayOf(__626487850_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SecondaryAuthenticationFactorRegistration>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryAuthenticationFactorRegistrationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __626487850_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryAuthenticationFactorRegistrationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4fe35f0ade34981af6bec195921682a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryAuthenticationFactorRegistrationResult(ptr: Pointer?): WithDefault =
        ISecondaryAuthenticationFactorRegistrationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISecondaryAuthenticationFactorRegistrationResult {
      val address = segment.toRawLongValue()
      return makeISecondaryAuthenticationFactorRegistrationResult(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryAuthenticationFactorRegistrationResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__626487850_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryAuthenticationFactorRegistrationResult):
        Array<ISecondaryAuthenticationFactorRegistrationResult?> = (elements as
        Array<ISecondaryAuthenticationFactorRegistrationResult?>).castToImpl<ISecondaryAuthenticationFactorRegistrationResult,ISecondaryAuthenticationFactorRegistrationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryAuthenticationFactorRegistrationResult?>
        = arrayOfNulls<ISecondaryAuthenticationFactorRegistrationResult_Impl>(size) as
        Array<ISecondaryAuthenticationFactorRegistrationResult?>
  }
}
