package Windows.Media.Audio

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import Windows.Media.AudioProcessing
import Windows.Media.Capture.MediaCategory
import Windows.Media.MediaProperties.AudioEncodingProperties
import Windows.Media.MediaProperties.MediaEncodingProfile
import Windows.Storage.IStorageFile
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioGraph.ABI::class)
@Signature("{1ad46eed-e48c-4e14-9660-2c4f83e9cdd8}")
@Guid("1ad46eede48c4e1496602c4f83e9cdd8")
@WinRTInterface("1ad46eede48c4e1496602c4f83e9cdd8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioGraph.ByReference::class)
public interface IAudioGraph : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun CreateFrameInputNode(): AudioFrameInputNode?

  @InterfaceMethod(1)
  public fun CreateFrameInputNode(encodingProperties: AudioEncodingProperties?):
      AudioFrameInputNode?

  @InterfaceMethod(2)
  public fun CreateDeviceInputNodeAsync(category: MediaCategory?):
      IAsyncOperation<CreateAudioDeviceInputNodeResult?>?

  @InterfaceMethod(3)
  public fun CreateDeviceInputNodeAsync(category: MediaCategory?,
      encodingProperties: AudioEncodingProperties?):
      IAsyncOperation<CreateAudioDeviceInputNodeResult?>?

  @InterfaceMethod(4)
  public fun CreateDeviceInputNodeAsync(
    category: MediaCategory?,
    encodingProperties: AudioEncodingProperties?,
    device: DeviceInformation?
  ): IAsyncOperation<CreateAudioDeviceInputNodeResult?>?

  @InterfaceMethod(5)
  public fun CreateFrameOutputNode(): AudioFrameOutputNode?

  @InterfaceMethod(6)
  public fun CreateFrameOutputNode(encodingProperties: AudioEncodingProperties?):
      AudioFrameOutputNode?

  @InterfaceMethod(7)
  public fun CreateDeviceOutputNodeAsync(): IAsyncOperation<CreateAudioDeviceOutputNodeResult?>?

  @InterfaceMethod(8)
  public fun CreateFileInputNodeAsync(`file`: IStorageFile?):
      IAsyncOperation<CreateAudioFileInputNodeResult?>?

  @InterfaceMethod(9)
  public fun CreateFileOutputNodeAsync(`file`: IStorageFile?):
      IAsyncOperation<CreateAudioFileOutputNodeResult?>?

  @InterfaceMethod(10)
  public fun CreateFileOutputNodeAsync(`file`: IStorageFile?,
      fileEncodingProfile: MediaEncodingProfile?):
      IAsyncOperation<CreateAudioFileOutputNodeResult?>?

  @InterfaceMethod(11)
  public fun CreateSubmixNode(): AudioSubmixNode?

  @InterfaceMethod(12)
  public fun CreateSubmixNode(encodingProperties: AudioEncodingProperties?): AudioSubmixNode?

  @InterfaceMethod(13)
  public fun Start(): Unit

  @InterfaceMethod(14)
  public fun Stop(): Unit

  @InterfaceMethod(15)
  public fun ResetAllNodes(): Unit

  @InterfaceMethod(16)
  public fun add_QuantumStarted(handler: TypedEventHandler<AudioGraph?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_QuantumStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_QuantumProcessed(handler: TypedEventHandler<AudioGraph?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_QuantumProcessed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun add_UnrecoverableErrorOccurred(handler: TypedEventHandler<AudioGraph?,
      AudioGraphUnrecoverableErrorOccurredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_UnrecoverableErrorOccurred(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun get_CompletedQuantumCount(): WinDef.ULONG

  @InterfaceMethod(23)
  public fun get_EncodingProperties(): AudioEncodingProperties?

  @InterfaceMethod(24)
  public fun get_LatencyInSamples(): Int

  @InterfaceMethod(25)
  public fun get_PrimaryRenderDevice(): DeviceInformation?

  @InterfaceMethod(26)
  public fun get_RenderDeviceAudioProcessing(): AudioProcessing?

  @InterfaceMethod(27)
  public fun get_SamplesPerQuantum(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAudioGraph> {
    public override fun getValue() = ABI.makeIAudioGraph(pointer.getPointer(0))

    public fun setValue(value: IAudioGraph_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioGraph, IClosable.WithDefault {
    public val __343522208_Ptr: Pointer?

    public val _343522208_VtblPtr: Pointer?
      get() = __343522208_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFrameInputNode(): AudioFrameInputNode? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrameInputNode>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrameInputNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFrameInputNode(encodingProperties: AudioEncodingProperties?):
        AudioFrameInputNode? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrameInputNode>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(encodingProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrameInputNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateDeviceInputNodeAsync(category: MediaCategory?):
        IAsyncOperation<CreateAudioDeviceInputNodeResult?>? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateAudioDeviceInputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(category), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateAudioDeviceInputNodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateDeviceInputNodeAsync(category: MediaCategory?,
        encodingProperties: AudioEncodingProperties?):
        IAsyncOperation<CreateAudioDeviceInputNodeResult?>? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateAudioDeviceInputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(category),
          marshalToNative(encodingProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateAudioDeviceInputNodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateDeviceInputNodeAsync(
      category: MediaCategory?,
      encodingProperties: AudioEncodingProperties?,
      device: DeviceInformation?
    ): IAsyncOperation<CreateAudioDeviceInputNodeResult?>? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateAudioDeviceInputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(category),
          marshalToNative(encodingProperties), marshalToNative(device), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateAudioDeviceInputNodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateFrameOutputNode(): AudioFrameOutputNode? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrameOutputNode>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrameOutputNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateFrameOutputNode(encodingProperties: AudioEncodingProperties?):
        AudioFrameOutputNode? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrameOutputNode>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(encodingProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrameOutputNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateDeviceOutputNodeAsync():
        IAsyncOperation<CreateAudioDeviceOutputNodeResult?>? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateAudioDeviceOutputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateAudioDeviceOutputNodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateFileInputNodeAsync(`file`: IStorageFile?):
        IAsyncOperation<CreateAudioFileInputNodeResult?>? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateAudioFileInputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateAudioFileInputNodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateFileOutputNodeAsync(`file`: IStorageFile?):
        IAsyncOperation<CreateAudioFileOutputNodeResult?>? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateAudioFileOutputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateAudioFileOutputNodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateFileOutputNodeAsync(`file`: IStorageFile?,
        fileEncodingProfile: MediaEncodingProfile?):
        IAsyncOperation<CreateAudioFileOutputNodeResult?>? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateAudioFileOutputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(file),
          marshalToNative(fileEncodingProfile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateAudioFileOutputNodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun CreateSubmixNode(): AudioSubmixNode? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioSubmixNode>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioSubmixNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun CreateSubmixNode(encodingProperties: AudioEncodingProperties?):
        AudioSubmixNode? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioSubmixNode>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(encodingProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioSubmixNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun Start(): Unit {
      val fnPtr = _343522208_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun Stop(): Unit {
      val fnPtr = _343522208_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun ResetAllNodes(): Unit {
      val fnPtr = _343522208_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_QuantumStarted(handler: TypedEventHandler<AudioGraph?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_QuantumStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _343522208_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_QuantumProcessed(handler: TypedEventHandler<AudioGraph?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_QuantumProcessed(token: EventRegistrationToken?): Unit {
      val fnPtr = _343522208_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_UnrecoverableErrorOccurred(handler: TypedEventHandler<AudioGraph?,
        AudioGraphUnrecoverableErrorOccurredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_UnrecoverableErrorOccurred(token: EventRegistrationToken?): Unit {
      val fnPtr = _343522208_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_CompletedQuantumCount(): WinDef.ULONG {
      val fnPtr = _343522208_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun get_EncodingProperties(): AudioEncodingProperties? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun get_LatencyInSamples(): Int {
      val fnPtr = _343522208_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun get_PrimaryRenderDevice(): DeviceInformation? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun get_RenderDeviceAudioProcessing(): AudioProcessing? {
      val fnPtr = _343522208_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioProcessing>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioProcessing>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun get_SamplesPerQuantum(): Int {
      val fnPtr = _343522208_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__343522208_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAudioGraph_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_343522208_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __343522208_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioGraph, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ad46eede48c4e1496602c4f83e9cdd8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioGraph(ptr: Pointer?): WithDefault = IAudioGraph_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioGraph {
      val address = segment.toRawLongValue()
      return makeIAudioGraph(Pointer(address))
    }

    public override fun toNative(obj: IAudioGraph): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__343522208_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioGraph): Array<IAudioGraph?> = (elements as
        Array<IAudioGraph?>).castToImpl<IAudioGraph,IAudioGraph_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioGraph?> =
        arrayOfNulls<IAudioGraph_Impl>(size) as Array<IAudioGraph?>
  }
}
