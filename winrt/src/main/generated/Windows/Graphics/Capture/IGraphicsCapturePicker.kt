package Windows.Graphics.Capture

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

@ABIMarker(IGraphicsCapturePicker.ABI::class)
@Signature("{5a1711b3-ad79-4b4a-9336-1318fdde3539}")
@Guid("5a1711b3ad794b4a93361318fdde3539")
@WinRTInterface("5a1711b3ad794b4a93361318fdde3539")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGraphicsCapturePicker.ByReference::class)
public interface IGraphicsCapturePicker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PickSingleItemAsync(): IAsyncOperation<GraphicsCaptureItem?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGraphicsCapturePicker> {
    public override fun getValue() = ABI.makeIGraphicsCapturePicker(pointer.getPointer(0))

    public fun setValue(value: IGraphicsCapturePicker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGraphicsCapturePicker {
    public val __280914322_Ptr: Pointer?

    public val _280914322_VtblPtr: Pointer?
      get() = __280914322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PickSingleItemAsync(): IAsyncOperation<GraphicsCaptureItem?>? {
      val fnPtr = _280914322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GraphicsCaptureItem?>>()
      val hr = fn.invokeHR(arrayOf(__280914322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GraphicsCaptureItem?>>(result.getValue())
      return resultValue
    }
  }

  public class IGraphicsCapturePicker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __280914322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGraphicsCapturePicker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a1711b3ad794b4a93361318fdde3539")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGraphicsCapturePicker(ptr: Pointer?): WithDefault =
        IGraphicsCapturePicker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGraphicsCapturePicker {
      val address = segment.toRawLongValue()
      return makeIGraphicsCapturePicker(Pointer(address))
    }

    public override fun toNative(obj: IGraphicsCapturePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__280914322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGraphicsCapturePicker): Array<IGraphicsCapturePicker?> =
        (elements as
        Array<IGraphicsCapturePicker?>).castToImpl<IGraphicsCapturePicker,IGraphicsCapturePicker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGraphicsCapturePicker?> =
        arrayOfNulls<IGraphicsCapturePicker_Impl>(size) as Array<IGraphicsCapturePicker?>
  }
}
