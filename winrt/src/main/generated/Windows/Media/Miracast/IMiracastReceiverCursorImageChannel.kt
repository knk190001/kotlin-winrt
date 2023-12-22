package Windows.Media.Miracast

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Graphics.PointInt32
import Windows.Graphics.SizeInt32
import Windows.Storage.Streams.IRandomAccessStreamWithContentType
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMiracastReceiverCursorImageChannel.ABI::class)
@Signature("{d9ac332d-723a-5a9d-b90a-81153efa2a0f}")
@Guid("d9ac332d723a5a9db90a81153efa2a0f")
@WinRTInterface("d9ac332d723a5a9db90a81153efa2a0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverCursorImageChannel.ByReference::class)
public interface IMiracastReceiverCursorImageChannel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_MaxImageSize(): SizeInt32?

  @InterfaceMethod(2)
  public fun get_Position(): PointInt32?

  @InterfaceMethod(3)
  public fun get_ImageStream(): IRandomAccessStreamWithContentType?

  @InterfaceMethod(4)
  public fun add_ImageStreamChanged(handler: TypedEventHandler<MiracastReceiverCursorImageChannel?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ImageStreamChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_PositionChanged(handler: TypedEventHandler<MiracastReceiverCursorImageChannel?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_PositionChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverCursorImageChannel> {
    public override fun getValue() =
        ABI.makeIMiracastReceiverCursorImageChannel(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverCursorImageChannel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverCursorImageChannel {
    public val __2076867231_Ptr: Pointer?

    public val _2076867231_VtblPtr: Pointer?
      get() = __2076867231_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _2076867231_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2076867231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MaxImageSize(): SizeInt32? {
      val fnPtr = _2076867231_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__2076867231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Position(): PointInt32? {
      val fnPtr = _2076867231_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointInt32>()
      val hr = fn.invokeHR(arrayOf(__2076867231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ImageStream(): IRandomAccessStreamWithContentType? {
      val fnPtr = _2076867231_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamWithContentType>()
      val hr = fn.invokeHR(arrayOf(__2076867231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamWithContentType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override
        fun add_ImageStreamChanged(handler: TypedEventHandler<MiracastReceiverCursorImageChannel?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2076867231_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2076867231_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ImageStreamChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2076867231_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076867231_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_PositionChanged(handler: TypedEventHandler<MiracastReceiverCursorImageChannel?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2076867231_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2076867231_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_PositionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2076867231_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076867231_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMiracastReceiverCursorImageChannel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2076867231_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverCursorImageChannel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9ac332d723a5a9db90a81153efa2a0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverCursorImageChannel(ptr: Pointer?): WithDefault =
        IMiracastReceiverCursorImageChannel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMiracastReceiverCursorImageChannel {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverCursorImageChannel(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverCursorImageChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2076867231_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverCursorImageChannel):
        Array<IMiracastReceiverCursorImageChannel?> = (elements as
        Array<IMiracastReceiverCursorImageChannel?>).castToImpl<IMiracastReceiverCursorImageChannel,IMiracastReceiverCursorImageChannel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverCursorImageChannel?> =
        arrayOfNulls<IMiracastReceiverCursorImageChannel_Impl>(size) as
        Array<IMiracastReceiverCursorImageChannel?>
  }
}
