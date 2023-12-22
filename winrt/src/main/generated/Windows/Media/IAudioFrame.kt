package Windows.Media

import Windows.Foundation.IClosable
import Windows.Media.IMediaFrame.ABI.IID
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

@ABIMarker(IAudioFrame.ABI::class)
@Signature("{e36ac304-aab2-4277-9ed0-43cedf8e29c6}")
@Guid("e36ac304aab242779ed043cedf8e29c6")
@WinRTInterface("e36ac304aab242779ed043cedf8e29c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioFrame.ByReference::class)
public interface IAudioFrame : NativeMapped, IWinRTInterface, IMediaFrame, IClosable {
  @InterfaceMethod(0)
  public fun LockBuffer(mode: AudioBufferAccessMode?): AudioBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAudioFrame> {
    public override fun getValue() = ABI.makeIAudioFrame(pointer.getPointer(0))

    public fun setValue(value: IAudioFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioFrame, IMediaFrame.WithDefault, IClosable.WithDefault {
    public val __765788743_Ptr: Pointer?

    public val _765788743_VtblPtr: Pointer?
      get() = __765788743_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LockBuffer(mode: AudioBufferAccessMode?): AudioBuffer? {
      val fnPtr = _765788743_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioBuffer>()
      val hr = fn.invokeHR(arrayOf(__765788743_Ptr, marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IAudioFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaFrame, IClosable {
    public override val __1156286201_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_765788743_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_765788743_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __765788743_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e36ac304aab242779ed043cedf8e29c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioFrame(ptr: Pointer?): WithDefault = IAudioFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioFrame {
      val address = segment.toRawLongValue()
      return makeIAudioFrame(Pointer(address))
    }

    public override fun toNative(obj: IAudioFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__765788743_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioFrame): Array<IAudioFrame?> = (elements as
        Array<IAudioFrame?>).castToImpl<IAudioFrame,IAudioFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioFrame?> =
        arrayOfNulls<IAudioFrame_Impl>(size) as Array<IAudioFrame?>
  }
}
