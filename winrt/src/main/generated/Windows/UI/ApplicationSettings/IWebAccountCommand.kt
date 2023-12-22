package Windows.UI.ApplicationSettings

import Windows.Security.Credentials.WebAccount
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

@ABIMarker(IWebAccountCommand.ABI::class)
@Signature("{caa39398-9cfa-4246-b0c4-a913a3896541}")
@Guid("caa393989cfa4246b0c4a913a3896541")
@WinRTInterface("caa393989cfa4246b0c4a913a3896541")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountCommand.ByReference::class)
public interface IWebAccountCommand : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WebAccount(): WebAccount?

  @InterfaceMethod(1)
  public fun get_Invoked(): WebAccountCommandInvokedHandler?

  @InterfaceMethod(2)
  public fun get_Actions(): SupportedWebAccountActions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountCommand> {
    public override fun getValue() = ABI.makeIWebAccountCommand(pointer.getPointer(0))

    public fun setValue(value: IWebAccountCommand_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountCommand {
    public val __875671949_Ptr: Pointer?

    public val _875671949_VtblPtr: Pointer?
      get() = __875671949_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WebAccount(): WebAccount? {
      val fnPtr = _875671949_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccount>()
      val hr = fn.invokeHR(arrayOf(__875671949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccount>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Invoked(): WebAccountCommandInvokedHandler? {
      val fnPtr = _875671949_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountCommandInvokedHandler>()
      val hr = fn.invokeHR(arrayOf(__875671949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountCommandInvokedHandler>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Actions(): SupportedWebAccountActions? {
      val fnPtr = _875671949_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SupportedWebAccountActions>()
      val hr = fn.invokeHR(arrayOf(__875671949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SupportedWebAccountActions>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountCommand_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __875671949_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountCommand, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("caa393989cfa4246b0c4a913a3896541")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountCommand(ptr: Pointer?): WithDefault = IWebAccountCommand_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountCommand {
      val address = segment.toRawLongValue()
      return makeIWebAccountCommand(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountCommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__875671949_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountCommand): Array<IWebAccountCommand?> =
        (elements as
        Array<IWebAccountCommand?>).castToImpl<IWebAccountCommand,IWebAccountCommand_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountCommand?> =
        arrayOfNulls<IWebAccountCommand_Impl>(size) as Array<IWebAccountCommand?>
  }
}
