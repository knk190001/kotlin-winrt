package Windows.UI.Composition.Interactions

import Windows.UI.Composition.ExpressionAnimation
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

@ABIMarker(ICompositionConditionalValue.ABI::class)
@Signature("{43250538-eb73-4561-a71d-1a43eaeb7a9b}")
@Guid("43250538eb734561a71d1a43eaeb7a9b")
@WinRTInterface("43250538eb734561a71d1a43eaeb7a9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionConditionalValue.ByReference::class)
public interface ICompositionConditionalValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Condition(): ExpressionAnimation?

  @InterfaceMethod(1)
  public fun put_Condition(value: ExpressionAnimation?): Unit

  @InterfaceMethod(2)
  public fun get_Value(): ExpressionAnimation?

  @InterfaceMethod(3)
  public fun put_Value(value: ExpressionAnimation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionConditionalValue> {
    public override fun getValue() = ABI.makeICompositionConditionalValue(pointer.getPointer(0))

    public fun setValue(value: ICompositionConditionalValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionConditionalValue {
    public val __617948160_Ptr: Pointer?

    public val _617948160_VtblPtr: Pointer?
      get() = __617948160_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Condition(): ExpressionAnimation? {
      val fnPtr = _617948160_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpressionAnimation>()
      val hr = fn.invokeHR(arrayOf(__617948160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpressionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Condition(value: ExpressionAnimation?): Unit {
      val fnPtr = _617948160_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617948160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Value(): ExpressionAnimation? {
      val fnPtr = _617948160_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpressionAnimation>()
      val hr = fn.invokeHR(arrayOf(__617948160_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpressionAnimation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Value(value: ExpressionAnimation?): Unit {
      val fnPtr = _617948160_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__617948160_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionConditionalValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __617948160_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionConditionalValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43250538eb734561a71d1a43eaeb7a9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionConditionalValue(ptr: Pointer?): WithDefault =
        ICompositionConditionalValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionConditionalValue {
      val address = segment.toRawLongValue()
      return makeICompositionConditionalValue(Pointer(address))
    }

    public override fun toNative(obj: ICompositionConditionalValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__617948160_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionConditionalValue):
        Array<ICompositionConditionalValue?> = (elements as
        Array<ICompositionConditionalValue?>).castToImpl<ICompositionConditionalValue,ICompositionConditionalValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionConditionalValue?> =
        arrayOfNulls<ICompositionConditionalValue_Impl>(size) as
        Array<ICompositionConditionalValue?>
  }
}
