package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IComboBoxOverrides.ABI::class)
@Signature("{a6afbc7a-284f-5b9a-89fe-a334b613f895}")
@Guid("a6afbc7a284f5b9a89fea334b613f895")
@WinRTInterface("a6afbc7a284f5b9a89fea334b613f895")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxOverrides.ByReference::class)
public interface IComboBoxOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnDropDownClosed(e: IUnknown?): Unit

  @InterfaceMethod(1)
  public fun OnDropDownOpened(e: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxOverrides> {
    public override fun getValue() = ABI.makeIComboBoxOverrides(pointer.getPointer(0))

    public fun setValue(value: IComboBoxOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxOverrides {
    public val __1689809309_Ptr: Pointer?

    public val _1689809309_VtblPtr: Pointer?
      get() = __1689809309_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnDropDownClosed(e: IUnknown?): Unit {
      val fnPtr = _1689809309_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1689809309_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnDropDownOpened(e: IUnknown?): Unit {
      val fnPtr = _1689809309_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1689809309_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IComboBoxOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1689809309_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6afbc7a284f5b9a89fea334b613f895")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxOverrides(ptr: Pointer?): WithDefault = IComboBoxOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxOverrides {
      val address = segment.toRawLongValue()
      return makeIComboBoxOverrides(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1689809309_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxOverrides): Array<IComboBoxOverrides?> =
        (elements as
        Array<IComboBoxOverrides?>).castToImpl<IComboBoxOverrides,IComboBoxOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxOverrides?> =
        arrayOfNulls<IComboBoxOverrides_Impl>(size) as Array<IComboBoxOverrides?>
  }
}
