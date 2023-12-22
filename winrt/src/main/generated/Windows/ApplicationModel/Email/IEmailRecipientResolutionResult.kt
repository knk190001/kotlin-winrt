package Windows.ApplicationModel.Email

import Windows.Foundation.Collections.IVectorView
import Windows.Security.Cryptography.Certificates.Certificate
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

@ABIMarker(IEmailRecipientResolutionResult.ABI::class)
@Signature("{918338fa-8d8d-4573-80d1-07172a34b98d}")
@Guid("918338fa8d8d457380d107172a34b98d")
@WinRTInterface("918338fa8d8d457380d107172a34b98d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailRecipientResolutionResult.ByReference::class)
public interface IEmailRecipientResolutionResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): EmailRecipientResolutionStatus?

  @InterfaceMethod(1)
  public fun get_PublicKeys(): IVectorView<Certificate?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailRecipientResolutionResult> {
    public override fun getValue() = ABI.makeIEmailRecipientResolutionResult(pointer.getPointer(0))

    public fun setValue(value: IEmailRecipientResolutionResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailRecipientResolutionResult {
    public val __2016849091_Ptr: Pointer?

    public val _2016849091_VtblPtr: Pointer?
      get() = __2016849091_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): EmailRecipientResolutionStatus? {
      val fnPtr = _2016849091_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailRecipientResolutionStatus>()
      val hr = fn.invokeHR(arrayOf(__2016849091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailRecipientResolutionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PublicKeys(): IVectorView<Certificate?>? {
      val fnPtr = _2016849091_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Certificate?>>()
      val hr = fn.invokeHR(arrayOf(__2016849091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Certificate?>>(result.getValue())
      return resultValue
    }
  }

  public class IEmailRecipientResolutionResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2016849091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailRecipientResolutionResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("918338fa8d8d457380d107172a34b98d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailRecipientResolutionResult(ptr: Pointer?): WithDefault =
        IEmailRecipientResolutionResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailRecipientResolutionResult {
      val address = segment.toRawLongValue()
      return makeIEmailRecipientResolutionResult(Pointer(address))
    }

    public override fun toNative(obj: IEmailRecipientResolutionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2016849091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailRecipientResolutionResult):
        Array<IEmailRecipientResolutionResult?> = (elements as
        Array<IEmailRecipientResolutionResult?>).castToImpl<IEmailRecipientResolutionResult,IEmailRecipientResolutionResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailRecipientResolutionResult?> =
        arrayOfNulls<IEmailRecipientResolutionResult_Impl>(size) as
        Array<IEmailRecipientResolutionResult?>
  }
}
