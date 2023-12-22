package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Control
import Microsoft.UI.Xaml.Input.ProcessKeyboardAcceleratorEventArgs
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

@ABIMarker(IFlyoutBaseOverrides.ABI::class)
@Signature("{5bb19ed8-08de-5eec-91cb-5fc59974e894}")
@Guid("5bb19ed808de5eec91cb5fc59974e894")
@WinRTInterface("5bb19ed808de5eec91cb5fc59974e894")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBaseOverrides.ByReference::class)
public interface IFlyoutBaseOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreatePresenter(): Control?

  @InterfaceMethod(1)
  public fun OnProcessKeyboardAccelerators(args: ProcessKeyboardAcceleratorEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutBaseOverrides> {
    public override fun getValue() = ABI.makeIFlyoutBaseOverrides(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBaseOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBaseOverrides {
    public val __759942186_Ptr: Pointer?

    public val _759942186_VtblPtr: Pointer?
      get() = __759942186_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreatePresenter(): Control? {
      val fnPtr = _759942186_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Control>()
      val hr = fn.invokeHR(arrayOf(__759942186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Control>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun OnProcessKeyboardAccelerators(args: ProcessKeyboardAcceleratorEventArgs?):
        Unit {
      val fnPtr = _759942186_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__759942186_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutBaseOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __759942186_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBaseOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bb19ed808de5eec91cb5fc59974e894")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBaseOverrides(ptr: Pointer?): WithDefault = IFlyoutBaseOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBaseOverrides {
      val address = segment.toRawLongValue()
      return makeIFlyoutBaseOverrides(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBaseOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__759942186_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBaseOverrides): Array<IFlyoutBaseOverrides?> =
        (elements as
        Array<IFlyoutBaseOverrides?>).castToImpl<IFlyoutBaseOverrides,IFlyoutBaseOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBaseOverrides?> =
        arrayOfNulls<IFlyoutBaseOverrides_Impl>(size) as Array<IFlyoutBaseOverrides?>
  }
}
