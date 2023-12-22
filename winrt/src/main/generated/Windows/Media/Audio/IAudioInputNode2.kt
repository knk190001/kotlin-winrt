package Windows.Media.Audio

import Windows.Foundation.IClosable
import Windows.Media.Audio.IAudioNode.ABI.IID
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

@ABIMarker(IAudioInputNode2.ABI::class)
@Signature("{905156b7-ca68-4c6d-a8bc-e3ee17fe3fd2}")
@Guid("905156b7ca684c6da8bce3ee17fe3fd2")
@WinRTInterface("905156b7ca684c6da8bce3ee17fe3fd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioInputNode2.ByReference::class)
public interface IAudioInputNode2 : NativeMapped, IWinRTInterface, IAudioNode, IClosable,
    IAudioInputNode {
  @InterfaceMethod(0)
  public fun get_Emitter(): AudioNodeEmitter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioInputNode2> {
    public override fun getValue() = ABI.makeIAudioInputNode2(pointer.getPointer(0))

    public fun setValue(value: IAudioInputNode2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioInputNode2, IAudioNode.WithDefault, IClosable.WithDefault,
      IAudioInputNode.WithDefault {
    public val __912932428_Ptr: Pointer?

    public val _912932428_VtblPtr: Pointer?
      get() = __912932428_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Emitter(): AudioNodeEmitter? {
      val fnPtr = _912932428_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeEmitter>()
      val hr = fn.invokeHR(arrayOf(__912932428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioNodeEmitter>(result.getValue())
      return resultValue
    }
  }

  public class IAudioInputNode2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IAudioNode, IClosable,
      IAudioInputNode {
    public override val __1950949744_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_912932428_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_912932428_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __801834558_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IAudioInputNode.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_912932428_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __912932428_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioInputNode2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("905156b7ca684c6da8bce3ee17fe3fd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioInputNode2(ptr: Pointer?): WithDefault = IAudioInputNode2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioInputNode2 {
      val address = segment.toRawLongValue()
      return makeIAudioInputNode2(Pointer(address))
    }

    public override fun toNative(obj: IAudioInputNode2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__912932428_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioInputNode2): Array<IAudioInputNode2?> = (elements as
        Array<IAudioInputNode2?>).castToImpl<IAudioInputNode2,IAudioInputNode2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioInputNode2?> =
        arrayOfNulls<IAudioInputNode2_Impl>(size) as Array<IAudioInputNode2?>
  }
}
