package Windows.Devices.Printers

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.DateTime
import Windows.Foundation.Uri
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(IppAttributeValue.ABI::class)
@Signature("rc(Windows.Devices.Printers.IppAttributeValue;{99407fed-e2bb-59a3-988b-28a974052a26})")
@WinRTByReference(brClass = IppAttributeValue.ByReference::class)
public class IppAttributeValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIppAttributeValue.WithDefault, IWinRTObject {
  private val __165194198_Interface: IIppAttributeValue.WithDefault by lazy {
    as_165194198()
  }


  public override val __165194198_Ptr: JNAPointer? by lazy {
    __165194198_Interface.__165194198_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__165194198_Interface)

  private fun as_165194198(): IIppAttributeValue.WithDefault {
    if(pointer == NULL) {
      return(IIppAttributeValue.ABI.makeIIppAttributeValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIppAttributeValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIppAttributeValue.ABI.makeIIppAttributeValue(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IppAttributeValue> {
    public override fun getValue() = IppAttributeValue(pointer.getPointer(0))

    public fun setValue(value: IppAttributeValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IppAttributeValue, MemoryAddress> {
    public val IIppAttributeValueStatics_Instance: IIppAttributeValueStatics by lazy {
      createIIppAttributeValueStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIppAttributeValueStatics(): IIppAttributeValueStatics {
      val refiid = Guid.REFIID(IIppAttributeValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Printers.IppAttributeValue".toHandle(),refiid,interfacePtr)
      val result = IIppAttributeValueStatics.ABI.makeIIppAttributeValueStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): IppAttributeValue {
      val address = segment.toRawLongValue()
      return IppAttributeValue(Pointer(address))
    }

    public override fun toNative(obj: IppAttributeValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateUnsupported() = ABI.IIppAttributeValueStatics_Instance.CreateUnsupported()

    public fun CreateUnknown() = ABI.IIppAttributeValueStatics_Instance.CreateUnknown()

    public fun CreateNoValue() = ABI.IIppAttributeValueStatics_Instance.CreateNoValue()

    public fun CreateInteger(value: Int) =
        ABI.IIppAttributeValueStatics_Instance.CreateInteger(value)

    public fun CreateIntegerArray(values: IIterable<Int>) =
        ABI.IIppAttributeValueStatics_Instance.CreateIntegerArray(values)

    public fun CreateBoolean(value: Boolean) =
        ABI.IIppAttributeValueStatics_Instance.CreateBoolean(value)

    public fun CreateBooleanArray(values: IIterable<Boolean>) =
        ABI.IIppAttributeValueStatics_Instance.CreateBooleanArray(values)

    public fun CreateEnum(value: Int) = ABI.IIppAttributeValueStatics_Instance.CreateEnum(value)

    public fun CreateEnumArray(values: IIterable<Int>) =
        ABI.IIppAttributeValueStatics_Instance.CreateEnumArray(values)

    public fun CreateOctetString(value: IBuffer) =
        ABI.IIppAttributeValueStatics_Instance.CreateOctetString(value)

    public fun CreateOctetStringArray(values: IIterable<IBuffer?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateOctetStringArray(values)

    public fun CreateDateTime(value: DateTime) =
        ABI.IIppAttributeValueStatics_Instance.CreateDateTime(value)

    public fun CreateDateTimeArray(values: IIterable<DateTime?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateDateTimeArray(values)

    public fun CreateResolution(value: IppResolution) =
        ABI.IIppAttributeValueStatics_Instance.CreateResolution(value)

    public fun CreateResolutionArray(values: IIterable<IppResolution?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateResolutionArray(values)

    public fun CreateRangeOfInteger(value: IppIntegerRange) =
        ABI.IIppAttributeValueStatics_Instance.CreateRangeOfInteger(value)

    public fun CreateRangeOfIntegerArray(values: IIterable<IppIntegerRange?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateRangeOfIntegerArray(values)

    public fun CreateCollection(memberAttributes: IIterable<IKeyValuePair<String?,
        IppAttributeValue?>?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateCollection(memberAttributes)

    public
        fun CreateCollectionArray(memberAttributesArray: IIterable<IIterable<IKeyValuePair<String?,
        IppAttributeValue?>?>?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateCollectionArray(memberAttributesArray)

    public fun CreateTextWithLanguage(value: IppTextWithLanguage) =
        ABI.IIppAttributeValueStatics_Instance.CreateTextWithLanguage(value)

    public fun CreateTextWithLanguageArray(values: IIterable<IppTextWithLanguage?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateTextWithLanguageArray(values)

    public fun CreateNameWithLanguage(value: IppTextWithLanguage) =
        ABI.IIppAttributeValueStatics_Instance.CreateNameWithLanguage(value)

    public fun CreateNameWithLanguageArray(values: IIterable<IppTextWithLanguage?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateNameWithLanguageArray(values)

    public fun CreateTextWithoutLanguage(value: String) =
        ABI.IIppAttributeValueStatics_Instance.CreateTextWithoutLanguage(value)

    public fun CreateTextWithoutLanguageArray(values: IIterable<String?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateTextWithoutLanguageArray(values)

    public fun CreateNameWithoutLanguage(value: String) =
        ABI.IIppAttributeValueStatics_Instance.CreateNameWithoutLanguage(value)

    public fun CreateNameWithoutLanguageArray(values: IIterable<String?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateNameWithoutLanguageArray(values)

    public fun CreateKeyword(value: String) =
        ABI.IIppAttributeValueStatics_Instance.CreateKeyword(value)

    public fun CreateKeywordArray(values: IIterable<String?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateKeywordArray(values)

    public fun CreateUri(value: Uri) = ABI.IIppAttributeValueStatics_Instance.CreateUri(value)

    public fun CreateUriArray(values: IIterable<Uri?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateUriArray(values)

    public fun CreateUriSchema(value: String) =
        ABI.IIppAttributeValueStatics_Instance.CreateUriSchema(value)

    public fun CreateUriSchemaArray(values: IIterable<String?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateUriSchemaArray(values)

    public fun CreateCharset(value: String) =
        ABI.IIppAttributeValueStatics_Instance.CreateCharset(value)

    public fun CreateCharsetArray(values: IIterable<String?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateCharsetArray(values)

    public fun CreateNaturalLanguage(value: String) =
        ABI.IIppAttributeValueStatics_Instance.CreateNaturalLanguage(value)

    public fun CreateNaturalLanguageArray(values: IIterable<String?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateNaturalLanguageArray(values)

    public fun CreateMimeMedia(value: String) =
        ABI.IIppAttributeValueStatics_Instance.CreateMimeMedia(value)

    public fun CreateMimeMediaArray(values: IIterable<String?>) =
        ABI.IIppAttributeValueStatics_Instance.CreateMimeMediaArray(values)
  }
}
