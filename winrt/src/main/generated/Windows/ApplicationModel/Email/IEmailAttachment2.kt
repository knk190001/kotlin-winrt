package Windows.ApplicationModel.Email

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IEmailAttachment2.ABI::class)
@Signature("{225f1070-b0ff-4571-9d54-a706c48d55c6}")
@Guid("225f1070b0ff45719d54a706c48d55c6")
@WinRTInterface("225f1070b0ff45719d54a706c48d55c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailAttachment2.ByReference::class)
public interface IEmailAttachment2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_ContentId(): String?

  @InterfaceMethod(2)
  public fun put_ContentId(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_ContentLocation(): String?

  @InterfaceMethod(4)
  public fun put_ContentLocation(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_DownloadState(): EmailAttachmentDownloadState?

  @InterfaceMethod(6)
  public fun put_DownloadState(value: EmailAttachmentDownloadState?): Unit

  @InterfaceMethod(7)
  public fun get_EstimatedDownloadSizeInBytes(): WinDef.ULONG

  @InterfaceMethod(8)
  public fun put_EstimatedDownloadSizeInBytes(value: WinDef.ULONG): Unit

  @InterfaceMethod(9)
  public fun get_IsFromBaseMessage(): Boolean

  @InterfaceMethod(10)
  public fun get_IsInline(): Boolean

  @InterfaceMethod(11)
  public fun put_IsInline(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_MimeType(): String?

  @InterfaceMethod(13)
  public fun put_MimeType(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailAttachment2> {
    public override fun getValue() = ABI.makeIEmailAttachment2(pointer.getPointer(0))

    public fun setValue(value: IEmailAttachment2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailAttachment2 {
    public val __1100711478_Ptr: Pointer?

    public val _1100711478_VtblPtr: Pointer?
      get() = __1100711478_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContentId(): String? {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ContentId(value: String?): Unit {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ContentLocation(): String? {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ContentLocation(value: String?): Unit {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_DownloadState(): EmailAttachmentDownloadState? {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailAttachmentDownloadState>()
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailAttachmentDownloadState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_DownloadState(value: EmailAttachmentDownloadState?): Unit {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_EstimatedDownloadSizeInBytes(): WinDef.ULONG {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_EstimatedDownloadSizeInBytes(value: WinDef.ULONG): Unit {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_IsFromBaseMessage(): Boolean {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_IsInline(): Boolean {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsInline(value: Boolean): Unit {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_MimeType(): String? {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_MimeType(value: String?): Unit {
      val fnPtr = _1100711478_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1100711478_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailAttachment2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1100711478_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailAttachment2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("225f1070b0ff45719d54a706c48d55c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailAttachment2(ptr: Pointer?): WithDefault = IEmailAttachment2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailAttachment2 {
      val address = segment.toRawLongValue()
      return makeIEmailAttachment2(Pointer(address))
    }

    public override fun toNative(obj: IEmailAttachment2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1100711478_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailAttachment2): Array<IEmailAttachment2?> = (elements
        as Array<IEmailAttachment2?>).castToImpl<IEmailAttachment2,IEmailAttachment2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailAttachment2?> =
        arrayOfNulls<IEmailAttachment2_Impl>(size) as Array<IEmailAttachment2?>
  }
}
