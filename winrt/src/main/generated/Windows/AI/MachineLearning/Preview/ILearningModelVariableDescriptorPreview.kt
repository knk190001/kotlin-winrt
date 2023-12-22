package Windows.AI.MachineLearning.Preview

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILearningModelVariableDescriptorPreview.ABI::class)
@Signature("{b13df682-fc30-492b-8ea0-ed1f53c0b038}")
@Guid("b13df682fc30492b8ea0ed1f53c0b038")
@WinRTInterface("b13df682fc30492b8ea0ed1f53c0b038")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelVariableDescriptorPreview.ByReference::class)
public interface ILearningModelVariableDescriptorPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Description(): String?

  @InterfaceMethod(2)
  public fun get_ModelFeatureKind(): LearningModelFeatureKindPreview?

  @InterfaceMethod(3)
  public fun get_IsRequired(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelVariableDescriptorPreview> {
    public override fun getValue() =
        ABI.makeILearningModelVariableDescriptorPreview(pointer.getPointer(0))

    public fun setValue(value: ILearningModelVariableDescriptorPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelVariableDescriptorPreview {
    public val __614308553_Ptr: Pointer?

    public val _614308553_VtblPtr: Pointer?
      get() = __614308553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _614308553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__614308553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Description(): String? {
      val fnPtr = _614308553_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__614308553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ModelFeatureKind(): LearningModelFeatureKindPreview? {
      val fnPtr = _614308553_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelFeatureKindPreview>()
      val hr = fn.invokeHR(arrayOf(__614308553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelFeatureKindPreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsRequired(): Boolean {
      val fnPtr = _614308553_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__614308553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ILearningModelVariableDescriptorPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __614308553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelVariableDescriptorPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b13df682fc30492b8ea0ed1f53c0b038")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelVariableDescriptorPreview(ptr: Pointer?): WithDefault =
        ILearningModelVariableDescriptorPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ILearningModelVariableDescriptorPreview {
      val address = segment.toRawLongValue()
      return makeILearningModelVariableDescriptorPreview(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelVariableDescriptorPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__614308553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelVariableDescriptorPreview):
        Array<ILearningModelVariableDescriptorPreview?> = (elements as
        Array<ILearningModelVariableDescriptorPreview?>).castToImpl<ILearningModelVariableDescriptorPreview,ILearningModelVariableDescriptorPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelVariableDescriptorPreview?> =
        arrayOfNulls<ILearningModelVariableDescriptorPreview_Impl>(size) as
        Array<ILearningModelVariableDescriptorPreview?>
  }
}
