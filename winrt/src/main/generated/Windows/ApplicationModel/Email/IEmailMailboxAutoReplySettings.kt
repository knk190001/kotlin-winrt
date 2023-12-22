package Windows.ApplicationModel.Email

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEmailMailboxAutoReplySettings.ABI::class)
@Signature("{a87a9fa8-0ac6-4b77-ba77-a6b99e9a27b8}")
@Guid("a87a9fa80ac64b77ba77a6b99e9a27b8")
@WinRTInterface("a87a9fa80ac64b77ba77a6b99e9a27b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxAutoReplySettings.ByReference::class)
public interface IEmailMailboxAutoReplySettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_ResponseKind(): EmailMailboxAutoReplyMessageResponseKind?

  @InterfaceMethod(3)
  public fun put_ResponseKind(value: EmailMailboxAutoReplyMessageResponseKind?): Unit

  @InterfaceMethod(4)
  public fun get_StartTime(): IReference<DateTime?>?

  @InterfaceMethod(5)
  public fun put_StartTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(6)
  public fun get_EndTime(): IReference<DateTime?>?

  @InterfaceMethod(7)
  public fun put_EndTime(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(8)
  public fun get_InternalReply(): EmailMailboxAutoReply?

  @InterfaceMethod(9)
  public fun get_KnownExternalReply(): EmailMailboxAutoReply?

  @InterfaceMethod(10)
  public fun get_UnknownExternalReply(): EmailMailboxAutoReply?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxAutoReplySettings> {
    public override fun getValue() = ABI.makeIEmailMailboxAutoReplySettings(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxAutoReplySettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxAutoReplySettings {
    public val __1045601553_Ptr: Pointer?

    public val _1045601553_VtblPtr: Pointer?
      get() = __1045601553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ResponseKind(): EmailMailboxAutoReplyMessageResponseKind? {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxAutoReplyMessageResponseKind>()
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<EmailMailboxAutoReplyMessageResponseKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ResponseKind(value: EmailMailboxAutoReplyMessageResponseKind?): Unit {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_StartTime(): IReference<DateTime?>? {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_StartTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_EndTime(): IReference<DateTime?>? {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_EndTime(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_InternalReply(): EmailMailboxAutoReply? {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxAutoReply>()
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxAutoReply>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_KnownExternalReply(): EmailMailboxAutoReply? {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxAutoReply>()
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxAutoReply>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_UnknownExternalReply(): EmailMailboxAutoReply? {
      val fnPtr = _1045601553_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxAutoReply>()
      val hr = fn.invokeHR(arrayOf(__1045601553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxAutoReply>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxAutoReplySettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1045601553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxAutoReplySettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a87a9fa80ac64b77ba77a6b99e9a27b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxAutoReplySettings(ptr: Pointer?): WithDefault =
        IEmailMailboxAutoReplySettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxAutoReplySettings {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxAutoReplySettings(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxAutoReplySettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1045601553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxAutoReplySettings):
        Array<IEmailMailboxAutoReplySettings?> = (elements as
        Array<IEmailMailboxAutoReplySettings?>).castToImpl<IEmailMailboxAutoReplySettings,IEmailMailboxAutoReplySettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxAutoReplySettings?> =
        arrayOfNulls<IEmailMailboxAutoReplySettings_Impl>(size) as
        Array<IEmailMailboxAutoReplySettings?>
  }
}
