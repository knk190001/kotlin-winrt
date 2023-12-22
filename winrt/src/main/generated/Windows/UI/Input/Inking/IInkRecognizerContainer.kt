package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IInkRecognizerContainer.ABI::class)
@Signature("{a74d9a31-8047-4698-a912-f82a5085012f}")
@Guid("a74d9a3180474698a912f82a5085012f")
@WinRTInterface("a74d9a3180474698a912f82a5085012f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkRecognizerContainer.ByReference::class)
public interface IInkRecognizerContainer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetDefaultRecognizer(recognizer: InkRecognizer?): Unit

  @InterfaceMethod(1)
  public fun RecognizeAsync(strokeCollection: InkStrokeContainer?,
      recognitionTarget: InkRecognitionTarget?):
      IAsyncOperation<IVectorView<InkRecognitionResult?>?>?

  @InterfaceMethod(2)
  public fun GetRecognizers(): IVectorView<InkRecognizer?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkRecognizerContainer> {
    public override fun getValue() = ABI.makeIInkRecognizerContainer(pointer.getPointer(0))

    public fun setValue(value: IInkRecognizerContainer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkRecognizerContainer {
    public val __783661167_Ptr: Pointer?

    public val _783661167_VtblPtr: Pointer?
      get() = __783661167_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetDefaultRecognizer(recognizer: InkRecognizer?): Unit {
      val fnPtr = _783661167_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__783661167_Ptr, marshalToNative(recognizer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RecognizeAsync(strokeCollection: InkStrokeContainer?,
        recognitionTarget: InkRecognitionTarget?):
        IAsyncOperation<IVectorView<InkRecognitionResult?>?>? {
      val fnPtr = _783661167_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<InkRecognitionResult?>?>>()
      val hr = fn.invokeHR(arrayOf(__783661167_Ptr, marshalToNative(strokeCollection),
          marshalToNative(recognitionTarget), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<InkRecognitionResult?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetRecognizers(): IVectorView<InkRecognizer?>? {
      val fnPtr = _783661167_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<InkRecognizer?>>()
      val hr = fn.invokeHR(arrayOf(__783661167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<InkRecognizer?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkRecognizerContainer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __783661167_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkRecognizerContainer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a74d9a3180474698a912f82a5085012f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkRecognizerContainer(ptr: Pointer?): WithDefault =
        IInkRecognizerContainer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkRecognizerContainer {
      val address = segment.toRawLongValue()
      return makeIInkRecognizerContainer(Pointer(address))
    }

    public override fun toNative(obj: IInkRecognizerContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__783661167_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkRecognizerContainer): Array<IInkRecognizerContainer?>
        = (elements as
        Array<IInkRecognizerContainer?>).castToImpl<IInkRecognizerContainer,IInkRecognizerContainer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkRecognizerContainer?> =
        arrayOfNulls<IInkRecognizerContainer_Impl>(size) as Array<IInkRecognizerContainer?>
  }
}
