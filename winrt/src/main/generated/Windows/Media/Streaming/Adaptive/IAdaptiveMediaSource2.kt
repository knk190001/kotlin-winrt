package Windows.Media.Streaming.Adaptive

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

@ABIMarker(IAdaptiveMediaSource2.ABI::class)
@Signature("{17890342-6760-4bb9-a58a-f7aa98b08c0e}")
@Guid("1789034267604bb9a58af7aa98b08c0e")
@WinRTInterface("1789034267604bb9a58af7aa98b08c0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSource2.ByReference::class)
public interface IAdaptiveMediaSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AdvancedSettings(): AdaptiveMediaSourceAdvancedSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSource2> {
    public override fun getValue() = ABI.makeIAdaptiveMediaSource2(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSource2 {
    public val __1929114747_Ptr: Pointer?

    public val _1929114747_VtblPtr: Pointer?
      get() = __1929114747_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AdvancedSettings(): AdaptiveMediaSourceAdvancedSettings? {
      val fnPtr = _1929114747_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceAdvancedSettings>()
      val hr = fn.invokeHR(arrayOf(__1929114747_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSourceAdvancedSettings>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1929114747_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1789034267604bb9a58af7aa98b08c0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSource2(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSource2 {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSource2(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1929114747_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSource2): Array<IAdaptiveMediaSource2?> =
        (elements as
        Array<IAdaptiveMediaSource2?>).castToImpl<IAdaptiveMediaSource2,IAdaptiveMediaSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSource2?> =
        arrayOfNulls<IAdaptiveMediaSource2_Impl>(size) as Array<IAdaptiveMediaSource2?>
  }
}
