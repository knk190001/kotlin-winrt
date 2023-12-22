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

@ABIMarker(IEmailMailboxCapabilities.ABI::class)
@Signature("{eedec3a6-89db-4305-82c4-439e0a33da11}")
@Guid("eedec3a689db430582c4439e0a33da11")
@WinRTInterface("eedec3a689db430582c4439e0a33da11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxCapabilities.ByReference::class)
public interface IEmailMailboxCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanForwardMeetings(): Boolean

  @InterfaceMethod(1)
  public fun get_CanGetAndSetExternalAutoReplies(): Boolean

  @InterfaceMethod(2)
  public fun get_CanGetAndSetInternalAutoReplies(): Boolean

  @InterfaceMethod(3)
  public fun get_CanUpdateMeetingResponses(): Boolean

  @InterfaceMethod(4)
  public fun get_CanServerSearchFolders(): Boolean

  @InterfaceMethod(5)
  public fun get_CanServerSearchMailbox(): Boolean

  @InterfaceMethod(6)
  public fun get_CanProposeNewTimeForMeetings(): Boolean

  @InterfaceMethod(7)
  public fun get_CanSmartSend(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxCapabilities> {
    public override fun getValue() = ABI.makeIEmailMailboxCapabilities(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxCapabilities {
    public val __772627995_Ptr: Pointer?

    public val _772627995_VtblPtr: Pointer?
      get() = __772627995_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanForwardMeetings(): Boolean {
      val fnPtr = _772627995_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__772627995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CanGetAndSetExternalAutoReplies(): Boolean {
      val fnPtr = _772627995_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__772627995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CanGetAndSetInternalAutoReplies(): Boolean {
      val fnPtr = _772627995_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__772627995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_CanUpdateMeetingResponses(): Boolean {
      val fnPtr = _772627995_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__772627995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_CanServerSearchFolders(): Boolean {
      val fnPtr = _772627995_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__772627995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_CanServerSearchMailbox(): Boolean {
      val fnPtr = _772627995_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__772627995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_CanProposeNewTimeForMeetings(): Boolean {
      val fnPtr = _772627995_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__772627995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_CanSmartSend(): Boolean {
      val fnPtr = _772627995_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__772627995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IEmailMailboxCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __772627995_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eedec3a689db430582c4439e0a33da11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxCapabilities(ptr: Pointer?): WithDefault =
        IEmailMailboxCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxCapabilities {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__772627995_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxCapabilities):
        Array<IEmailMailboxCapabilities?> = (elements as
        Array<IEmailMailboxCapabilities?>).castToImpl<IEmailMailboxCapabilities,IEmailMailboxCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxCapabilities?> =
        arrayOfNulls<IEmailMailboxCapabilities_Impl>(size) as Array<IEmailMailboxCapabilities?>
  }
}
