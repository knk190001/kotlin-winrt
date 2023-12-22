package Windows.Media.AppRecording

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

@ABIMarker(IAppRecordingStatusDetails.ABI::class)
@Signature("{b538a9b0-14ed-4412-ac45-6d672c9c9949}")
@Guid("b538a9b014ed4412ac456d672c9c9949")
@WinRTInterface("b538a9b014ed4412ac456d672c9c9949")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppRecordingStatusDetails.ByReference::class)
public interface IAppRecordingStatusDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsAnyAppBroadcasting(): Boolean

  @InterfaceMethod(1)
  public fun get_IsCaptureResourceUnavailable(): Boolean

  @InterfaceMethod(2)
  public fun get_IsGameStreamInProgress(): Boolean

  @InterfaceMethod(3)
  public fun get_IsTimeSpanRecordingDisabled(): Boolean

  @InterfaceMethod(4)
  public fun get_IsGpuConstrained(): Boolean

  @InterfaceMethod(5)
  public fun get_IsAppInactive(): Boolean

  @InterfaceMethod(6)
  public fun get_IsBlockedForApp(): Boolean

  @InterfaceMethod(7)
  public fun get_IsDisabledByUser(): Boolean

  @InterfaceMethod(8)
  public fun get_IsDisabledBySystem(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppRecordingStatusDetails> {
    public override fun getValue() = ABI.makeIAppRecordingStatusDetails(pointer.getPointer(0))

    public fun setValue(value: IAppRecordingStatusDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppRecordingStatusDetails {
    public val __1060805308_Ptr: Pointer?

    public val _1060805308_VtblPtr: Pointer?
      get() = __1060805308_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsAnyAppBroadcasting(): Boolean {
      val fnPtr = _1060805308_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1060805308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsCaptureResourceUnavailable(): Boolean {
      val fnPtr = _1060805308_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1060805308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsGameStreamInProgress(): Boolean {
      val fnPtr = _1060805308_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1060805308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsTimeSpanRecordingDisabled(): Boolean {
      val fnPtr = _1060805308_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1060805308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsGpuConstrained(): Boolean {
      val fnPtr = _1060805308_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1060805308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsAppInactive(): Boolean {
      val fnPtr = _1060805308_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1060805308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsBlockedForApp(): Boolean {
      val fnPtr = _1060805308_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1060805308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_IsDisabledByUser(): Boolean {
      val fnPtr = _1060805308_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1060805308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_IsDisabledBySystem(): Boolean {
      val fnPtr = _1060805308_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1060805308_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppRecordingStatusDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1060805308_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppRecordingStatusDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b538a9b014ed4412ac456d672c9c9949")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppRecordingStatusDetails(ptr: Pointer?): WithDefault =
        IAppRecordingStatusDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppRecordingStatusDetails {
      val address = segment.toRawLongValue()
      return makeIAppRecordingStatusDetails(Pointer(address))
    }

    public override fun toNative(obj: IAppRecordingStatusDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1060805308_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppRecordingStatusDetails):
        Array<IAppRecordingStatusDetails?> = (elements as
        Array<IAppRecordingStatusDetails?>).castToImpl<IAppRecordingStatusDetails,IAppRecordingStatusDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppRecordingStatusDetails?> =
        arrayOfNulls<IAppRecordingStatusDetails_Impl>(size) as Array<IAppRecordingStatusDetails?>
  }
}
