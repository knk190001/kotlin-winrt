package Windows.UI.Xaml.Input

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

@ABIMarker(IAccessKeyInvokedEventArgs.ABI::class)
@Signature("{cfe9cd97-c718-4091-b7dd-adf1c072b1e1}")
@Guid("cfe9cd97c7184091b7ddadf1c072b1e1")
@WinRTInterface("cfe9cd97c7184091b7ddadf1c072b1e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccessKeyInvokedEventArgs.ByReference::class)
public interface IAccessKeyInvokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccessKeyInvokedEventArgs> {
    public override fun getValue() = ABI.makeIAccessKeyInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAccessKeyInvokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccessKeyInvokedEventArgs {
    public val __1794065264_Ptr: Pointer?

    public val _1794065264_VtblPtr: Pointer?
      get() = __1794065264_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1794065264_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1794065264_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1794065264_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1794065264_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccessKeyInvokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1794065264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessKeyInvokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfe9cd97c7184091b7ddadf1c072b1e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessKeyInvokedEventArgs(ptr: Pointer?): WithDefault =
        IAccessKeyInvokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessKeyInvokedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAccessKeyInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAccessKeyInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1794065264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccessKeyInvokedEventArgs):
        Array<IAccessKeyInvokedEventArgs?> = (elements as
        Array<IAccessKeyInvokedEventArgs?>).castToImpl<IAccessKeyInvokedEventArgs,IAccessKeyInvokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccessKeyInvokedEventArgs?> =
        arrayOfNulls<IAccessKeyInvokedEventArgs_Impl>(size) as Array<IAccessKeyInvokedEventArgs?>
  }
}
