package Microsoft.UI.Xaml.Controls

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(IDatePickerSelectedValueChangedEventArgs.ABI::class)
@Signature("{305ed436-370f-5e82-acf2-f1413e8f9ec4}")
@Guid("305ed436370f5e82acf2f1413e8f9ec4")
@WinRTInterface("305ed436370f5e82acf2f1413e8f9ec4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerSelectedValueChangedEventArgs.ByReference::class)
public interface IDatePickerSelectedValueChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldDate(): IReference<DateTime?>?

  @InterfaceMethod(1)
  public fun get_NewDate(): IReference<DateTime?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerSelectedValueChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIDatePickerSelectedValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDatePickerSelectedValueChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerSelectedValueChangedEventArgs {
    public val __1121928662_Ptr: Pointer?

    public val _1121928662_VtblPtr: Pointer?
      get() = __1121928662_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldDate(): IReference<DateTime?>? {
      val fnPtr = _1121928662_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1121928662_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewDate(): IReference<DateTime?>? {
      val fnPtr = _1121928662_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1121928662_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerSelectedValueChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1121928662_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerSelectedValueChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("305ed436370f5e82acf2f1413e8f9ec4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerSelectedValueChangedEventArgs(ptr: Pointer?): WithDefault =
        IDatePickerSelectedValueChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDatePickerSelectedValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDatePickerSelectedValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerSelectedValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1121928662_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerSelectedValueChangedEventArgs):
        Array<IDatePickerSelectedValueChangedEventArgs?> = (elements as
        Array<IDatePickerSelectedValueChangedEventArgs?>).castToImpl<IDatePickerSelectedValueChangedEventArgs,IDatePickerSelectedValueChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerSelectedValueChangedEventArgs?> =
        arrayOfNulls<IDatePickerSelectedValueChangedEventArgs_Impl>(size) as
        Array<IDatePickerSelectedValueChangedEventArgs?>
  }
}
