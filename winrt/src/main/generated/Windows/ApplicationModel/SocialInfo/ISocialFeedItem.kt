package Windows.ApplicationModel.SocialInfo

import Windows.Foundation.Collections.IVector
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISocialFeedItem.ABI::class)
@Signature("{4f1392ab-1f72-4d33-b695-de3e1db60317}")
@Guid("4f1392ab1f724d33b695de3e1db60317")
@WinRTInterface("4f1392ab1f724d33b695de3e1db60317")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocialFeedItem.ByReference::class)
public interface ISocialFeedItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Author(): SocialUserInfo?

  @InterfaceMethod(1)
  public fun get_PrimaryContent(): SocialFeedContent?

  @InterfaceMethod(2)
  public fun get_SecondaryContent(): SocialFeedContent?

  @InterfaceMethod(3)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(4)
  public fun put_Timestamp(value: DateTime?): Unit

  @InterfaceMethod(5)
  public fun get_TargetUri(): Uri?

  @InterfaceMethod(6)
  public fun put_TargetUri(value: Uri?): Unit

  @InterfaceMethod(7)
  public fun get_Thumbnails(): IVector<SocialItemThumbnail?>?

  @InterfaceMethod(8)
  public fun get_SharedItem(): SocialFeedSharedItem?

  @InterfaceMethod(9)
  public fun put_SharedItem(value: SocialFeedSharedItem?): Unit

  @InterfaceMethod(10)
  public fun get_BadgeStyle(): SocialItemBadgeStyle?

  @InterfaceMethod(11)
  public fun put_BadgeStyle(value: SocialItemBadgeStyle?): Unit

  @InterfaceMethod(12)
  public fun get_BadgeCountValue(): Int

  @InterfaceMethod(13)
  public fun put_BadgeCountValue(value: Int): Unit

  @InterfaceMethod(14)
  public fun get_RemoteId(): String?

  @InterfaceMethod(15)
  public fun put_RemoteId(value: String?): Unit

  @InterfaceMethod(16)
  public fun get_ChildItem(): SocialFeedChildItem?

  @InterfaceMethod(17)
  public fun put_ChildItem(value: SocialFeedChildItem?): Unit

  @InterfaceMethod(18)
  public fun get_Style(): SocialFeedItemStyle?

  @InterfaceMethod(19)
  public fun put_Style(value: SocialFeedItemStyle?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocialFeedItem> {
    public override fun getValue() = ABI.makeISocialFeedItem(pointer.getPointer(0))

    public fun setValue(value: ISocialFeedItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocialFeedItem {
    public val __2022950814_Ptr: Pointer?

    public val _2022950814_VtblPtr: Pointer?
      get() = __2022950814_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Author(): SocialUserInfo? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialUserInfo>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialUserInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PrimaryContent(): SocialFeedContent? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedContent>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SecondaryContent(): SocialFeedContent? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedContent>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Timestamp(value: DateTime?): Unit {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_TargetUri(): Uri? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_TargetUri(value: Uri?): Unit {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Thumbnails(): IVector<SocialItemThumbnail?>? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SocialItemThumbnail?>>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SocialItemThumbnail?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SharedItem(): SocialFeedSharedItem? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedSharedItem>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedSharedItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_SharedItem(value: SocialFeedSharedItem?): Unit {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_BadgeStyle(): SocialItemBadgeStyle? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialItemBadgeStyle>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialItemBadgeStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_BadgeStyle(value: SocialItemBadgeStyle?): Unit {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_BadgeCountValue(): Int {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_BadgeCountValue(value: Int): Unit {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_RemoteId(): String? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_RemoteId(value: String?): Unit {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ChildItem(): SocialFeedChildItem? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedChildItem>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedChildItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ChildItem(value: SocialFeedChildItem?): Unit {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Style(): SocialFeedItemStyle? {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedItemStyle>()
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedItemStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_Style(value: SocialFeedItemStyle?): Unit {
      val fnPtr = _2022950814_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2022950814_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISocialFeedItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2022950814_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocialFeedItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f1392ab1f724d33b695de3e1db60317")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocialFeedItem(ptr: Pointer?): WithDefault = ISocialFeedItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocialFeedItem {
      val address = segment.toRawLongValue()
      return makeISocialFeedItem(Pointer(address))
    }

    public override fun toNative(obj: ISocialFeedItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2022950814_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocialFeedItem): Array<ISocialFeedItem?> = (elements as
        Array<ISocialFeedItem?>).castToImpl<ISocialFeedItem,ISocialFeedItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocialFeedItem?> =
        arrayOfNulls<ISocialFeedItem_Impl>(size) as Array<ISocialFeedItem?>
  }
}
