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
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INumberFormatter.ABI::class)
@Signature("{a5007c49-7676-4db7-8631-1b6ff265caa9}")
@Guid("a5007c4976764db786311b6ff265caa9")
@WinRTInterface("a5007c4976764db786311b6ff265caa9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberFormatter.ByReference::class)
public interface INumberFormatter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Format(value: Long): String?

  @InterfaceMethod(1)
  public fun Format(value: WinDef.ULONG): String?

  @InterfaceMethod(2)
  public fun Format(value: Double): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INumberFormatter> {
    public override fun getValue() = ABI.makeINumberFormatter(pointer.getPointer(0))

    public fun setValue(value: INumberFormatter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberFormatter {
    public val __559084446_Ptr: Pointer?

    public val _559084446_VtblPtr: Pointer?
      get() = __559084446_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Format(value: Long): String? {
      val fnPtr = _559084446_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__559084446_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Format(value: WinDef.ULONG): String? {
      val fnPtr = _559084446_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__559084446_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Format(value: Double): String? {
      val fnPtr = _559084446_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__559084446_Ptr, value, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class INumberFormatter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __559084446_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberFormatter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5007c4976764db786311b6ff265caa9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberFormatter(ptr: Pointer?): WithDefault = INumberFormatter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberFormatter {
      val address = segment.toRawLongValue()
      return makeINumberFormatter(Pointer(address))
    }

    public override fun toNative(obj: INumberFormatter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__559084446_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberFormatter): Array<INumberFormatter?> = (elements as
        Array<INumberFormatter?>).castToImpl<INumberFormatter,INumberFormatter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberFormatter?> =
        arrayOfNulls<INumberFormatter_Impl>(size) as Array<INumberFormatter?>
  }
}
