package Windows.Devices.Radios

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IRadioStatics.ABI::class)
@Signature("{5fb6a12e-67cb-46ae-aae9-65919f86eff4}")
@Guid("5fb6a12e67cb46aeaae965919f86eff4")
@WinRTInterface("5fb6a12e67cb46aeaae965919f86eff4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioStatics.ByReference::class)
public interface IRadioStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetRadiosAsync(): IAsyncOperation<IVectorView<Radio?>?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(2)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<Radio?>?

  @InterfaceMethod(3)
  public fun RequestAccessAsync(): IAsyncOperation<RadioAccessStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRadioStatics>
      {
    public override fun getValue() = ABI.makeIRadioStatics(pointer.getPointer(0))

    public fun setValue(value: IRadioStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioStatics {
    public val __1173577345_Ptr: Pointer?

    public val _1173577345_VtblPtr: Pointer?
      get() = __1173577345_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetRadiosAsync(): IAsyncOperation<IVectorView<Radio?>?>? {
      val fnPtr = _1173577345_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Radio?>?>>()
      val hr = fn.invokeHR(arrayOf(__1173577345_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<Radio?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1173577345_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1173577345_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<Radio?>? {
      val fnPtr = _1173577345_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Radio?>>()
      val hr = fn.invokeHR(arrayOf(__1173577345_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Radio?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestAccessAsync(): IAsyncOperation<RadioAccessStatus?>? {
      val fnPtr = _1173577345_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RadioAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1173577345_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<RadioAccessStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IRadioStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1173577345_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5fb6a12e67cb46aeaae965919f86eff4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioStatics(ptr: Pointer?): WithDefault = IRadioStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioStatics {
      val address = segment.toRawLongValue()
      return makeIRadioStatics(Pointer(address))
    }

    public override fun toNative(obj: IRadioStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1173577345_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioStatics): Array<IRadioStatics?> = (elements as
        Array<IRadioStatics?>).castToImpl<IRadioStatics,IRadioStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioStatics?> =
        arrayOfNulls<IRadioStatics_Impl>(size) as Array<IRadioStatics?>
  }
}
