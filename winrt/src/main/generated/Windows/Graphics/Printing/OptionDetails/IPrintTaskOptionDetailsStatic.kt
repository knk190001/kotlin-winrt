package Windows.Graphics.Printing.OptionDetails

import Windows.Graphics.Printing.PrintTaskOptions
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

@ABIMarker(IPrintTaskOptionDetailsStatic.ABI::class)
@Signature("{135da193-0961-4b6e-8766-f13b7fbccd58}")
@Guid("135da19309614b6e8766f13b7fbccd58")
@WinRTInterface("135da19309614b6e8766f13b7fbccd58")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskOptionDetailsStatic.ByReference::class)
public interface IPrintTaskOptionDetailsStatic : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFromPrintTaskOptions(printTaskOptions: PrintTaskOptions?): PrintTaskOptionDetails?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskOptionDetailsStatic> {
    public override fun getValue() = ABI.makeIPrintTaskOptionDetailsStatic(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskOptionDetailsStatic_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskOptionDetailsStatic {
    public val __1997373690_Ptr: Pointer?

    public val _1997373690_VtblPtr: Pointer?
      get() = __1997373690_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFromPrintTaskOptions(printTaskOptions: PrintTaskOptions?):
        PrintTaskOptionDetails? {
      val fnPtr = _1997373690_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskOptionDetails>()
      val hr = fn.invokeHR(arrayOf(__1997373690_Ptr, marshalToNative(printTaskOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTaskOptionDetails>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskOptionDetailsStatic_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1997373690_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskOptionDetailsStatic, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("135da19309614b6e8766f13b7fbccd58")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskOptionDetailsStatic(ptr: Pointer?): WithDefault =
        IPrintTaskOptionDetailsStatic_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskOptionDetailsStatic {
      val address = segment.toRawLongValue()
      return makeIPrintTaskOptionDetailsStatic(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskOptionDetailsStatic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1997373690_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskOptionDetailsStatic):
        Array<IPrintTaskOptionDetailsStatic?> = (elements as
        Array<IPrintTaskOptionDetailsStatic?>).castToImpl<IPrintTaskOptionDetailsStatic,IPrintTaskOptionDetailsStatic_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskOptionDetailsStatic?> =
        arrayOfNulls<IPrintTaskOptionDetailsStatic_Impl>(size) as
        Array<IPrintTaskOptionDetailsStatic?>
  }
}
