package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.BluetoothCacheMode
import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGattDescriptor.ABI::class)
@Signature("{92055f2b-8084-4344-b4c2-284de19a8506}")
@Guid("92055f2b80844344b4c2284de19a8506")
@WinRTInterface("92055f2b80844344b4c2284de19a8506")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattDescriptor.ByReference::class)
public interface IGattDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProtectionLevel(): GattProtectionLevel?

  @InterfaceMethod(1)
  public fun put_ProtectionLevel(value: GattProtectionLevel?): Unit

  @InterfaceMethod(2)
  public fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun get_AttributeHandle(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun ReadValueAsync(): IAsyncOperation<GattReadResult?>?

  @InterfaceMethod(5)
  public fun ReadValueAsync(cacheMode: BluetoothCacheMode?): IAsyncOperation<GattReadResult?>?

  @InterfaceMethod(6)
  public fun WriteValueAsync(value: IBuffer?): IAsyncOperation<GattCommunicationStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattDescriptor> {
    public override fun getValue() = ABI.makeIGattDescriptor(pointer.getPointer(0))

    public fun setValue(value: IGattDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattDescriptor {
    public val __1499513238_Ptr: Pointer?

    public val _1499513238_VtblPtr: Pointer?
      get() = __1499513238_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProtectionLevel(): GattProtectionLevel? {
      val fnPtr = _1499513238_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__1499513238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ProtectionLevel(value: GattProtectionLevel?): Unit {
      val fnPtr = _1499513238_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1499513238_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1499513238_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1499513238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AttributeHandle(): WinDef.USHORT {
      val fnPtr = _1499513238_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1499513238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun ReadValueAsync(): IAsyncOperation<GattReadResult?>? {
      val fnPtr = _1499513238_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattReadResult?>>()
      val hr = fn.invokeHR(arrayOf(__1499513238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattReadResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ReadValueAsync(cacheMode: BluetoothCacheMode?):
        IAsyncOperation<GattReadResult?>? {
      val fnPtr = _1499513238_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattReadResult?>>()
      val hr = fn.invokeHR(arrayOf(__1499513238_Ptr, marshalToNative(cacheMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattReadResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun WriteValueAsync(value: IBuffer?):
        IAsyncOperation<GattCommunicationStatus?>? {
      val fnPtr = _1499513238_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattCommunicationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1499513238_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GattCommunicationStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1499513238_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92055f2b80844344b4c2284de19a8506")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattDescriptor(ptr: Pointer?): WithDefault = IGattDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattDescriptor {
      val address = segment.toRawLongValue()
      return makeIGattDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IGattDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1499513238_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattDescriptor): Array<IGattDescriptor?> = (elements as
        Array<IGattDescriptor?>).castToImpl<IGattDescriptor,IGattDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattDescriptor?> =
        arrayOfNulls<IGattDescriptor_Impl>(size) as Array<IGattDescriptor?>
  }
}
