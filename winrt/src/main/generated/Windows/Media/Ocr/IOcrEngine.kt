package Windows.Media.Ocr

import Windows.Foundation.IAsyncOperation
import Windows.Globalization.Language
import Windows.Graphics.Imaging.SoftwareBitmap
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

@ABIMarker(IOcrEngine.ABI::class)
@Signature("{5a14bc41-5b76-3140-b680-8825562683ac}")
@Guid("5a14bc415b763140b6808825562683ac")
@WinRTInterface("5a14bc415b763140b6808825562683ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOcrEngine.ByReference::class)
public interface IOcrEngine : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RecognizeAsync(bitmap: SoftwareBitmap?): IAsyncOperation<OcrResult?>?

  @InterfaceMethod(1)
  public fun get_RecognizerLanguage(): Language?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IOcrEngine> {
    public override fun getValue() = ABI.makeIOcrEngine(pointer.getPointer(0))

    public fun setValue(value: IOcrEngine_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOcrEngine {
    public val __186464640_Ptr: Pointer?

    public val _186464640_VtblPtr: Pointer?
      get() = __186464640_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RecognizeAsync(bitmap: SoftwareBitmap?): IAsyncOperation<OcrResult?>? {
      val fnPtr = _186464640_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<OcrResult?>>()
      val hr = fn.invokeHR(arrayOf(__186464640_Ptr, marshalToNative(bitmap), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<OcrResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RecognizerLanguage(): Language? {
      val fnPtr = _186464640_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Language>()
      val hr = fn.invokeHR(arrayOf(__186464640_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Language>(result.getValue())
      return resultValue
    }
  }

  public class IOcrEngine_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __186464640_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOcrEngine, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a14bc415b763140b6808825562683ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOcrEngine(ptr: Pointer?): WithDefault = IOcrEngine_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOcrEngine {
      val address = segment.toRawLongValue()
      return makeIOcrEngine(Pointer(address))
    }

    public override fun toNative(obj: IOcrEngine): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__186464640_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOcrEngine): Array<IOcrEngine?> = (elements as
        Array<IOcrEngine?>).castToImpl<IOcrEngine,IOcrEngine_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOcrEngine?> = arrayOfNulls<IOcrEngine_Impl>(size)
        as Array<IOcrEngine?>
  }
}
