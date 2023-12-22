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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneNumberInfo.ABI::class)
@Signature("{1c7ce4dd-c8b4-4ea3-9aef-b342e2c5b417}")
@Guid("1c7ce4ddc8b44ea39aefb342e2c5b417")
@WinRTInterface("1c7ce4ddc8b44ea39aefb342e2c5b417")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneNumberInfo.ByReference::class)
public interface IPhoneNumberInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CountryCode(): Int

  @InterfaceMethod(1)
  public fun get_PhoneNumber(): String?

  @InterfaceMethod(2)
  public fun GetLengthOfGeographicalAreaCode(): Int

  @InterfaceMethod(3)
  public fun GetNationalSignificantNumber(): String?

  @InterfaceMethod(4)
  public fun GetLengthOfNationalDestinationCode(): Int

  @InterfaceMethod(5)
  public fun PredictNumberKind(): PredictedPhoneNumberKind?

  @InterfaceMethod(6)
  public fun GetGeographicRegionCode(): String?

  @InterfaceMethod(7)
  public fun CheckNumberMatch(otherNumber: PhoneNumberInfo?): PhoneNumberMatchResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneNumberInfo> {
    public override fun getValue() = ABI.makeIPhoneNumberInfo(pointer.getPointer(0))

    public fun setValue(value: IPhoneNumberInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneNumberInfo {
    public val __635640864_Ptr: Pointer?

    public val _635640864_VtblPtr: Pointer?
      get() = __635640864_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CountryCode(): Int {
      val fnPtr = _635640864_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__635640864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_PhoneNumber(): String? {
      val fnPtr = _635640864_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__635640864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetLengthOfGeographicalAreaCode(): Int {
      val fnPtr = _635640864_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__635640864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun GetNationalSignificantNumber(): String? {
      val fnPtr = _635640864_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__635640864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetLengthOfNationalDestinationCode(): Int {
      val fnPtr = _635640864_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__635640864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun PredictNumberKind(): PredictedPhoneNumberKind? {
      val fnPtr = _635640864_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PredictedPhoneNumberKind>()
      val hr = fn.invokeHR(arrayOf(__635640864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PredictedPhoneNumberKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetGeographicRegionCode(): String? {
      val fnPtr = _635640864_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__635640864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CheckNumberMatch(otherNumber: PhoneNumberInfo?): PhoneNumberMatchResult? {
      val fnPtr = _635640864_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneNumberMatchResult>()
      val hr = fn.invokeHR(arrayOf(__635640864_Ptr, marshalToNative(otherNumber), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneNumberMatchResult>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneNumberInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __635640864_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneNumberInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c7ce4ddc8b44ea39aefb342e2c5b417")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneNumberInfo(ptr: Pointer?): WithDefault = IPhoneNumberInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneNumberInfo {
      val address = segment.toRawLongValue()
      return makeIPhoneNumberInfo(Pointer(address))
    }

    public override fun toNative(obj: IPhoneNumberInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__635640864_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneNumberInfo): Array<IPhoneNumberInfo?> = (elements as
        Array<IPhoneNumberInfo?>).castToImpl<IPhoneNumberInfo,IPhoneNumberInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneNumberInfo?> =
        arrayOfNulls<IPhoneNumberInfo_Impl>(size) as Array<IPhoneNumberInfo?>
  }
}
