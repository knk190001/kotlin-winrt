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

@ABIMarker(IGattLocalDescriptorParameters.ABI::class)
@Signature("{5fdede6a-f3c1-4b66-8c4b-e3d2293b40e9}")
@Guid("5fdede6af3c14b668c4be3d2293b40e9")
@WinRTInterface("5fdede6af3c14b668c4be3d2293b40e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattLocalDescriptorParameters.ByReference::class)
public interface IGattLocalDescriptorParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_StaticValue(value: IBuffer?): Unit

  @InterfaceMethod(1)
  public fun get_StaticValue(): IBuffer?

  @InterfaceMethod(2)
  public fun put_ReadProtectionLevel(value: GattProtectionLevel?): Unit

  @InterfaceMethod(3)
  public fun get_ReadProtectionLevel(): GattProtectionLevel?

  @InterfaceMethod(4)
  public fun put_WriteProtectionLevel(value: GattProtectionLevel?): Unit

  @InterfaceMethod(5)
  public fun get_WriteProtectionLevel(): GattProtectionLevel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattLocalDescriptorParameters> {
    public override fun getValue() = ABI.makeIGattLocalDescriptorParameters(pointer.getPointer(0))

    public fun setValue(value: IGattLocalDescriptorParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattLocalDescriptorParameters {
    public val __933839465_Ptr: Pointer?

    public val _933839465_VtblPtr: Pointer?
      get() = __933839465_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_StaticValue(value: IBuffer?): Unit {
      val fnPtr = _933839465_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__933839465_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_StaticValue(): IBuffer? {
      val fnPtr = _933839465_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__933839465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ReadProtectionLevel(value: GattProtectionLevel?): Unit {
      val fnPtr = _933839465_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__933839465_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ReadProtectionLevel(): GattProtectionLevel? {
      val fnPtr = _933839465_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__933839465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_WriteProtectionLevel(value: GattProtectionLevel?): Unit {
      val fnPtr = _933839465_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__933839465_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_WriteProtectionLevel(): GattProtectionLevel? {
      val fnPtr = _933839465_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__933839465_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattProtectionLevel>(result.getValue())
      return resultValue
    }
  }

  public class IGattLocalDescriptorParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __933839465_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattLocalDescriptorParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5fdede6af3c14b668c4be3d2293b40e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattLocalDescriptorParameters(ptr: Pointer?): WithDefault =
        IGattLocalDescriptorParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattLocalDescriptorParameters {
      val address = segment.toRawLongValue()
      return makeIGattLocalDescriptorParameters(Pointer(address))
    }

    public override fun toNative(obj: IGattLocalDescriptorParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__933839465_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattLocalDescriptorParameters):
        Array<IGattLocalDescriptorParameters?> = (elements as
        Array<IGattLocalDescriptorParameters?>).castToImpl<IGattLocalDescriptorParameters,IGattLocalDescriptorParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattLocalDescriptorParameters?> =
        arrayOfNulls<IGattLocalDescriptorParameters_Impl>(size) as
        Array<IGattLocalDescriptorParameters?>
  }
}
