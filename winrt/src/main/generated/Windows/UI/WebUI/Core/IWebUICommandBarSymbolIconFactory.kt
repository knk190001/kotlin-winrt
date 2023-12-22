package Windows.UI.WebUI.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebUICommandBarSymbolIconFactory.ABI::class)
@Signature("{51be1a1f-3730-429e-b622-14e2b7bf6a07}")
@Guid("51be1a1f3730429eb62214e2b7bf6a07")
@WinRTInterface("51be1a1f3730429eb62214e2b7bf6a07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarSymbolIconFactory.ByReference::class)
public interface IWebUICommandBarSymbolIconFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(symbol: String?): WebUICommandBarSymbolIcon?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarSymbolIconFactory> {
    public override fun getValue() =
        ABI.makeIWebUICommandBarSymbolIconFactory(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarSymbolIconFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarSymbolIconFactory {
    public val __1367760354_Ptr: Pointer?

    public val _1367760354_VtblPtr: Pointer?
      get() = __1367760354_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(symbol: String?): WebUICommandBarSymbolIcon? {
      val fnPtr = _1367760354_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebUICommandBarSymbolIcon>()
      val hr = fn.invokeHR(arrayOf(__1367760354_Ptr, marshalToNative(symbol), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebUICommandBarSymbolIcon>(result.getValue())
      return resultValue
    }
  }

  public class IWebUICommandBarSymbolIconFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1367760354_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarSymbolIconFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51be1a1f3730429eb62214e2b7bf6a07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarSymbolIconFactory(ptr: Pointer?): WithDefault =
        IWebUICommandBarSymbolIconFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarSymbolIconFactory {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarSymbolIconFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarSymbolIconFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1367760354_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarSymbolIconFactory):
        Array<IWebUICommandBarSymbolIconFactory?> = (elements as
        Array<IWebUICommandBarSymbolIconFactory?>).castToImpl<IWebUICommandBarSymbolIconFactory,IWebUICommandBarSymbolIconFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarSymbolIconFactory?> =
        arrayOfNulls<IWebUICommandBarSymbolIconFactory_Impl>(size) as
        Array<IWebUICommandBarSymbolIconFactory?>
  }
}
