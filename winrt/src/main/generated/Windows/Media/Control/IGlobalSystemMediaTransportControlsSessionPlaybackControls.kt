package Windows.Media.Control

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

@ABIMarker(IGlobalSystemMediaTransportControlsSessionPlaybackControls.ABI::class)
@Signature("{6501a3e6-bc7a-503a-bb1b-68f158f3fb03}")
@Guid("6501a3e6bc7a503abb1b68f158f3fb03")
@WinRTInterface("6501a3e6bc7a503abb1b68f158f3fb03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IGlobalSystemMediaTransportControlsSessionPlaybackControls.ByReference::class)
public interface IGlobalSystemMediaTransportControlsSessionPlaybackControls : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPlayEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_IsPauseEnabled(): Boolean

  @InterfaceMethod(2)
  public fun get_IsStopEnabled(): Boolean

  @InterfaceMethod(3)
  public fun get_IsRecordEnabled(): Boolean

  @InterfaceMethod(4)
  public fun get_IsFastForwardEnabled(): Boolean

  @InterfaceMethod(5)
  public fun get_IsRewindEnabled(): Boolean

  @InterfaceMethod(6)
  public fun get_IsNextEnabled(): Boolean

  @InterfaceMethod(7)
  public fun get_IsPreviousEnabled(): Boolean

  @InterfaceMethod(8)
  public fun get_IsChannelUpEnabled(): Boolean

  @InterfaceMethod(9)
  public fun get_IsChannelDownEnabled(): Boolean

  @InterfaceMethod(10)
  public fun get_IsPlayPauseToggleEnabled(): Boolean

  @InterfaceMethod(11)
  public fun get_IsShuffleEnabled(): Boolean

  @InterfaceMethod(12)
  public fun get_IsRepeatEnabled(): Boolean

  @InterfaceMethod(13)
  public fun get_IsPlaybackRateEnabled(): Boolean

  @InterfaceMethod(14)
  public fun get_IsPlaybackPositionEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGlobalSystemMediaTransportControlsSessionPlaybackControls> {
    public override fun getValue() =
        ABI.makeIGlobalSystemMediaTransportControlsSessionPlaybackControls(pointer.getPointer(0))

    public fun setValue(value: IGlobalSystemMediaTransportControlsSessionPlaybackControls_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlobalSystemMediaTransportControlsSessionPlaybackControls {
    public val __2065801369_Ptr: Pointer?

    public val _2065801369_VtblPtr: Pointer?
      get() = __2065801369_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPlayEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsPauseEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsStopEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsRecordEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsFastForwardEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsRewindEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsNextEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_IsPreviousEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_IsChannelUpEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsChannelDownEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_IsPlayPauseToggleEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_IsShuffleEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_IsRepeatEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_IsPlaybackRateEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_IsPlaybackPositionEnabled(): Boolean {
      val fnPtr = _2065801369_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2065801369_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGlobalSystemMediaTransportControlsSessionPlaybackControls_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2065801369_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlobalSystemMediaTransportControlsSessionPlaybackControls,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6501a3e6bc7a503abb1b68f158f3fb03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlobalSystemMediaTransportControlsSessionPlaybackControls(ptr: Pointer?):
        WithDefault = IGlobalSystemMediaTransportControlsSessionPlaybackControls_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGlobalSystemMediaTransportControlsSessionPlaybackControls {
      val address = segment.toRawLongValue()
      return makeIGlobalSystemMediaTransportControlsSessionPlaybackControls(Pointer(address))
    }

    public override fun toNative(obj: IGlobalSystemMediaTransportControlsSessionPlaybackControls):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2065801369_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IGlobalSystemMediaTransportControlsSessionPlaybackControls):
        Array<IGlobalSystemMediaTransportControlsSessionPlaybackControls?> = (elements as
        Array<IGlobalSystemMediaTransportControlsSessionPlaybackControls?>).castToImpl<IGlobalSystemMediaTransportControlsSessionPlaybackControls,IGlobalSystemMediaTransportControlsSessionPlaybackControls_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IGlobalSystemMediaTransportControlsSessionPlaybackControls?> =
        arrayOfNulls<IGlobalSystemMediaTransportControlsSessionPlaybackControls_Impl>(size) as
        Array<IGlobalSystemMediaTransportControlsSessionPlaybackControls?>
  }
}
