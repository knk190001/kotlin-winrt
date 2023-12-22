package Windows.Media

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IAudioFrameFactory.ABI::class)
@Signature("{91a90ade-2422-40a6-b9ad-30d02404317d}")
@Guid("91a90ade242240a6b9ad30d02404317d")
@WinRTInterface("91a90ade242240a6b9ad30d02404317d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioFrameFactory.ByReference::class)
public interface IAudioFrameFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(capacity: WinDef.UINT): AudioFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioFrameFactory> {
    public override fun getValue() = ABI.makeIAudioFrameFactory(pointer.getPointer(0))

    public fun setValue(value: IAudioFrameFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioFrameFactory {
    public val __760481597_Ptr: Pointer?

    public val _760481597_VtblPtr: Pointer?
      get() = __760481597_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(capacity: WinDef.UINT): AudioFrame? {
      val fnPtr = _760481597_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFrame>()
      val hr = fn.invokeHR(arrayOf(__760481597_Ptr, capacity, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFrame>(result.getValue())
      return resultValue
    }
  }

  public class IAudioFrameFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __760481597_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioFrameFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("91a90ade242240a6b9ad30d02404317d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioFrameFactory(ptr: Pointer?): WithDefault = IAudioFrameFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioFrameFactory {
      val address = segment.toRawLongValue()
      return makeIAudioFrameFactory(Pointer(address))
    }

    public override fun toNative(obj: IAudioFrameFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__760481597_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioFrameFactory): Array<IAudioFrameFactory?> =
        (elements as
        Array<IAudioFrameFactory?>).castToImpl<IAudioFrameFactory,IAudioFrameFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioFrameFactory?> =
        arrayOfNulls<IAudioFrameFactory_Impl>(size) as Array<IAudioFrameFactory?>
  }
}
