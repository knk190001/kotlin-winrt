package Windows.UI.ViewManagement

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IAccessibilitySettings.ABI::class)
@Signature("{fe0e8147-c4c0-4562-b962-1327b52ad5b9}")
@Guid("fe0e8147c4c04562b9621327b52ad5b9")
@WinRTInterface("fe0e8147c4c04562b9621327b52ad5b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccessibilitySettings.ByReference::class)
public interface IAccessibilitySettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HighContrast(): Boolean

  @InterfaceMethod(1)
  public fun get_HighContrastScheme(): String?

  @InterfaceMethod(2)
  public fun add_HighContrastChanged(handler: TypedEventHandler<AccessibilitySettings?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_HighContrastChanged(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccessibilitySettings> {
    public override fun getValue() = ABI.makeIAccessibilitySettings(pointer.getPointer(0))

    public fun setValue(value: IAccessibilitySettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccessibilitySettings {
    public val __1444277185_Ptr: Pointer?

    public val _1444277185_VtblPtr: Pointer?
      get() = __1444277185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HighContrast(): Boolean {
      val fnPtr = _1444277185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1444277185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_HighContrastScheme(): String? {
      val fnPtr = _1444277185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1444277185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_HighContrastChanged(handler: TypedEventHandler<AccessibilitySettings?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1444277185_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1444277185_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_HighContrastChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1444277185_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1444277185_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccessibilitySettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1444277185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessibilitySettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe0e8147c4c04562b9621327b52ad5b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessibilitySettings(ptr: Pointer?): WithDefault =
        IAccessibilitySettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessibilitySettings {
      val address = segment.toRawLongValue()
      return makeIAccessibilitySettings(Pointer(address))
    }

    public override fun toNative(obj: IAccessibilitySettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1444277185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccessibilitySettings): Array<IAccessibilitySettings?> =
        (elements as
        Array<IAccessibilitySettings?>).castToImpl<IAccessibilitySettings,IAccessibilitySettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccessibilitySettings?> =
        arrayOfNulls<IAccessibilitySettings_Impl>(size) as Array<IAccessibilitySettings?>
  }
}
