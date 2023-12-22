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

@ABIMarker(IImageFeatureDescriptor2.ABI::class)
@Signature("{2b27cca7-d533-5862-bb98-1611b155b0e1}")
@Guid("2b27cca7d5335862bb981611b155b0e1")
@WinRTInterface("2b27cca7d5335862bb981611b155b0e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageFeatureDescriptor2.ByReference::class)
public interface IImageFeatureDescriptor2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PixelRange(): LearningModelPixelRange?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageFeatureDescriptor2> {
    public override fun getValue() = ABI.makeIImageFeatureDescriptor2(pointer.getPointer(0))

    public fun setValue(value: IImageFeatureDescriptor2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageFeatureDescriptor2 {
    public val __2032067063_Ptr: Pointer?

    public val _2032067063_VtblPtr: Pointer?
      get() = __2032067063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PixelRange(): LearningModelPixelRange? {
      val fnPtr = _2032067063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModelPixelRange>()
      val hr = fn.invokeHR(arrayOf(__2032067063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModelPixelRange>(result.getValue())
      return resultValue
    }
  }

  public class IImageFeatureDescriptor2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2032067063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageFeatureDescriptor2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b27cca7d5335862bb981611b155b0e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageFeatureDescriptor2(ptr: Pointer?): WithDefault =
        IImageFeatureDescriptor2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageFeatureDescriptor2 {
      val address = segment.toRawLongValue()
      return makeIImageFeatureDescriptor2(Pointer(address))
    }

    public override fun toNative(obj: IImageFeatureDescriptor2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2032067063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageFeatureDescriptor2):
        Array<IImageFeatureDescriptor2?> = (elements as
        Array<IImageFeatureDescriptor2?>).castToImpl<IImageFeatureDescriptor2,IImageFeatureDescriptor2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageFeatureDescriptor2?> =
        arrayOfNulls<IImageFeatureDescriptor2_Impl>(size) as Array<IImageFeatureDescriptor2?>
  }
}
