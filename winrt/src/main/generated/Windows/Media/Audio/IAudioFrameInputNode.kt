package Windows.Media.Audio

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.TypedEventHandler
import Windows.Media.Audio.IAudioInputNode.ABI.IID
import Windows.Media.AudioFrame
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IAudioFrameInputNode.ABI::class)
@Signature("{01b266c7-fd96-4ff5-a3c5-d27a9bf44237}")
@Guid("01b266c7fd964ff5a3c5d27a9bf44237")
@WinRTInterface("01b266c7fd964ff5a3c5d27a9bf44237")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioFrameInputNode.ByReference::class)
public interface IAudioFrameInputNode : NativeMapped, IWinRTInterface, IAudioInputNode, IAudioNode,
    IClosable {
  @InterfaceMethod(0)
  public fun put_PlaybackSpeedFactor(value: Double): Unit

  @InterfaceMethod(1)
  public fun get_PlaybackSpeedFactor(): Double

  @InterfaceMethod(2)
  public fun AddFrame(frame: AudioFrame?): Unit

  @InterfaceMethod(3)
  public fun DiscardQueuedFrames(): Unit

  @InterfaceMethod(4)
  public fun get_QueuedSampleCount(): WinDef.ULONG

  @InterfaceMethod(5)
  public fun add_AudioFrameCompleted(handler: TypedEventHandler<AudioFrameInputNode?,
      AudioFrameCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_AudioFrameCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_QuantumStarted(handler: TypedEventHandler<AudioFrameInputNode?,
      FrameInputNodeQuantumStartedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_QuantumStarted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioFrameInputNode> {
    public override fun getValue() = ABI.makeIAudioFrameInputNode(pointer.getPointer(0))

    public fun setValue(value: IAudioFrameInputNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioFrameInputNode, IAudioInputNode.WithDefault,
      IAudioNode.WithDefault, IClosable.WithDefault {
    public val __1762342931_Ptr: Pointer?

    public val _1762342931_VtblPtr: Pointer?
      get() = __1762342931_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_PlaybackSpeedFactor(value: Double): Unit {
      val fnPtr = _1762342931_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1762342931_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_PlaybackSpeedFactor(): Double {
      val fnPtr = _1762342931_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1762342931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun AddFrame(frame: AudioFrame?): Unit {
      val fnPtr = _1762342931_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1762342931_Ptr, marshalToNative(frame),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun DiscardQueuedFrames(): Unit {
      val fnPtr = _1762342931_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1762342931_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_QueuedSampleCount(): WinDef.ULONG {
      val fnPtr = _1762342931_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1762342931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun add_AudioFrameCompleted(handler: TypedEventHandler<AudioFrameInputNode?,
        AudioFrameCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1762342931_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1762342931_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_AudioFrameCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1762342931_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1762342931_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_QuantumStarted(handler: TypedEventHandler<AudioFrameInputNode?,
        FrameInputNodeQuantumStartedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1762342931_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1762342931_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_QuantumStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1762342931_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1762342931_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAudioFrameInputNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioInputNode, IAudioNode,
      IClosable {
    public override val __801834558_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1762342931_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1950949744_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IAudioNode.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1762342931_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1762342931_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1762342931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioFrameInputNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01b266c7fd964ff5a3c5d27a9bf44237")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioFrameInputNode(ptr: Pointer?): WithDefault = IAudioFrameInputNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioFrameInputNode {
      val address = segment.toRawLongValue()
      return makeIAudioFrameInputNode(Pointer(address))
    }

    public override fun toNative(obj: IAudioFrameInputNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1762342931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioFrameInputNode): Array<IAudioFrameInputNode?> =
        (elements as
        Array<IAudioFrameInputNode?>).castToImpl<IAudioFrameInputNode,IAudioFrameInputNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioFrameInputNode?> =
        arrayOfNulls<IAudioFrameInputNode_Impl>(size) as Array<IAudioFrameInputNode?>
  }
}
