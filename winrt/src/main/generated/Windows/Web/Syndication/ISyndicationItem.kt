package Windows.Web.Syndication

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.Collections.IVector
import Windows.Foundation.DateTime
import Windows.Foundation.Uri
import Windows.Web.Syndication.ISyndicationNode.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISyndicationItem.ABI::class)
@Signature("{548db883-c384-45c1-8ae8-a378c4ec486c}")
@Guid("548db883c38445c18ae8a378c4ec486c")
@WinRTInterface("548db883c38445c18ae8a378c4ec486c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationItem.ByReference::class)
public interface ISyndicationItem : NativeMapped, IWinRTInterface, ISyndicationNode {
  @InterfaceMethod(0)
  public fun get_Authors(): IVector<SyndicationPerson?>?

  @InterfaceMethod(1)
  public fun get_Categories(): IVector<SyndicationCategory?>?

  @InterfaceMethod(2)
  public fun get_Contributors(): IVector<SyndicationPerson?>?

  @InterfaceMethod(3)
  public fun get_Content(): SyndicationContent?

  @InterfaceMethod(4)
  public fun put_Content(value: SyndicationContent?): Unit

  @InterfaceMethod(5)
  public fun get_Id(): String?

  @InterfaceMethod(6)
  public fun put_Id(value: String?): Unit

  @InterfaceMethod(7)
  public fun get_LastUpdatedTime(): DateTime?

  @InterfaceMethod(8)
  public fun put_LastUpdatedTime(value: DateTime?): Unit

  @InterfaceMethod(9)
  public fun get_Links(): IVector<SyndicationLink?>?

  @InterfaceMethod(10)
  public fun get_PublishedDate(): DateTime?

  @InterfaceMethod(11)
  public fun put_PublishedDate(value: DateTime?): Unit

  @InterfaceMethod(12)
  public fun get_Rights(): ISyndicationText?

  @InterfaceMethod(13)
  public fun put_Rights(value: ISyndicationText?): Unit

  @InterfaceMethod(14)
  public fun get_Source(): SyndicationFeed?

  @InterfaceMethod(15)
  public fun put_Source(value: SyndicationFeed?): Unit

  @InterfaceMethod(16)
  public fun get_Summary(): ISyndicationText?

  @InterfaceMethod(17)
  public fun put_Summary(value: ISyndicationText?): Unit

  @InterfaceMethod(18)
  public fun get_Title(): ISyndicationText?

  @InterfaceMethod(19)
  public fun put_Title(value: ISyndicationText?): Unit

  @InterfaceMethod(20)
  public fun get_CommentsUri(): Uri?

  @InterfaceMethod(21)
  public fun put_CommentsUri(value: Uri?): Unit

  @InterfaceMethod(22)
  public fun get_EditUri(): Uri?

  @InterfaceMethod(23)
  public fun get_EditMediaUri(): Uri?

  @InterfaceMethod(24)
  public fun get_ETag(): String?

  @InterfaceMethod(25)
  public fun get_ItemUri(): Uri?

  @InterfaceMethod(26)
  public fun Load(item: String?): Unit

  @InterfaceMethod(27)
  public fun LoadFromXml(itemDocument: XmlDocument?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationItem> {
    public override fun getValue() = ABI.makeISyndicationItem(pointer.getPointer(0))

    public fun setValue(value: ISyndicationItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationItem, ISyndicationNode.WithDefault {
    public val __1576636733_Ptr: Pointer?

    public val _1576636733_VtblPtr: Pointer?
      get() = __1576636733_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Authors(): IVector<SyndicationPerson?>? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SyndicationPerson?>>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SyndicationPerson?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Categories(): IVector<SyndicationCategory?>? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SyndicationCategory?>>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SyndicationCategory?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Contributors(): IVector<SyndicationPerson?>? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SyndicationPerson?>>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SyndicationPerson?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Content(): SyndicationContent? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationContent>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Content(value: SyndicationContent?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Id(): String? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Id(value: String?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_LastUpdatedTime(): DateTime? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_LastUpdatedTime(value: DateTime?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Links(): IVector<SyndicationLink?>? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SyndicationLink?>>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SyndicationLink?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_PublishedDate(): DateTime? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_PublishedDate(value: DateTime?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Rights(): ISyndicationText? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISyndicationText>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISyndicationText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Rights(value: ISyndicationText?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Source(): SyndicationFeed? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationFeed>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationFeed>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Source(value: SyndicationFeed?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_Summary(): ISyndicationText? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISyndicationText>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISyndicationText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_Summary(value: ISyndicationText?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Title(): ISyndicationText? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISyndicationText>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISyndicationText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_Title(value: ISyndicationText?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_CommentsUri(): Uri? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_CommentsUri(value: Uri?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_EditUri(): Uri? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_EditMediaUri(): Uri? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_ETag(): String? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_ItemUri(): Uri? {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun Load(item: String?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(item),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun LoadFromXml(itemDocument: XmlDocument?): Unit {
      val fnPtr = _1576636733_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576636733_Ptr, marshalToNative(itemDocument),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISyndicationItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISyndicationNode {
    public override val __1576492622_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1576636733_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1576636733_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("548db883c38445c18ae8a378c4ec486c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationItem(ptr: Pointer?): WithDefault = ISyndicationItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationItem {
      val address = segment.toRawLongValue()
      return makeISyndicationItem(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1576636733_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationItem): Array<ISyndicationItem?> = (elements as
        Array<ISyndicationItem?>).castToImpl<ISyndicationItem,ISyndicationItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationItem?> =
        arrayOfNulls<ISyndicationItem_Impl>(size) as Array<ISyndicationItem?>
  }
}
