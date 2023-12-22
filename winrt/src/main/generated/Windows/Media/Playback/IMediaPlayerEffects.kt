package Windows.Media.Playback

import Windows.Foundation.Collections.IPropertySet
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaPlayerEffects.ABI::class)
@Signature("{85a1deda-cab6-4cc0-8be3-6035f4de2591}")
@Guid("85a1dedacab64cc08be36035f4de2591")
@WinRTInterface("85a1dedacab64cc08be36035f4de2591")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerEffects.ByReference::class)
public interface IMediaPlayerEffects : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddAudioEffect(
    activatableClassId: String?,
    effectOptional: Boolean,
    configuration: IPropertySet?
  ): Unit

  @InterfaceMethod(1)
  public fun RemoveAllEffects(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerEffects> {
    public override fun getValue() = ABI.makeIMediaPlayerEffects(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerEffects_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerEffects {
    public val __328484726_Ptr: Pointer?

    public val _328484726_VtblPtr: Pointer?
      get() = __328484726_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddAudioEffect(
      activatableClassId: String?,
      effectOptional: Boolean,
      configuration: IPropertySet?
    ): Unit {
      val fnPtr = _328484726_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__328484726_Ptr, marshalToNative(activatableClassId),
          effectOptional, marshalToNative(configuration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RemoveAllEffects(): Unit {
      val fnPtr = _328484726_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__328484726_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlayerEffects_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __328484726_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerEffects, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("85a1dedacab64cc08be36035f4de2591")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerEffects(ptr: Pointer?): WithDefault = IMediaPlayerEffects_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerEffects {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerEffects(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerEffects): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__328484726_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerEffects): Array<IMediaPlayerEffects?> =
        (elements as
        Array<IMediaPlayerEffects?>).castToImpl<IMediaPlayerEffects,IMediaPlayerEffects_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerEffects?> =
        arrayOfNulls<IMediaPlayerEffects_Impl>(size) as Array<IMediaPlayerEffects?>
  }
}
