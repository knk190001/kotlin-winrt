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

@ABIMarker(IEmailMailboxCapabilities3.ABI::class)
@Signature("{f690e944-56f2-45aa-872c-0ce9f3db0b5c}")
@Guid("f690e94456f245aa872c0ce9f3db0b5c")
@WinRTInterface("f690e94456f245aa872c0ce9f3db0b5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxCapabilities3.ByReference::class)
public interface IEmailMailboxCapabilities3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_CanForwardMeetings(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun put_CanGetAndSetExternalAutoReplies(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun put_CanGetAndSetInternalAutoReplies(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun put_CanUpdateMeetingResponses(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun put_CanServerSearchFolders(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun put_CanServerSearchMailbox(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun put_CanProposeNewTimeForMeetings(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun put_CanSmartSend(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun put_CanResolveRecipients(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun put_CanValidateCertificates(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun put_CanEmptyFolder(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun put_CanCreateFolder(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun put_CanDeleteFolder(value: Boolean): Unit

  @InterfaceMethod(13)
  public fun put_CanMoveFolder(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxCapabilities3> {
    public override fun getValue() = ABI.makeIEmailMailboxCapabilities3(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxCapabilities3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxCapabilities3 {
    public val __1818335982_Ptr: Pointer?

    public val _1818335982_VtblPtr: Pointer?
      get() = __1818335982_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_CanForwardMeetings(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun put_CanGetAndSetExternalAutoReplies(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun put_CanGetAndSetInternalAutoReplies(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun put_CanUpdateMeetingResponses(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun put_CanServerSearchFolders(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun put_CanServerSearchMailbox(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun put_CanProposeNewTimeForMeetings(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun put_CanSmartSend(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun put_CanResolveRecipients(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun put_CanValidateCertificates(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun put_CanEmptyFolder(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun put_CanCreateFolder(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun put_CanDeleteFolder(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun put_CanMoveFolder(value: Boolean): Unit {
      val fnPtr = _1818335982_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1818335982_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailMailboxCapabilities3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1818335982_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxCapabilities3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f690e94456f245aa872c0ce9f3db0b5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxCapabilities3(ptr: Pointer?): WithDefault =
        IEmailMailboxCapabilities3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxCapabilities3 {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxCapabilities3(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxCapabilities3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1818335982_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxCapabilities3):
        Array<IEmailMailboxCapabilities3?> = (elements as
        Array<IEmailMailboxCapabilities3?>).castToImpl<IEmailMailboxCapabilities3,IEmailMailboxCapabilities3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxCapabilities3?> =
        arrayOfNulls<IEmailMailboxCapabilities3_Impl>(size) as Array<IEmailMailboxCapabilities3?>
  }
}
