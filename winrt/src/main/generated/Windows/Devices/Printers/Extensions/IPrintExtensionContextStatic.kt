package Windows.Devices.Printers.Extensions

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintExtensionContextStatic.ABI::class)
@Signature("{e70d9fc1-ff79-4aa4-8c9b-0c93aedfde8a}")
@Guid("e70d9fc1ff794aa48c9b0c93aedfde8a")
@WinRTInterface("e70d9fc1ff794aa48c9b0c93aedfde8a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintExtensionContextStatic.ByReference::class)
public interface IPrintExtensionContextStatic : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromDeviceId(deviceId: String?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintExtensionContextStatic> {
    public override fun getValue() = ABI.makeIPrintExtensionContextStatic(pointer.getPointer(0))

    public fun setValue(value: IPrintExtensionContextStatic_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintExtensionContextStatic {
    public val __1390586959_Ptr: Pointer?

    public val _1390586959_VtblPtr: Pointer?
      get() = __1390586959_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromDeviceId(deviceId: String?): IUnknown? {
      val fnPtr = _1390586959_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1390586959_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IPrintExtensionContextStatic_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1390586959_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintExtensionContextStatic, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e70d9fc1ff794aa48c9b0c93aedfde8a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintExtensionContextStatic(ptr: Pointer?): WithDefault =
        IPrintExtensionContextStatic_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintExtensionContextStatic {
      val address = segment.toRawLongValue()
      return makeIPrintExtensionContextStatic(Pointer(address))
    }

    public override fun toNative(obj: IPrintExtensionContextStatic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1390586959_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintExtensionContextStatic):
        Array<IPrintExtensionContextStatic?> = (elements as
        Array<IPrintExtensionContextStatic?>).castToImpl<IPrintExtensionContextStatic,IPrintExtensionContextStatic_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintExtensionContextStatic?> =
        arrayOfNulls<IPrintExtensionContextStatic_Impl>(size) as
        Array<IPrintExtensionContextStatic?>
  }
}
