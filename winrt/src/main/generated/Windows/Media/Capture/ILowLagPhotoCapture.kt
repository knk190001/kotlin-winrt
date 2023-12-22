package Windows.Media.Capture

import Windows.Foundation.IAsyncAction
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

@ABIMarker(ILowLagPhotoCapture.ABI::class)
@Signature("{a37251b7-6b44-473d-8f24-f703d6c0ec44}")
@Guid("a37251b76b44473d8f24f703d6c0ec44")
@WinRTInterface("a37251b76b44473d8f24f703d6c0ec44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILowLagPhotoCapture.ByReference::class)
public interface ILowLagPhotoCapture : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CaptureAsync(): IAsyncOperation<CapturedPhoto?>?

  @InterfaceMethod(1)
  public fun FinishAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILowLagPhotoCapture> {
    public override fun getValue() = ABI.makeILowLagPhotoCapture(pointer.getPointer(0))

    public fun setValue(value: ILowLagPhotoCapture_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILowLagPhotoCapture {
    public val __1390800714_Ptr: Pointer?

    public val _1390800714_VtblPtr: Pointer?
      get() = __1390800714_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CaptureAsync(): IAsyncOperation<CapturedPhoto?>? {
      val fnPtr = _1390800714_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CapturedPhoto?>>()
      val hr = fn.invokeHR(arrayOf(__1390800714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<CapturedPhoto?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FinishAsync(): IAsyncAction? {
      val fnPtr = _1390800714_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1390800714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ILowLagPhotoCapture_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1390800714_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILowLagPhotoCapture, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a37251b76b44473d8f24f703d6c0ec44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILowLagPhotoCapture(ptr: Pointer?): WithDefault = ILowLagPhotoCapture_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILowLagPhotoCapture {
      val address = segment.toRawLongValue()
      return makeILowLagPhotoCapture(Pointer(address))
    }

    public override fun toNative(obj: ILowLagPhotoCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1390800714_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILowLagPhotoCapture): Array<ILowLagPhotoCapture?> =
        (elements as
        Array<ILowLagPhotoCapture?>).castToImpl<ILowLagPhotoCapture,ILowLagPhotoCapture_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILowLagPhotoCapture?> =
        arrayOfNulls<ILowLagPhotoCapture_Impl>(size) as Array<ILowLagPhotoCapture?>
  }
}
