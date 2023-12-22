package Windows.ApplicationModel.SocialInfo.Provider

import Windows.ApplicationModel.SocialInfo.SocialFeedContent
import Windows.ApplicationModel.SocialInfo.SocialItemThumbnail
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
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

@ABIMarker(ISocialDashboardItemUpdater.ABI::class)
@Signature("{3cde9dc9-4800-46cd-869b-1973ec685bde}")
@Guid("3cde9dc9480046cd869b1973ec685bde")
@WinRTInterface("3cde9dc9480046cd869b1973ec685bde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocialDashboardItemUpdater.ByReference::class)
public interface ISocialDashboardItemUpdater : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OwnerRemoteId(): String?

  @InterfaceMethod(1)
  public fun get_Content(): SocialFeedContent?

  @InterfaceMethod(2)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(3)
  public fun put_Timestamp(value: DateTime?): Unit

  @InterfaceMethod(4)
  public fun put_Thumbnail(value: SocialItemThumbnail?): Unit

  @InterfaceMethod(5)
  public fun get_Thumbnail(): SocialItemThumbnail?

  @InterfaceMethod(6)
  public fun CommitAsync(): IAsyncAction?

  @InterfaceMethod(7)
  public fun get_TargetUri(): Uri?

  @InterfaceMethod(8)
  public fun put_TargetUri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocialDashboardItemUpdater> {
    public override fun getValue() = ABI.makeISocialDashboardItemUpdater(pointer.getPointer(0))

    public fun setValue(value: ISocialDashboardItemUpdater_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocialDashboardItemUpdater {
    public val __985636578_Ptr: Pointer?

    public val _985636578_VtblPtr: Pointer?
      get() = __985636578_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OwnerRemoteId(): String? {
      val fnPtr = _985636578_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__985636578_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Content(): SocialFeedContent? {
      val fnPtr = _985636578_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialFeedContent>()
      val hr = fn.invokeHR(arrayOf(__985636578_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialFeedContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _985636578_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__985636578_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Timestamp(value: DateTime?): Unit {
      val fnPtr = _985636578_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985636578_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun put_Thumbnail(value: SocialItemThumbnail?): Unit {
      val fnPtr = _985636578_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985636578_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Thumbnail(): SocialItemThumbnail? {
      val fnPtr = _985636578_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocialItemThumbnail>()
      val hr = fn.invokeHR(arrayOf(__985636578_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocialItemThumbnail>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CommitAsync(): IAsyncAction? {
      val fnPtr = _985636578_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__985636578_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_TargetUri(): Uri? {
      val fnPtr = _985636578_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__985636578_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_TargetUri(value: Uri?): Unit {
      val fnPtr = _985636578_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__985636578_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISocialDashboardItemUpdater_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __985636578_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocialDashboardItemUpdater, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3cde9dc9480046cd869b1973ec685bde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocialDashboardItemUpdater(ptr: Pointer?): WithDefault =
        ISocialDashboardItemUpdater_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocialDashboardItemUpdater {
      val address = segment.toRawLongValue()
      return makeISocialDashboardItemUpdater(Pointer(address))
    }

    public override fun toNative(obj: ISocialDashboardItemUpdater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__985636578_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocialDashboardItemUpdater):
        Array<ISocialDashboardItemUpdater?> = (elements as
        Array<ISocialDashboardItemUpdater?>).castToImpl<ISocialDashboardItemUpdater,ISocialDashboardItemUpdater_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocialDashboardItemUpdater?> =
        arrayOfNulls<ISocialDashboardItemUpdater_Impl>(size) as Array<ISocialDashboardItemUpdater?>
  }
}
