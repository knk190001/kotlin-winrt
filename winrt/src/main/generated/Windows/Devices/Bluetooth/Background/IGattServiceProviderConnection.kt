package Windows.Devices.Bluetooth.Background

import Windows.Devices.Bluetooth.GenericAttributeProfile.GattLocalService
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

@ABIMarker(IGattServiceProviderConnection.ABI::class)
@Signature("{7fa1b9b9-2f13-40b5-9582-8eb78e98ef13}")
@Guid("7fa1b9b92f1340b595828eb78e98ef13")
@WinRTInterface("7fa1b9b92f1340b595828eb78e98ef13")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattServiceProviderConnection.ByReference::class)
public interface IGattServiceProviderConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TriggerId(): String?

  @InterfaceMethod(1)
  public fun get_Service(): GattLocalService?

  @InterfaceMethod(2)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattServiceProviderConnection> {
    public override fun getValue() = ABI.makeIGattServiceProviderConnection(pointer.getPointer(0))

    public fun setValue(value: IGattServiceProviderConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattServiceProviderConnection {
    public val __1325806805_Ptr: Pointer?

    public val _1325806805_VtblPtr: Pointer?
      get() = __1325806805_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TriggerId(): String? {
      val fnPtr = _1325806805_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1325806805_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Service(): GattLocalService? {
      val fnPtr = _1325806805_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattLocalService>()
      val hr = fn.invokeHR(arrayOf(__1325806805_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattLocalService>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Start(): Unit {
      val fnPtr = _1325806805_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1325806805_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGattServiceProviderConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1325806805_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattServiceProviderConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7fa1b9b92f1340b595828eb78e98ef13")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattServiceProviderConnection(ptr: Pointer?): WithDefault =
        IGattServiceProviderConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattServiceProviderConnection {
      val address = segment.toRawLongValue()
      return makeIGattServiceProviderConnection(Pointer(address))
    }

    public override fun toNative(obj: IGattServiceProviderConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1325806805_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattServiceProviderConnection):
        Array<IGattServiceProviderConnection?> = (elements as
        Array<IGattServiceProviderConnection?>).castToImpl<IGattServiceProviderConnection,IGattServiceProviderConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattServiceProviderConnection?> =
        arrayOfNulls<IGattServiceProviderConnection_Impl>(size) as
        Array<IGattServiceProviderConnection?>
  }
}
