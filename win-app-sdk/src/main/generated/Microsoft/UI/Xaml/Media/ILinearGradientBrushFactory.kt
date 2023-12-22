package Microsoft.UI.Xaml.Media

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

@ABIMarker(ILinearGradientBrushFactory.ABI::class)
@Signature("{c0ba7de3-ccfd-534c-882f-3ab39ae723f3}")
@Guid("c0ba7de3ccfd534c882f3ab39ae723f3")
@WinRTInterface("c0ba7de3ccfd534c882f3ab39ae723f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinearGradientBrushFactory.ByReference::class)
public interface ILinearGradientBrushFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun CreateInstanceWithGradientStopCollectionAndAngle(gradientStopCollection: GradientStopCollection?,
      angle: Double): LinearGradientBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinearGradientBrushFactory> {
    public override fun getValue() = ABI.makeILinearGradientBrushFactory(pointer.getPointer(0))

    public fun setValue(value: ILinearGradientBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinearGradientBrushFactory {
    public val __219583626_Ptr: Pointer?

    public val _219583626_VtblPtr: Pointer?
      get() = __219583626_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateInstanceWithGradientStopCollectionAndAngle(gradientStopCollection: GradientStopCollection?,
        angle: Double): LinearGradientBrush? {
      val fnPtr = _219583626_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LinearGradientBrush>()
      val hr = fn.invokeHR(arrayOf(__219583626_Ptr, marshalToNative(gradientStopCollection), angle,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LinearGradientBrush>(result.getValue())
      return resultValue
    }
  }

  public class ILinearGradientBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __219583626_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinearGradientBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0ba7de3ccfd534c882f3ab39ae723f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinearGradientBrushFactory(ptr: Pointer?): WithDefault =
        ILinearGradientBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILinearGradientBrushFactory {
      val address = segment.toRawLongValue()
      return makeILinearGradientBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: ILinearGradientBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__219583626_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinearGradientBrushFactory):
        Array<ILinearGradientBrushFactory?> = (elements as
        Array<ILinearGradientBrushFactory?>).castToImpl<ILinearGradientBrushFactory,ILinearGradientBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinearGradientBrushFactory?> =
        arrayOfNulls<ILinearGradientBrushFactory_Impl>(size) as Array<ILinearGradientBrushFactory?>
  }
}
