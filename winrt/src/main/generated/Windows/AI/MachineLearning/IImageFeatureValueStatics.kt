package Windows.AI.MachineLearning

import Windows.Media.VideoFrame
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

@ABIMarker(IImageFeatureValueStatics.ABI::class)
@Signature("{1bc317fd-23cb-4610-b085-c8e1c87ebaa0}")
@Guid("1bc317fd23cb4610b085c8e1c87ebaa0")
@WinRTInterface("1bc317fd23cb4610b085c8e1c87ebaa0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageFeatureValueStatics.ByReference::class)
public interface IImageFeatureValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromVideoFrame(image: VideoFrame?): ImageFeatureValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageFeatureValueStatics> {
    public override fun getValue() = ABI.makeIImageFeatureValueStatics(pointer.getPointer(0))

    public fun setValue(value: IImageFeatureValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageFeatureValueStatics {
    public val __2123144814_Ptr: Pointer?

    public val _2123144814_VtblPtr: Pointer?
      get() = __2123144814_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromVideoFrame(image: VideoFrame?): ImageFeatureValue? {
      val fnPtr = _2123144814_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageFeatureValue>()
      val hr = fn.invokeHR(arrayOf(__2123144814_Ptr, marshalToNative(image), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageFeatureValue>(result.getValue())
      return resultValue
    }
  }

  public class IImageFeatureValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2123144814_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageFeatureValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1bc317fd23cb4610b085c8e1c87ebaa0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageFeatureValueStatics(ptr: Pointer?): WithDefault =
        IImageFeatureValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageFeatureValueStatics {
      val address = segment.toRawLongValue()
      return makeIImageFeatureValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IImageFeatureValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2123144814_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageFeatureValueStatics):
        Array<IImageFeatureValueStatics?> = (elements as
        Array<IImageFeatureValueStatics?>).castToImpl<IImageFeatureValueStatics,IImageFeatureValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageFeatureValueStatics?> =
        arrayOfNulls<IImageFeatureValueStatics_Impl>(size) as Array<IImageFeatureValueStatics?>
  }
}
