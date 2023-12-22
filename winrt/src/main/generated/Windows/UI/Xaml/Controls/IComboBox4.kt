package Windows.UI.Xaml.Controls

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

@ABIMarker(IComboBox4.ABI::class)
@Signature("{b7974f49-b05c-47f9-9aaf-d6f9187be5fd}")
@Guid("b7974f49b05c47f99aafd6f9187be5fd")
@WinRTInterface("b7974f49b05c47f99aafd6f9187be5fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBox4.ByReference::class)
public interface IComboBox4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionChangedTrigger(): ComboBoxSelectionChangedTrigger?

  @InterfaceMethod(1)
  public fun put_SelectionChangedTrigger(value: ComboBoxSelectionChangedTrigger?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IComboBox4> {
    public override fun getValue() = ABI.makeIComboBox4(pointer.getPointer(0))

    public fun setValue(value: IComboBox4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBox4 {
    public val __227077595_Ptr: Pointer?

    public val _227077595_VtblPtr: Pointer?
      get() = __227077595_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionChangedTrigger(): ComboBoxSelectionChangedTrigger? {
      val fnPtr = _227077595_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ComboBoxSelectionChangedTrigger>()
      val hr = fn.invokeHR(arrayOf(__227077595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ComboBoxSelectionChangedTrigger>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SelectionChangedTrigger(value: ComboBoxSelectionChangedTrigger?): Unit {
      val fnPtr = _227077595_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__227077595_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IComboBox4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __227077595_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBox4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7974f49b05c47f99aafd6f9187be5fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBox4(ptr: Pointer?): WithDefault = IComboBox4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBox4 {
      val address = segment.toRawLongValue()
      return makeIComboBox4(Pointer(address))
    }

    public override fun toNative(obj: IComboBox4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__227077595_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBox4): Array<IComboBox4?> = (elements as
        Array<IComboBox4?>).castToImpl<IComboBox4,IComboBox4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBox4?> = arrayOfNulls<IComboBox4_Impl>(size)
        as Array<IComboBox4?>
  }
}
