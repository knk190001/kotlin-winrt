package Windows.ApplicationModel.SocialInfo

import Windows.Foundation.DateTime
import Windows.Foundation.Uri
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISocialFeedSharedItem.ABI::class)
@Signature("{7bfb9e40-a6aa-45a7-9ff6-54c42105dd1f}")
@Guid("7bfb9e40a6aa45a79ff654c42105dd1f")
@WinRTInterface("7bfb9e40a6aa45a79ff654c42105dd1f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocialFeedSharedItem.ByReference::class)
public interface ISocialFeedSharedItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OriginalSource(): Uri?

  @InterfaceMethod(1)
  public fun put_OriginalSource(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_Content(): SocialFeedContent?

  @InterfaceMethod(3)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(4)
  public fun put_Timestamp(value: DateTime?): Unit

  @InterfaceMethod(5)
  public fun get_TargetUri(): Uri?

  @InterfaceMethod(6)
  public fun put_TargetUri(value: Uri?): Unit

  @InterfaceMethod(7)
  public fun put_Thumbnail(value: SocialItemThumbnail?): Unit

  @InterfaceMethod(8)
  public fun get_Thumbnail(): SocialItemThumbnail?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocialFeedSharedItem> {
    public override fun getValue() = ABI.makeISocialFeedSharedItem(pointer.getPointer(0))

    public fun setValue(value: ISocialFeedSharedItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocialFeedSharedItem {
    public val __1775884505_Ptr: Pointer?

    public val _1775884505_VtblPtr: Pointer?
      get() = __1775884505_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OriginalSource(): Uri? {
      val fnPtr = _1775884505_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1775884505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_OriginalSource(value: Uri?): Unit {
      val fnPtr = _1775884505_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1775884505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Content(): SocialFeedContent? {
      val fnPtr = _1775884505_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedContent>()
      val hr = fn.invokeHR(arrayOf(__1775884505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1775884505_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1775884505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Timestamp(value: DateTime?): Unit {
      val fnPtr = _1775884505_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1775884505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_TargetUri(): Uri? {
      val fnPtr = _1775884505_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1775884505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_TargetUri(value: Uri?): Unit {
      val fnPtr = _1775884505_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1775884505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun put_Thumbnail(value: SocialItemThumbnail?): Unit {
      val fnPtr = _1775884505_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1775884505_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Thumbnail(): SocialItemThumbnail? {
      val fnPtr = _1775884505_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialItemThumbnail>()
      val hr = fn.invokeHR(arrayOf(__1775884505_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialItemThumbnail>(result.getValue())
      return resultValue
    }
  }

  public class ISocialFeedSharedItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1775884505_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocialFeedSharedItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7bfb9e40a6aa45a79ff654c42105dd1f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocialFeedSharedItem(ptr: Pointer?): WithDefault =
        ISocialFeedSharedItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocialFeedSharedItem {
      val address = segment.toRawLongValue()
      return makeISocialFeedSharedItem(Pointer(address))
    }

    public override fun toNative(obj: ISocialFeedSharedItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1775884505_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocialFeedSharedItem): Array<ISocialFeedSharedItem?> =
        (elements as
        Array<ISocialFeedSharedItem?>).castToImpl<ISocialFeedSharedItem,ISocialFeedSharedItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocialFeedSharedItem?> =
        arrayOfNulls<ISocialFeedSharedItem_Impl>(size) as Array<ISocialFeedSharedItem?>
  }
}
