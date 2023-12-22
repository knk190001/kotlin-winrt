package Windows.UI.ViewManagement

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

@ABIMarker(IUIViewSettingsStatics.ABI::class)
@Signature("{595c97a5-f8f6-41cf-b0fb-aacdb81fd5f6}")
@Guid("595c97a5f8f641cfb0fbaacdb81fd5f6")
@WinRTInterface("595c97a5f8f641cfb0fbaacdb81fd5f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIViewSettingsStatics.ByReference::class)
public interface IUIViewSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): UIViewSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIViewSettingsStatics> {
    public override fun getValue() = ABI.makeIUIViewSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: IUIViewSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIViewSettingsStatics {
    public val __1667119703_Ptr: Pointer?

    public val _1667119703_VtblPtr: Pointer?
      get() = __1667119703_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): UIViewSettings? {
      val fnPtr = _1667119703_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIViewSettings>()
      val hr = fn.invokeHR(arrayOf(__1667119703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIViewSettings>(result.getValue())
      return resultValue
    }
  }

  public class IUIViewSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1667119703_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIViewSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("595c97a5f8f641cfb0fbaacdb81fd5f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIViewSettingsStatics(ptr: Pointer?): WithDefault =
        IUIViewSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIViewSettingsStatics {
      val address = segment.toRawLongValue()
      return makeIUIViewSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: IUIViewSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1667119703_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIViewSettingsStatics): Array<IUIViewSettingsStatics?> =
        (elements as
        Array<IUIViewSettingsStatics?>).castToImpl<IUIViewSettingsStatics,IUIViewSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIViewSettingsStatics?> =
        arrayOfNulls<IUIViewSettingsStatics_Impl>(size) as Array<IUIViewSettingsStatics?>
  }
}
