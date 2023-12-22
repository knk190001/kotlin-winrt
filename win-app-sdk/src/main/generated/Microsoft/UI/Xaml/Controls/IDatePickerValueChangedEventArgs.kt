package Microsoft.UI.Xaml.Controls

import Windows.Foundation.DateTime
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

@ABIMarker(IDatePickerValueChangedEventArgs.ABI::class)
@Signature("{bd4e36ca-f6ab-57cf-84f0-75d024084f20}")
@Guid("bd4e36caf6ab57cf84f075d024084f20")
@WinRTInterface("bd4e36caf6ab57cf84f075d024084f20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerValueChangedEventArgs.ByReference::class)
public interface IDatePickerValueChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldDate(): DateTime?

  @InterfaceMethod(1)
  public fun get_NewDate(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerValueChangedEventArgs> {
    public override fun getValue() = ABI.makeIDatePickerValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDatePickerValueChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerValueChangedEventArgs {
    public val __2030884529_Ptr: Pointer?

    public val _2030884529_VtblPtr: Pointer?
      get() = __2030884529_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldDate(): DateTime? {
      val fnPtr = _2030884529_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2030884529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewDate(): DateTime? {
      val fnPtr = _2030884529_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2030884529_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickerValueChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2030884529_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerValueChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd4e36caf6ab57cf84f075d024084f20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerValueChangedEventArgs(ptr: Pointer?): WithDefault =
        IDatePickerValueChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDatePickerValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2030884529_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerValueChangedEventArgs):
        Array<IDatePickerValueChangedEventArgs?> = (elements as
        Array<IDatePickerValueChangedEventArgs?>).castToImpl<IDatePickerValueChangedEventArgs,IDatePickerValueChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerValueChangedEventArgs?> =
        arrayOfNulls<IDatePickerValueChangedEventArgs_Impl>(size) as
        Array<IDatePickerValueChangedEventArgs?>
  }
}
