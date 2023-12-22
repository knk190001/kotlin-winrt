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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISignificantDigitsNumberRounder.ABI::class)
@Signature("{f5941bca-6646-4913-8c76-1b191ff94dfd}")
@Guid("f5941bca664649138c761b191ff94dfd")
@WinRTInterface("f5941bca664649138c761b191ff94dfd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISignificantDigitsNumberRounder.ByReference::class)
public interface ISignificantDigitsNumberRounder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RoundingAlgorithm(): RoundingAlgorithm?

  @InterfaceMethod(1)
  public fun put_RoundingAlgorithm(value: RoundingAlgorithm?): Unit

  @InterfaceMethod(2)
  public fun get_SignificantDigits(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_SignificantDigits(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISignificantDigitsNumberRounder> {
    public override fun getValue() = ABI.makeISignificantDigitsNumberRounder(pointer.getPointer(0))

    public fun setValue(value: ISignificantDigitsNumberRounder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISignificantDigitsNumberRounder {
    public val __705488892_Ptr: Pointer?

    public val _705488892_VtblPtr: Pointer?
      get() = __705488892_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RoundingAlgorithm(): RoundingAlgorithm? {
      val fnPtr = _705488892_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RoundingAlgorithm>()
      val hr = fn.invokeHR(arrayOf(__705488892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RoundingAlgorithm>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RoundingAlgorithm(value: RoundingAlgorithm?): Unit {
      val fnPtr = _705488892_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__705488892_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SignificantDigits(): WinDef.UINT {
      val fnPtr = _705488892_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__705488892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_SignificantDigits(value: WinDef.UINT): Unit {
      val fnPtr = _705488892_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__705488892_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISignificantDigitsNumberRounder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __705488892_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISignificantDigitsNumberRounder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5941bca664649138c761b191ff94dfd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISignificantDigitsNumberRounder(ptr: Pointer?): WithDefault =
        ISignificantDigitsNumberRounder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISignificantDigitsNumberRounder {
      val address = segment.toRawLongValue()
      return makeISignificantDigitsNumberRounder(Pointer(address))
    }

    public override fun toNative(obj: ISignificantDigitsNumberRounder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__705488892_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISignificantDigitsNumberRounder):
        Array<ISignificantDigitsNumberRounder?> = (elements as
        Array<ISignificantDigitsNumberRounder?>).castToImpl<ISignificantDigitsNumberRounder,ISignificantDigitsNumberRounder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISignificantDigitsNumberRounder?> =
        arrayOfNulls<ISignificantDigitsNumberRounder_Impl>(size) as
        Array<ISignificantDigitsNumberRounder?>
  }
}
