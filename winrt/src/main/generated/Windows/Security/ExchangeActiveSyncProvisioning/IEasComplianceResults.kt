package Windows.Security.ExchangeActiveSyncProvisioning

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEasComplianceResults.ABI::class)
@Signature("{463c299c-7f19-4c66-b403-cb45dd57a2b3}")
@Guid("463c299c7f194c66b403cb45dd57a2b3")
@WinRTInterface("463c299c7f194c66b403cb45dd57a2b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEasComplianceResults.ByReference::class)
public interface IEasComplianceResults : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Compliant(): Boolean

  @InterfaceMethod(1)
  public fun get_RequireEncryptionResult(): EasRequireEncryptionResult?

  @InterfaceMethod(2)
  public fun get_MinPasswordLengthResult(): EasMinPasswordLengthResult?

  @InterfaceMethod(3)
  public fun get_DisallowConvenienceLogonResult(): EasDisallowConvenienceLogonResult?

  @InterfaceMethod(4)
  public fun get_MinPasswordComplexCharactersResult(): EasMinPasswordComplexCharactersResult?

  @InterfaceMethod(5)
  public fun get_PasswordExpirationResult(): EasPasswordExpirationResult?

  @InterfaceMethod(6)
  public fun get_PasswordHistoryResult(): EasPasswordHistoryResult?

  @InterfaceMethod(7)
  public fun get_MaxPasswordFailedAttemptsResult(): EasMaxPasswordFailedAttemptsResult?

  @InterfaceMethod(8)
  public fun get_MaxInactivityTimeLockResult(): EasMaxInactivityTimeLockResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEasComplianceResults> {
    public override fun getValue() = ABI.makeIEasComplianceResults(pointer.getPointer(0))

    public fun setValue(value: IEasComplianceResults_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEasComplianceResults {
    public val __343962873_Ptr: Pointer?

    public val _343962873_VtblPtr: Pointer?
      get() = __343962873_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Compliant(): Boolean {
      val fnPtr = _343962873_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__343962873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_RequireEncryptionResult(): EasRequireEncryptionResult? {
      val fnPtr = _343962873_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasRequireEncryptionResult>()
      val hr = fn.invokeHR(arrayOf(__343962873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasRequireEncryptionResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinPasswordLengthResult(): EasMinPasswordLengthResult? {
      val fnPtr = _343962873_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasMinPasswordLengthResult>()
      val hr = fn.invokeHR(arrayOf(__343962873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasMinPasswordLengthResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DisallowConvenienceLogonResult(): EasDisallowConvenienceLogonResult? {
      val fnPtr = _343962873_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasDisallowConvenienceLogonResult>()
      val hr = fn.invokeHR(arrayOf(__343962873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasDisallowConvenienceLogonResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MinPasswordComplexCharactersResult():
        EasMinPasswordComplexCharactersResult? {
      val fnPtr = _343962873_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasMinPasswordComplexCharactersResult>()
      val hr = fn.invokeHR(arrayOf(__343962873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasMinPasswordComplexCharactersResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PasswordExpirationResult(): EasPasswordExpirationResult? {
      val fnPtr = _343962873_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasPasswordExpirationResult>()
      val hr = fn.invokeHR(arrayOf(__343962873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasPasswordExpirationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PasswordHistoryResult(): EasPasswordHistoryResult? {
      val fnPtr = _343962873_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasPasswordHistoryResult>()
      val hr = fn.invokeHR(arrayOf(__343962873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasPasswordHistoryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_MaxPasswordFailedAttemptsResult(): EasMaxPasswordFailedAttemptsResult? {
      val fnPtr = _343962873_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasMaxPasswordFailedAttemptsResult>()
      val hr = fn.invokeHR(arrayOf(__343962873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasMaxPasswordFailedAttemptsResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_MaxInactivityTimeLockResult(): EasMaxInactivityTimeLockResult? {
      val fnPtr = _343962873_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasMaxInactivityTimeLockResult>()
      val hr = fn.invokeHR(arrayOf(__343962873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasMaxInactivityTimeLockResult>(result.getValue())
      return resultValue
    }
  }

  public class IEasComplianceResults_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __343962873_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEasComplianceResults, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("463c299c7f194c66b403cb45dd57a2b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEasComplianceResults(ptr: Pointer?): WithDefault =
        IEasComplianceResults_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEasComplianceResults {
      val address = segment.toRawLongValue()
      return makeIEasComplianceResults(Pointer(address))
    }

    public override fun toNative(obj: IEasComplianceResults): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__343962873_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEasComplianceResults): Array<IEasComplianceResults?> =
        (elements as
        Array<IEasComplianceResults?>).castToImpl<IEasComplianceResults,IEasComplianceResults_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEasComplianceResults?> =
        arrayOfNulls<IEasComplianceResults_Impl>(size) as Array<IEasComplianceResults?>
  }
}
