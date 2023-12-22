package Windows.Media.Audio

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Media.Capture.MediaCategory
import Windows.Media.MediaProperties.AudioEncodingProperties
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioGraph2.ABI::class)
@Signature("{4e4c3bd5-4fc1-45f6-a947-3cd38f4fd839}")
@Guid("4e4c3bd54fc145f6a9473cd38f4fd839")
@WinRTInterface("4e4c3bd54fc145f6a9473cd38f4fd839")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioGraph2.ByReference::class)
public interface IAudioGraph2 : NativeMapped, IWinRTInterface, IClosable, IAudioGraph {
  @InterfaceMethod(0)
  public fun CreateFrameInputNode(encodingProperties: AudioEncodingProperties?,
      emitter: AudioNodeEmitter?): AudioFrameInputNode?

  @InterfaceMethod(1)
  public fun CreateDeviceInputNodeAsync(
    category: MediaCategory?,
    encodingProperties: AudioEncodingProperties?,
    device: DeviceInformation?,
    emitter: AudioNodeEmitter?
  ): IAsyncOperation<CreateAudioDeviceInputNodeResult?>?

  @InterfaceMethod(2)
  public fun CreateFileInputNodeAsync(`file`: IStorageFile?, emitter: AudioNodeEmitter?):
      IAsyncOperation<CreateAudioFileInputNodeResult?>?

  @InterfaceMethod(3)
  public fun CreateSubmixNode(encodingProperties: AudioEncodingProperties?,
      emitter: AudioNodeEmitter?): AudioSubmixNode?

  @InterfaceMethod(4)
  public fun CreateBatchUpdater(): AudioGraphBatchUpdater?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAudioGraph2> {
    public override fun getValue() = ABI.makeIAudioGraph2(pointer.getPointer(0))

    public fun setValue(value: IAudioGraph2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioGraph2, IClosable.WithDefault, IAudioGraph.WithDefault {
    public val __2059253906_Ptr: Pointer?

    public val _2059253906_VtblPtr: Pointer?
      get() = __2059253906_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFrameInputNode(encodingProperties: AudioEncodingProperties?,
        emitter: AudioNodeEmitter?): AudioFrameInputNode? {
      val fnPtr = _2059253906_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrameInputNode>()
      val hr = fn.invokeHR(arrayOf(__2059253906_Ptr, marshalToNative(encodingProperties),
          marshalToNative(emitter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrameInputNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateDeviceInputNodeAsync(
      category: MediaCategory?,
      encodingProperties: AudioEncodingProperties?,
      device: DeviceInformation?,
      emitter: AudioNodeEmitter?
    ): IAsyncOperation<CreateAudioDeviceInputNodeResult?>? {
      val fnPtr = _2059253906_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateAudioDeviceInputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__2059253906_Ptr, marshalToNative(category),
          marshalToNative(encodingProperties), marshalToNative(device), marshalToNative(emitter),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateAudioDeviceInputNodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFileInputNodeAsync(`file`: IStorageFile?, emitter: AudioNodeEmitter?):
        IAsyncOperation<CreateAudioFileInputNodeResult?>? {
      val fnPtr = _2059253906_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CreateAudioFileInputNodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__2059253906_Ptr, marshalToNative(file),
          marshalToNative(emitter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CreateAudioFileInputNodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateSubmixNode(encodingProperties: AudioEncodingProperties?,
        emitter: AudioNodeEmitter?): AudioSubmixNode? {
      val fnPtr = _2059253906_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioSubmixNode>()
      val hr = fn.invokeHR(arrayOf(__2059253906_Ptr, marshalToNative(encodingProperties),
          marshalToNative(emitter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioSubmixNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateBatchUpdater(): AudioGraphBatchUpdater? {
      val fnPtr = _2059253906_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioGraphBatchUpdater>()
      val hr = fn.invokeHR(arrayOf(__2059253906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioGraphBatchUpdater>(result.getValue())
      return resultValue
    }
  }

  public class IAudioGraph2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable, IAudioGraph {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2059253906_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __343522208_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IAudioGraph.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_2059253906_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2059253906_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioGraph2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e4c3bd54fc145f6a9473cd38f4fd839")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioGraph2(ptr: Pointer?): WithDefault = IAudioGraph2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioGraph2 {
      val address = segment.toRawLongValue()
      return makeIAudioGraph2(Pointer(address))
    }

    public override fun toNative(obj: IAudioGraph2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2059253906_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioGraph2): Array<IAudioGraph2?> = (elements as
        Array<IAudioGraph2?>).castToImpl<IAudioGraph2,IAudioGraph2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioGraph2?> =
        arrayOfNulls<IAudioGraph2_Impl>(size) as Array<IAudioGraph2?>
  }
}
