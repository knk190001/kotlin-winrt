package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Storage.Streams.IBuffer
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattServiceProviderAdvertisingParameters2.ABI::class)
@Signature("{ff68468d-ca92-4434-9743-0e90988ad879}")
@Guid("ff68468dca92443497430e90988ad879")
@WinRTInterface("ff68468dca92443497430e90988ad879")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattServiceProviderAdvertisingParameters2.ByReference::class)
public interface IGattServiceProviderAdvertisingParameters2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ServiceData(value: IBuffer?): Unit

  @InterfaceMethod(1)
  public fun get_ServiceData(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattServiceProviderAdvertisingParameters2> {
    public override fun getValue() =
        ABI.makeIGattServiceProviderAdvertisingParameters2(pointer.getPointer(0))

    public fun setValue(value: IGattServiceProviderAdvertisingParameters2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattServiceProviderAdvertisingParameters2 {
    public val __48258383_Ptr: Pointer?

    public val _48258383_VtblPtr: Pointer?
      get() = __48258383_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ServiceData(value: IBuffer?): Unit {
      val fnPtr = _48258383_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__48258383_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ServiceData(): IBuffer? {
      val fnPtr = _48258383_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__48258383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IGattServiceProviderAdvertisingParameters2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __48258383_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattServiceProviderAdvertisingParameters2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff68468dca92443497430e90988ad879")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattServiceProviderAdvertisingParameters2(ptr: Pointer?): WithDefault =
        IGattServiceProviderAdvertisingParameters2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGattServiceProviderAdvertisingParameters2 {
      val address = segment.toRawLongValue()
      return makeIGattServiceProviderAdvertisingParameters2(Pointer(address))
    }

    public override fun toNative(obj: IGattServiceProviderAdvertisingParameters2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__48258383_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattServiceProviderAdvertisingParameters2):
        Array<IGattServiceProviderAdvertisingParameters2?> = (elements as
        Array<IGattServiceProviderAdvertisingParameters2?>).castToImpl<IGattServiceProviderAdvertisingParameters2,IGattServiceProviderAdvertisingParameters2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattServiceProviderAdvertisingParameters2?> =
        arrayOfNulls<IGattServiceProviderAdvertisingParameters2_Impl>(size) as
        Array<IGattServiceProviderAdvertisingParameters2?>
  }
}
