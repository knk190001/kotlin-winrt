package Microsoft.UI

import Windows.UI.Color
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IColorHelperStatics.ABI::class)
@Signature("{1d1d85a1-eb63-538a-84f0-019210bc406b}")
@Guid("1d1d85a1eb63538a84f0019210bc406b")
@WinRTInterface("1d1d85a1eb63538a84f0019210bc406b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorHelperStatics.ByReference::class)
public interface IColorHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromArgb(
    a: Byte,
    r: Byte,
    g: Byte,
    b: Byte
  ): Color?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorHelperStatics> {
    public override fun getValue() = ABI.makeIColorHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IColorHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorHelperStatics {
    public val __2121002377_Ptr: Pointer?

    public val _2121002377_VtblPtr: Pointer?
      get() = __2121002377_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromArgb(
      a: Byte,
      r: Byte,
      g: Byte,
      b: Byte
    ): Color? {
      val fnPtr = _2121002377_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__2121002377_Ptr, a, r, g, b, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }
  }

  public class IColorHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2121002377_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d1d85a1eb63538a84f0019210bc406b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorHelperStatics(ptr: Pointer?): WithDefault = IColorHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorHelperStatics {
      val address = segment.toRawLongValue()
      return makeIColorHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IColorHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2121002377_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorHelperStatics): Array<IColorHelperStatics?> =
        (elements as
        Array<IColorHelperStatics?>).castToImpl<IColorHelperStatics,IColorHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorHelperStatics?> =
        arrayOfNulls<IColorHelperStatics_Impl>(size) as Array<IColorHelperStatics?>
  }
}
