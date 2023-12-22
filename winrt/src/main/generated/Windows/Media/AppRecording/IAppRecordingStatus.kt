package Windows.Media.AppRecording

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

@ABIMarker(IAppRecordingStatus.ABI::class)
@Signature("{1d0cc82c-bc18-4b8a-a6ef-127efab3b5d9}")
@Guid("1d0cc82cbc184b8aa6ef127efab3b5d9")
@WinRTInterface("1d0cc82cbc184b8aa6ef127efab3b5d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppRecordingStatus.ByReference::class)
public interface IAppRecordingStatus : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanRecord(): Boolean

  @InterfaceMethod(1)
  public fun get_CanRecordTimeSpan(): Boolean

  @InterfaceMethod(2)
  public fun get_HistoricalBufferDuration(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_Details(): AppRecordingStatusDetails?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppRecordingStatus> {
    public override fun getValue() = ABI.makeIAppRecordingStatus(pointer.getPointer(0))

    public fun setValue(value: IAppRecordingStatus_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppRecordingStatus {
    public val __819918682_Ptr: Pointer?

    public val _819918682_VtblPtr: Pointer?
      get() = __819918682_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanRecord(): Boolean {
      val fnPtr = _819918682_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__819918682_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CanRecordTimeSpan(): Boolean {
      val fnPtr = _819918682_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__819918682_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_HistoricalBufferDuration(): TimeSpan? {
      val fnPtr = _819918682_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__819918682_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Details(): AppRecordingStatusDetails? {
      val fnPtr = _819918682_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppRecordingStatusDetails>()
      val hr = fn.invokeHR(arrayOf(__819918682_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppRecordingStatusDetails>(result.getValue())
      return resultValue
    }
  }

  public class IAppRecordingStatus_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __819918682_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppRecordingStatus, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d0cc82cbc184b8aa6ef127efab3b5d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppRecordingStatus(ptr: Pointer?): WithDefault = IAppRecordingStatus_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppRecordingStatus {
      val address = segment.toRawLongValue()
      return makeIAppRecordingStatus(Pointer(address))
    }

    public override fun toNative(obj: IAppRecordingStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__819918682_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppRecordingStatus): Array<IAppRecordingStatus?> =
        (elements as
        Array<IAppRecordingStatus?>).castToImpl<IAppRecordingStatus,IAppRecordingStatus_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppRecordingStatus?> =
        arrayOfNulls<IAppRecordingStatus_Impl>(size) as Array<IAppRecordingStatus?>
  }
}
