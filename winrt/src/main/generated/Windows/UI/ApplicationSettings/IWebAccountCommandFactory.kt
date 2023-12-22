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

@ABIMarker(IWebAccountCommandFactory.ABI::class)
@Signature("{bfa6cdff-2f2d-42f5-81de-1d56bafc496d}")
@Guid("bfa6cdff2f2d42f581de1d56bafc496d")
@WinRTInterface("bfa6cdff2f2d42f581de1d56bafc496d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountCommandFactory.ByReference::class)
public interface IWebAccountCommandFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWebAccountCommand(
    webAccount: WebAccount?,
    invoked: WebAccountCommandInvokedHandler?,
    actions: SupportedWebAccountActions?
  ): WebAccountCommand?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountCommandFactory> {
    public override fun getValue() = ABI.makeIWebAccountCommandFactory(pointer.getPointer(0))

    public fun setValue(value: IWebAccountCommandFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountCommandFactory {
    public val __337727811_Ptr: Pointer?

    public val _337727811_VtblPtr: Pointer?
      get() = __337727811_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWebAccountCommand(
      webAccount: WebAccount?,
      invoked: WebAccountCommandInvokedHandler?,
      actions: SupportedWebAccountActions?
    ): WebAccountCommand? {
      val fnPtr = _337727811_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountCommand>()
      val hr = fn.invokeHR(arrayOf(__337727811_Ptr, marshalToNative(webAccount),
          marshalToNative(invoked), marshalToNative(actions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountCommand>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountCommandFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __337727811_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountCommandFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bfa6cdff2f2d42f581de1d56bafc496d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountCommandFactory(ptr: Pointer?): WithDefault =
        IWebAccountCommandFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountCommandFactory {
      val address = segment.toRawLongValue()
      return makeIWebAccountCommandFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountCommandFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__337727811_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountCommandFactory):
        Array<IWebAccountCommandFactory?> = (elements as
        Array<IWebAccountCommandFactory?>).castToImpl<IWebAccountCommandFactory,IWebAccountCommandFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountCommandFactory?> =
        arrayOfNulls<IWebAccountCommandFactory_Impl>(size) as Array<IWebAccountCommandFactory?>
  }
}
