package Windows.AI.MachineLearning

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILearningModelStatics.ABI::class)
@Signature("{e3b977e8-6952-4e47-8ef4-1f7f07897c6d}")
@Guid("e3b977e869524e478ef41f7f07897c6d")
@WinRTInterface("e3b977e869524e478ef41f7f07897c6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILearningModelStatics.ByReference::class)
public interface ILearningModelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadFromStorageFileAsync(modelFile: IStorageFile?): IAsyncOperation<LearningModel?>?

  @InterfaceMethod(1)
  public fun LoadFromStreamAsync(modelStream: IRandomAccessStreamReference?):
      IAsyncOperation<LearningModel?>?

  @InterfaceMethod(2)
  public fun LoadFromFilePath(filePath: String?): LearningModel?

  @InterfaceMethod(3)
  public fun LoadFromStream(modelStream: IRandomAccessStreamReference?): LearningModel?

  @InterfaceMethod(4)
  public fun LoadFromStorageFileAsync(modelFile: IStorageFile?,
      operatorProvider: ILearningModelOperatorProvider?): IAsyncOperation<LearningModel?>?

  @InterfaceMethod(5)
  public fun LoadFromStreamAsync(modelStream: IRandomAccessStreamReference?,
      operatorProvider: ILearningModelOperatorProvider?): IAsyncOperation<LearningModel?>?

  @InterfaceMethod(6)
  public fun LoadFromFilePath(filePath: String?, operatorProvider: ILearningModelOperatorProvider?):
      LearningModel?

  @InterfaceMethod(7)
  public fun LoadFromStream(modelStream: IRandomAccessStreamReference?,
      operatorProvider: ILearningModelOperatorProvider?): LearningModel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILearningModelStatics> {
    public override fun getValue() = ABI.makeILearningModelStatics(pointer.getPointer(0))

    public fun setValue(value: ILearningModelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILearningModelStatics {
    public val __1664497991_Ptr: Pointer?

    public val _1664497991_VtblPtr: Pointer?
      get() = __1664497991_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadFromStorageFileAsync(modelFile: IStorageFile?):
        IAsyncOperation<LearningModel?>? {
      val fnPtr = _1664497991_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LearningModel?>>()
      val hr = fn.invokeHR(arrayOf(__1664497991_Ptr, marshalToNative(modelFile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LearningModel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LoadFromStreamAsync(modelStream: IRandomAccessStreamReference?):
        IAsyncOperation<LearningModel?>? {
      val fnPtr = _1664497991_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LearningModel?>>()
      val hr = fn.invokeHR(arrayOf(__1664497991_Ptr, marshalToNative(modelStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LearningModel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun LoadFromFilePath(filePath: String?): LearningModel? {
      val fnPtr = _1664497991_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModel>()
      val hr = fn.invokeHR(arrayOf(__1664497991_Ptr, marshalToNative(filePath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun LoadFromStream(modelStream: IRandomAccessStreamReference?): LearningModel? {
      val fnPtr = _1664497991_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModel>()
      val hr = fn.invokeHR(arrayOf(__1664497991_Ptr, marshalToNative(modelStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun LoadFromStorageFileAsync(modelFile: IStorageFile?,
        operatorProvider: ILearningModelOperatorProvider?): IAsyncOperation<LearningModel?>? {
      val fnPtr = _1664497991_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LearningModel?>>()
      val hr = fn.invokeHR(arrayOf(__1664497991_Ptr, marshalToNative(modelFile),
          marshalToNative(operatorProvider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LearningModel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun LoadFromStreamAsync(modelStream: IRandomAccessStreamReference?,
        operatorProvider: ILearningModelOperatorProvider?): IAsyncOperation<LearningModel?>? {
      val fnPtr = _1664497991_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LearningModel?>>()
      val hr = fn.invokeHR(arrayOf(__1664497991_Ptr, marshalToNative(modelStream),
          marshalToNative(operatorProvider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LearningModel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun LoadFromFilePath(filePath: String?,
        operatorProvider: ILearningModelOperatorProvider?): LearningModel? {
      val fnPtr = _1664497991_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModel>()
      val hr = fn.invokeHR(arrayOf(__1664497991_Ptr, marshalToNative(filePath),
          marshalToNative(operatorProvider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun LoadFromStream(modelStream: IRandomAccessStreamReference?,
        operatorProvider: ILearningModelOperatorProvider?): LearningModel? {
      val fnPtr = _1664497991_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LearningModel>()
      val hr = fn.invokeHR(arrayOf(__1664497991_Ptr, marshalToNative(modelStream),
          marshalToNative(operatorProvider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LearningModel>(result.getValue())
      return resultValue
    }
  }

  public class ILearningModelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1664497991_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILearningModelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3b977e869524e478ef41f7f07897c6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILearningModelStatics(ptr: Pointer?): WithDefault =
        ILearningModelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILearningModelStatics {
      val address = segment.toRawLongValue()
      return makeILearningModelStatics(Pointer(address))
    }

    public override fun toNative(obj: ILearningModelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1664497991_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILearningModelStatics): Array<ILearningModelStatics?> =
        (elements as
        Array<ILearningModelStatics?>).castToImpl<ILearningModelStatics,ILearningModelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILearningModelStatics?> =
        arrayOfNulls<ILearningModelStatics_Impl>(size) as Array<ILearningModelStatics?>
  }
}
