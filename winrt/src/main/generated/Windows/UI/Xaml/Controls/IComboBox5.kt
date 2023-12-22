package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.Brush
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

@ABIMarker(IComboBox5.ABI::class)
@Signature("{ab79d646-800a-4a28-969b-34bb8fb458cf}")
@Guid("ab79d646800a4a28969b34bb8fb458cf")
@WinRTInterface("ab79d646800a4a28969b34bb8fb458cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBox5.ByReference::class)
public interface IComboBox5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlaceholderForeground(): Brush?

  @InterfaceMethod(1)
  public fun put_PlaceholderForeground(value: Brush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IComboBox5> {
    public override fun getValue() = ABI.makeIComboBox5(pointer.getPointer(0))

    public fun setValue(value: IComboBox5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBox5 {
    public val __227077596_Ptr: Pointer?

    public val _227077596_VtblPtr: Pointer?
      get() = __227077596_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlaceholderForeground(): Brush? {
      val fnPtr = _227077596_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__227077596_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PlaceholderForeground(value: Brush?): Unit {
      val fnPtr = _227077596_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__227077596_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IComboBox5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __227077596_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBox5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab79d646800a4a28969b34bb8fb458cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBox5(ptr: Pointer?): WithDefault = IComboBox5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBox5 {
      val address = segment.toRawLongValue()
      return makeIComboBox5(Pointer(address))
    }

    public override fun toNative(obj: IComboBox5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__227077596_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBox5): Array<IComboBox5?> = (elements as
        Array<IComboBox5?>).castToImpl<IComboBox5,IComboBox5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBox5?> = arrayOfNulls<IComboBox5_Impl>(size)
        as Array<IComboBox5?>
  }
}
