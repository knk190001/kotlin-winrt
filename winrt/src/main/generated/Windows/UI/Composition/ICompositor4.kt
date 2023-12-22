package Windows.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositor4.ABI::class)
@Signature("{ae47e78a-7910-4425-a482-a05b758adce9}")
@Guid("ae47e78a79104425a482a05b758adce9")
@WinRTInterface("ae47e78a79104425a482a05b758adce9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositor4.ByReference::class)
public interface ICompositor4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateColorGradientStop(): CompositionColorGradientStop?

  @InterfaceMethod(1)
  public fun CreateColorGradientStop(offset: Float, color: Color?): CompositionColorGradientStop?

  @InterfaceMethod(2)
  public fun CreateLinearGradientBrush(): CompositionLinearGradientBrush?

  @InterfaceMethod(3)
  public fun CreateSpringScalarAnimation(): SpringScalarNaturalMotionAnimation?

  @InterfaceMethod(4)
  public fun CreateSpringVector2Animation(): SpringVector2NaturalMotionAnimation?

  @InterfaceMethod(5)
  public fun CreateSpringVector3Animation(): SpringVector3NaturalMotionAnimation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICompositor4> {
    public override fun getValue() = ABI.makeICompositor4(pointer.getPointer(0))

    public fun setValue(value: ICompositor4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositor4 {
    public val __2043002907_Ptr: Pointer?

    public val _2043002907_VtblPtr: Pointer?
      get() = __2043002907_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateColorGradientStop(): CompositionColorGradientStop? {
      val fnPtr = _2043002907_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionColorGradientStop>()
      val hr = fn.invokeHR(arrayOf(__2043002907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionColorGradientStop>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateColorGradientStop(offset: Float, color: Color?):
        CompositionColorGradientStop? {
      val fnPtr = _2043002907_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionColorGradientStop>()
      val hr = fn.invokeHR(arrayOf(__2043002907_Ptr, offset, marshalToNative(color), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionColorGradientStop>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateLinearGradientBrush(): CompositionLinearGradientBrush? {
      val fnPtr = _2043002907_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionLinearGradientBrush>()
      val hr = fn.invokeHR(arrayOf(__2043002907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionLinearGradientBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateSpringScalarAnimation(): SpringScalarNaturalMotionAnimation? {
      val fnPtr = _2043002907_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpringScalarNaturalMotionAnimation>()
      val hr = fn.invokeHR(arrayOf(__2043002907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpringScalarNaturalMotionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateSpringVector2Animation(): SpringVector2NaturalMotionAnimation? {
      val fnPtr = _2043002907_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpringVector2NaturalMotionAnimation>()
      val hr = fn.invokeHR(arrayOf(__2043002907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpringVector2NaturalMotionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateSpringVector3Animation(): SpringVector3NaturalMotionAnimation? {
      val fnPtr = _2043002907_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpringVector3NaturalMotionAnimation>()
      val hr = fn.invokeHR(arrayOf(__2043002907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpringVector3NaturalMotionAnimation>(result.getValue())
      return resultValue
    }
  }

  public class ICompositor4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2043002907_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositor4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae47e78a79104425a482a05b758adce9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositor4(ptr: Pointer?): WithDefault = ICompositor4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositor4 {
      val address = segment.toRawLongValue()
      return makeICompositor4(Pointer(address))
    }

    public override fun toNative(obj: ICompositor4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2043002907_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositor4): Array<ICompositor4?> = (elements as
        Array<ICompositor4?>).castToImpl<ICompositor4,ICompositor4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositor4?> =
        arrayOfNulls<ICompositor4_Impl>(size) as Array<ICompositor4?>
  }
}
