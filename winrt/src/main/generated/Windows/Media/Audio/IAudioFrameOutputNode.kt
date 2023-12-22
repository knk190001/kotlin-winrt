package Windows.Media.Audio

import Windows.Foundation.IClosable
import Windows.Media.Audio.IAudioNode.ABI.IID
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

@ABIMarker(IAudioFrameOutputNode.ABI::class)
@Signature("{b847371b-3299-45f5-88b3-c9d12a3f1cc8}")
@Guid("b847371b329945f588b3c9d12a3f1cc8")
@WinRTInterface("b847371b329945f588b3c9d12a3f1cc8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioFrameOutputNode.ByReference::class)
public interface IAudioFrameOutputNode : NativeMapped, IWinRTInterface, IAudioNode, IClosable {
  @InterfaceMethod(0)
  public fun GetFrame(): AudioFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioFrameOutputNode> {
    public override fun getValue() = ABI.makeIAudioFrameOutputNode(pointer.getPointer(0))

    public fun setValue(value: IAudioFrameOutputNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioFrameOutputNode, IAudioNode.WithDefault,
      IClosable.WithDefault {
    public val __1442910270_Ptr: Pointer?

    public val _1442910270_VtblPtr: Pointer?
      get() = __1442910270_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFrame(): AudioFrame? {
      val fnPtr = _1442910270_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrame>()
      val hr = fn.invokeHR(arrayOf(__1442910270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrame>(result.getValue())
      return resultValue
    }
  }

  public class IAudioFrameOutputNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioNode, IClosable {
    public override val __1950949744_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1442910270_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1442910270_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1442910270_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioFrameOutputNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b847371b329945f588b3c9d12a3f1cc8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioFrameOutputNode(ptr: Pointer?): WithDefault =
        IAudioFrameOutputNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioFrameOutputNode {
      val address = segment.toRawLongValue()
      return makeIAudioFrameOutputNode(Pointer(address))
    }

    public override fun toNative(obj: IAudioFrameOutputNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1442910270_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioFrameOutputNode): Array<IAudioFrameOutputNode?> =
        (elements as
        Array<IAudioFrameOutputNode?>).castToImpl<IAudioFrameOutputNode,IAudioFrameOutputNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioFrameOutputNode?> =
        arrayOfNulls<IAudioFrameOutputNode_Impl>(size) as Array<IAudioFrameOutputNode?>
  }
}
