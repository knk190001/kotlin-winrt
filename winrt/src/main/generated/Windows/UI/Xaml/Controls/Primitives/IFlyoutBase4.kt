package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Input.ProcessKeyboardAcceleratorEventArgs
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

@ABIMarker(IFlyoutBase4.ABI::class)
@Signature("{e3897d69-a37f-4828-9b70-0ef67c03b5f8}")
@Guid("e3897d69a37f48289b700ef67c03b5f8")
@WinRTInterface("e3897d69a37f48289b700ef67c03b5f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBase4.ByReference::class)
public interface IFlyoutBase4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryInvokeKeyboardAccelerator(args: ProcessKeyboardAcceleratorEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlyoutBase4> {
    public override fun getValue() = ABI.makeIFlyoutBase4(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBase4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBase4 {
    public val __1324150292_Ptr: Pointer?

    public val _1324150292_VtblPtr: Pointer?
      get() = __1324150292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryInvokeKeyboardAccelerator(args: ProcessKeyboardAcceleratorEventArgs?):
        Unit {
      val fnPtr = _1324150292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1324150292_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutBase4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1324150292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBase4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3897d69a37f48289b700ef67c03b5f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBase4(ptr: Pointer?): WithDefault = IFlyoutBase4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBase4 {
      val address = segment.toRawLongValue()
      return makeIFlyoutBase4(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBase4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1324150292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBase4): Array<IFlyoutBase4?> = (elements as
        Array<IFlyoutBase4?>).castToImpl<IFlyoutBase4,IFlyoutBase4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBase4?> =
        arrayOfNulls<IFlyoutBase4_Impl>(size) as Array<IFlyoutBase4?>
  }
}
