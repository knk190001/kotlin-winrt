package Windows.Devices.HumanInterfaceDevice

import Windows.Foundation.IAsyncOperation
import Windows.Storage.FileAccessMode
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHidDeviceStatics.ABI::class)
@Signature("{9e5981e4-9856-418c-9f73-77de0cd85754}")
@Guid("9e5981e49856418c9f7377de0cd85754")
@WinRTInterface("9e5981e49856418c9f7377de0cd85754")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidDeviceStatics.ByReference::class)
public interface IHidDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(usagePage: WinDef.USHORT, usageId: WinDef.USHORT): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(
    usagePage: WinDef.USHORT,
    usageId: WinDef.USHORT,
    vendorId: WinDef.USHORT,
    productId: WinDef.USHORT
  ): String?

  @InterfaceMethod(2)
  public fun FromIdAsync(deviceId: String?, accessMode: FileAccessMode?):
      IAsyncOperation<HidDevice?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHidDeviceStatics> {
    public override fun getValue() = ABI.makeIHidDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IHidDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidDeviceStatics {
    public val __1369581463_Ptr: Pointer?

    public val _1369581463_VtblPtr: Pointer?
      get() = __1369581463_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(usagePage: WinDef.USHORT, usageId: WinDef.USHORT):
        String? {
      val fnPtr = _1369581463_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1369581463_Ptr, usagePage, usageId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(
      usagePage: WinDef.USHORT,
      usageId: WinDef.USHORT,
      vendorId: WinDef.USHORT,
      productId: WinDef.USHORT
    ): String? {
      val fnPtr = _1369581463_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1369581463_Ptr, usagePage, usageId, vendorId, productId,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(deviceId: String?, accessMode: FileAccessMode?):
        IAsyncOperation<HidDevice?>? {
      val fnPtr = _1369581463_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HidDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1369581463_Ptr, marshalToNative(deviceId),
          marshalToNative(accessMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HidDevice?>>(result.getValue())
      return resultValue
    }
  }

  public class IHidDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1369581463_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e5981e49856418c9f7377de0cd85754")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidDeviceStatics(ptr: Pointer?): WithDefault = IHidDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIHidDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IHidDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1369581463_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidDeviceStatics): Array<IHidDeviceStatics?> = (elements
        as Array<IHidDeviceStatics?>).castToImpl<IHidDeviceStatics,IHidDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidDeviceStatics?> =
        arrayOfNulls<IHidDeviceStatics_Impl>(size) as Array<IHidDeviceStatics?>
  }
}
