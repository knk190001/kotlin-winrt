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

@ABIMarker(IEmailMailboxDeleteFolderRequestEventArgs.ABI::class)
@Signature("{b4d32d06-2332-4678-8378-28b579336846}")
@Guid("b4d32d0623324678837828b579336846")
@WinRTInterface("b4d32d0623324678837828b579336846")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxDeleteFolderRequestEventArgs.ByReference::class)
public interface IEmailMailboxDeleteFolderRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxDeleteFolderRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxDeleteFolderRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxDeleteFolderRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxDeleteFolderRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxDeleteFolderRequestEventArgs {
    public val __1841574773_Ptr: Pointer?

    public val _1841574773_VtblPtr: Pointer?
      get() = __1841574773_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxDeleteFolderRequest? {
      val fnPtr = _1841574773_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxDeleteFolderRequest>()
      val hr = fn.invokeHR(arrayOf(__1841574773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxDeleteFolderRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1841574773_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1841574773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxDeleteFolderRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1841574773_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxDeleteFolderRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4d32d0623324678837828b579336846")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxDeleteFolderRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxDeleteFolderRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxDeleteFolderRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxDeleteFolderRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxDeleteFolderRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1841574773_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxDeleteFolderRequestEventArgs):
        Array<IEmailMailboxDeleteFolderRequestEventArgs?> = (elements as
        Array<IEmailMailboxDeleteFolderRequestEventArgs?>).castToImpl<IEmailMailboxDeleteFolderRequestEventArgs,IEmailMailboxDeleteFolderRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxDeleteFolderRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxDeleteFolderRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxDeleteFolderRequestEventArgs?>
  }
}
