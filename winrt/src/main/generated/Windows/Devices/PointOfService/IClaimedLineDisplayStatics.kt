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

@ABIMarker(IClaimedLineDisplayStatics.ABI::class)
@Signature("{78ca98fb-8b6b-4973-86f0-3e570c351825}")
@Guid("78ca98fb8b6b497386f03e570c351825")
@WinRTInterface("78ca98fb8b6b497386f03e570c351825")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedLineDisplayStatics.ByReference::class)
public interface IClaimedLineDisplayStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<ClaimedLineDisplay?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(2)
  public fun GetDeviceSelector(connectionTypes: PosConnectionTypes?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedLineDisplayStatics> {
    public override fun getValue() = ABI.makeIClaimedLineDisplayStatics(pointer.getPointer(0))

    public fun setValue(value: IClaimedLineDisplayStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedLineDisplayStatics {
    public val __911079603_Ptr: Pointer?

    public val _911079603_VtblPtr: Pointer?
      get() = __911079603_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<ClaimedLineDisplay?>? {
      val fnPtr = _911079603_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ClaimedLineDisplay?>>()
      val hr = fn.invokeHR(arrayOf(__911079603_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ClaimedLineDisplay?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _911079603_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__911079603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelector(connectionTypes: PosConnectionTypes?): String? {
      val fnPtr = _911079603_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__911079603_Ptr, marshalToNative(connectionTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IClaimedLineDisplayStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __911079603_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedLineDisplayStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("78ca98fb8b6b497386f03e570c351825")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedLineDisplayStatics(ptr: Pointer?): WithDefault =
        IClaimedLineDisplayStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedLineDisplayStatics {
      val address = segment.toRawLongValue()
      return makeIClaimedLineDisplayStatics(Pointer(address))
    }

    public override fun toNative(obj: IClaimedLineDisplayStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__911079603_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedLineDisplayStatics):
        Array<IClaimedLineDisplayStatics?> = (elements as
        Array<IClaimedLineDisplayStatics?>).castToImpl<IClaimedLineDisplayStatics,IClaimedLineDisplayStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedLineDisplayStatics?> =
        arrayOfNulls<IClaimedLineDisplayStatics_Impl>(size) as Array<IClaimedLineDisplayStatics?>
  }
}
