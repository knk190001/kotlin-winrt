package Windows.Media.AppBroadcasting

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

@ABIMarker(IAppBroadcastingStatusDetails.ABI::class)
@Signature("{069dada4-b573-4e3c-8e19-1bafacd09713}")
@Guid("069dada4b5734e3c8e191bafacd09713")
@WinRTInterface("069dada4b5734e3c8e191bafacd09713")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastingStatusDetails.ByReference::class)
public interface IAppBroadcastingStatusDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsAnyAppBroadcasting(): Boolean

  @InterfaceMethod(1)
  public fun get_IsCaptureResourceUnavailable(): Boolean

  @InterfaceMethod(2)
  public fun get_IsGameStreamInProgress(): Boolean

  @InterfaceMethod(3)
  public fun get_IsGpuConstrained(): Boolean

  @InterfaceMethod(4)
  public fun get_IsAppInactive(): Boolean

  @InterfaceMethod(5)
  public fun get_IsBlockedForApp(): Boolean

  @InterfaceMethod(6)
  public fun get_IsDisabledByUser(): Boolean

  @InterfaceMethod(7)
  public fun get_IsDisabledBySystem(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastingStatusDetails> {
    public override fun getValue() = ABI.makeIAppBroadcastingStatusDetails(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastingStatusDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastingStatusDetails {
    public val __261196758_Ptr: Pointer?

    public val _261196758_VtblPtr: Pointer?
      get() = __261196758_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsAnyAppBroadcasting(): Boolean {
      val fnPtr = _261196758_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__261196758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsCaptureResourceUnavailable(): Boolean {
      val fnPtr = _261196758_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__261196758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsGameStreamInProgress(): Boolean {
      val fnPtr = _261196758_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__261196758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsGpuConstrained(): Boolean {
      val fnPtr = _261196758_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__261196758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsAppInactive(): Boolean {
      val fnPtr = _261196758_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__261196758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsBlockedForApp(): Boolean {
      val fnPtr = _261196758_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__261196758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsDisabledByUser(): Boolean {
      val fnPtr = _261196758_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__261196758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_IsDisabledBySystem(): Boolean {
      val fnPtr = _261196758_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__261196758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppBroadcastingStatusDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __261196758_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastingStatusDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("069dada4b5734e3c8e191bafacd09713")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastingStatusDetails(ptr: Pointer?): WithDefault =
        IAppBroadcastingStatusDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastingStatusDetails {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastingStatusDetails(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastingStatusDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__261196758_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastingStatusDetails):
        Array<IAppBroadcastingStatusDetails?> = (elements as
        Array<IAppBroadcastingStatusDetails?>).castToImpl<IAppBroadcastingStatusDetails,IAppBroadcastingStatusDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastingStatusDetails?> =
        arrayOfNulls<IAppBroadcastingStatusDetails_Impl>(size) as
        Array<IAppBroadcastingStatusDetails?>
  }
}
