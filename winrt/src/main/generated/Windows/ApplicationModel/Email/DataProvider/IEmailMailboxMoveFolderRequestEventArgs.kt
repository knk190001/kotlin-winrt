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

@ABIMarker(IEmailMailboxMoveFolderRequestEventArgs.ABI::class)
@Signature("{38623020-14ba-4c88-8698-7239e3c8aaa7}")
@Guid("3862302014ba4c8886987239e3c8aaa7")
@WinRTInterface("3862302014ba4c8886987239e3c8aaa7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxMoveFolderRequestEventArgs.ByReference::class)
public interface IEmailMailboxMoveFolderRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxMoveFolderRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxMoveFolderRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxMoveFolderRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxMoveFolderRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxMoveFolderRequestEventArgs {
    public val __1983423665_Ptr: Pointer?

    public val _1983423665_VtblPtr: Pointer?
      get() = __1983423665_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxMoveFolderRequest? {
      val fnPtr = _1983423665_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxMoveFolderRequest>()
      val hr = fn.invokeHR(arrayOf(__1983423665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxMoveFolderRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1983423665_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1983423665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxMoveFolderRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1983423665_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxMoveFolderRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3862302014ba4c8886987239e3c8aaa7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxMoveFolderRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxMoveFolderRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxMoveFolderRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxMoveFolderRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxMoveFolderRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1983423665_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxMoveFolderRequestEventArgs):
        Array<IEmailMailboxMoveFolderRequestEventArgs?> = (elements as
        Array<IEmailMailboxMoveFolderRequestEventArgs?>).castToImpl<IEmailMailboxMoveFolderRequestEventArgs,IEmailMailboxMoveFolderRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxMoveFolderRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxMoveFolderRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxMoveFolderRequestEventArgs?>
  }
}
