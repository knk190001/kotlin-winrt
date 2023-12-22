package Windows.Devices.Haptics

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

@ABIMarker(IVibrationDeviceStatics.ABI::class)
@Signature("{53e2eded-2290-4ac9-8eb3-1a84122eb71c}")
@Guid("53e2eded22904ac98eb31a84122eb71c")
@WinRTInterface("53e2eded22904ac98eb31a84122eb71c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVibrationDeviceStatics.ByReference::class)
public interface IVibrationDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessAsync(): IAsyncOperation<VibrationAccessStatus?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(2)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<VibrationDevice?>?

  @InterfaceMethod(3)
  public fun GetDefaultAsync(): IAsyncOperation<VibrationDevice?>?

  @InterfaceMethod(4)
  public fun FindAllAsync(): IAsyncOperation<IVectorView<VibrationDevice?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVibrationDeviceStatics> {
    public override fun getValue() = ABI.makeIVibrationDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IVibrationDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVibrationDeviceStatics {
    public val __1112659942_Ptr: Pointer?

    public val _1112659942_VtblPtr: Pointer?
      get() = __1112659942_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessAsync(): IAsyncOperation<VibrationAccessStatus?>? {
      val fnPtr = _1112659942_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VibrationAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1112659942_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VibrationAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1112659942_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1112659942_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<VibrationDevice?>? {
      val fnPtr = _1112659942_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VibrationDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1112659942_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<VibrationDevice?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDefaultAsync(): IAsyncOperation<VibrationDevice?>? {
      val fnPtr = _1112659942_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VibrationDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1112659942_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<VibrationDevice?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindAllAsync(): IAsyncOperation<IVectorView<VibrationDevice?>?>? {
      val fnPtr = _1112659942_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<VibrationDevice?>?>>()
      val hr = fn.invokeHR(arrayOf(__1112659942_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<VibrationDevice?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IVibrationDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1112659942_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVibrationDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53e2eded22904ac98eb31a84122eb71c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVibrationDeviceStatics(ptr: Pointer?): WithDefault =
        IVibrationDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVibrationDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIVibrationDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IVibrationDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1112659942_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVibrationDeviceStatics): Array<IVibrationDeviceStatics?>
        = (elements as
        Array<IVibrationDeviceStatics?>).castToImpl<IVibrationDeviceStatics,IVibrationDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVibrationDeviceStatics?> =
        arrayOfNulls<IVibrationDeviceStatics_Impl>(size) as Array<IVibrationDeviceStatics?>
  }
}
