package Windows.Globalization.NumberFormatting

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

@ABIMarker(INumberParser.ABI::class)
@Signature("{e6659412-4a13-4a53-83a1-392fbe4cff9f}")
@Guid("e66594124a134a5383a1392fbe4cff9f")
@WinRTInterface("e66594124a134a5383a1392fbe4cff9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INumberParser.ByReference::class)
public interface INumberParser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ParseInt(text: String?): IReference<Long>?

  @InterfaceMethod(1)
  public fun ParseUInt(text: String?): IReference<WinDef.ULONG>?

  @InterfaceMethod(2)
  public fun ParseDouble(text: String?): IReference<Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<INumberParser>
      {
    public override fun getValue() = ABI.makeINumberParser(pointer.getPointer(0))

    public fun setValue(value: INumberParser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INumberParser {
    public val __185731531_Ptr: Pointer?

    public val _185731531_VtblPtr: Pointer?
      get() = __185731531_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ParseInt(text: String?): IReference<Long>? {
      val fnPtr = _185731531_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Long>>()
      val hr = fn.invokeHR(arrayOf(__185731531_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Long>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ParseUInt(text: String?): IReference<WinDef.ULONG>? {
      val fnPtr = _185731531_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__185731531_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ParseDouble(text: String?): IReference<Double>? {
      val fnPtr = _185731531_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__185731531_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }
  }

  public class INumberParser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __185731531_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INumberParser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e66594124a134a5383a1392fbe4cff9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINumberParser(ptr: Pointer?): WithDefault = INumberParser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INumberParser {
      val address = segment.toRawLongValue()
      return makeINumberParser(Pointer(address))
    }

    public override fun toNative(obj: INumberParser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__185731531_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INumberParser): Array<INumberParser?> = (elements as
        Array<INumberParser?>).castToImpl<INumberParser,INumberParser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INumberParser?> =
        arrayOfNulls<INumberParser_Impl>(size) as Array<INumberParser?>
  }
}
