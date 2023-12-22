package Windows.Media.Audio

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Media.Audio.IAudioNode.ABI.IID
import Windows.Media.MediaProperties.MediaEncodingProfile
import Windows.Media.Transcoding.TranscodeFailureReason
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

@ABIMarker(IAudioFileOutputNode.ABI::class)
@Signature("{50e01980-5166-4093-80f8-ada00089e9cf}")
@Guid("50e019805166409380f8ada00089e9cf")
@WinRTInterface("50e019805166409380f8ada00089e9cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioFileOutputNode.ByReference::class)
public interface IAudioFileOutputNode : NativeMapped, IWinRTInterface, IAudioNode, IClosable {
  @InterfaceMethod(0)
  public fun get_File(): IStorageFile?

  @InterfaceMethod(1)
  public fun get_FileEncodingProfile(): MediaEncodingProfile?

  @InterfaceMethod(2)
  public fun FinalizeAsync(): IAsyncOperation<TranscodeFailureReason?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioFileOutputNode> {
    public override fun getValue() = ABI.makeIAudioFileOutputNode(pointer.getPointer(0))

    public fun setValue(value: IAudioFileOutputNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioFileOutputNode, IAudioNode.WithDefault, IClosable.WithDefault
      {
    public val __829392083_Ptr: Pointer?

    public val _829392083_VtblPtr: Pointer?
      get() = __829392083_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_File(): IStorageFile? {
      val fnPtr = _829392083_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IStorageFile>()
      val hr = fn.invokeHR(arrayOf(__829392083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IStorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FileEncodingProfile(): MediaEncodingProfile? {
      val fnPtr = _829392083_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__829392083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FinalizeAsync(): IAsyncOperation<TranscodeFailureReason?>? {
      val fnPtr = _829392083_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<TranscodeFailureReason?>>()
      val hr = fn.invokeHR(arrayOf(__829392083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<TranscodeFailureReason?>>(result.getValue())
      return resultValue
    }
  }

  public class IAudioFileOutputNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioNode, IClosable {
    public override val __1950949744_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_829392083_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_829392083_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __829392083_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioFileOutputNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50e019805166409380f8ada00089e9cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioFileOutputNode(ptr: Pointer?): WithDefault = IAudioFileOutputNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioFileOutputNode {
      val address = segment.toRawLongValue()
      return makeIAudioFileOutputNode(Pointer(address))
    }

    public override fun toNative(obj: IAudioFileOutputNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__829392083_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioFileOutputNode): Array<IAudioFileOutputNode?> =
        (elements as
        Array<IAudioFileOutputNode?>).castToImpl<IAudioFileOutputNode,IAudioFileOutputNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioFileOutputNode?> =
        arrayOfNulls<IAudioFileOutputNode_Impl>(size) as Array<IAudioFileOutputNode?>
  }
}
