package Microsoft.UI.Xaml.Media

import Microsoft.UI.Composition.ICompositionSupportsSystemBackdrop
import Microsoft.UI.Composition.SystemBackdrops.SystemBackdropConfiguration
import Microsoft.UI.Xaml.XamlRoot
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

@ABIMarker(ISystemBackdrop.ABI::class)
@Signature("{5aeed5c4-37ac-5852-b73f-1b76ebc3205f}")
@Guid("5aeed5c437ac5852b73f1b76ebc3205f")
@WinRTInterface("5aeed5c437ac5852b73f1b76ebc3205f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemBackdrop.ByReference::class)
public interface ISystemBackdrop : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultSystemBackdropConfiguration(target: ICompositionSupportsSystemBackdrop?,
      xamlRoot: XamlRoot?): SystemBackdropConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemBackdrop> {
    public override fun getValue() = ABI.makeISystemBackdrop(pointer.getPointer(0))

    public fun setValue(value: ISystemBackdrop_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemBackdrop {
    public val __343338518_Ptr: Pointer?

    public val _343338518_VtblPtr: Pointer?
      get() = __343338518_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun GetDefaultSystemBackdropConfiguration(target: ICompositionSupportsSystemBackdrop?,
        xamlRoot: XamlRoot?): SystemBackdropConfiguration? {
      val fnPtr = _343338518_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemBackdropConfiguration>()
      val hr = fn.invokeHR(arrayOf(__343338518_Ptr, marshalToNative(target),
          marshalToNative(xamlRoot), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemBackdropConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class ISystemBackdrop_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __343338518_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemBackdrop, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5aeed5c437ac5852b73f1b76ebc3205f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemBackdrop(ptr: Pointer?): WithDefault = ISystemBackdrop_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemBackdrop {
      val address = segment.toRawLongValue()
      return makeISystemBackdrop(Pointer(address))
    }

    public override fun toNative(obj: ISystemBackdrop): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__343338518_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemBackdrop): Array<ISystemBackdrop?> = (elements as
        Array<ISystemBackdrop?>).castToImpl<ISystemBackdrop,ISystemBackdrop_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemBackdrop?> =
        arrayOfNulls<ISystemBackdrop_Impl>(size) as Array<ISystemBackdrop?>
  }
}
