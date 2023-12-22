package Windows.Security.ExchangeActiveSyncProvisioning

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEasClientSecurityPolicy.ABI::class)
@Signature("{45b72362-dfba-4a9b-aced-6fe2adcb6420}")
@Guid("45b72362dfba4a9baced6fe2adcb6420")
@WinRTInterface("45b72362dfba4a9baced6fe2adcb6420")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEasClientSecurityPolicy.ByReference::class)
public interface IEasClientSecurityPolicy : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequireEncryption(): Boolean

  @InterfaceMethod(1)
  public fun put_RequireEncryption(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_MinPasswordLength(): Byte

  @InterfaceMethod(3)
  public fun put_MinPasswordLength(value: Byte): Unit

  @InterfaceMethod(4)
  public fun get_DisallowConvenienceLogon(): Boolean

  @InterfaceMethod(5)
  public fun put_DisallowConvenienceLogon(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_MinPasswordComplexCharacters(): Byte

  @InterfaceMethod(7)
  public fun put_MinPasswordComplexCharacters(value: Byte): Unit

  @InterfaceMethod(8)
  public fun get_PasswordExpiration(): TimeSpan?

  @InterfaceMethod(9)
  public fun put_PasswordExpiration(value: TimeSpan?): Unit

  @InterfaceMethod(10)
  public fun get_PasswordHistory(): WinDef.UINT

  @InterfaceMethod(11)
  public fun put_PasswordHistory(value: WinDef.UINT): Unit

  @InterfaceMethod(12)
  public fun get_MaxPasswordFailedAttempts(): Byte

  @InterfaceMethod(13)
  public fun put_MaxPasswordFailedAttempts(value: Byte): Unit

  @InterfaceMethod(14)
  public fun get_MaxInactivityTimeLock(): TimeSpan?

  @InterfaceMethod(15)
  public fun put_MaxInactivityTimeLock(value: TimeSpan?): Unit

  @InterfaceMethod(16)
  public fun CheckCompliance(): EasComplianceResults?

  @InterfaceMethod(17)
  public fun ApplyAsync(): IAsyncOperation<EasComplianceResults?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEasClientSecurityPolicy> {
    public override fun getValue() = ABI.makeIEasClientSecurityPolicy(pointer.getPointer(0))

    public fun setValue(value: IEasClientSecurityPolicy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEasClientSecurityPolicy {
    public val __186419489_Ptr: Pointer?

    public val _186419489_VtblPtr: Pointer?
      get() = __186419489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequireEncryption(): Boolean {
      val fnPtr = _186419489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_RequireEncryption(value: Boolean): Unit {
      val fnPtr = _186419489_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MinPasswordLength(): Byte {
      val fnPtr = _186419489_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MinPasswordLength(value: Byte): Unit {
      val fnPtr = _186419489_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DisallowConvenienceLogon(): Boolean {
      val fnPtr = _186419489_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DisallowConvenienceLogon(value: Boolean): Unit {
      val fnPtr = _186419489_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MinPasswordComplexCharacters(): Byte {
      val fnPtr = _186419489_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_MinPasswordComplexCharacters(value: Byte): Unit {
      val fnPtr = _186419489_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PasswordExpiration(): TimeSpan? {
      val fnPtr = _186419489_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_PasswordExpiration(value: TimeSpan?): Unit {
      val fnPtr = _186419489_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_PasswordHistory(): WinDef.UINT {
      val fnPtr = _186419489_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_PasswordHistory(value: WinDef.UINT): Unit {
      val fnPtr = _186419489_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_MaxPasswordFailedAttempts(): Byte {
      val fnPtr = _186419489_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_MaxPasswordFailedAttempts(value: Byte): Unit {
      val fnPtr = _186419489_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_MaxInactivityTimeLock(): TimeSpan? {
      val fnPtr = _186419489_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_MaxInactivityTimeLock(value: TimeSpan?): Unit {
      val fnPtr = _186419489_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun CheckCompliance(): EasComplianceResults? {
      val fnPtr = _186419489_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasComplianceResults>()
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasComplianceResults>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun ApplyAsync(): IAsyncOperation<EasComplianceResults?>? {
      val fnPtr = _186419489_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EasComplianceResults?>>()
      val hr = fn.invokeHR(arrayOf(__186419489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<EasComplianceResults?>>(result.getValue())
      return resultValue
    }
  }

  public class IEasClientSecurityPolicy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __186419489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEasClientSecurityPolicy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45b72362dfba4a9baced6fe2adcb6420")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEasClientSecurityPolicy(ptr: Pointer?): WithDefault =
        IEasClientSecurityPolicy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEasClientSecurityPolicy {
      val address = segment.toRawLongValue()
      return makeIEasClientSecurityPolicy(Pointer(address))
    }

    public override fun toNative(obj: IEasClientSecurityPolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__186419489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEasClientSecurityPolicy):
        Array<IEasClientSecurityPolicy?> = (elements as
        Array<IEasClientSecurityPolicy?>).castToImpl<IEasClientSecurityPolicy,IEasClientSecurityPolicy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEasClientSecurityPolicy?> =
        arrayOfNulls<IEasClientSecurityPolicy_Impl>(size) as Array<IEasClientSecurityPolicy?>
  }
}
