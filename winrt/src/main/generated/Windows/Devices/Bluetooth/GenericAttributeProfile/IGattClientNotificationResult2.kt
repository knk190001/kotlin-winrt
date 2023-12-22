package Windows.Devices.Bluetooth.GenericAttributeProfile

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGattClientNotificationResult2.ABI::class)
@Signature("{8faec497-45e0-497e-9582-29a1fe281ad5}")
@Guid("8faec49745e0497e958229a1fe281ad5")
@WinRTInterface("8faec49745e0497e958229a1fe281ad5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattClientNotificationResult2.ByReference::class)
public interface IGattClientNotificationResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BytesSent(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattClientNotificationResult2> {
    public override fun getValue() = ABI.makeIGattClientNotificationResult2(pointer.getPointer(0))

    public fun setValue(value: IGattClientNotificationResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattClientNotificationResult2 {
    public val __1156559324_Ptr: Pointer?

    public val _1156559324_VtblPtr: Pointer?
      get() = __1156559324_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BytesSent(): WinDef.USHORT {
      val fnPtr = _1156559324_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1156559324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IGattClientNotificationResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1156559324_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattClientNotificationResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8faec49745e0497e958229a1fe281ad5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattClientNotificationResult2(ptr: Pointer?): WithDefault =
        IGattClientNotificationResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattClientNotificationResult2 {
      val address = segment.toRawLongValue()
      return makeIGattClientNotificationResult2(Pointer(address))
    }

    public override fun toNative(obj: IGattClientNotificationResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1156559324_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattClientNotificationResult2):
        Array<IGattClientNotificationResult2?> = (elements as
        Array<IGattClientNotificationResult2?>).castToImpl<IGattClientNotificationResult2,IGattClientNotificationResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattClientNotificationResult2?> =
        arrayOfNulls<IGattClientNotificationResult2_Impl>(size) as
        Array<IGattClientNotificationResult2?>
  }
}
