package Windows.Devices.SmartCards

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

@ABIMarker(ISmartCardReaderStatics.ABI::class)
@Signature("{103c04e1-a1ca-48f2-a281-5b6f669af107}")
@Guid("103c04e1a1ca48f2a2815b6f669af107")
@WinRTInterface("103c04e1a1ca48f2a2815b6f669af107")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardReaderStatics.ByReference::class)
public interface ISmartCardReaderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(kind: SmartCardReaderKind?): String?

  @InterfaceMethod(2)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<SmartCardReader?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardReaderStatics> {
    public override fun getValue() = ABI.makeISmartCardReaderStatics(pointer.getPointer(0))

    public fun setValue(value: ISmartCardReaderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardReaderStatics {
    public val __516584964_Ptr: Pointer?

    public val _516584964_VtblPtr: Pointer?
      get() = __516584964_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _516584964_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__516584964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(kind: SmartCardReaderKind?): String? {
      val fnPtr = _516584964_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__516584964_Ptr, marshalToNative(kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<SmartCardReader?>? {
      val fnPtr = _516584964_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardReader?>>()
      val hr = fn.invokeHR(arrayOf(__516584964_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SmartCardReader?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardReaderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __516584964_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardReaderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("103c04e1a1ca48f2a2815b6f669af107")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardReaderStatics(ptr: Pointer?): WithDefault =
        ISmartCardReaderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardReaderStatics {
      val address = segment.toRawLongValue()
      return makeISmartCardReaderStatics(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardReaderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__516584964_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardReaderStatics): Array<ISmartCardReaderStatics?>
        = (elements as
        Array<ISmartCardReaderStatics?>).castToImpl<ISmartCardReaderStatics,ISmartCardReaderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardReaderStatics?> =
        arrayOfNulls<ISmartCardReaderStatics_Impl>(size) as Array<ISmartCardReaderStatics?>
  }
}
