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

@ABIMarker(IDatePickedEventArgs.ABI::class)
@Signature("{a1527b12-59c1-4521-b28c-b176675e7c5a}")
@Guid("a1527b1259c14521b28cb176675e7c5a")
@WinRTInterface("a1527b1259c14521b28cb176675e7c5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickedEventArgs.ByReference::class)
public interface IDatePickedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OldDate(): DateTime?

  @InterfaceMethod(1)
  public fun get_NewDate(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickedEventArgs> {
    public override fun getValue() = ABI.makeIDatePickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDatePickedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickedEventArgs {
    public val __511823565_Ptr: Pointer?

    public val _511823565_VtblPtr: Pointer?
      get() = __511823565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldDate(): DateTime? {
      val fnPtr = _511823565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__511823565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewDate(): DateTime? {
      val fnPtr = _511823565_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__511823565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IDatePickedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __511823565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1527b1259c14521b28cb176675e7c5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickedEventArgs(ptr: Pointer?): WithDefault = IDatePickedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDatePickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDatePickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__511823565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickedEventArgs): Array<IDatePickedEventArgs?> =
        (elements as
        Array<IDatePickedEventArgs?>).castToImpl<IDatePickedEventArgs,IDatePickedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickedEventArgs?> =
        arrayOfNulls<IDatePickedEventArgs_Impl>(size) as Array<IDatePickedEventArgs?>
  }
}
