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

@ABIMarker(IImageFeatureValue.ABI::class)
@Signature("{f0414fd9-c9aa-4405-b7fb-94f87c8a3037}")
@Guid("f0414fd9c9aa4405b7fb94f87c8a3037")
@WinRTInterface("f0414fd9c9aa4405b7fb94f87c8a3037")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageFeatureValue.ByReference::class)
public interface IImageFeatureValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoFrame(): VideoFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageFeatureValue> {
    public override fun getValue() = ABI.makeIImageFeatureValue(pointer.getPointer(0))

    public fun setValue(value: IImageFeatureValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageFeatureValue {
    public val __1853888855_Ptr: Pointer?

    public val _1853888855_VtblPtr: Pointer?
      get() = __1853888855_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoFrame(): VideoFrame? {
      val fnPtr = _1853888855_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__1853888855_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }
  }

  public class IImageFeatureValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1853888855_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageFeatureValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0414fd9c9aa4405b7fb94f87c8a3037")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageFeatureValue(ptr: Pointer?): WithDefault = IImageFeatureValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageFeatureValue {
      val address = segment.toRawLongValue()
      return makeIImageFeatureValue(Pointer(address))
    }

    public override fun toNative(obj: IImageFeatureValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1853888855_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageFeatureValue): Array<IImageFeatureValue?> =
        (elements as
        Array<IImageFeatureValue?>).castToImpl<IImageFeatureValue,IImageFeatureValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageFeatureValue?> =
        arrayOfNulls<IImageFeatureValue_Impl>(size) as Array<IImageFeatureValue?>
  }
}
