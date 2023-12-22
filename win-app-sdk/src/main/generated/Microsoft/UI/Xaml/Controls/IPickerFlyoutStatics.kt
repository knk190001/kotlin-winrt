package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IPickerFlyoutStatics.ABI::class)
@Signature("{a8d33e85-aeaa-5079-983b-ce45e468672a}")
@Guid("a8d33e85aeaa5079983bce45e468672a")
@WinRTInterface("a8d33e85aeaa5079983bce45e468672a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerFlyoutStatics.ByReference::class)
public interface IPickerFlyoutStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ConfirmationButtonsVisibleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerFlyoutStatics> {
    public override fun getValue() = ABI.makeIPickerFlyoutStatics(pointer.getPointer(0))

    public fun setValue(value: IPickerFlyoutStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerFlyoutStatics {
    public val __1264075317_Ptr: Pointer?

    public val _1264075317_VtblPtr: Pointer?
      get() = __1264075317_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentProperty(): DependencyProperty? {
      val fnPtr = _1264075317_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1264075317_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConfirmationButtonsVisibleProperty(): DependencyProperty? {
      val fnPtr = _1264075317_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1264075317_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPickerFlyoutStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1264075317_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerFlyoutStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a8d33e85aeaa5079983bce45e468672a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerFlyoutStatics(ptr: Pointer?): WithDefault = IPickerFlyoutStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerFlyoutStatics {
      val address = segment.toRawLongValue()
      return makeIPickerFlyoutStatics(Pointer(address))
    }

    public override fun toNative(obj: IPickerFlyoutStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1264075317_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerFlyoutStatics): Array<IPickerFlyoutStatics?> =
        (elements as
        Array<IPickerFlyoutStatics?>).castToImpl<IPickerFlyoutStatics,IPickerFlyoutStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerFlyoutStatics?> =
        arrayOfNulls<IPickerFlyoutStatics_Impl>(size) as Array<IPickerFlyoutStatics?>
  }
}
