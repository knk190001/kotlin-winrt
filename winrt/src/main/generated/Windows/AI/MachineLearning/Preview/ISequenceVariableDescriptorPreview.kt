package Windows.AI.MachineLearning.Preview

import Windows.AI.MachineLearning.Preview.ILearningModelVariableDescriptorPreview.ABI.IID
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISequenceVariableDescriptorPreview.ABI::class)
@Signature("{9cd8f292-98b2-4530-a1b6-2ded5fecbc26}")
@Guid("9cd8f29298b24530a1b62ded5fecbc26")
@WinRTInterface("9cd8f29298b24530a1b62ded5fecbc26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISequenceVariableDescriptorPreview.ByReference::class)
public interface ISequenceVariableDescriptorPreview : NativeMapped, IWinRTInterface,
    ILearningModelVariableDescriptorPreview {
  @InterfaceMethod(0)
  public fun get_ElementType(): ILearningModelVariableDescriptorPreview?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISequenceVariableDescriptorPreview> {
    public override fun getValue() =
        ABI.makeISequenceVariableDescriptorPreview(pointer.getPointer(0))

    public fun setValue(value: ISequenceVariableDescriptorPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISequenceVariableDescriptorPreview,
      ILearningModelVariableDescriptorPreview.WithDefault {
    public val __1177193737_Ptr: Pointer?

    public val _1177193737_VtblPtr: Pointer?
      get() = __1177193737_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ElementType(): ILearningModelVariableDescriptorPreview? {
      val fnPtr = _1177193737_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ILearningModelVariableDescriptorPreview>()
      val hr = fn.invokeHR(arrayOf(__1177193737_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ILearningModelVariableDescriptorPreview>(result.getValue())
      return resultValue
    }
  }

  public class ISequenceVariableDescriptorPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      ILearningModelVariableDescriptorPreview {
    public override val __614308553_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1177193737_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1177193737_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISequenceVariableDescriptorPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9cd8f29298b24530a1b62ded5fecbc26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISequenceVariableDescriptorPreview(ptr: Pointer?): WithDefault =
        ISequenceVariableDescriptorPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISequenceVariableDescriptorPreview {
      val address = segment.toRawLongValue()
      return makeISequenceVariableDescriptorPreview(Pointer(address))
    }

    public override fun toNative(obj: ISequenceVariableDescriptorPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1177193737_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISequenceVariableDescriptorPreview):
        Array<ISequenceVariableDescriptorPreview?> = (elements as
        Array<ISequenceVariableDescriptorPreview?>).castToImpl<ISequenceVariableDescriptorPreview,ISequenceVariableDescriptorPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISequenceVariableDescriptorPreview?> =
        arrayOfNulls<ISequenceVariableDescriptorPreview_Impl>(size) as
        Array<ISequenceVariableDescriptorPreview?>
  }
}
