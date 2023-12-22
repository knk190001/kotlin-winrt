package Windows.Media.Capture

import Windows.System.VirtualKey
import Windows.System.VirtualKeyModifiers
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

@ABIMarker(IAppCaptureAlternateShortcutKeys2.ABI::class)
@Signature("{c3669090-dd17-47f0-95e5-ce42286cf338}")
@Guid("c3669090dd1747f095e5ce42286cf338")
@WinRTInterface("c3669090dd1747f095e5ce42286cf338")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureAlternateShortcutKeys2.ByReference::class)
public interface IAppCaptureAlternateShortcutKeys2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ToggleMicrophoneCaptureKey(value: VirtualKey?): Unit

  @InterfaceMethod(1)
  public fun get_ToggleMicrophoneCaptureKey(): VirtualKey?

  @InterfaceMethod(2)
  public fun put_ToggleMicrophoneCaptureKeyModifiers(value: VirtualKeyModifiers?): Unit

  @InterfaceMethod(3)
  public fun get_ToggleMicrophoneCaptureKeyModifiers(): VirtualKeyModifiers?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureAlternateShortcutKeys2> {
    public override fun getValue() =
        ABI.makeIAppCaptureAlternateShortcutKeys2(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureAlternateShortcutKeys2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureAlternateShortcutKeys2 {
    public val __70187483_Ptr: Pointer?

    public val _70187483_VtblPtr: Pointer?
      get() = __70187483_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ToggleMicrophoneCaptureKey(value: VirtualKey?): Unit {
      val fnPtr = _70187483_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70187483_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ToggleMicrophoneCaptureKey(): VirtualKey? {
      val fnPtr = _70187483_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__70187483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ToggleMicrophoneCaptureKeyModifiers(value: VirtualKeyModifiers?): Unit {
      val fnPtr = _70187483_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70187483_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ToggleMicrophoneCaptureKeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _70187483_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__70187483_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }
  }

  public class IAppCaptureAlternateShortcutKeys2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __70187483_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureAlternateShortcutKeys2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3669090dd1747f095e5ce42286cf338")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureAlternateShortcutKeys2(ptr: Pointer?): WithDefault =
        IAppCaptureAlternateShortcutKeys2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureAlternateShortcutKeys2 {
      val address = segment.toRawLongValue()
      return makeIAppCaptureAlternateShortcutKeys2(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureAlternateShortcutKeys2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__70187483_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureAlternateShortcutKeys2):
        Array<IAppCaptureAlternateShortcutKeys2?> = (elements as
        Array<IAppCaptureAlternateShortcutKeys2?>).castToImpl<IAppCaptureAlternateShortcutKeys2,IAppCaptureAlternateShortcutKeys2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureAlternateShortcutKeys2?> =
        arrayOfNulls<IAppCaptureAlternateShortcutKeys2_Impl>(size) as
        Array<IAppCaptureAlternateShortcutKeys2?>
  }
}
