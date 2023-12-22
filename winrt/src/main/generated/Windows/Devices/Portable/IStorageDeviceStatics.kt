package Windows.Devices.Portable

import Windows.Storage.StorageFolder
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

@ABIMarker(IStorageDeviceStatics.ABI::class)
@Signature("{5ece44ee-1b23-4dd2-8652-bc164f003128}")
@Guid("5ece44ee1b234dd28652bc164f003128")
@WinRTInterface("5ece44ee1b234dd28652bc164f003128")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageDeviceStatics.ByReference::class)
public interface IStorageDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromId(deviceId: String?): StorageFolder?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageDeviceStatics> {
    public override fun getValue() = ABI.makeIStorageDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IStorageDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageDeviceStatics {
    public val __2118738022_Ptr: Pointer?

    public val _2118738022_VtblPtr: Pointer?
      get() = __2118738022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromId(deviceId: String?): StorageFolder? {
      val fnPtr = _2118738022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__2118738022_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _2118738022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2118738022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStorageDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2118738022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ece44ee1b234dd28652bc164f003128")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageDeviceStatics(ptr: Pointer?): WithDefault =
        IStorageDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIStorageDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IStorageDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2118738022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageDeviceStatics): Array<IStorageDeviceStatics?> =
        (elements as
        Array<IStorageDeviceStatics?>).castToImpl<IStorageDeviceStatics,IStorageDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageDeviceStatics?> =
        arrayOfNulls<IStorageDeviceStatics_Impl>(size) as Array<IStorageDeviceStatics?>
  }
}
