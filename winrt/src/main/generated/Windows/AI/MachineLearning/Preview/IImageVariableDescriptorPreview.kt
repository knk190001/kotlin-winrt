package Windows.AI.MachineLearning.Preview

import Windows.AI.MachineLearning.Preview.ILearningModelVariableDescriptorPreview.ABI.IID
import Windows.Graphics.Imaging.BitmapPixelFormat
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IImageVariableDescriptorPreview.ABI::class)
@Signature("{7ae1fa72-029e-4dc5-a2f8-5fb763154150}")
@Guid("7ae1fa72029e4dc5a2f85fb763154150")
@WinRTInterface("7ae1fa72029e4dc5a2f85fb763154150")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageVariableDescriptorPreview.ByReference::class)
public interface IImageVariableDescriptorPreview : NativeMapped, IWinRTInterface,
    ILearningModelVariableDescriptorPreview {
  @InterfaceMethod(0)
  public fun get_BitmapPixelFormat(): BitmapPixelFormat?

  @InterfaceMethod(1)
  public fun get_Width(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Height(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageVariableDescriptorPreview> {
    public override fun getValue() = ABI.makeIImageVariableDescriptorPreview(pointer.getPointer(0))

    public fun setValue(value: IImageVariableDescriptorPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageVariableDescriptorPreview,
      ILearningModelVariableDescriptorPreview.WithDefault {
    public val __1091653241_Ptr: Pointer?

    public val _1091653241_VtblPtr: Pointer?
      get() = __1091653241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BitmapPixelFormat(): BitmapPixelFormat? {
      val fnPtr = _1091653241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__1091653241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _1091653241_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1091653241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _1091653241_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1091653241_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IImageVariableDescriptorPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      ILearningModelVariableDescriptorPreview {
    public override val __614308553_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1091653241_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1091653241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageVariableDescriptorPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ae1fa72029e4dc5a2f85fb763154150")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageVariableDescriptorPreview(ptr: Pointer?): WithDefault =
        IImageVariableDescriptorPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageVariableDescriptorPreview {
      val address = segment.toRawLongValue()
      return makeIImageVariableDescriptorPreview(Pointer(address))
    }

    public override fun toNative(obj: IImageVariableDescriptorPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1091653241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageVariableDescriptorPreview):
        Array<IImageVariableDescriptorPreview?> = (elements as
        Array<IImageVariableDescriptorPreview?>).castToImpl<IImageVariableDescriptorPreview,IImageVariableDescriptorPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageVariableDescriptorPreview?> =
        arrayOfNulls<IImageVariableDescriptorPreview_Impl>(size) as
        Array<IImageVariableDescriptorPreview?>
  }
}
