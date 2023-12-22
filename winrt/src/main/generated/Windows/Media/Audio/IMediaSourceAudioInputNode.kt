package Windows.Media.Audio

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Media.Audio.IAudioInputNode.ABI.IID
import Windows.Media.Core.MediaSource
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaSourceAudioInputNode.ABI::class)
@Signature("{99d8983b-a88a-4041-8e4f-ddbac0c91fd3}")
@Guid("99d8983ba88a40418e4fddbac0c91fd3")
@WinRTInterface("99d8983ba88a40418e4fddbac0c91fd3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSourceAudioInputNode.ByReference::class)
public interface IMediaSourceAudioInputNode : NativeMapped, IWinRTInterface, IAudioInputNode,
    IAudioNode, IClosable, IAudioInputNode2 {
  @InterfaceMethod(0)
  public fun put_PlaybackSpeedFactor(value: Double): Unit

  @InterfaceMethod(1)
  public fun get_PlaybackSpeedFactor(): Double

  @InterfaceMethod(2)
  public fun get_Position(): TimeSpan?

  @InterfaceMethod(3)
  public fun Seek(position: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_StartTime(): IReference<TimeSpan?>?

  @InterfaceMethod(5)
  public fun put_StartTime(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(6)
  public fun get_EndTime(): IReference<TimeSpan?>?

  @InterfaceMethod(7)
  public fun put_EndTime(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(8)
  public fun get_LoopCount(): IReference<Int>?

  @InterfaceMethod(9)
  public fun put_LoopCount(value: IReference<Int>?): Unit

  @InterfaceMethod(10)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(11)
  public fun get_MediaSource(): MediaSource?

  @InterfaceMethod(12)
  public fun add_MediaSourceCompleted(handler: TypedEventHandler<MediaSourceAudioInputNode?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_MediaSourceCompleted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaSourceAudioInputNode> {
    public override fun getValue() = ABI.makeIMediaSourceAudioInputNode(pointer.getPointer(0))

    public fun setValue(value: IMediaSourceAudioInputNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSourceAudioInputNode, IAudioInputNode.WithDefault,
      IAudioNode.WithDefault, IClosable.WithDefault, IAudioInputNode2.WithDefault {
    public val __1189247789_Ptr: Pointer?

    public val _1189247789_VtblPtr: Pointer?
      get() = __1189247789_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_PlaybackSpeedFactor(value: Double): Unit {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_PlaybackSpeedFactor(): Double {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Position(): TimeSpan? {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Seek(position: TimeSpan?): Unit {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr, marshalToNative(position),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_StartTime(): IReference<TimeSpan?>? {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_StartTime(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_EndTime(): IReference<TimeSpan?>? {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_EndTime(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_LoopCount(): IReference<Int>? {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_LoopCount(value: IReference<Int>?): Unit {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_MediaSource(): MediaSource? {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override
        fun add_MediaSourceCompleted(handler: TypedEventHandler<MediaSourceAudioInputNode?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_MediaSourceCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1189247789_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1189247789_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaSourceAudioInputNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioInputNode, IAudioNode,
      IClosable, IAudioInputNode2 {
    public override val __801834558_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1189247789_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1950949744_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IAudioNode.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1189247789_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1189247789_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __912932428_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IAudioInputNode2.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1189247789_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1189247789_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSourceAudioInputNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("99d8983ba88a40418e4fddbac0c91fd3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSourceAudioInputNode(ptr: Pointer?): WithDefault =
        IMediaSourceAudioInputNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSourceAudioInputNode {
      val address = segment.toRawLongValue()
      return makeIMediaSourceAudioInputNode(Pointer(address))
    }

    public override fun toNative(obj: IMediaSourceAudioInputNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1189247789_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSourceAudioInputNode):
        Array<IMediaSourceAudioInputNode?> = (elements as
        Array<IMediaSourceAudioInputNode?>).castToImpl<IMediaSourceAudioInputNode,IMediaSourceAudioInputNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSourceAudioInputNode?> =
        arrayOfNulls<IMediaSourceAudioInputNode_Impl>(size) as Array<IMediaSourceAudioInputNode?>
  }
}
