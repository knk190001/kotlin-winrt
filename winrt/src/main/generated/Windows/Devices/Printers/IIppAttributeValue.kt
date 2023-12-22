package Windows.Devices.Printers

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVector
import Windows.Foundation.DateTime
import Windows.Foundation.Uri
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IIppAttributeValue.ABI::class)
@Signature("{99407fed-e2bb-59a3-988b-28a974052a26}")
@Guid("99407fede2bb59a3988b28a974052a26")
@WinRTInterface("99407fede2bb59a3988b28a974052a26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIppAttributeValue.ByReference::class)
public interface IIppAttributeValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): IppAttributeValueKind?

  @InterfaceMethod(1)
  public fun GetIntegerArray(): IVector<Int>?

  @InterfaceMethod(2)
  public fun GetBooleanArray(): IVector<Boolean>?

  @InterfaceMethod(3)
  public fun GetEnumArray(): IVector<Int>?

  @InterfaceMethod(4)
  public fun GetOctetStringArray(): IVector<IBuffer?>?

  @InterfaceMethod(5)
  public fun GetDateTimeArray(): IVector<DateTime?>?

  @InterfaceMethod(6)
  public fun GetResolutionArray(): IVector<IppResolution?>?

  @InterfaceMethod(7)
  public fun GetRangeOfIntegerArray(): IVector<IppIntegerRange?>?

  @InterfaceMethod(8)
  public fun GetCollectionArray(): IVector<IMapView<String?, IppAttributeValue?>?>?

  @InterfaceMethod(9)
  public fun GetTextWithLanguageArray(): IVector<IppTextWithLanguage?>?

  @InterfaceMethod(10)
  public fun GetNameWithLanguageArray(): IVector<IppTextWithLanguage?>?

  @InterfaceMethod(11)
  public fun GetTextWithoutLanguageArray(): IVector<String?>?

  @InterfaceMethod(12)
  public fun GetNameWithoutLanguageArray(): IVector<String?>?

  @InterfaceMethod(13)
  public fun GetKeywordArray(): IVector<String?>?

  @InterfaceMethod(14)
  public fun GetUriArray(): IVector<Uri?>?

  @InterfaceMethod(15)
  public fun GetUriSchemaArray(): IVector<String?>?

  @InterfaceMethod(16)
  public fun GetCharsetArray(): IVector<String?>?

  @InterfaceMethod(17)
  public fun GetNaturalLanguageArray(): IVector<String?>?

  @InterfaceMethod(18)
  public fun GetMimeMediaTypeArray(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIppAttributeValue> {
    public override fun getValue() = ABI.makeIIppAttributeValue(pointer.getPointer(0))

    public fun setValue(value: IIppAttributeValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIppAttributeValue {
    public val __165194198_Ptr: Pointer?

    public val _165194198_VtblPtr: Pointer?
      get() = __165194198_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): IppAttributeValueKind? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValueKind>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValueKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetIntegerArray(): IVector<Int>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Int>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetBooleanArray(): IVector<Boolean>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetEnumArray(): IVector<Int>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Int>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetOctetStringArray(): IVector<IBuffer?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetDateTimeArray(): IVector<DateTime?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetResolutionArray(): IVector<IppResolution?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IppResolution?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IppResolution?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetRangeOfIntegerArray(): IVector<IppIntegerRange?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IppIntegerRange?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IppIntegerRange?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetCollectionArray(): IVector<IMapView<String?, IppAttributeValue?>?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IMapView<String?, IppAttributeValue?>?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IMapView<String?,
          IppAttributeValue?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetTextWithLanguageArray(): IVector<IppTextWithLanguage?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IppTextWithLanguage?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IppTextWithLanguage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetNameWithLanguageArray(): IVector<IppTextWithLanguage?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IppTextWithLanguage?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IppTextWithLanguage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetTextWithoutLanguageArray(): IVector<String?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetNameWithoutLanguageArray(): IVector<String?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetKeywordArray(): IVector<String?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun GetUriArray(): IVector<Uri?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun GetUriSchemaArray(): IVector<String?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetCharsetArray(): IVector<String?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun GetNaturalLanguageArray(): IVector<String?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun GetMimeMediaTypeArray(): IVector<String?>? {
      val fnPtr = _165194198_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__165194198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IIppAttributeValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __165194198_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIppAttributeValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("99407fede2bb59a3988b28a974052a26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIppAttributeValue(ptr: Pointer?): WithDefault = IIppAttributeValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIppAttributeValue {
      val address = segment.toRawLongValue()
      return makeIIppAttributeValue(Pointer(address))
    }

    public override fun toNative(obj: IIppAttributeValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__165194198_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIppAttributeValue): Array<IIppAttributeValue?> =
        (elements as
        Array<IIppAttributeValue?>).castToImpl<IIppAttributeValue,IIppAttributeValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIppAttributeValue?> =
        arrayOfNulls<IIppAttributeValue_Impl>(size) as Array<IIppAttributeValue?>
  }
}
