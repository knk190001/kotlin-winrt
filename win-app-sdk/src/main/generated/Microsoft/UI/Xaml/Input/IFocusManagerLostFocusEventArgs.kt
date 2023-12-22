package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.DependencyObject
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

@ABIMarker(IFocusManagerLostFocusEventArgs.ABI::class)
@Signature("{fdaf2c3f-a22e-5902-abce-b60758fbed1e}")
@Guid("fdaf2c3fa22e5902abceb60758fbed1e")
@WinRTInterface("fdaf2c3fa22e5902abceb60758fbed1e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusManagerLostFocusEventArgs.ByReference::class)
public interface IFocusManagerLostFocusEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldFocusedElement(): DependencyObject?

  @InterfaceMethod(1)
  public fun get_CorrelationId(): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusManagerLostFocusEventArgs> {
    public override fun getValue() = ABI.makeIFocusManagerLostFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFocusManagerLostFocusEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusManagerLostFocusEventArgs {
    public val __1068338499_Ptr: Pointer?

    public val _1068338499_VtblPtr: Pointer?
      get() = __1068338499_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldFocusedElement(): DependencyObject? {
      val fnPtr = _1068338499_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1068338499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CorrelationId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1068338499_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1068338499_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IFocusManagerLostFocusEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1068338499_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusManagerLostFocusEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fdaf2c3fa22e5902abceb60758fbed1e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusManagerLostFocusEventArgs(ptr: Pointer?): WithDefault =
        IFocusManagerLostFocusEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusManagerLostFocusEventArgs {
      val address = segment.toRawLongValue()
      return makeIFocusManagerLostFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFocusManagerLostFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1068338499_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusManagerLostFocusEventArgs):
        Array<IFocusManagerLostFocusEventArgs?> = (elements as
        Array<IFocusManagerLostFocusEventArgs?>).castToImpl<IFocusManagerLostFocusEventArgs,IFocusManagerLostFocusEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusManagerLostFocusEventArgs?> =
        arrayOfNulls<IFocusManagerLostFocusEventArgs_Impl>(size) as
        Array<IFocusManagerLostFocusEventArgs?>
  }
}
