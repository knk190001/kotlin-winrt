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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISocialFeedChildItem.ABI::class)
@Signature("{0b6a985a-d59d-40be-980c-488a2ab30a83}")
@Guid("0b6a985ad59d40be980c488a2ab30a83")
@WinRTInterface("0b6a985ad59d40be980c488a2ab30a83")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocialFeedChildItem.ByReference::class)
public interface ISocialFeedChildItem : NativeMapped, IWinRTInterface {
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocialFeedChildItem> {
    public override fun getValue() = ABI.makeISocialFeedChildItem(pointer.getPointer(0))

    public fun setValue(value: ISocialFeedChildItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocialFeedChildItem {
    public val __233754016_Ptr: Pointer?

    public val _233754016_VtblPtr: Pointer?
      get() = __233754016_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Author(): SocialUserInfo? {
      val fnPtr = _233754016_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialUserInfo>()
      val hr = fn.invokeHR(arrayOf(__233754016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialUserInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PrimaryContent(): SocialFeedContent? {
      val fnPtr = _233754016_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedContent>()
      val hr = fn.invokeHR(arrayOf(__233754016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SecondaryContent(): SocialFeedContent? {
      val fnPtr = _233754016_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedContent>()
      val hr = fn.invokeHR(arrayOf(__233754016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _233754016_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__233754016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Timestamp(value: DateTime?): Unit {
      val fnPtr = _233754016_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__233754016_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_TargetUri(): Uri? {
      val fnPtr = _233754016_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__233754016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_TargetUri(value: Uri?): Unit {
      val fnPtr = _233754016_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__233754016_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Thumbnails(): IVector<SocialItemThumbnail?>? {
      val fnPtr = _233754016_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SocialItemThumbnail?>>()
      val hr = fn.invokeHR(arrayOf(__233754016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SocialItemThumbnail?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_SharedItem(): SocialFeedSharedItem? {
      val fnPtr = _233754016_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedSharedItem>()
      val hr = fn.invokeHR(arrayOf(__233754016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedSharedItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_SharedItem(value: SocialFeedSharedItem?): Unit {
      val fnPtr = _233754016_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__233754016_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISocialFeedChildItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __233754016_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocialFeedChildItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b6a985ad59d40be980c488a2ab30a83")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocialFeedChildItem(ptr: Pointer?): WithDefault = ISocialFeedChildItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocialFeedChildItem {
      val address = segment.toRawLongValue()
      return makeISocialFeedChildItem(Pointer(address))
    }

    public override fun toNative(obj: ISocialFeedChildItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__233754016_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocialFeedChildItem): Array<ISocialFeedChildItem?> =
        (elements as
        Array<ISocialFeedChildItem?>).castToImpl<ISocialFeedChildItem,ISocialFeedChildItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocialFeedChildItem?> =
        arrayOfNulls<ISocialFeedChildItem_Impl>(size) as Array<ISocialFeedChildItem?>
  }
}
