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

@ABIMarker(IEmailMailboxSyncManagerSyncRequestEventArgs.ABI::class)
@Signature("{439a031a-8fcc-4ae5-b9b5-d434e0a65aa8}")
@Guid("439a031a8fcc4ae5b9b5d434e0a65aa8")
@WinRTInterface("439a031a8fcc4ae5b9b5d434e0a65aa8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxSyncManagerSyncRequestEventArgs.ByReference::class)
public interface IEmailMailboxSyncManagerSyncRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxSyncManagerSyncRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxSyncManagerSyncRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxSyncManagerSyncRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxSyncManagerSyncRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxSyncManagerSyncRequestEventArgs {
    public val __132192587_Ptr: Pointer?

    public val _132192587_VtblPtr: Pointer?
      get() = __132192587_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxSyncManagerSyncRequest? {
      val fnPtr = _132192587_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxSyncManagerSyncRequest>()
      val hr = fn.invokeHR(arrayOf(__132192587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxSyncManagerSyncRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _132192587_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__132192587_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxSyncManagerSyncRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __132192587_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxSyncManagerSyncRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("439a031a8fcc4ae5b9b5d434e0a65aa8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxSyncManagerSyncRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxSyncManagerSyncRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxSyncManagerSyncRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxSyncManagerSyncRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxSyncManagerSyncRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__132192587_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxSyncManagerSyncRequestEventArgs):
        Array<IEmailMailboxSyncManagerSyncRequestEventArgs?> = (elements as
        Array<IEmailMailboxSyncManagerSyncRequestEventArgs?>).castToImpl<IEmailMailboxSyncManagerSyncRequestEventArgs,IEmailMailboxSyncManagerSyncRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxSyncManagerSyncRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxSyncManagerSyncRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxSyncManagerSyncRequestEventArgs?>
  }
}
