package Windows.AI.MachineLearning

import Windows.AI.MachineLearning.ILearningModelFeatureValue.ABI.IID
import Windows.Foundation.Collections.IVectorView
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensor.ABI::class)
@Signature("{05489593-a305-4a25-ad09-440119b4b7f6}")
@Guid("05489593a3054a25ad09440119b4b7f6")
@WinRTInterface("05489593a3054a25ad09440119b4b7f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensor.ByReference::class)
public interface ITensor : NativeMapped, IWinRTInterface, ILearningModelFeatureValue {
  @InterfaceMethod(0)
  public fun get_TensorKind(): TensorKind?

  @InterfaceMethod(1)
  public fun get_Shape(): IVectorView<Long>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITensor> {
    public override fun getValue() = ABI.makeITensor(pointer.getPointer(0))

    public fun setValue(value: ITensor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensor, ILearningModelFeatureValue.WithDefault {
    public val __593465016_Ptr: Pointer?

    public val _593465016_VtblPtr: Pointer?
      get() = __593465016_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TensorKind(): TensorKind? {
      val fnPtr = _593465016_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorKind>()
      val hr = fn.invokeHR(arrayOf(__593465016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Shape(): IVectorView<Long>? {
      val fnPtr = _593465016_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Long>>()
      val hr = fn.invokeHR(arrayOf(__593465016_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Long>>(result.getValue())
      return resultValue
    }
  }

  public class ITensor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ILearningModelFeatureValue {
    public override val __608697945_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_593465016_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __593465016_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05489593a3054a25ad09440119b4b7f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensor(ptr: Pointer?): WithDefault = ITensor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensor {
      val address = segment.toRawLongValue()
      return makeITensor(Pointer(address))
    }

    public override fun toNative(obj: ITensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__593465016_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensor): Array<ITensor?> = (elements as
        Array<ITensor?>).castToImpl<ITensor,ITensor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensor?> = arrayOfNulls<ITensor_Impl>(size) as
        Array<ITensor?>
  }
}
