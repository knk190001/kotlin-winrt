package Windows.Devices.PointOfService

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILineDisplayStatics.ABI::class)
@Signature("{022dc0b6-11b0-4690-9547-0b39c5af2114}")
@Guid("022dc0b611b0469095470b39c5af2114")
@WinRTInterface("022dc0b611b0469095470b39c5af2114")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayStatics.ByReference::class)
public interface ILineDisplayStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<LineDisplay?>?

  @InterfaceMethod(1)
  public fun GetDefaultAsync(): IAsyncOperation<LineDisplay?>?

  @InterfaceMethod(2)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(3)
  public fun GetDeviceSelector(connectionTypes: PosConnectionTypes?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayStatics> {
    public override fun getValue() = ABI.makeILineDisplayStatics(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayStatics {
    public val __1150763798_Ptr: Pointer?

    public val _1150763798_VtblPtr: Pointer?
      get() = __1150763798_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<LineDisplay?>? {
      val fnPtr = _1150763798_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LineDisplay?>>()
      val hr = fn.invokeHR(arrayOf(__1150763798_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LineDisplay?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDefaultAsync(): IAsyncOperation<LineDisplay?>? {
      val fnPtr = _1150763798_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LineDisplay?>>()
      val hr = fn.invokeHR(arrayOf(__1150763798_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LineDisplay?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1150763798_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1150763798_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeviceSelector(connectionTypes: PosConnectionTypes?): String? {
      val fnPtr = _1150763798_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1150763798_Ptr, marshalToNative(connectionTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplayStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1150763798_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("022dc0b611b0469095470b39c5af2114")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayStatics(ptr: Pointer?): WithDefault = ILineDisplayStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayStatics {
      val address = segment.toRawLongValue()
      return makeILineDisplayStatics(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1150763798_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayStatics): Array<ILineDisplayStatics?> =
        (elements as
        Array<ILineDisplayStatics?>).castToImpl<ILineDisplayStatics,ILineDisplayStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayStatics?> =
        arrayOfNulls<ILineDisplayStatics_Impl>(size) as Array<ILineDisplayStatics?>
  }
}
