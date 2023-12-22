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

@ABIMarker(IEmailMeetingInfo2.ABI::class)
@Signature("{7e59386d-b0d9-4fe5-867c-e31ed2b588b8}")
@Guid("7e59386db0d94fe5867ce31ed2b588b8")
@WinRTInterface("7e59386db0d94fe5867ce31ed2b588b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMeetingInfo2.ByReference::class)
public interface IEmailMeetingInfo2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsReportedOutOfDateByServer(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMeetingInfo2> {
    public override fun getValue() = ABI.makeIEmailMeetingInfo2(pointer.getPointer(0))

    public fun setValue(value: IEmailMeetingInfo2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMeetingInfo2 {
    public val __46350542_Ptr: Pointer?

    public val _46350542_VtblPtr: Pointer?
      get() = __46350542_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsReportedOutOfDateByServer(): Boolean {
      val fnPtr = _46350542_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__46350542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IEmailMeetingInfo2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __46350542_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMeetingInfo2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e59386db0d94fe5867ce31ed2b588b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMeetingInfo2(ptr: Pointer?): WithDefault = IEmailMeetingInfo2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMeetingInfo2 {
      val address = segment.toRawLongValue()
      return makeIEmailMeetingInfo2(Pointer(address))
    }

    public override fun toNative(obj: IEmailMeetingInfo2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__46350542_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMeetingInfo2): Array<IEmailMeetingInfo2?> =
        (elements as
        Array<IEmailMeetingInfo2?>).castToImpl<IEmailMeetingInfo2,IEmailMeetingInfo2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMeetingInfo2?> =
        arrayOfNulls<IEmailMeetingInfo2_Impl>(size) as Array<IEmailMeetingInfo2?>
  }
}
