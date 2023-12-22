package Microsoft.UI.Xaml

import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IApplication.ABI::class)
@Signature("{06a8f4e7-1146-55af-820d-ebd55643b021}")
@Guid("06a8f4e7114655af820debd55643b021")
@WinRTInterface("06a8f4e7114655af820debd55643b021")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplication.ByReference::class)
public interface IApplication : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Resources(): ResourceDictionary?

  @InterfaceMethod(1)
  public fun put_Resources(value: ResourceDictionary?): Unit

  @InterfaceMethod(2)
  public fun get_DebugSettings(): DebugSettings?

  @InterfaceMethod(3)
  public fun get_RequestedTheme(): ApplicationTheme?

  @InterfaceMethod(4)
  public fun put_RequestedTheme(value: ApplicationTheme?): Unit

  @InterfaceMethod(5)
  public fun get_FocusVisualKind(): FocusVisualKind?

  @InterfaceMethod(6)
  public fun put_FocusVisualKind(value: FocusVisualKind?): Unit

  @InterfaceMethod(7)
  public fun get_HighContrastAdjustment(): ApplicationHighContrastAdjustment?

  @InterfaceMethod(8)
  public fun put_HighContrastAdjustment(value: ApplicationHighContrastAdjustment?): Unit

  @InterfaceMethod(9)
  public fun add_UnhandledException(handler: UnhandledExceptionEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_UnhandledException(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun Exit(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IApplication> {
    public override fun getValue() = ABI.makeIApplication(pointer.getPointer(0))

    public fun setValue(value: IApplication_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplication {
    public val __149214551_Ptr: Pointer?

    public val _149214551_VtblPtr: Pointer?
      get() = __149214551_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Resources(): ResourceDictionary? {
      val fnPtr = _149214551_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResourceDictionary>()
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResourceDictionary>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Resources(value: ResourceDictionary?): Unit {
      val fnPtr = _149214551_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DebugSettings(): DebugSettings? {
      val fnPtr = _149214551_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DebugSettings>()
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DebugSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RequestedTheme(): ApplicationTheme? {
      val fnPtr = _149214551_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationTheme>()
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationTheme>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_RequestedTheme(value: ApplicationTheme?): Unit {
      val fnPtr = _149214551_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_FocusVisualKind(): FocusVisualKind? {
      val fnPtr = _149214551_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusVisualKind>()
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusVisualKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_FocusVisualKind(value: FocusVisualKind?): Unit {
      val fnPtr = _149214551_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_HighContrastAdjustment(): ApplicationHighContrastAdjustment? {
      val fnPtr = _149214551_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationHighContrastAdjustment>()
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationHighContrastAdjustment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_HighContrastAdjustment(value: ApplicationHighContrastAdjustment?):
        Unit {
      val fnPtr = _149214551_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_UnhandledException(handler: UnhandledExceptionEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _149214551_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_UnhandledException(token: EventRegistrationToken?): Unit {
      val fnPtr = _149214551_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun Exit(): Unit {
      val fnPtr = _149214551_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__149214551_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplication_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __149214551_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplication, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06a8f4e7114655af820debd55643b021")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplication(ptr: Pointer?): WithDefault = IApplication_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplication {
      val address = segment.toRawLongValue()
      return makeIApplication(Pointer(address))
    }

    public override fun toNative(obj: IApplication): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__149214551_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplication): Array<IApplication?> = (elements as
        Array<IApplication?>).castToImpl<IApplication,IApplication_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplication?> =
        arrayOfNulls<IApplication_Impl>(size) as Array<IApplication?>
  }
}
