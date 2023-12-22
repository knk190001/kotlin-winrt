package Windows.AI.MachineLearning

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

@ABIMarker(ISequenceFeatureDescriptor.ABI::class)
@Signature("{84f6945a-562b-4d62-a851-739aced96668}")
@Guid("84f6945a562b4d62a851739aced96668")
@WinRTInterface("84f6945a562b4d62a851739aced96668")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISequenceFeatureDescriptor.ByReference::class)
public interface ISequenceFeatureDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ElementDescriptor(): ILearningModelFeatureDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISequenceFeatureDescriptor> {
    public override fun getValue() = ABI.makeISequenceFeatureDescriptor(pointer.getPointer(0))

    public fun setValue(value: ISequenceFeatureDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISequenceFeatureDescriptor {
    public val __367885445_Ptr: Pointer?

    public val _367885445_VtblPtr: Pointer?
      get() = __367885445_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ElementDescriptor(): ILearningModelFeatureDescriptor? {
      val fnPtr = _367885445_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ILearningModelFeatureDescriptor>()
      val hr = fn.invokeHR(arrayOf(__367885445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ILearningModelFeatureDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class ISequenceFeatureDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __367885445_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISequenceFeatureDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84f6945a562b4d62a851739aced96668")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISequenceFeatureDescriptor(ptr: Pointer?): WithDefault =
        ISequenceFeatureDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISequenceFeatureDescriptor {
      val address = segment.toRawLongValue()
      return makeISequenceFeatureDescriptor(Pointer(address))
    }

    public override fun toNative(obj: ISequenceFeatureDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__367885445_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISequenceFeatureDescriptor):
        Array<ISequenceFeatureDescriptor?> = (elements as
        Array<ISequenceFeatureDescriptor?>).castToImpl<ISequenceFeatureDescriptor,ISequenceFeatureDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISequenceFeatureDescriptor?> =
        arrayOfNulls<ISequenceFeatureDescriptor_Impl>(size) as Array<ISequenceFeatureDescriptor?>
  }
}
