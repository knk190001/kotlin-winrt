package Windows.ApplicationModel.Email.DataProvider

import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
import Windows.Foundation.TimeSpan
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

@ABIMarker(IEmailMailboxProposeNewTimeForMeetingRequest.ABI::class)
@Signature("{5aeff152-9799-4f9f-a399-ff07f3eef04e}")
@Guid("5aeff15297994f9fa399ff07f3eef04e")
@WinRTInterface("5aeff15297994f9fa399ff07f3eef04e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxProposeNewTimeForMeetingRequest.ByReference::class)
public interface IEmailMailboxProposeNewTimeForMeetingRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EmailMailboxId(): String?

  @InterfaceMethod(1)
  public fun get_EmailMessageId(): String?

  @InterfaceMethod(2)
  public fun get_NewStartTime(): DateTime?

  @InterfaceMethod(3)
  public fun get_NewDuration(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_Subject(): String?

  @InterfaceMethod(5)
  public fun get_Comment(): String?

  @InterfaceMethod(6)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(7)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxProposeNewTimeForMeetingRequest> {
    public override fun getValue() =
        ABI.makeIEmailMailboxProposeNewTimeForMeetingRequest(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxProposeNewTimeForMeetingRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxProposeNewTimeForMeetingRequest {
    public val __1602283236_Ptr: Pointer?

    public val _1602283236_VtblPtr: Pointer?
      get() = __1602283236_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EmailMailboxId(): String? {
      val fnPtr = _1602283236_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1602283236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EmailMessageId(): String? {
      val fnPtr = _1602283236_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1602283236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NewStartTime(): DateTime? {
      val fnPtr = _1602283236_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1602283236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_NewDuration(): TimeSpan? {
      val fnPtr = _1602283236_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1602283236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Subject(): String? {
      val fnPtr = _1602283236_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1602283236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Comment(): String? {
      val fnPtr = _1602283236_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1602283236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _1602283236_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1602283236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1602283236_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1602283236_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxProposeNewTimeForMeetingRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1602283236_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxProposeNewTimeForMeetingRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5aeff15297994f9fa399ff07f3eef04e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxProposeNewTimeForMeetingRequest(ptr: Pointer?): WithDefault =
        IEmailMailboxProposeNewTimeForMeetingRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxProposeNewTimeForMeetingRequest {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxProposeNewTimeForMeetingRequest(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxProposeNewTimeForMeetingRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1602283236_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxProposeNewTimeForMeetingRequest):
        Array<IEmailMailboxProposeNewTimeForMeetingRequest?> = (elements as
        Array<IEmailMailboxProposeNewTimeForMeetingRequest?>).castToImpl<IEmailMailboxProposeNewTimeForMeetingRequest,IEmailMailboxProposeNewTimeForMeetingRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxProposeNewTimeForMeetingRequest?> =
        arrayOfNulls<IEmailMailboxProposeNewTimeForMeetingRequest_Impl>(size) as
        Array<IEmailMailboxProposeNewTimeForMeetingRequest?>
  }
}
