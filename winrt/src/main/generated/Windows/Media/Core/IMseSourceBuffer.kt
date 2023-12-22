package Windows.Media.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.IInputStream
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMseSourceBuffer.ABI::class)
@Signature("{0c1aa3e3-df8d-4079-a3fe-6849184b4e2f}")
@Guid("0c1aa3e3df8d4079a3fe6849184b4e2f")
@WinRTInterface("0c1aa3e3df8d4079a3fe6849184b4e2f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMseSourceBuffer.ByReference::class)
public interface IMseSourceBuffer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_UpdateStarting(handler: TypedEventHandler<MseSourceBuffer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_UpdateStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Updated(handler: TypedEventHandler<MseSourceBuffer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Updated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_UpdateEnded(handler: TypedEventHandler<MseSourceBuffer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_UpdateEnded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_ErrorOccurred(handler: TypedEventHandler<MseSourceBuffer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ErrorOccurred(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_Aborted(handler: TypedEventHandler<MseSourceBuffer?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_Aborted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun get_Mode(): MseAppendMode?

  @InterfaceMethod(11)
  public fun put_Mode(value: MseAppendMode?): Unit

  @InterfaceMethod(12)
  public fun get_IsUpdating(): Boolean

  @InterfaceMethod(13)
  public fun get_Buffered(): IVectorView<MseTimeRange?>?

  @InterfaceMethod(14)
  public fun get_TimestampOffset(): TimeSpan?

  @InterfaceMethod(15)
  public fun put_TimestampOffset(value: TimeSpan?): Unit

  @InterfaceMethod(16)
  public fun get_AppendWindowStart(): TimeSpan?

  @InterfaceMethod(17)
  public fun put_AppendWindowStart(value: TimeSpan?): Unit

  @InterfaceMethod(18)
  public fun get_AppendWindowEnd(): IReference<TimeSpan?>?

  @InterfaceMethod(19)
  public fun put_AppendWindowEnd(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(20)
  public fun AppendBuffer(buffer: IBuffer?): Unit

  @InterfaceMethod(21)
  public fun AppendStream(stream: IInputStream?): Unit

  @InterfaceMethod(22)
  public fun AppendStream(stream: IInputStream?, maxSize: WinDef.ULONG): Unit

  @InterfaceMethod(23)
  public fun Abort(): Unit

  @InterfaceMethod(24)
  public fun Remove(start: TimeSpan?, end: IReference<TimeSpan?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMseSourceBuffer> {
    public override fun getValue() = ABI.makeIMseSourceBuffer(pointer.getPointer(0))

    public fun setValue(value: IMseSourceBuffer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMseSourceBuffer {
    public val __722067941_Ptr: Pointer?

    public val _722067941_VtblPtr: Pointer?
      get() = __722067941_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_UpdateStarting(handler: TypedEventHandler<MseSourceBuffer?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _722067941_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_UpdateStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Updated(handler: TypedEventHandler<MseSourceBuffer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _722067941_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Updated(token: EventRegistrationToken?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_UpdateEnded(handler: TypedEventHandler<MseSourceBuffer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _722067941_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_UpdateEnded(token: EventRegistrationToken?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_ErrorOccurred(handler: TypedEventHandler<MseSourceBuffer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _722067941_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ErrorOccurred(token: EventRegistrationToken?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_Aborted(handler: TypedEventHandler<MseSourceBuffer?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _722067941_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_Aborted(token: EventRegistrationToken?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Mode(): MseAppendMode? {
      val fnPtr = _722067941_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MseAppendMode>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MseAppendMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Mode(value: MseAppendMode?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsUpdating(): Boolean {
      val fnPtr = _722067941_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_Buffered(): IVectorView<MseTimeRange?>? {
      val fnPtr = _722067941_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MseTimeRange?>>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MseTimeRange?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_TimestampOffset(): TimeSpan? {
      val fnPtr = _722067941_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_TimestampOffset(value: TimeSpan?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_AppendWindowStart(): TimeSpan? {
      val fnPtr = _722067941_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_AppendWindowStart(value: TimeSpan?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_AppendWindowEnd(): IReference<TimeSpan?>? {
      val fnPtr = _722067941_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_AppendWindowEnd(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun AppendBuffer(buffer: IBuffer?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun AppendStream(stream: IInputStream?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(stream),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun AppendStream(stream: IInputStream?, maxSize: WinDef.ULONG): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(stream), maxSize,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun Abort(): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun Remove(start: TimeSpan?, end: IReference<TimeSpan?>?): Unit {
      val fnPtr = _722067941_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__722067941_Ptr, marshalToNative(start), marshalToNative(end),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMseSourceBuffer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __722067941_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMseSourceBuffer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c1aa3e3df8d4079a3fe6849184b4e2f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMseSourceBuffer(ptr: Pointer?): WithDefault = IMseSourceBuffer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMseSourceBuffer {
      val address = segment.toRawLongValue()
      return makeIMseSourceBuffer(Pointer(address))
    }

    public override fun toNative(obj: IMseSourceBuffer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__722067941_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMseSourceBuffer): Array<IMseSourceBuffer?> = (elements as
        Array<IMseSourceBuffer?>).castToImpl<IMseSourceBuffer,IMseSourceBuffer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMseSourceBuffer?> =
        arrayOfNulls<IMseSourceBuffer_Impl>(size) as Array<IMseSourceBuffer?>
  }
}
