package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ICornerRadiusToThicknessConverterStatics.ABI::class)
@Signature("{92ad9d36-5483-5258-a43b-4356443087f1}")
@Guid("92ad9d3654835258a43b4356443087f1")
@WinRTInterface("92ad9d3654835258a43b4356443087f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICornerRadiusToThicknessConverterStatics.ByReference::class)
public interface ICornerRadiusToThicknessConverterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConversionKindProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MultiplierProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICornerRadiusToThicknessConverterStatics> {
    public override fun getValue() =
        ABI.makeICornerRadiusToThicknessConverterStatics(pointer.getPointer(0))

    public fun setValue(value: ICornerRadiusToThicknessConverterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICornerRadiusToThicknessConverterStatics {
    public val __160723494_Ptr: Pointer?

    public val _160723494_VtblPtr: Pointer?
      get() = __160723494_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConversionKindProperty(): DependencyProperty? {
      val fnPtr = _160723494_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__160723494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MultiplierProperty(): DependencyProperty? {
      val fnPtr = _160723494_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__160723494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ICornerRadiusToThicknessConverterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __160723494_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICornerRadiusToThicknessConverterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92ad9d3654835258a43b4356443087f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICornerRadiusToThicknessConverterStatics(ptr: Pointer?): WithDefault =
        ICornerRadiusToThicknessConverterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICornerRadiusToThicknessConverterStatics {
      val address = segment.toRawLongValue()
      return makeICornerRadiusToThicknessConverterStatics(Pointer(address))
    }

    public override fun toNative(obj: ICornerRadiusToThicknessConverterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__160723494_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICornerRadiusToThicknessConverterStatics):
        Array<ICornerRadiusToThicknessConverterStatics?> = (elements as
        Array<ICornerRadiusToThicknessConverterStatics?>).castToImpl<ICornerRadiusToThicknessConverterStatics,ICornerRadiusToThicknessConverterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICornerRadiusToThicknessConverterStatics?> =
        arrayOfNulls<ICornerRadiusToThicknessConverterStatics_Impl>(size) as
        Array<ICornerRadiusToThicknessConverterStatics?>
  }
}
