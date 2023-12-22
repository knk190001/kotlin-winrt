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

@ABIMarker(ISyndicationFeed.ABI::class)
@Signature("{7ffe3cd2-5b66-4d62-8403-1bc10d910d6b}")
@Guid("7ffe3cd25b664d6284031bc10d910d6b")
@WinRTInterface("7ffe3cd25b664d6284031bc10d910d6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationFeed.ByReference::class)
public interface ISyndicationFeed : NativeMapped, IWinRTInterface, ISyndicationNode {
  @InterfaceMethod(0)
  public fun get_Authors(): IVector<SyndicationPerson?>?

  @InterfaceMethod(1)
  public fun get_Categories(): IVector<SyndicationCategory?>?

  @InterfaceMethod(2)
  public fun get_Contributors(): IVector<SyndicationPerson?>?

  @InterfaceMethod(3)
  public fun get_Generator(): SyndicationGenerator?

  @InterfaceMethod(4)
  public fun put_Generator(value: SyndicationGenerator?): Unit

  @InterfaceMethod(5)
  public fun get_IconUri(): Uri?

  @InterfaceMethod(6)
  public fun put_IconUri(value: Uri?): Unit

  @InterfaceMethod(7)
  public fun get_Id(): String?

  @InterfaceMethod(8)
  public fun put_Id(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_Items(): IVector<SyndicationItem?>?

  @InterfaceMethod(10)
  public fun get_LastUpdatedTime(): DateTime?

  @InterfaceMethod(11)
  public fun put_LastUpdatedTime(value: DateTime?): Unit

  @InterfaceMethod(12)
  public fun get_Links(): IVector<SyndicationLink?>?

  @InterfaceMethod(13)
  public fun get_ImageUri(): Uri?

  @InterfaceMethod(14)
  public fun put_ImageUri(value: Uri?): Unit

  @InterfaceMethod(15)
  public fun get_Rights(): ISyndicationText?

  @InterfaceMethod(16)
  public fun put_Rights(value: ISyndicationText?): Unit

  @InterfaceMethod(17)
  public fun get_Subtitle(): ISyndicationText?

  @InterfaceMethod(18)
  public fun put_Subtitle(value: ISyndicationText?): Unit

  @InterfaceMethod(19)
  public fun get_Title(): ISyndicationText?

  @InterfaceMethod(20)
  public fun put_Title(value: ISyndicationText?): Unit

  @InterfaceMethod(21)
  public fun get_FirstUri(): Uri?

  @InterfaceMethod(22)
  public fun get_LastUri(): Uri?

  @InterfaceMethod(23)
  public fun get_NextUri(): Uri?

  @InterfaceMethod(24)
  public fun get_PreviousUri(): Uri?

  @InterfaceMethod(25)
  public fun get_SourceFormat(): SyndicationFormat?

  @InterfaceMethod(26)
  public fun Load(feed: String?): Unit

  @InterfaceMethod(27)
  public fun LoadFromXml(feedDocument: XmlDocument?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationFeed> {
    public override fun getValue() = ABI.makeISyndicationFeed(pointer.getPointer(0))

    public fun setValue(value: ISyndicationFeed_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationFeed, ISyndicationNode.WithDefault {
    public val __1576740530_Ptr: Pointer?

    public val _1576740530_VtblPtr: Pointer?
      get() = __1576740530_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Authors(): IVector<SyndicationPerson?>? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SyndicationPerson?>>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SyndicationPerson?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Categories(): IVector<SyndicationCategory?>? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SyndicationCategory?>>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SyndicationCategory?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Contributors(): IVector<SyndicationPerson?>? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SyndicationPerson?>>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SyndicationPerson?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Generator(): SyndicationGenerator? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationGenerator>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationGenerator>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Generator(value: SyndicationGenerator?): Unit {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IconUri(): Uri? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_IconUri(value: Uri?): Unit {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Id(): String? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Id(value: String?): Unit {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Items(): IVector<SyndicationItem?>? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SyndicationItem?>>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SyndicationItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_LastUpdatedTime(): DateTime? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_LastUpdatedTime(value: DateTime?): Unit {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Links(): IVector<SyndicationLink?>? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SyndicationLink?>>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SyndicationLink?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_ImageUri(): Uri? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_ImageUri(value: Uri?): Unit {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_Rights(): ISyndicationText? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISyndicationText>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISyndicationText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_Rights(value: ISyndicationText?): Unit {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_Subtitle(): ISyndicationText? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISyndicationText>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISyndicationText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_Subtitle(value: ISyndicationText?): Unit {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_Title(): ISyndicationText? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISyndicationText>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISyndicationText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_Title(value: ISyndicationText?): Unit {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_FirstUri(): Uri? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_LastUri(): Uri? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun get_NextUri(): Uri? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_PreviousUri(): Uri? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun get_SourceFormat(): SyndicationFormat? {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationFormat>()
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun Load(feed: String?): Unit {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr, marshalToNative(feed),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun LoadFromXml(feedDocument: XmlDocument?): Unit {
      val fnPtr = _1576740530_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576740530_Ptr, marshalToNative(feedDocument),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISyndicationFeed_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISyndicationNode {
    public override val __1576492622_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1576740530_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1576740530_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationFeed, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ffe3cd25b664d6284031bc10d910d6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationFeed(ptr: Pointer?): WithDefault = ISyndicationFeed_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationFeed {
      val address = segment.toRawLongValue()
      return makeISyndicationFeed(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationFeed): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1576740530_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationFeed): Array<ISyndicationFeed?> = (elements as
        Array<ISyndicationFeed?>).castToImpl<ISyndicationFeed,ISyndicationFeed_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationFeed?> =
        arrayOfNulls<ISyndicationFeed_Impl>(size) as Array<ISyndicationFeed?>
  }
}
