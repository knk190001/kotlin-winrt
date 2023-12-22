package Microsoft.UI.Xaml.Controls

import Windows.Foundation.IReference
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

@ABIMarker(ITimePickerSelectedValueChangedEventArgs.ABI::class)
@Signature("{6ed7edf1-9b0b-5e7b-9e10-f35660a29fd2}")
@Guid("6ed7edf19b0b5e7b9e10f35660a29fd2")
@WinRTInterface("6ed7edf19b0b5e7b9e10f35660a29fd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimePickerSelectedValueChangedEventArgs.ByReference::class)
public interface ITimePickerSelectedValueChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldTime(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun get_NewTime(): IReference<TimeSpan?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimePickerSelectedValueChangedEventArgs> {
    public override fun getValue() =
        ABI.makeITimePickerSelectedValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITimePickerSelectedValueChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimePickerSelectedValueChangedEventArgs {
    public val __1408030295_Ptr: Pointer?

    public val _1408030295_VtblPtr: Pointer?
      get() = __1408030295_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldTime(): IReference<TimeSpan?>? {
      val fnPtr = _1408030295_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1408030295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewTime(): IReference<TimeSpan?>? {
      val fnPtr = _1408030295_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1408030295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }
  }

  public class ITimePickerSelectedValueChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1408030295_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimePickerSelectedValueChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ed7edf19b0b5e7b9e10f35660a29fd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimePickerSelectedValueChangedEventArgs(ptr: Pointer?): WithDefault =
        ITimePickerSelectedValueChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITimePickerSelectedValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeITimePickerSelectedValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITimePickerSelectedValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1408030295_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimePickerSelectedValueChangedEventArgs):
        Array<ITimePickerSelectedValueChangedEventArgs?> = (elements as
        Array<ITimePickerSelectedValueChangedEventArgs?>).castToImpl<ITimePickerSelectedValueChangedEventArgs,ITimePickerSelectedValueChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimePickerSelectedValueChangedEventArgs?> =
        arrayOfNulls<ITimePickerSelectedValueChangedEventArgs_Impl>(size) as
        Array<ITimePickerSelectedValueChangedEventArgs?>
  }
}
