package Windows.Media.Audio

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
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

@ABIMarker(IAudioNodeWithListener.ABI::class)
@Signature("{0e0f907c-79ff-4544-9eeb-01257b15105a}")
@Guid("0e0f907c79ff45449eeb01257b15105a")
@WinRTInterface("0e0f907c79ff45449eeb01257b15105a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioNodeWithListener.ByReference::class)
public interface IAudioNodeWithListener : NativeMapped, IWinRTInterface, IClosable, IAudioNode {
  @InterfaceMethod(0)
  public fun put_Listener(value: AudioNodeListener?): Unit

  @InterfaceMethod(1)
  public fun get_Listener(): AudioNodeListener?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioNodeWithListener> {
    public override fun getValue() = ABI.makeIAudioNodeWithListener(pointer.getPointer(0))

    public fun setValue(value: IAudioNodeWithListener_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioNodeWithListener, IClosable.WithDefault,
      IAudioNode.WithDefault {
    public val __2085257514_Ptr: Pointer?

    public val _2085257514_VtblPtr: Pointer?
      get() = __2085257514_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Listener(value: AudioNodeListener?): Unit {
      val fnPtr = _2085257514_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2085257514_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Listener(): AudioNodeListener? {
      val fnPtr = _2085257514_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioNodeListener>()
      val hr = fn.invokeHR(arrayOf(__2085257514_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioNodeListener>(result.getValue())
      return resultValue
    }
  }

  public class IAudioNodeWithListener_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable, IAudioNode {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2085257514_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1950949744_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IAudioNode.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_2085257514_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2085257514_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioNodeWithListener, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e0f907c79ff45449eeb01257b15105a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioNodeWithListener(ptr: Pointer?): WithDefault =
        IAudioNodeWithListener_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioNodeWithListener {
      val address = segment.toRawLongValue()
      return makeIAudioNodeWithListener(Pointer(address))
    }

    public override fun toNative(obj: IAudioNodeWithListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2085257514_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioNodeWithListener): Array<IAudioNodeWithListener?> =
        (elements as
        Array<IAudioNodeWithListener?>).castToImpl<IAudioNodeWithListener,IAudioNodeWithListener_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioNodeWithListener?> =
        arrayOfNulls<IAudioNodeWithListener_Impl>(size) as Array<IAudioNodeWithListener?>
  }
}
