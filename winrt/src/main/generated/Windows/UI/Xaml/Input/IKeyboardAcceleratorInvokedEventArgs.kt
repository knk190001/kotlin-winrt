package Windows.UI.Xaml.Input

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IKeyboardAcceleratorInvokedEventArgs.ABI::class)
@Signature("{c00b03f2-04e7-4415-b17d-d76b9490de2b}")
@Guid("c00b03f204e74415b17dd76b9490de2b")
@WinRTInterface("c00b03f204e74415b17dd76b9490de2b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyboardAcceleratorInvokedEventArgs.ByReference::class)
public interface IKeyboardAcceleratorInvokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Element(): DependencyObject?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyboardAcceleratorInvokedEventArgs> {
    public override fun getValue() =
        ABI.makeIKeyboardAcceleratorInvokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IKeyboardAcceleratorInvokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyboardAcceleratorInvokedEventArgs {
    public val __1022074521_Ptr: Pointer?

    public val _1022074521_VtblPtr: Pointer?
      get() = __1022074521_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1022074521_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022074521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1022074521_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1022074521_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Element(): DependencyObject? {
      val fnPtr = _1022074521_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1022074521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }
  }

  public class IKeyboardAcceleratorInvokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1022074521_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyboardAcceleratorInvokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c00b03f204e74415b17dd76b9490de2b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyboardAcceleratorInvokedEventArgs(ptr: Pointer?): WithDefault =
        IKeyboardAcceleratorInvokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyboardAcceleratorInvokedEventArgs {
      val address = segment.toRawLongValue()
      return makeIKeyboardAcceleratorInvokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IKeyboardAcceleratorInvokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1022074521_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyboardAcceleratorInvokedEventArgs):
        Array<IKeyboardAcceleratorInvokedEventArgs?> = (elements as
        Array<IKeyboardAcceleratorInvokedEventArgs?>).castToImpl<IKeyboardAcceleratorInvokedEventArgs,IKeyboardAcceleratorInvokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyboardAcceleratorInvokedEventArgs?> =
        arrayOfNulls<IKeyboardAcceleratorInvokedEventArgs_Impl>(size) as
        Array<IKeyboardAcceleratorInvokedEventArgs?>
  }
}
