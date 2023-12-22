package Windows.Media.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IClosable
import Windows.Media.FaceAnalysis.DetectedFace
import Windows.Media.IMediaFrame
import Windows.Media.IMediaFrame.ABI.IID
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

@ABIMarker(IFaceDetectionEffectFrame.ABI::class)
@Signature("{8ab08993-5dc8-447b-a247-5270bd802ece}")
@Guid("8ab089935dc8447ba2475270bd802ece")
@WinRTInterface("8ab089935dc8447ba2475270bd802ece")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFaceDetectionEffectFrame.ByReference::class)
public interface IFaceDetectionEffectFrame : NativeMapped, IWinRTInterface, IMediaFrame, IClosable {
  @InterfaceMethod(0)
  public fun get_DetectedFaces(): IVectorView<DetectedFace?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFaceDetectionEffectFrame> {
    public override fun getValue() = ABI.makeIFaceDetectionEffectFrame(pointer.getPointer(0))

    public fun setValue(value: IFaceDetectionEffectFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFaceDetectionEffectFrame, IMediaFrame.WithDefault,
      IClosable.WithDefault {
    public val __1956510825_Ptr: Pointer?

    public val _1956510825_VtblPtr: Pointer?
      get() = __1956510825_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DetectedFaces(): IVectorView<DetectedFace?>? {
      val fnPtr = _1956510825_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DetectedFace?>>()
      val hr = fn.invokeHR(arrayOf(__1956510825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DetectedFace?>>(result.getValue())
      return resultValue
    }
  }

  public class IFaceDetectionEffectFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaFrame, IClosable {
    public override val __1156286201_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1956510825_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1956510825_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1956510825_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFaceDetectionEffectFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ab089935dc8447ba2475270bd802ece")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFaceDetectionEffectFrame(ptr: Pointer?): WithDefault =
        IFaceDetectionEffectFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFaceDetectionEffectFrame {
      val address = segment.toRawLongValue()
      return makeIFaceDetectionEffectFrame(Pointer(address))
    }

    public override fun toNative(obj: IFaceDetectionEffectFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1956510825_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFaceDetectionEffectFrame):
        Array<IFaceDetectionEffectFrame?> = (elements as
        Array<IFaceDetectionEffectFrame?>).castToImpl<IFaceDetectionEffectFrame,IFaceDetectionEffectFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFaceDetectionEffectFrame?> =
        arrayOfNulls<IFaceDetectionEffectFrame_Impl>(size) as Array<IFaceDetectionEffectFrame?>
  }
}
