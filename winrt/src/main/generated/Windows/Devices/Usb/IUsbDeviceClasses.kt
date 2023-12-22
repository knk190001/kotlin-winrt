package Windows.Devices.Usb

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbDeviceClasses.ABI::class)
@Signature("{686f955d-9b92-4b30-9781-c22c55ac35cb}")
@Guid("686f955d9b924b309781c22c55ac35cb")
@WinRTInterface("686f955d9b924b309781c22c55ac35cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbDeviceClasses.ByReference::class)
public interface IUsbDeviceClasses : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbDeviceClasses> {
    public override fun getValue() = ABI.makeIUsbDeviceClasses(pointer.getPointer(0))

    public fun setValue(value: IUsbDeviceClasses_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbDeviceClasses {
    public val __333337485_Ptr: Pointer?

    public val _333337485_VtblPtr: Pointer?
      get() = __333337485_Ptr?.getPointer(0)
  }

  public class IUsbDeviceClasses_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __333337485_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbDeviceClasses, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("686f955d9b924b309781c22c55ac35cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbDeviceClasses(ptr: Pointer?): WithDefault = IUsbDeviceClasses_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbDeviceClasses {
      val address = segment.toRawLongValue()
      return makeIUsbDeviceClasses(Pointer(address))
    }

    public override fun toNative(obj: IUsbDeviceClasses): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__333337485_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbDeviceClasses): Array<IUsbDeviceClasses?> = (elements
        as Array<IUsbDeviceClasses?>).castToImpl<IUsbDeviceClasses,IUsbDeviceClasses_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbDeviceClasses?> =
        arrayOfNulls<IUsbDeviceClasses_Impl>(size) as Array<IUsbDeviceClasses?>
  }
}
