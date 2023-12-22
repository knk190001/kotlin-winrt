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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebUICommandBarItemInvokedEventArgs.ABI::class)
@Signature("{304edbdd-e741-41ef-bdc4-a45cea2a4f70}")
@Guid("304edbdde74141efbdc4a45cea2a4f70")
@WinRTInterface("304edbdde74141efbdc4a45cea2a4f70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarItemInvokedEventArgs.ByReference::class)
public interface IWebUICommandBarItemInvokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPrimaryCommand(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarItemInvokedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebUICommandBarItemInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarItemInvokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarItemInvokedEventArgs {
    public val __508081255_Ptr: Pointer?

    public val _508081255_VtblPtr: Pointer?
      get() = __508081255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPrimaryCommand(): Boolean {
      val fnPtr = _508081255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__508081255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IWebUICommandBarItemInvokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __508081255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarItemInvokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("304edbdde74141efbdc4a45cea2a4f70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarItemInvokedEventArgs(ptr: Pointer?): WithDefault =
        IWebUICommandBarItemInvokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarItemInvokedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarItemInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarItemInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__508081255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarItemInvokedEventArgs):
        Array<IWebUICommandBarItemInvokedEventArgs?> = (elements as
        Array<IWebUICommandBarItemInvokedEventArgs?>).castToImpl<IWebUICommandBarItemInvokedEventArgs,IWebUICommandBarItemInvokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarItemInvokedEventArgs?> =
        arrayOfNulls<IWebUICommandBarItemInvokedEventArgs_Impl>(size) as
        Array<IWebUICommandBarItemInvokedEventArgs?>
  }
}
