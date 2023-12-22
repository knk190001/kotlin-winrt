package Windows.UI.Xaml

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IElementSoundPlayerStatics.ABI::class)
@Signature("{217a9004-981d-41c9-b152-ada911a4b13a}")
@Guid("217a9004981d41c9b152ada911a4b13a")
@WinRTInterface("217a9004981d41c9b152ada911a4b13a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElementSoundPlayerStatics.ByReference::class)
public interface IElementSoundPlayerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Volume(): Double

  @InterfaceMethod(1)
  public fun put_Volume(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_State(): ElementSoundPlayerState?

  @InterfaceMethod(3)
  public fun put_State(value: ElementSoundPlayerState?): Unit

  @InterfaceMethod(4)
  public fun Play(sound: ElementSoundKind?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElementSoundPlayerStatics> {
    public override fun getValue() = ABI.makeIElementSoundPlayerStatics(pointer.getPointer(0))

    public fun setValue(value: IElementSoundPlayerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElementSoundPlayerStatics {
    public val __1461727967_Ptr: Pointer?

    public val _1461727967_VtblPtr: Pointer?
      get() = __1461727967_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Volume(): Double {
      val fnPtr = _1461727967_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1461727967_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Volume(value: Double): Unit {
      val fnPtr = _1461727967_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461727967_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_State(): ElementSoundPlayerState? {
      val fnPtr = _1461727967_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementSoundPlayerState>()
      val hr = fn.invokeHR(arrayOf(__1461727967_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementSoundPlayerState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_State(value: ElementSoundPlayerState?): Unit {
      val fnPtr = _1461727967_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461727967_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Play(sound: ElementSoundKind?): Unit {
      val fnPtr = _1461727967_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461727967_Ptr, marshalToNative(sound),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IElementSoundPlayerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1461727967_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementSoundPlayerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("217a9004981d41c9b152ada911a4b13a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementSoundPlayerStatics(ptr: Pointer?): WithDefault =
        IElementSoundPlayerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementSoundPlayerStatics {
      val address = segment.toRawLongValue()
      return makeIElementSoundPlayerStatics(Pointer(address))
    }

    public override fun toNative(obj: IElementSoundPlayerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1461727967_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementSoundPlayerStatics):
        Array<IElementSoundPlayerStatics?> = (elements as
        Array<IElementSoundPlayerStatics?>).castToImpl<IElementSoundPlayerStatics,IElementSoundPlayerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementSoundPlayerStatics?> =
        arrayOfNulls<IElementSoundPlayerStatics_Impl>(size) as Array<IElementSoundPlayerStatics?>
  }
}
