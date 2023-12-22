package Windows.Media.Audio

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Media.Audio.IAudioInputNode.ABI.IID
import Windows.Storage.StorageFile
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

@ABIMarker(IAudioFileInputNode.ABI::class)
@Signature("{905b67c8-6f65-4cd4-8890-4694843c276d}")
@Guid("905b67c86f654cd488904694843c276d")
@WinRTInterface("905b67c86f654cd488904694843c276d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioFileInputNode.ByReference::class)
public interface IAudioFileInputNode : NativeMapped, IWinRTInterface, IAudioInputNode, IAudioNode,
    IClosable {
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
  public fun get_SourceFile(): StorageFile?

  @InterfaceMethod(12)
  public fun add_FileCompleted(handler: TypedEventHandler<AudioFileInputNode?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_FileCompleted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioFileInputNode> {
    public override fun getValue() = ABI.makeIAudioFileInputNode(pointer.getPointer(0))

    public fun setValue(value: IAudioFileInputNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioFileInputNode, IAudioInputNode.WithDefault,
      IAudioNode.WithDefault, IClosable.WithDefault {
    public val __2019646686_Ptr: Pointer?

    public val _2019646686_VtblPtr: Pointer?
      get() = __2019646686_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_PlaybackSpeedFactor(value: Double): Unit {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_PlaybackSpeedFactor(): Double {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Position(): TimeSpan? {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Seek(position: TimeSpan?): Unit {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr, marshalToNative(position),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_StartTime(): IReference<TimeSpan?>? {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_StartTime(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_EndTime(): IReference<TimeSpan?>? {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_EndTime(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_LoopCount(): IReference<Int>? {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_LoopCount(value: IReference<Int>?): Unit {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_SourceFile(): StorageFile? {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun add_FileCompleted(handler: TypedEventHandler<AudioFileInputNode?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_FileCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _2019646686_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2019646686_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAudioFileInputNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioInputNode, IAudioNode,
      IClosable {
    public override val __801834558_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2019646686_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1950949744_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IAudioNode.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_2019646686_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_2019646686_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2019646686_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioFileInputNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("905b67c86f654cd488904694843c276d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioFileInputNode(ptr: Pointer?): WithDefault = IAudioFileInputNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioFileInputNode {
      val address = segment.toRawLongValue()
      return makeIAudioFileInputNode(Pointer(address))
    }

    public override fun toNative(obj: IAudioFileInputNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2019646686_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioFileInputNode): Array<IAudioFileInputNode?> =
        (elements as
        Array<IAudioFileInputNode?>).castToImpl<IAudioFileInputNode,IAudioFileInputNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioFileInputNode?> =
        arrayOfNulls<IAudioFileInputNode_Impl>(size) as Array<IAudioFileInputNode?>
  }
}
