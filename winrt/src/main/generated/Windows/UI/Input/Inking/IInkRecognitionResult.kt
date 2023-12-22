package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Rect
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

@ABIMarker(IInkRecognitionResult.ABI::class)
@Signature("{36461a94-5068-40ef-8a05-2c2fb60908a2}")
@Guid("36461a94506840ef8a052c2fb60908a2")
@WinRTInterface("36461a94506840ef8a052c2fb60908a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkRecognitionResult.ByReference::class)
public interface IInkRecognitionResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BoundingRect(): Rect?

  @InterfaceMethod(1)
  public fun GetTextCandidates(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun GetStrokes(): IVectorView<InkStroke?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkRecognitionResult> {
    public override fun getValue() = ABI.makeIInkRecognitionResult(pointer.getPointer(0))

    public fun setValue(value: IInkRecognitionResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkRecognitionResult {
    public val __1007263752_Ptr: Pointer?

    public val _1007263752_VtblPtr: Pointer?
      get() = __1007263752_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BoundingRect(): Rect? {
      val fnPtr = _1007263752_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1007263752_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetTextCandidates(): IVectorView<String?>? {
      val fnPtr = _1007263752_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1007263752_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetStrokes(): IVectorView<InkStroke?>? {
      val fnPtr = _1007263752_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<InkStroke?>>()
      val hr = fn.invokeHR(arrayOf(__1007263752_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<InkStroke?>>(result.getValue())
      return resultValue
    }
  }

  public class IInkRecognitionResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1007263752_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkRecognitionResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("36461a94506840ef8a052c2fb60908a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkRecognitionResult(ptr: Pointer?): WithDefault =
        IInkRecognitionResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkRecognitionResult {
      val address = segment.toRawLongValue()
      return makeIInkRecognitionResult(Pointer(address))
    }

    public override fun toNative(obj: IInkRecognitionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1007263752_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkRecognitionResult): Array<IInkRecognitionResult?> =
        (elements as
        Array<IInkRecognitionResult?>).castToImpl<IInkRecognitionResult,IInkRecognitionResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkRecognitionResult?> =
        arrayOfNulls<IInkRecognitionResult_Impl>(size) as Array<IInkRecognitionResult?>
  }
}
