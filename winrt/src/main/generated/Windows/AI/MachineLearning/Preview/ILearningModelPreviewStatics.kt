package Windows.AI.MachineLearning.Preview

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(ILearningModelPreviewStatics.ABI::class)
@Signature("{164bbb60-8465-4786-8b93-2c16a89289d7}")
@Guid("164bbb60846547868b932c16a89289d7")
@WinRTInterface("164bbb60846547868b932c16a89289d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelPreviewStatics.ByReference::class)
public interface ILearningModelPreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadModelFromStorageFileAsync(modelFile: IStorageFile?):
      IAsyncOperation<LearningModelPreview?>?

  @InterfaceMethod(1)
  public fun LoadModelFromStreamAsync(modelStream: IRandomAccessStreamReference?):
      IAsyncOperation<LearningModelPreview?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelPreviewStatics> {
    public override fun getValue() = ABI.makeILearningModelPreviewStatics(pointer.getPointer(0))

    public fun setValue(value: ILearningModelPreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelPreviewStatics {
    public val __238815267_Ptr: Pointer?

    public val _238815267_VtblPtr: Pointer?
      get() = __238815267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadModelFromStorageFileAsync(modelFile: IStorageFile?):
        IAsyncOperation<LearningModelPreview?>? {
      val fnPtr = _238815267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LearningModelPreview?>>()
      val hr = fn.invokeHR(arrayOf(__238815267_Ptr, marshalToNative(modelFile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LearningModelPreview?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LoadModelFromStreamAsync(modelStream: IRandomAccessStreamReference?):
        IAsyncOperation<LearningModelPreview?>? {
      val fnPtr = _238815267_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LearningModelPreview?>>()
      val hr = fn.invokeHR(arrayOf(__238815267_Ptr, marshalToNative(modelStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LearningModelPreview?>>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelPreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __238815267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelPreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("164bbb60846547868b932c16a89289d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelPreviewStatics(ptr: Pointer?): WithDefault =
        ILearningModelPreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelPreviewStatics {
      val address = segment.toRawLongValue()
      return makeILearningModelPreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelPreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__238815267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelPreviewStatics):
        Array<ILearningModelPreviewStatics?> = (elements as
        Array<ILearningModelPreviewStatics?>).castToImpl<ILearningModelPreviewStatics,ILearningModelPreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelPreviewStatics?> =
        arrayOfNulls<ILearningModelPreviewStatics_Impl>(size) as
        Array<ILearningModelPreviewStatics?>
  }
}
