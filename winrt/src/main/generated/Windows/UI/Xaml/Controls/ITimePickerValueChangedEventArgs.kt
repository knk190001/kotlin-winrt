package Windows.UI.Xaml.Controls

import Windows.Foundation.TimeSpan
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

@ABIMarker(ITimePickerValueChangedEventArgs.ABI::class)
@Signature("{2f4edb8d-b995-4e31-8ba9-c4dcdeb21ca3}")
@Guid("2f4edb8db9954e318ba9c4dcdeb21ca3")
@WinRTInterface("2f4edb8db9954e318ba9c4dcdeb21ca3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerValueChangedEventArgs.ByReference::class)
public interface ITimePickerValueChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_NewTime(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerValueChangedEventArgs> {
    public override fun getValue() = ABI.makeITimePickerValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITimePickerValueChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerValueChangedEventArgs {
    public val __2041815235_Ptr: Pointer?

    public val _2041815235_VtblPtr: Pointer?
      get() = __2041815235_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldTime(): TimeSpan? {
      val fnPtr = _2041815235_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2041815235_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewTime(): TimeSpan? {
      val fnPtr = _2041815235_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2041815235_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class ITimePickerValueChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2041815235_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerValueChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f4edb8db9954e318ba9c4dcdeb21ca3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerValueChangedEventArgs(ptr: Pointer?): WithDefault =
        ITimePickerValueChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimePickerValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeITimePickerValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2041815235_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerValueChangedEventArgs):
        Array<ITimePickerValueChangedEventArgs?> = (elements as
        Array<ITimePickerValueChangedEventArgs?>).castToImpl<ITimePickerValueChangedEventArgs,ITimePickerValueChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerValueChangedEventArgs?> =
        arrayOfNulls<ITimePickerValueChangedEventArgs_Impl>(size) as
        Array<ITimePickerValueChangedEventArgs?>
  }
}
