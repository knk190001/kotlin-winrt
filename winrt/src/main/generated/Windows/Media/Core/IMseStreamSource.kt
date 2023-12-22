package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Media.Core.IMediaSource.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IMseStreamSource.ABI::class)
@Signature("{b0b4198d-02f4-4923-88dd-81bc3f360ffa}")
@Guid("b0b4198d02f4492388dd81bc3f360ffa")
@WinRTInterface("b0b4198d02f4492388dd81bc3f360ffa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMseStreamSource.ByReference::class)
public interface IMseStreamSource : NativeMapped, IWinRTInterface, IMediaSource {
  @InterfaceMethod(0)
  public fun add_Opened(handler: TypedEventHandler<MseStreamSource?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Ended(handler: TypedEventHandler<MseStreamSource?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Ended(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Closed(handler: TypedEventHandler<MseStreamSource?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_SourceBuffers(): MseSourceBufferList?

  @InterfaceMethod(7)
  public fun get_ActiveSourceBuffers(): MseSourceBufferList?

  @InterfaceMethod(8)
  public fun get_ReadyState(): MseReadyState?

  @InterfaceMethod(9)
  public fun get_Duration(): IReference<TimeSpan?>?

  @InterfaceMethod(10)
  public fun put_Duration(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(11)
  public fun AddSourceBuffer(mimeType: String?): MseSourceBuffer?

  @InterfaceMethod(12)
  public fun RemoveSourceBuffer(buffer: MseSourceBuffer?): Unit

  @InterfaceMethod(13)
  public fun EndOfStream(status: MseEndOfStreamStatus?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMseStreamSource> {
    public override fun getValue() = ABI.makeIMseStreamSource(pointer.getPointer(0))

    public fun setValue(value: IMseStreamSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMseStreamSource, IMediaSource.WithDefault {
    public val __1555055259_Ptr: Pointer?

    public val _1555055259_VtblPtr: Pointer?
      get() = __1555055259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Opened(handler: TypedEventHandler<MseStreamSource?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Ended(handler: TypedEventHandler<MseStreamSource?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Ended(token: EventRegistrationToken?): Unit {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Closed(handler: TypedEventHandler<MseStreamSource?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SourceBuffers(): MseSourceBufferList? {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MseSourceBufferList>()
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MseSourceBufferList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ActiveSourceBuffers(): MseSourceBufferList? {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MseSourceBufferList>()
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MseSourceBufferList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ReadyState(): MseReadyState? {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MseReadyState>()
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MseReadyState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Duration(): IReference<TimeSpan?>? {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_Duration(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun AddSourceBuffer(mimeType: String?): MseSourceBuffer? {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MseSourceBuffer>()
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr, marshalToNative(mimeType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MseSourceBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun RemoveSourceBuffer(buffer: MseSourceBuffer?): Unit {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr, marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun EndOfStream(status: MseEndOfStreamStatus?): Unit {
      val fnPtr = _1555055259_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1555055259_Ptr, marshalToNative(status),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMseStreamSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaSource {
    public override val __1076644650_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1555055259_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1555055259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMseStreamSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0b4198d02f4492388dd81bc3f360ffa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMseStreamSource(ptr: Pointer?): WithDefault = IMseStreamSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMseStreamSource {
      val address = segment.toRawLongValue()
      return makeIMseStreamSource(Pointer(address))
    }

    public override fun toNative(obj: IMseStreamSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1555055259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMseStreamSource): Array<IMseStreamSource?> = (elements as
        Array<IMseStreamSource?>).castToImpl<IMseStreamSource,IMseStreamSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMseStreamSource?> =
        arrayOfNulls<IMseStreamSource_Impl>(size) as Array<IMseStreamSource?>
  }
}
