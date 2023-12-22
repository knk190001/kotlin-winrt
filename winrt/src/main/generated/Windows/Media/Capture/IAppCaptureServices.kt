package Windows.Media.Capture

import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppCaptureServices.ABI::class)
@Signature("{44fec0b5-34f5-4f18-ae8c-b9123abbfc0d}")
@Guid("44fec0b534f54f18ae8cb9123abbfc0d")
@WinRTInterface("44fec0b534f54f18ae8cb9123abbfc0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureServices.ByReference::class)
public interface IAppCaptureServices : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Record(): AppCaptureRecordOperation?

  @InterfaceMethod(1)
  public fun RecordTimeSpan(startTime: DateTime?, duration: TimeSpan?): AppCaptureRecordOperation?

  @InterfaceMethod(2)
  public fun get_CanCapture(): Boolean

  @InterfaceMethod(3)
  public fun get_State(): AppCaptureState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureServices> {
    public override fun getValue() = ABI.makeIAppCaptureServices(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureServices_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureServices {
    public val __655799493_Ptr: Pointer?

    public val _655799493_VtblPtr: Pointer?
      get() = __655799493_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Record(): AppCaptureRecordOperation? {
      val fnPtr = _655799493_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureRecordOperation>()
      val hr = fn.invokeHR(arrayOf(__655799493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureRecordOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RecordTimeSpan(startTime: DateTime?, duration: TimeSpan?):
        AppCaptureRecordOperation? {
      val fnPtr = _655799493_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureRecordOperation>()
      val hr = fn.invokeHR(arrayOf(__655799493_Ptr, marshalToNative(startTime),
          marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureRecordOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CanCapture(): Boolean {
      val fnPtr = _655799493_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__655799493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_State(): AppCaptureState? {
      val fnPtr = _655799493_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppCaptureState>()
      val hr = fn.invokeHR(arrayOf(__655799493_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppCaptureState>(result.getValue())
      return resultValue
    }
  }

  public class IAppCaptureServices_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __655799493_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureServices, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("44fec0b534f54f18ae8cb9123abbfc0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureServices(ptr: Pointer?): WithDefault = IAppCaptureServices_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureServices {
      val address = segment.toRawLongValue()
      return makeIAppCaptureServices(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureServices): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__655799493_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureServices): Array<IAppCaptureServices?> =
        (elements as
        Array<IAppCaptureServices?>).castToImpl<IAppCaptureServices,IAppCaptureServices_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureServices?> =
        arrayOfNulls<IAppCaptureServices_Impl>(size) as Array<IAppCaptureServices?>
  }
}
