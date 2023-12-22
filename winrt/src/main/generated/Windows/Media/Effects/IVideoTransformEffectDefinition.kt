package Windows.Media.Effects

import Windows.Foundation.Rect
import Windows.Foundation.Size
import Windows.Media.Effects.IVideoEffectDefinition.ABI.IID
import Windows.Media.MediaProperties.MediaMirroringOptions
import Windows.Media.MediaProperties.MediaRotation
import Windows.Media.Transcoding.MediaVideoProcessingAlgorithm
import Windows.UI.Color
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

@ABIMarker(IVideoTransformEffectDefinition.ABI::class)
@Signature("{9664bb6a-1ea6-4aa6-8074-abe8851ecae2}")
@Guid("9664bb6a1ea64aa68074abe8851ecae2")
@WinRTInterface("9664bb6a1ea64aa68074abe8851ecae2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoTransformEffectDefinition.ByReference::class)
public interface IVideoTransformEffectDefinition : NativeMapped, IWinRTInterface,
    IVideoEffectDefinition {
  @InterfaceMethod(0)
  public fun get_PaddingColor(): Color?

  @InterfaceMethod(1)
  public fun put_PaddingColor(value: Color?): Unit

  @InterfaceMethod(2)
  public fun get_OutputSize(): Size?

  @InterfaceMethod(3)
  public fun put_OutputSize(value: Size?): Unit

  @InterfaceMethod(4)
  public fun get_CropRectangle(): Rect?

  @InterfaceMethod(5)
  public fun put_CropRectangle(value: Rect?): Unit

  @InterfaceMethod(6)
  public fun get_Rotation(): MediaRotation?

  @InterfaceMethod(7)
  public fun put_Rotation(value: MediaRotation?): Unit

  @InterfaceMethod(8)
  public fun get_Mirror(): MediaMirroringOptions?

  @InterfaceMethod(9)
  public fun put_Mirror(value: MediaMirroringOptions?): Unit

  @InterfaceMethod(10)
  public fun put_ProcessingAlgorithm(value: MediaVideoProcessingAlgorithm?): Unit

  @InterfaceMethod(11)
  public fun get_ProcessingAlgorithm(): MediaVideoProcessingAlgorithm?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoTransformEffectDefinition> {
    public override fun getValue() = ABI.makeIVideoTransformEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: IVideoTransformEffectDefinition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoTransformEffectDefinition, IVideoEffectDefinition.WithDefault
      {
    public val __965800527_Ptr: Pointer?

    public val _965800527_VtblPtr: Pointer?
      get() = __965800527_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PaddingColor(): Color? {
      val fnPtr = _965800527_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PaddingColor(value: Color?): Unit {
      val fnPtr = _965800527_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OutputSize(): Size? {
      val fnPtr = _965800527_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_OutputSize(value: Size?): Unit {
      val fnPtr = _965800527_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CropRectangle(): Rect? {
      val fnPtr = _965800527_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CropRectangle(value: Rect?): Unit {
      val fnPtr = _965800527_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Rotation(): MediaRotation? {
      val fnPtr = _965800527_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaRotation>()
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaRotation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Rotation(value: MediaRotation?): Unit {
      val fnPtr = _965800527_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Mirror(): MediaMirroringOptions? {
      val fnPtr = _965800527_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaMirroringOptions>()
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaMirroringOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Mirror(value: MediaMirroringOptions?): Unit {
      val fnPtr = _965800527_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun put_ProcessingAlgorithm(value: MediaVideoProcessingAlgorithm?): Unit {
      val fnPtr = _965800527_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ProcessingAlgorithm(): MediaVideoProcessingAlgorithm? {
      val fnPtr = _965800527_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaVideoProcessingAlgorithm>()
      val hr = fn.invokeHR(arrayOf(__965800527_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaVideoProcessingAlgorithm>(result.getValue())
      return resultValue
    }
  }

  public class IVideoTransformEffectDefinition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVideoEffectDefinition {
    public override val __1115276221_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_965800527_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __965800527_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoTransformEffectDefinition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9664bb6a1ea64aa68074abe8851ecae2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoTransformEffectDefinition(ptr: Pointer?): WithDefault =
        IVideoTransformEffectDefinition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoTransformEffectDefinition {
      val address = segment.toRawLongValue()
      return makeIVideoTransformEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: IVideoTransformEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__965800527_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoTransformEffectDefinition):
        Array<IVideoTransformEffectDefinition?> = (elements as
        Array<IVideoTransformEffectDefinition?>).castToImpl<IVideoTransformEffectDefinition,IVideoTransformEffectDefinition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoTransformEffectDefinition?> =
        arrayOfNulls<IVideoTransformEffectDefinition_Impl>(size) as
        Array<IVideoTransformEffectDefinition?>
  }
}
