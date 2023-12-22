package Windows.Devices.Lights.Effects

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(ILampArrayEffectPlaylistStatics.ABI::class)
@Signature("{fb15235c-ea35-4c7f-a016-f3bfc6a6c47d}")
@Guid("fb15235cea354c7fa016f3bfc6a6c47d")
@WinRTInterface("fb15235cea354c7fa016f3bfc6a6c47d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayEffectPlaylistStatics.ByReference::class)
public interface ILampArrayEffectPlaylistStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartAll(value: IIterable<LampArrayEffectPlaylist?>?): Unit

  @InterfaceMethod(1)
  public fun StopAll(value: IIterable<LampArrayEffectPlaylist?>?): Unit

  @InterfaceMethod(2)
  public fun PauseAll(value: IIterable<LampArrayEffectPlaylist?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayEffectPlaylistStatics> {
    public override fun getValue() = ABI.makeILampArrayEffectPlaylistStatics(pointer.getPointer(0))

    public fun setValue(value: ILampArrayEffectPlaylistStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayEffectPlaylistStatics {
    public val __442173315_Ptr: Pointer?

    public val _442173315_VtblPtr: Pointer?
      get() = __442173315_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartAll(value: IIterable<LampArrayEffectPlaylist?>?): Unit {
      val fnPtr = _442173315_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__442173315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun StopAll(value: IIterable<LampArrayEffectPlaylist?>?): Unit {
      val fnPtr = _442173315_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__442173315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun PauseAll(value: IIterable<LampArrayEffectPlaylist?>?): Unit {
      val fnPtr = _442173315_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__442173315_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILampArrayEffectPlaylistStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __442173315_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayEffectPlaylistStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb15235cea354c7fa016f3bfc6a6c47d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayEffectPlaylistStatics(ptr: Pointer?): WithDefault =
        ILampArrayEffectPlaylistStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayEffectPlaylistStatics {
      val address = segment.toRawLongValue()
      return makeILampArrayEffectPlaylistStatics(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayEffectPlaylistStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__442173315_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayEffectPlaylistStatics):
        Array<ILampArrayEffectPlaylistStatics?> = (elements as
        Array<ILampArrayEffectPlaylistStatics?>).castToImpl<ILampArrayEffectPlaylistStatics,ILampArrayEffectPlaylistStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayEffectPlaylistStatics?> =
        arrayOfNulls<ILampArrayEffectPlaylistStatics_Impl>(size) as
        Array<ILampArrayEffectPlaylistStatics?>
  }
}
