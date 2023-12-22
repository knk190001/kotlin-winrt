package Windows.Devices.Sms

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ISmsMessageRegistrationStatics.ABI::class)
@Signature("{63a05464-2898-4778-a03c-6f994907d63a}")
@Guid("63a0546428984778a03c6f994907d63a")
@WinRTInterface("63a0546428984778a03c6f994907d63a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsMessageRegistrationStatics.ByReference::class)
public interface ISmsMessageRegistrationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllRegistrations(): IVectorView<SmsMessageRegistration?>?

  @InterfaceMethod(1)
  public fun Register(id: String?, filterRules: SmsFilterRules?): SmsMessageRegistration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsMessageRegistrationStatics> {
    public override fun getValue() = ABI.makeISmsMessageRegistrationStatics(pointer.getPointer(0))

    public fun setValue(value: ISmsMessageRegistrationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsMessageRegistrationStatics {
    public val __532261262_Ptr: Pointer?

    public val _532261262_VtblPtr: Pointer?
      get() = __532261262_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllRegistrations(): IVectorView<SmsMessageRegistration?>? {
      val fnPtr = _532261262_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SmsMessageRegistration?>>()
      val hr = fn.invokeHR(arrayOf(__532261262_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<SmsMessageRegistration?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Register(id: String?, filterRules: SmsFilterRules?):
        SmsMessageRegistration? {
      val fnPtr = _532261262_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsMessageRegistration>()
      val hr = fn.invokeHR(arrayOf(__532261262_Ptr, marshalToNative(id),
          marshalToNative(filterRules), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsMessageRegistration>(result.getValue())
      return resultValue
    }
  }

  public class ISmsMessageRegistrationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __532261262_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsMessageRegistrationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63a0546428984778a03c6f994907d63a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsMessageRegistrationStatics(ptr: Pointer?): WithDefault =
        ISmsMessageRegistrationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsMessageRegistrationStatics {
      val address = segment.toRawLongValue()
      return makeISmsMessageRegistrationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISmsMessageRegistrationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__532261262_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsMessageRegistrationStatics):
        Array<ISmsMessageRegistrationStatics?> = (elements as
        Array<ISmsMessageRegistrationStatics?>).castToImpl<ISmsMessageRegistrationStatics,ISmsMessageRegistrationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsMessageRegistrationStatics?> =
        arrayOfNulls<ISmsMessageRegistrationStatics_Impl>(size) as
        Array<ISmsMessageRegistrationStatics?>
  }
}
