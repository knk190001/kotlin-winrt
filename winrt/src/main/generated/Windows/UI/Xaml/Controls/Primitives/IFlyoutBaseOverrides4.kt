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

@ABIMarker(IFlyoutBaseOverrides4.ABI::class)
@Signature("{a6bfd04d-5ff3-4418-add8-4042a88d2da5}")
@Guid("a6bfd04d5ff34418add84042a88d2da5")
@WinRTInterface("a6bfd04d5ff34418add84042a88d2da5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBaseOverrides4.ByReference::class)
public interface IFlyoutBaseOverrides4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnProcessKeyboardAccelerators(args: ProcessKeyboardAcceleratorEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutBaseOverrides4> {
    public override fun getValue() = ABI.makeIFlyoutBaseOverrides4(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBaseOverrides4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBaseOverrides4 {
    public val __1454022741_Ptr: Pointer?

    public val _1454022741_VtblPtr: Pointer?
      get() = __1454022741_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnProcessKeyboardAccelerators(args: ProcessKeyboardAcceleratorEventArgs?):
        Unit {
      val fnPtr = _1454022741_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1454022741_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutBaseOverrides4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1454022741_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBaseOverrides4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6bfd04d5ff34418add84042a88d2da5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBaseOverrides4(ptr: Pointer?): WithDefault =
        IFlyoutBaseOverrides4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBaseOverrides4 {
      val address = segment.toRawLongValue()
      return makeIFlyoutBaseOverrides4(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBaseOverrides4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1454022741_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBaseOverrides4): Array<IFlyoutBaseOverrides4?> =
        (elements as
        Array<IFlyoutBaseOverrides4?>).castToImpl<IFlyoutBaseOverrides4,IFlyoutBaseOverrides4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBaseOverrides4?> =
        arrayOfNulls<IFlyoutBaseOverrides4_Impl>(size) as Array<IFlyoutBaseOverrides4?>
  }
}
