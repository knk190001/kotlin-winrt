package Windows.Globalization.NumberFormatting

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

@ABIMarker(ISignificantDigitsOption.ABI::class)
@Signature("{1d4dfcdd-2d43-4ee8-bbf1-c1b26a711a58}")
@Guid("1d4dfcdd2d434ee8bbf1c1b26a711a58")
@WinRTInterface("1d4dfcdd2d434ee8bbf1c1b26a711a58")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISignificantDigitsOption.ByReference::class)
public interface ISignificantDigitsOption : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SignificantDigits(): Int

  @InterfaceMethod(1)
  public fun put_SignificantDigits(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISignificantDigitsOption> {
    public override fun getValue() = ABI.makeISignificantDigitsOption(pointer.getPointer(0))

    public fun setValue(value: ISignificantDigitsOption_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISignificantDigitsOption {
    public val __730319595_Ptr: Pointer?

    public val _730319595_VtblPtr: Pointer?
      get() = __730319595_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SignificantDigits(): Int {
      val fnPtr = _730319595_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__730319595_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SignificantDigits(value: Int): Unit {
      val fnPtr = _730319595_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__730319595_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISignificantDigitsOption_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __730319595_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISignificantDigitsOption, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d4dfcdd2d434ee8bbf1c1b26a711a58")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISignificantDigitsOption(ptr: Pointer?): WithDefault =
        ISignificantDigitsOption_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISignificantDigitsOption {
      val address = segment.toRawLongValue()
      return makeISignificantDigitsOption(Pointer(address))
    }

    public override fun toNative(obj: ISignificantDigitsOption): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__730319595_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISignificantDigitsOption):
        Array<ISignificantDigitsOption?> = (elements as
        Array<ISignificantDigitsOption?>).castToImpl<ISignificantDigitsOption,ISignificantDigitsOption_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISignificantDigitsOption?> =
        arrayOfNulls<ISignificantDigitsOption_Impl>(size) as Array<ISignificantDigitsOption?>
  }
}
