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

@ABIMarker(IEmailMailboxCreateFolderRequestEventArgs.ABI::class)
@Signature("{03e4c02c-241c-4ea9-a68f-ff20bc5afc85}")
@Guid("03e4c02c241c4ea9a68fff20bc5afc85")
@WinRTInterface("03e4c02c241c4ea9a68fff20bc5afc85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxCreateFolderRequestEventArgs.ByReference::class)
public interface IEmailMailboxCreateFolderRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxCreateFolderRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxCreateFolderRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxCreateFolderRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxCreateFolderRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxCreateFolderRequestEventArgs {
    public val __1825973532_Ptr: Pointer?

    public val _1825973532_VtblPtr: Pointer?
      get() = __1825973532_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxCreateFolderRequest? {
      val fnPtr = _1825973532_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxCreateFolderRequest>()
      val hr = fn.invokeHR(arrayOf(__1825973532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxCreateFolderRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1825973532_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1825973532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxCreateFolderRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1825973532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxCreateFolderRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03e4c02c241c4ea9a68fff20bc5afc85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxCreateFolderRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxCreateFolderRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxCreateFolderRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxCreateFolderRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxCreateFolderRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1825973532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxCreateFolderRequestEventArgs):
        Array<IEmailMailboxCreateFolderRequestEventArgs?> = (elements as
        Array<IEmailMailboxCreateFolderRequestEventArgs?>).castToImpl<IEmailMailboxCreateFolderRequestEventArgs,IEmailMailboxCreateFolderRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxCreateFolderRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxCreateFolderRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxCreateFolderRequestEventArgs?>
  }
}
