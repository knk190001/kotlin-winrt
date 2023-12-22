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

@ABIMarker(IAppCaptureAlternateShortcutKeys3.ABI::class)
@Signature("{7b81448c-418e-469c-a49a-45b597c826b6}")
@Guid("7b81448c418e469ca49a45b597c826b6")
@WinRTInterface("7b81448c418e469ca49a45b597c826b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppCaptureAlternateShortcutKeys3.ByReference::class)
public interface IAppCaptureAlternateShortcutKeys3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ToggleCameraCaptureKey(value: VirtualKey?): Unit

  @InterfaceMethod(1)
  public fun get_ToggleCameraCaptureKey(): VirtualKey?

  @InterfaceMethod(2)
  public fun put_ToggleCameraCaptureKeyModifiers(value: VirtualKeyModifiers?): Unit

  @InterfaceMethod(3)
  public fun get_ToggleCameraCaptureKeyModifiers(): VirtualKeyModifiers?

  @InterfaceMethod(4)
  public fun put_ToggleBroadcastKey(value: VirtualKey?): Unit

  @InterfaceMethod(5)
  public fun get_ToggleBroadcastKey(): VirtualKey?

  @InterfaceMethod(6)
  public fun put_ToggleBroadcastKeyModifiers(value: VirtualKeyModifiers?): Unit

  @InterfaceMethod(7)
  public fun get_ToggleBroadcastKeyModifiers(): VirtualKeyModifiers?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppCaptureAlternateShortcutKeys3> {
    public override fun getValue() =
        ABI.makeIAppCaptureAlternateShortcutKeys3(pointer.getPointer(0))

    public fun setValue(value: IAppCaptureAlternateShortcutKeys3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppCaptureAlternateShortcutKeys3 {
    public val __70187484_Ptr: Pointer?

    public val _70187484_VtblPtr: Pointer?
      get() = __70187484_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ToggleCameraCaptureKey(value: VirtualKey?): Unit {
      val fnPtr = _70187484_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70187484_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ToggleCameraCaptureKey(): VirtualKey? {
      val fnPtr = _70187484_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__70187484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ToggleCameraCaptureKeyModifiers(value: VirtualKeyModifiers?): Unit {
      val fnPtr = _70187484_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70187484_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ToggleCameraCaptureKeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _70187484_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__70187484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ToggleBroadcastKey(value: VirtualKey?): Unit {
      val fnPtr = _70187484_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70187484_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ToggleBroadcastKey(): VirtualKey? {
      val fnPtr = _70187484_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__70187484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ToggleBroadcastKeyModifiers(value: VirtualKeyModifiers?): Unit {
      val fnPtr = _70187484_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__70187484_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_ToggleBroadcastKeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _70187484_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__70187484_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }
  }

  public class IAppCaptureAlternateShortcutKeys3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __70187484_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppCaptureAlternateShortcutKeys3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b81448c418e469ca49a45b597c826b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppCaptureAlternateShortcutKeys3(ptr: Pointer?): WithDefault =
        IAppCaptureAlternateShortcutKeys3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppCaptureAlternateShortcutKeys3 {
      val address = segment.toRawLongValue()
      return makeIAppCaptureAlternateShortcutKeys3(Pointer(address))
    }

    public override fun toNative(obj: IAppCaptureAlternateShortcutKeys3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__70187484_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppCaptureAlternateShortcutKeys3):
        Array<IAppCaptureAlternateShortcutKeys3?> = (elements as
        Array<IAppCaptureAlternateShortcutKeys3?>).castToImpl<IAppCaptureAlternateShortcutKeys3,IAppCaptureAlternateShortcutKeys3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppCaptureAlternateShortcutKeys3?> =
        arrayOfNulls<IAppCaptureAlternateShortcutKeys3_Impl>(size) as
        Array<IAppCaptureAlternateShortcutKeys3?>
  }
}
