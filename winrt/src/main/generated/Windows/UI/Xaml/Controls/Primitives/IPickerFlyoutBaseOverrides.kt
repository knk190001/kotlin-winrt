package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IPickerFlyoutBaseOverrides.ABI::class)
@Signature("{5bfc4f4a-4822-47b4-a958-77c20ba120d3}")
@Guid("5bfc4f4a482247b4a95877c20ba120d3")
@WinRTInterface("5bfc4f4a482247b4a95877c20ba120d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerFlyoutBaseOverrides.ByReference::class)
public interface IPickerFlyoutBaseOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnConfirmed(): Unit

  @InterfaceMethod(1)
  public fun ShouldShowConfirmationButtons(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerFlyoutBaseOverrides> {
    public override fun getValue() = ABI.makeIPickerFlyoutBaseOverrides(pointer.getPointer(0))

    public fun setValue(value: IPickerFlyoutBaseOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerFlyoutBaseOverrides {
    public val __617237167_Ptr: Pointer?

    public val _617237167_VtblPtr: Pointer?
      get() = __617237167_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnConfirmed(): Unit {
      val fnPtr = _617237167_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617237167_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ShouldShowConfirmationButtons(): Boolean {
      val fnPtr = _617237167_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__617237167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPickerFlyoutBaseOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __617237167_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerFlyoutBaseOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bfc4f4a482247b4a95877c20ba120d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerFlyoutBaseOverrides(ptr: Pointer?): WithDefault =
        IPickerFlyoutBaseOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerFlyoutBaseOverrides {
      val address = segment.toRawLongValue()
      return makeIPickerFlyoutBaseOverrides(Pointer(address))
    }

    public override fun toNative(obj: IPickerFlyoutBaseOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__617237167_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerFlyoutBaseOverrides):
        Array<IPickerFlyoutBaseOverrides?> = (elements as
        Array<IPickerFlyoutBaseOverrides?>).castToImpl<IPickerFlyoutBaseOverrides,IPickerFlyoutBaseOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerFlyoutBaseOverrides?> =
        arrayOfNulls<IPickerFlyoutBaseOverrides_Impl>(size) as Array<IPickerFlyoutBaseOverrides?>
  }
}
