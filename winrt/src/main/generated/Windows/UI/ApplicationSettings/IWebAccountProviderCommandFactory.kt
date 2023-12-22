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

@ABIMarker(IWebAccountProviderCommandFactory.ABI::class)
@Signature("{d5658a1b-b176-4776-8469-a9d3ff0b3f59}")
@Guid("d5658a1bb17647768469a9d3ff0b3f59")
@WinRTInterface("d5658a1bb17647768469a9d3ff0b3f59")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderCommandFactory.ByReference::class)
public interface IWebAccountProviderCommandFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWebAccountProviderCommand(webAccountProvider: WebAccountProvider?,
      invoked: WebAccountProviderCommandInvokedHandler?): WebAccountProviderCommand?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderCommandFactory> {
    public override fun getValue() =
        ABI.makeIWebAccountProviderCommandFactory(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderCommandFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderCommandFactory {
    public val __223647474_Ptr: Pointer?

    public val _223647474_VtblPtr: Pointer?
      get() = __223647474_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWebAccountProviderCommand(webAccountProvider: WebAccountProvider?,
        invoked: WebAccountProviderCommandInvokedHandler?): WebAccountProviderCommand? {
      val fnPtr = _223647474_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountProviderCommand>()
      val hr = fn.invokeHR(arrayOf(__223647474_Ptr, marshalToNative(webAccountProvider),
          marshalToNative(invoked), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountProviderCommand>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProviderCommandFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __223647474_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderCommandFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5658a1bb17647768469a9d3ff0b3f59")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderCommandFactory(ptr: Pointer?): WithDefault =
        IWebAccountProviderCommandFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProviderCommandFactory {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderCommandFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderCommandFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__223647474_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderCommandFactory):
        Array<IWebAccountProviderCommandFactory?> = (elements as
        Array<IWebAccountProviderCommandFactory?>).castToImpl<IWebAccountProviderCommandFactory,IWebAccountProviderCommandFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderCommandFactory?> =
        arrayOfNulls<IWebAccountProviderCommandFactory_Impl>(size) as
        Array<IWebAccountProviderCommandFactory?>
  }
}
