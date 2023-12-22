package Windows.AI.MachineLearning.Preview

import Windows.AI.MachineLearning.Preview.ILearningModelVariableDescriptorPreview.ABI.IID
import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapVariableDescriptorPreview.ABI::class)
@Signature("{3cb38370-c02b-4236-b3e8-6bdca49c3129}")
@Guid("3cb38370c02b4236b3e86bdca49c3129")
@WinRTInterface("3cb38370c02b4236b3e86bdca49c3129")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapVariableDescriptorPreview.ByReference::class)
public interface IMapVariableDescriptorPreview : NativeMapped, IWinRTInterface,
    ILearningModelVariableDescriptorPreview {
  @InterfaceMethod(0)
  public fun get_KeyKind(): FeatureElementKindPreview?

  @InterfaceMethod(1)
  public fun get_ValidStringKeys(): IIterable<String?>?

  @InterfaceMethod(2)
  public fun get_ValidIntegerKeys(): IIterable<Long>?

  @InterfaceMethod(3)
  public fun get_Fields(): ILearningModelVariableDescriptorPreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapVariableDescriptorPreview> {
    public override fun getValue() = ABI.makeIMapVariableDescriptorPreview(pointer.getPointer(0))

    public fun setValue(value: IMapVariableDescriptorPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapVariableDescriptorPreview,
      ILearningModelVariableDescriptorPreview.WithDefault {
    public val __539337242_Ptr: Pointer?

    public val _539337242_VtblPtr: Pointer?
      get() = __539337242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyKind(): FeatureElementKindPreview? {
      val fnPtr = _539337242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FeatureElementKindPreview>()
      val hr = fn.invokeHR(arrayOf(__539337242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FeatureElementKindPreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ValidStringKeys(): IIterable<String?>? {
      val fnPtr = _539337242_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<String?>>()
      val hr = fn.invokeHR(arrayOf(__539337242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ValidIntegerKeys(): IIterable<Long>? {
      val fnPtr = _539337242_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<Long>>()
      val hr = fn.invokeHR(arrayOf(__539337242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<Long>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Fields(): ILearningModelVariableDescriptorPreview? {
      val fnPtr = _539337242_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ILearningModelVariableDescriptorPreview>()
      val hr = fn.invokeHR(arrayOf(__539337242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ILearningModelVariableDescriptorPreview>(result.getValue())
      return resultValue
    }
  }

  public class IMapVariableDescriptorPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      ILearningModelVariableDescriptorPreview {
    public override val __614308553_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_539337242_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __539337242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapVariableDescriptorPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3cb38370c02b4236b3e86bdca49c3129")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapVariableDescriptorPreview(ptr: Pointer?): WithDefault =
        IMapVariableDescriptorPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapVariableDescriptorPreview {
      val address = segment.toRawLongValue()
      return makeIMapVariableDescriptorPreview(Pointer(address))
    }

    public override fun toNative(obj: IMapVariableDescriptorPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__539337242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapVariableDescriptorPreview):
        Array<IMapVariableDescriptorPreview?> = (elements as
        Array<IMapVariableDescriptorPreview?>).castToImpl<IMapVariableDescriptorPreview,IMapVariableDescriptorPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapVariableDescriptorPreview?> =
        arrayOfNulls<IMapVariableDescriptorPreview_Impl>(size) as
        Array<IMapVariableDescriptorPreview?>
  }
}
