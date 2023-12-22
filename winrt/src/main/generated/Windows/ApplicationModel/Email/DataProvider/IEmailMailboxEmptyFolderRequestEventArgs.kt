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

@ABIMarker(IEmailMailboxEmptyFolderRequestEventArgs.ABI::class)
@Signature("{7183f484-985a-4ac0-b33f-ee0e2627a3c0}")
@Guid("7183f484985a4ac0b33fee0e2627a3c0")
@WinRTInterface("7183f484985a4ac0b33fee0e2627a3c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxEmptyFolderRequestEventArgs.ByReference::class)
public interface IEmailMailboxEmptyFolderRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxEmptyFolderRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxEmptyFolderRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxEmptyFolderRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxEmptyFolderRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxEmptyFolderRequestEventArgs {
    public val __3511783_Ptr: Pointer?

    public val _3511783_VtblPtr: Pointer?
      get() = __3511783_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxEmptyFolderRequest? {
      val fnPtr = _3511783_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxEmptyFolderRequest>()
      val hr = fn.invokeHR(arrayOf(__3511783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxEmptyFolderRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _3511783_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__3511783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxEmptyFolderRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __3511783_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxEmptyFolderRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7183f484985a4ac0b33fee0e2627a3c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxEmptyFolderRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxEmptyFolderRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxEmptyFolderRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxEmptyFolderRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxEmptyFolderRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__3511783_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxEmptyFolderRequestEventArgs):
        Array<IEmailMailboxEmptyFolderRequestEventArgs?> = (elements as
        Array<IEmailMailboxEmptyFolderRequestEventArgs?>).castToImpl<IEmailMailboxEmptyFolderRequestEventArgs,IEmailMailboxEmptyFolderRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxEmptyFolderRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxEmptyFolderRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxEmptyFolderRequestEventArgs?>
  }
}
