package Windows.ApplicationModel.Store.Preview

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

@ABIMarker(IStoreHardwareManufacturerInfo.ABI::class)
@Signature("{f292dc08-c654-43ac-a21f-34801c9d3388}")
@Guid("f292dc08c65443aca21f34801c9d3388")
@WinRTInterface("f292dc08c65443aca21f34801c9d3388")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreHardwareManufacturerInfo.ByReference::class)
public interface IStoreHardwareManufacturerInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HardwareManufacturerId(): String?

  @InterfaceMethod(1)
  public fun get_StoreContentModifierId(): String?

  @InterfaceMethod(2)
  public fun get_ModelName(): String?

  @InterfaceMethod(3)
  public fun get_ManufacturerName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreHardwareManufacturerInfo> {
    public override fun getValue() = ABI.makeIStoreHardwareManufacturerInfo(pointer.getPointer(0))

    public fun setValue(value: IStoreHardwareManufacturerInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreHardwareManufacturerInfo {
    public val __1643043760_Ptr: Pointer?

    public val _1643043760_VtblPtr: Pointer?
      get() = __1643043760_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HardwareManufacturerId(): String? {
      val fnPtr = _1643043760_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1643043760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StoreContentModifierId(): String? {
      val fnPtr = _1643043760_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1643043760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ModelName(): String? {
      val fnPtr = _1643043760_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1643043760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ManufacturerName(): String? {
      val fnPtr = _1643043760_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1643043760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStoreHardwareManufacturerInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1643043760_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreHardwareManufacturerInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f292dc08c65443aca21f34801c9d3388")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreHardwareManufacturerInfo(ptr: Pointer?): WithDefault =
        IStoreHardwareManufacturerInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreHardwareManufacturerInfo {
      val address = segment.toRawLongValue()
      return makeIStoreHardwareManufacturerInfo(Pointer(address))
    }

    public override fun toNative(obj: IStoreHardwareManufacturerInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1643043760_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreHardwareManufacturerInfo):
        Array<IStoreHardwareManufacturerInfo?> = (elements as
        Array<IStoreHardwareManufacturerInfo?>).castToImpl<IStoreHardwareManufacturerInfo,IStoreHardwareManufacturerInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreHardwareManufacturerInfo?> =
        arrayOfNulls<IStoreHardwareManufacturerInfo_Impl>(size) as
        Array<IStoreHardwareManufacturerInfo?>
  }
}
