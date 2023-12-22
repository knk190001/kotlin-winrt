package Windows.UI.ApplicationSettings

import Windows.Security.Credentials.WebAccountProvider
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

@ABIMarker(IWebAccountProviderCommand.ABI::class)
@Signature("{d69bdd9a-a0a6-4e9b-88dc-c71e757a3501}")
@Guid("d69bdd9aa0a64e9b88dcc71e757a3501")
@WinRTInterface("d69bdd9aa0a64e9b88dcc71e757a3501")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderCommand.ByReference::class)
public interface IWebAccountProviderCommand : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WebAccountProvider(): WebAccountProvider?

  @InterfaceMethod(1)
  public fun get_Invoked(): WebAccountProviderCommandInvokedHandler?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderCommand> {
    public override fun getValue() = ABI.makeIWebAccountProviderCommand(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderCommand_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderCommand {
    public val __1414824028_Ptr: Pointer?

    public val _1414824028_VtblPtr: Pointer?
      get() = __1414824028_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WebAccountProvider(): WebAccountProvider? {
      val fnPtr = _1414824028_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountProvider>()
      val hr = fn.invokeHR(arrayOf(__1414824028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Invoked(): WebAccountProviderCommandInvokedHandler? {
      val fnPtr = _1414824028_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountProviderCommandInvokedHandler>()
      val hr = fn.invokeHR(arrayOf(__1414824028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<WebAccountProviderCommandInvokedHandler>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProviderCommand_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1414824028_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderCommand, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d69bdd9aa0a64e9b88dcc71e757a3501")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderCommand(ptr: Pointer?): WithDefault =
        IWebAccountProviderCommand_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProviderCommand {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderCommand(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderCommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1414824028_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderCommand):
        Array<IWebAccountProviderCommand?> = (elements as
        Array<IWebAccountProviderCommand?>).castToImpl<IWebAccountProviderCommand,IWebAccountProviderCommand_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderCommand?> =
        arrayOfNulls<IWebAccountProviderCommand_Impl>(size) as Array<IWebAccountProviderCommand?>
  }
}
