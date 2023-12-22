package Windows.Graphics.Printing.OptionDetails

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

@ABIMarker(IPrintTaskOptionChangedEventArgs.ABI::class)
@Signature("{65197d05-a5ee-4307-9407-9acad147679c}")
@Guid("65197d05a5ee430794079acad147679c")
@WinRTInterface("65197d05a5ee430794079acad147679c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskOptionChangedEventArgs.ByReference::class)
public interface IPrintTaskOptionChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OptionId(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskOptionChangedEventArgs> {
    public override fun getValue() = ABI.makeIPrintTaskOptionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskOptionChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskOptionChangedEventArgs {
    public val __1152987853_Ptr: Pointer?

    public val _1152987853_VtblPtr: Pointer?
      get() = __1152987853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OptionId(): IUnknown? {
      val fnPtr = _1152987853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1152987853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskOptionChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1152987853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskOptionChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("65197d05a5ee430794079acad147679c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskOptionChangedEventArgs(ptr: Pointer?): WithDefault =
        IPrintTaskOptionChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskOptionChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintTaskOptionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskOptionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1152987853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskOptionChangedEventArgs):
        Array<IPrintTaskOptionChangedEventArgs?> = (elements as
        Array<IPrintTaskOptionChangedEventArgs?>).castToImpl<IPrintTaskOptionChangedEventArgs,IPrintTaskOptionChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskOptionChangedEventArgs?> =
        arrayOfNulls<IPrintTaskOptionChangedEventArgs_Impl>(size) as
        Array<IPrintTaskOptionChangedEventArgs?>
  }
}
