package Windows.Globalization.PhoneNumberFormatting

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneNumberFormatterStatics.ABI::class)
@Signature("{5ca6f931-84d9-414b-ab4e-a0552c878602}")
@Guid("5ca6f93184d9414bab4ea0552c878602")
@WinRTInterface("5ca6f93184d9414bab4ea0552c878602")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneNumberFormatterStatics.ByReference::class)
public interface IPhoneNumberFormatterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreate(regionCode: String?,
      phoneNumber: Windows.Globalization.PhoneNumberFormatting.PhoneNumberFormatter.ByReference?):
      Unit

  @InterfaceMethod(1)
  public fun GetCountryCodeForRegion(regionCode: String?): Int

  @InterfaceMethod(2)
  public fun GetNationalDirectDialingPrefixForRegion(regionCode: String?, stripNonDigit: Boolean):
      String?

  @InterfaceMethod(3)
  public fun WrapWithLeftToRightMarkers(number: String?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneNumberFormatterStatics> {
    public override fun getValue() = ABI.makeIPhoneNumberFormatterStatics(pointer.getPointer(0))

    public fun setValue(value: IPhoneNumberFormatterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneNumberFormatterStatics {
    public val __1012831219_Ptr: Pointer?

    public val _1012831219_VtblPtr: Pointer?
      get() = __1012831219_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreate(regionCode: String?,
        phoneNumber: Windows.Globalization.PhoneNumberFormatting.PhoneNumberFormatter.ByReference?):
        Unit {
      val fnPtr = _1012831219_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012831219_Ptr, marshalToNative(regionCode),
          marshalToNative(phoneNumber),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetCountryCodeForRegion(regionCode: String?): Int {
      val fnPtr = _1012831219_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1012831219_Ptr, marshalToNative(regionCode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetNationalDirectDialingPrefixForRegion(regionCode: String?,
        stripNonDigit: Boolean): String? {
      val fnPtr = _1012831219_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1012831219_Ptr, marshalToNative(regionCode), stripNonDigit,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun WrapWithLeftToRightMarkers(number: String?): String? {
      val fnPtr = _1012831219_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1012831219_Ptr, marshalToNative(number), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneNumberFormatterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1012831219_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneNumberFormatterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ca6f93184d9414bab4ea0552c878602")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneNumberFormatterStatics(ptr: Pointer?): WithDefault =
        IPhoneNumberFormatterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneNumberFormatterStatics {
      val address = segment.toRawLongValue()
      return makeIPhoneNumberFormatterStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhoneNumberFormatterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1012831219_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneNumberFormatterStatics):
        Array<IPhoneNumberFormatterStatics?> = (elements as
        Array<IPhoneNumberFormatterStatics?>).castToImpl<IPhoneNumberFormatterStatics,IPhoneNumberFormatterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneNumberFormatterStatics?> =
        arrayOfNulls<IPhoneNumberFormatterStatics_Impl>(size) as
        Array<IPhoneNumberFormatterStatics?>
  }
}
