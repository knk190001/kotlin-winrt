package Windows.UI.Input

import Windows.Storage.Streams.RandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRadialControllerMenuItemStatics.ABI::class)
@Signature("{249e0887-d842-4524-9df8-e0d647edc887}")
@Guid("249e0887d84245249df8e0d647edc887")
@WinRTInterface("249e0887d84245249df8e0d647edc887")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerMenuItemStatics.ByReference::class)
public interface IRadialControllerMenuItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromIcon(displayText: String?, icon: RandomAccessStreamReference?):
      RadialControllerMenuItem?

  @InterfaceMethod(1)
  public fun CreateFromKnownIcon(displayText: String?, value: RadialControllerMenuKnownIcon?):
      RadialControllerMenuItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerMenuItemStatics> {
    public override fun getValue() = ABI.makeIRadialControllerMenuItemStatics(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerMenuItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerMenuItemStatics {
    public val __1275417814_Ptr: Pointer?

    public val _1275417814_VtblPtr: Pointer?
      get() = __1275417814_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromIcon(displayText: String?, icon: RandomAccessStreamReference?):
        RadialControllerMenuItem? {
      val fnPtr = _1275417814_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerMenuItem>()
      val hr = fn.invokeHR(arrayOf(__1275417814_Ptr, marshalToNative(displayText),
          marshalToNative(icon), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerMenuItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromKnownIcon(displayText: String?,
        value: RadialControllerMenuKnownIcon?): RadialControllerMenuItem? {
      val fnPtr = _1275417814_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialControllerMenuItem>()
      val hr = fn.invokeHR(arrayOf(__1275417814_Ptr, marshalToNative(displayText),
          marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialControllerMenuItem>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerMenuItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1275417814_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerMenuItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("249e0887d84245249df8e0d647edc887")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerMenuItemStatics(ptr: Pointer?): WithDefault =
        IRadialControllerMenuItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialControllerMenuItemStatics {
      val address = segment.toRawLongValue()
      return makeIRadialControllerMenuItemStatics(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerMenuItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1275417814_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerMenuItemStatics):
        Array<IRadialControllerMenuItemStatics?> = (elements as
        Array<IRadialControllerMenuItemStatics?>).castToImpl<IRadialControllerMenuItemStatics,IRadialControllerMenuItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerMenuItemStatics?> =
        arrayOfNulls<IRadialControllerMenuItemStatics_Impl>(size) as
        Array<IRadialControllerMenuItemStatics?>
  }
}
