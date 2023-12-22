package Microsoft.UI.Xaml.Controls.Primitives

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICornerRadiusToThicknessConverter.ABI::class)
@Signature("{b36aa8ae-166e-5ca5-93d2-95e9907c1222}")
@Guid("b36aa8ae166e5ca593d295e9907c1222")
@WinRTInterface("b36aa8ae166e5ca593d295e9907c1222")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICornerRadiusToThicknessConverter.ByReference::class)
public interface ICornerRadiusToThicknessConverter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConversionKind(): CornerRadiusToThicknessConverterKind?

  @InterfaceMethod(1)
  public fun put_ConversionKind(value: CornerRadiusToThicknessConverterKind?): Unit

  @InterfaceMethod(2)
  public fun get_Multiplier(): Double

  @InterfaceMethod(3)
  public fun put_Multiplier(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICornerRadiusToThicknessConverter> {
    public override fun getValue() =
        ABI.makeICornerRadiusToThicknessConverter(pointer.getPointer(0))

    public fun setValue(value: ICornerRadiusToThicknessConverter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICornerRadiusToThicknessConverter {
    public val __617514143_Ptr: Pointer?

    public val _617514143_VtblPtr: Pointer?
      get() = __617514143_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConversionKind(): CornerRadiusToThicknessConverterKind? {
      val fnPtr = _617514143_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadiusToThicknessConverterKind>()
      val hr = fn.invokeHR(arrayOf(__617514143_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadiusToThicknessConverterKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ConversionKind(value: CornerRadiusToThicknessConverterKind?): Unit {
      val fnPtr = _617514143_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617514143_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Multiplier(): Double {
      val fnPtr = _617514143_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__617514143_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Multiplier(value: Double): Unit {
      val fnPtr = _617514143_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617514143_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICornerRadiusToThicknessConverter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __617514143_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICornerRadiusToThicknessConverter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b36aa8ae166e5ca593d295e9907c1222")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICornerRadiusToThicknessConverter(ptr: Pointer?): WithDefault =
        ICornerRadiusToThicknessConverter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICornerRadiusToThicknessConverter {
      val address = segment.toRawLongValue()
      return makeICornerRadiusToThicknessConverter(Pointer(address))
    }

    public override fun toNative(obj: ICornerRadiusToThicknessConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__617514143_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICornerRadiusToThicknessConverter):
        Array<ICornerRadiusToThicknessConverter?> = (elements as
        Array<ICornerRadiusToThicknessConverter?>).castToImpl<ICornerRadiusToThicknessConverter,ICornerRadiusToThicknessConverter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICornerRadiusToThicknessConverter?> =
        arrayOfNulls<ICornerRadiusToThicknessConverter_Impl>(size) as
        Array<ICornerRadiusToThicknessConverter?>
  }
}
