package Windows.ApplicationModel.Email.DataProvider

import Windows.Foundation.Deferral
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

@ABIMarker(IEmailMailboxSetAutoReplySettingsRequestEventArgs.ABI::class)
@Signature("{09da11ad-d7ca-4087-ac86-53fa67f76246}")
@Guid("09da11add7ca4087ac8653fa67f76246")
@WinRTInterface("09da11add7ca4087ac8653fa67f76246")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxSetAutoReplySettingsRequestEventArgs.ByReference::class)
public interface IEmailMailboxSetAutoReplySettingsRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxSetAutoReplySettingsRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxSetAutoReplySettingsRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxSetAutoReplySettingsRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxSetAutoReplySettingsRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxSetAutoReplySettingsRequestEventArgs {
    public val __1761264114_Ptr: Pointer?

    public val _1761264114_VtblPtr: Pointer?
      get() = __1761264114_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxSetAutoReplySettingsRequest? {
      val fnPtr = _1761264114_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxSetAutoReplySettingsRequest>()
      val hr = fn.invokeHR(arrayOf(__1761264114_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<EmailMailboxSetAutoReplySettingsRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1761264114_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1761264114_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxSetAutoReplySettingsRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1761264114_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxSetAutoReplySettingsRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09da11add7ca4087ac8653fa67f76246")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxSetAutoReplySettingsRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxSetAutoReplySettingsRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxSetAutoReplySettingsRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxSetAutoReplySettingsRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxSetAutoReplySettingsRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1761264114_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxSetAutoReplySettingsRequestEventArgs):
        Array<IEmailMailboxSetAutoReplySettingsRequestEventArgs?> = (elements as
        Array<IEmailMailboxSetAutoReplySettingsRequestEventArgs?>).castToImpl<IEmailMailboxSetAutoReplySettingsRequestEventArgs,IEmailMailboxSetAutoReplySettingsRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IEmailMailboxSetAutoReplySettingsRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxSetAutoReplySettingsRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxSetAutoReplySettingsRequestEventArgs?>
  }
}
