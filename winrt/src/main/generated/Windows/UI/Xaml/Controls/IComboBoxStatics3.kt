package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IComboBoxStatics3.ABI::class)
@Signature("{949e140f-ce7f-4e41-bdc5-d1d3388ad0a6}")
@Guid("949e140fce7f4e41bdc5d1d3388ad0a6")
@WinRTInterface("949e140fce7f4e41bdc5d1d3388ad0a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxStatics3.ByReference::class)
public interface IComboBoxStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LightDismissOverlayModeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsTextSearchEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxStatics3> {
    public override fun getValue() = ABI.makeIComboBoxStatics3(pointer.getPointer(0))

    public fun setValue(value: IComboBoxStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxStatics3 {
    public val __1235937881_Ptr: Pointer?

    public val _1235937881_VtblPtr: Pointer?
      get() = __1235937881_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LightDismissOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _1235937881_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1235937881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsTextSearchEnabledProperty(): DependencyProperty? {
      val fnPtr = _1235937881_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1235937881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IComboBoxStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1235937881_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("949e140fce7f4e41bdc5d1d3388ad0a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxStatics3(ptr: Pointer?): WithDefault = IComboBoxStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxStatics3 {
      val address = segment.toRawLongValue()
      return makeIComboBoxStatics3(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1235937881_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxStatics3): Array<IComboBoxStatics3?> = (elements
        as Array<IComboBoxStatics3?>).castToImpl<IComboBoxStatics3,IComboBoxStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxStatics3?> =
        arrayOfNulls<IComboBoxStatics3_Impl>(size) as Array<IComboBoxStatics3?>
  }
}
