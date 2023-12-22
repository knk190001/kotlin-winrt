package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITensorFeatureDescriptor.ABI::class)
@Signature("{74455c80-946a-4310-a19c-ee0af028fce4}")
@Guid("74455c80946a4310a19cee0af028fce4")
@WinRTInterface("74455c80946a4310a19cee0af028fce4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITensorFeatureDescriptor.ByReference::class)
public interface ITensorFeatureDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TensorKind(): TensorKind?

  @InterfaceMethod(1)
  public fun get_Shape(): IVectorView<Long>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITensorFeatureDescriptor> {
    public override fun getValue() = ABI.makeITensorFeatureDescriptor(pointer.getPointer(0))

    public fun setValue(value: ITensorFeatureDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITensorFeatureDescriptor {
    public val __1138321197_Ptr: Pointer?

    public val _1138321197_VtblPtr: Pointer?
      get() = __1138321197_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TensorKind(): TensorKind? {
      val fnPtr = _1138321197_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorKind>()
      val hr = fn.invokeHR(arrayOf(__1138321197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Shape(): IVectorView<Long>? {
      val fnPtr = _1138321197_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Long>>()
      val hr = fn.invokeHR(arrayOf(__1138321197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Long>>(result.getValue())
      return resultValue
    }
  }

  public class ITensorFeatureDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1138321197_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITensorFeatureDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74455c80946a4310a19cee0af028fce4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITensorFeatureDescriptor(ptr: Pointer?): WithDefault =
        ITensorFeatureDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITensorFeatureDescriptor {
      val address = segment.toRawLongValue()
      return makeITensorFeatureDescriptor(Pointer(address))
    }

    public override fun toNative(obj: ITensorFeatureDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1138321197_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITensorFeatureDescriptor):
        Array<ITensorFeatureDescriptor?> = (elements as
        Array<ITensorFeatureDescriptor?>).castToImpl<ITensorFeatureDescriptor,ITensorFeatureDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITensorFeatureDescriptor?> =
        arrayOfNulls<ITensorFeatureDescriptor_Impl>(size) as Array<ITensorFeatureDescriptor?>
  }
}
