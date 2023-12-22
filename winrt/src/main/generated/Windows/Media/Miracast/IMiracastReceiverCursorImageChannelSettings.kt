package Windows.Media.Miracast

import Windows.Graphics.SizeInt32
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMiracastReceiverCursorImageChannelSettings.ABI::class)
@Signature("{ccdbedff-bd00-5b9c-8e4c-00cacf86b634}")
@Guid("ccdbedffbd005b9c8e4c00cacf86b634")
@WinRTInterface("ccdbedffbd005b9c8e4c00cacf86b634")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMiracastReceiverCursorImageChannelSettings.ByReference::class)
public interface IMiracastReceiverCursorImageChannelSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_MaxImageSize(): SizeInt32?

  @InterfaceMethod(3)
  public fun put_MaxImageSize(value: SizeInt32?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMiracastReceiverCursorImageChannelSettings> {
    public override fun getValue() =
        ABI.makeIMiracastReceiverCursorImageChannelSettings(pointer.getPointer(0))

    public fun setValue(value: IMiracastReceiverCursorImageChannelSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMiracastReceiverCursorImageChannelSettings {
    public val __1809075036_Ptr: Pointer?

    public val _1809075036_VtblPtr: Pointer?
      get() = __1809075036_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1809075036_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1809075036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _1809075036_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1809075036_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxImageSize(): SizeInt32? {
      val fnPtr = _1809075036_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__1809075036_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MaxImageSize(value: SizeInt32?): Unit {
      val fnPtr = _1809075036_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1809075036_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMiracastReceiverCursorImageChannelSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1809075036_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMiracastReceiverCursorImageChannelSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ccdbedffbd005b9c8e4c00cacf86b634")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMiracastReceiverCursorImageChannelSettings(ptr: Pointer?): WithDefault =
        IMiracastReceiverCursorImageChannelSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMiracastReceiverCursorImageChannelSettings {
      val address = segment.toRawLongValue()
      return makeIMiracastReceiverCursorImageChannelSettings(Pointer(address))
    }

    public override fun toNative(obj: IMiracastReceiverCursorImageChannelSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1809075036_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMiracastReceiverCursorImageChannelSettings):
        Array<IMiracastReceiverCursorImageChannelSettings?> = (elements as
        Array<IMiracastReceiverCursorImageChannelSettings?>).castToImpl<IMiracastReceiverCursorImageChannelSettings,IMiracastReceiverCursorImageChannelSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMiracastReceiverCursorImageChannelSettings?> =
        arrayOfNulls<IMiracastReceiverCursorImageChannelSettings_Impl>(size) as
        Array<IMiracastReceiverCursorImageChannelSettings?>
  }
}
