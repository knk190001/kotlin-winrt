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

@ABIMarker(IMapFeatureDescriptor.ABI::class)
@Signature("{530424bd-a257-436d-9e60-c2981f7cc5c4}")
@Guid("530424bda257436d9e60c2981f7cc5c4")
@WinRTInterface("530424bda257436d9e60c2981f7cc5c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapFeatureDescriptor.ByReference::class)
public interface IMapFeatureDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyKind(): TensorKind?

  @InterfaceMethod(1)
  public fun get_ValueDescriptor(): ILearningModelFeatureDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapFeatureDescriptor> {
    public override fun getValue() = ABI.makeIMapFeatureDescriptor(pointer.getPointer(0))

    public fun setValue(value: IMapFeatureDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapFeatureDescriptor {
    public val __1939750184_Ptr: Pointer?

    public val _1939750184_VtblPtr: Pointer?
      get() = __1939750184_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyKind(): TensorKind? {
      val fnPtr = _1939750184_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TensorKind>()
      val hr = fn.invokeHR(arrayOf(__1939750184_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TensorKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ValueDescriptor(): ILearningModelFeatureDescriptor? {
      val fnPtr = _1939750184_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ILearningModelFeatureDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1939750184_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ILearningModelFeatureDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class IMapFeatureDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1939750184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapFeatureDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("530424bda257436d9e60c2981f7cc5c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapFeatureDescriptor(ptr: Pointer?): WithDefault =
        IMapFeatureDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapFeatureDescriptor {
      val address = segment.toRawLongValue()
      return makeIMapFeatureDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IMapFeatureDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1939750184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapFeatureDescriptor): Array<IMapFeatureDescriptor?> =
        (elements as
        Array<IMapFeatureDescriptor?>).castToImpl<IMapFeatureDescriptor,IMapFeatureDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapFeatureDescriptor?> =
        arrayOfNulls<IMapFeatureDescriptor_Impl>(size) as Array<IMapFeatureDescriptor?>
  }
}
