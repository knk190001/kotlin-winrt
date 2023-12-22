package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ComboBox
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IComboBoxHelperStatics.ABI::class)
@Signature("{ec21be42-ed02-5c10-9fbe-af1881cd877b}")
@Guid("ec21be42ed025c109fbeaf1881cd877b")
@WinRTInterface("ec21be42ed025c109fbeaf1881cd877b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxHelperStatics.ByReference::class)
public interface IComboBoxHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeepInteriorCornersSquareProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun SetKeepInteriorCornersSquare(comboBox: ComboBox?, value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetKeepInteriorCornersSquare(comboBox: ComboBox?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxHelperStatics> {
    public override fun getValue() = ABI.makeIComboBoxHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IComboBoxHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxHelperStatics {
    public val __567061975_Ptr: Pointer?

    public val _567061975_VtblPtr: Pointer?
      get() = __567061975_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeepInteriorCornersSquareProperty(): DependencyProperty? {
      val fnPtr = _567061975_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__567061975_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetKeepInteriorCornersSquare(comboBox: ComboBox?, value: Boolean): Unit {
      val fnPtr = _567061975_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__567061975_Ptr, marshalToNative(comboBox), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetKeepInteriorCornersSquare(comboBox: ComboBox?): Boolean {
      val fnPtr = _567061975_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__567061975_Ptr, marshalToNative(comboBox), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IComboBoxHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __567061975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec21be42ed025c109fbeaf1881cd877b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxHelperStatics(ptr: Pointer?): WithDefault =
        IComboBoxHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxHelperStatics {
      val address = segment.toRawLongValue()
      return makeIComboBoxHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__567061975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxHelperStatics): Array<IComboBoxHelperStatics?> =
        (elements as
        Array<IComboBoxHelperStatics?>).castToImpl<IComboBoxHelperStatics,IComboBoxHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxHelperStatics?> =
        arrayOfNulls<IComboBoxHelperStatics_Impl>(size) as Array<IComboBoxHelperStatics?>
  }
}
