package Windows.Devices.Printers

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
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

@ABIMarker(IIppAttributeValueStatics.ABI::class)
@Signature("{10d43942-dd94-5998-b235-afafb6fa7935}")
@Guid("10d43942dd945998b235afafb6fa7935")
@WinRTInterface("10d43942dd945998b235afafb6fa7935")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIppAttributeValueStatics.ByReference::class)
public interface IIppAttributeValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateUnsupported(): IppAttributeValue?

  @InterfaceMethod(1)
  public fun CreateUnknown(): IppAttributeValue?

  @InterfaceMethod(2)
  public fun CreateNoValue(): IppAttributeValue?

  @InterfaceMethod(3)
  public fun CreateInteger(value: Int): IppAttributeValue?

  @InterfaceMethod(4)
  public fun CreateIntegerArray(values: IIterable<Int>?): IppAttributeValue?

  @InterfaceMethod(5)
  public fun CreateBoolean(value: Boolean): IppAttributeValue?

  @InterfaceMethod(6)
  public fun CreateBooleanArray(values: IIterable<Boolean>?): IppAttributeValue?

  @InterfaceMethod(7)
  public fun CreateEnum(value: Int): IppAttributeValue?

  @InterfaceMethod(8)
  public fun CreateEnumArray(values: IIterable<Int>?): IppAttributeValue?

  @InterfaceMethod(9)
  public fun CreateOctetString(value: IBuffer?): IppAttributeValue?

  @InterfaceMethod(10)
  public fun CreateOctetStringArray(values: IIterable<IBuffer?>?): IppAttributeValue?

  @InterfaceMethod(11)
  public fun CreateDateTime(value: DateTime?): IppAttributeValue?

  @InterfaceMethod(12)
  public fun CreateDateTimeArray(values: IIterable<DateTime?>?): IppAttributeValue?

  @InterfaceMethod(13)
  public fun CreateResolution(value: IppResolution?): IppAttributeValue?

  @InterfaceMethod(14)
  public fun CreateResolutionArray(values: IIterable<IppResolution?>?): IppAttributeValue?

  @InterfaceMethod(15)
  public fun CreateRangeOfInteger(value: IppIntegerRange?): IppAttributeValue?

  @InterfaceMethod(16)
  public fun CreateRangeOfIntegerArray(values: IIterable<IppIntegerRange?>?): IppAttributeValue?

  @InterfaceMethod(17)
  public fun CreateCollection(memberAttributes: IIterable<IKeyValuePair<String?,
      IppAttributeValue?>?>?): IppAttributeValue?

  @InterfaceMethod(18)
  public fun CreateCollectionArray(memberAttributesArray: IIterable<IIterable<IKeyValuePair<String?,
      IppAttributeValue?>?>?>?): IppAttributeValue?

  @InterfaceMethod(19)
  public fun CreateTextWithLanguage(value: IppTextWithLanguage?): IppAttributeValue?

  @InterfaceMethod(20)
  public fun CreateTextWithLanguageArray(values: IIterable<IppTextWithLanguage?>?):
      IppAttributeValue?

  @InterfaceMethod(21)
  public fun CreateNameWithLanguage(value: IppTextWithLanguage?): IppAttributeValue?

  @InterfaceMethod(22)
  public fun CreateNameWithLanguageArray(values: IIterable<IppTextWithLanguage?>?):
      IppAttributeValue?

  @InterfaceMethod(23)
  public fun CreateTextWithoutLanguage(value: String?): IppAttributeValue?

  @InterfaceMethod(24)
  public fun CreateTextWithoutLanguageArray(values: IIterable<String?>?): IppAttributeValue?

  @InterfaceMethod(25)
  public fun CreateNameWithoutLanguage(value: String?): IppAttributeValue?

  @InterfaceMethod(26)
  public fun CreateNameWithoutLanguageArray(values: IIterable<String?>?): IppAttributeValue?

  @InterfaceMethod(27)
  public fun CreateKeyword(value: String?): IppAttributeValue?

  @InterfaceMethod(28)
  public fun CreateKeywordArray(values: IIterable<String?>?): IppAttributeValue?

  @InterfaceMethod(29)
  public fun CreateUri(value: Uri?): IppAttributeValue?

  @InterfaceMethod(30)
  public fun CreateUriArray(values: IIterable<Uri?>?): IppAttributeValue?

  @InterfaceMethod(31)
  public fun CreateUriSchema(value: String?): IppAttributeValue?

  @InterfaceMethod(32)
  public fun CreateUriSchemaArray(values: IIterable<String?>?): IppAttributeValue?

  @InterfaceMethod(33)
  public fun CreateCharset(value: String?): IppAttributeValue?

  @InterfaceMethod(34)
  public fun CreateCharsetArray(values: IIterable<String?>?): IppAttributeValue?

  @InterfaceMethod(35)
  public fun CreateNaturalLanguage(value: String?): IppAttributeValue?

  @InterfaceMethod(36)
  public fun CreateNaturalLanguageArray(values: IIterable<String?>?): IppAttributeValue?

  @InterfaceMethod(37)
  public fun CreateMimeMedia(value: String?): IppAttributeValue?

  @InterfaceMethod(38)
  public fun CreateMimeMediaArray(values: IIterable<String?>?): IppAttributeValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIppAttributeValueStatics> {
    public override fun getValue() = ABI.makeIIppAttributeValueStatics(pointer.getPointer(0))

    public fun setValue(value: IIppAttributeValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIppAttributeValueStatics {
    public val __1037967813_Ptr: Pointer?

    public val _1037967813_VtblPtr: Pointer?
      get() = __1037967813_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateUnsupported(): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateUnknown(): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateNoValue(): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateInteger(value: Int): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateIntegerArray(values: IIterable<Int>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateBoolean(value: Boolean): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateBooleanArray(values: IIterable<Boolean>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateEnum(value: Int): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateEnumArray(values: IIterable<Int>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateOctetString(value: IBuffer?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateOctetStringArray(values: IIterable<IBuffer?>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun CreateDateTime(value: DateTime?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun CreateDateTimeArray(values: IIterable<DateTime?>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun CreateResolution(value: IppResolution?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun CreateResolutionArray(values: IIterable<IppResolution?>?):
        IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun CreateRangeOfInteger(value: IppIntegerRange?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun CreateRangeOfIntegerArray(values: IIterable<IppIntegerRange?>?):
        IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun CreateCollection(memberAttributes: IIterable<IKeyValuePair<String?,
        IppAttributeValue?>?>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(memberAttributes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override
        fun CreateCollectionArray(memberAttributesArray: IIterable<IIterable<IKeyValuePair<String?,
        IppAttributeValue?>?>?>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(memberAttributesArray),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun CreateTextWithLanguage(value: IppTextWithLanguage?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun CreateTextWithLanguageArray(values: IIterable<IppTextWithLanguage?>?):
        IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun CreateNameWithLanguage(value: IppTextWithLanguage?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun CreateNameWithLanguageArray(values: IIterable<IppTextWithLanguage?>?):
        IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun CreateTextWithoutLanguage(value: String?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun CreateTextWithoutLanguageArray(values: IIterable<String?>?):
        IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun CreateNameWithoutLanguage(value: String?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun CreateNameWithoutLanguageArray(values: IIterable<String?>?):
        IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun CreateKeyword(value: String?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(28)
    public override fun CreateKeywordArray(values: IIterable<String?>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun CreateUri(value: Uri?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun CreateUriArray(values: IIterable<Uri?>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun CreateUriSchema(value: String?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun CreateUriSchemaArray(values: IIterable<String?>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun CreateCharset(value: String?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(34)
    public override fun CreateCharsetArray(values: IIterable<String?>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun CreateNaturalLanguage(value: String?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun CreateNaturalLanguageArray(values: IIterable<String?>?):
        IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun CreateMimeMedia(value: String?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(38)
    public override fun CreateMimeMediaArray(values: IIterable<String?>?): IppAttributeValue? {
      val fnPtr = _1037967813_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppAttributeValue>()
      val hr = fn.invokeHR(arrayOf(__1037967813_Ptr, marshalToNative(values), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppAttributeValue>(result.getValue())
      return resultValue
    }
  }

  public class IIppAttributeValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1037967813_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIppAttributeValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10d43942dd945998b235afafb6fa7935")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIppAttributeValueStatics(ptr: Pointer?): WithDefault =
        IIppAttributeValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIppAttributeValueStatics {
      val address = segment.toRawLongValue()
      return makeIIppAttributeValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IIppAttributeValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1037967813_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIppAttributeValueStatics):
        Array<IIppAttributeValueStatics?> = (elements as
        Array<IIppAttributeValueStatics?>).castToImpl<IIppAttributeValueStatics,IIppAttributeValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIppAttributeValueStatics?> =
        arrayOfNulls<IIppAttributeValueStatics_Impl>(size) as Array<IIppAttributeValueStatics?>
  }
}
