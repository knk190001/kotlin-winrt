package Windows.UI.Xaml.Controls

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
@Signature("{1ae661b2-b1b4-4273-96e0-19daff187446}")
@Guid("1ae661b2b1b4427396e019daff187446")
@WinRTInterface("1ae661b2b1b4427396e019daff187446")
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
    public val __1401535932_Ptr: Pointer?

    public val _1401535932_VtblPtr: Pointer?
      get() = __1401535932_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldDate(): DateTime? {
      val fnPtr = _1401535932_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1401535932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewDate(): DateTime? {
      val fnPtr = _1401535932_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1401535932_Ptr,  result))
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
    public override val __1401535932_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerValueChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ae661b2b1b4427396e019daff187446")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerValueChangedEventArgs(ptr: Pointer?): WithDefault =
        IDatePickerValueChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDatePickerValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1401535932_Ptr))
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
