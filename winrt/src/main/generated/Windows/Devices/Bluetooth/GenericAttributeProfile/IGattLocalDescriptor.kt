package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IGattLocalDescriptor.ABI::class)
@Signature("{f48ebe06-789d-4a4b-8652-bd017b5d2fc6}")
@Guid("f48ebe06789d4a4b8652bd017b5d2fc6")
@WinRTInterface("f48ebe06789d4a4b8652bd017b5d2fc6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattLocalDescriptor.ByReference::class)
public interface IGattLocalDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_StaticValue(): IBuffer?

  @InterfaceMethod(2)
  public fun get_ReadProtectionLevel(): GattProtectionLevel?

  @InterfaceMethod(3)
  public fun get_WriteProtectionLevel(): GattProtectionLevel?

  @InterfaceMethod(4)
  public fun add_ReadRequested(handler: TypedEventHandler<GattLocalDescriptor?,
      GattReadRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ReadRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_WriteRequested(handler: TypedEventHandler<GattLocalDescriptor?,
      GattWriteRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_WriteRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattLocalDescriptor> {
    public override fun getValue() = ABI.makeIGattLocalDescriptor(pointer.getPointer(0))

    public fun setValue(value: IGattLocalDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattLocalDescriptor {
    public val __932135137_Ptr: Pointer?

    public val _932135137_VtblPtr: Pointer?
      get() = __932135137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _932135137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__932135137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StaticValue(): IBuffer? {
      val fnPtr = _932135137_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__932135137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ReadProtectionLevel(): GattProtectionLevel? {
      val fnPtr = _932135137_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__932135137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_WriteProtectionLevel(): GattProtectionLevel? {
      val fnPtr = _932135137_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__932135137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_ReadRequested(handler: TypedEventHandler<GattLocalDescriptor?,
        GattReadRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _932135137_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__932135137_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ReadRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _932135137_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932135137_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_WriteRequested(handler: TypedEventHandler<GattLocalDescriptor?,
        GattWriteRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _932135137_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__932135137_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_WriteRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _932135137_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932135137_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGattLocalDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __932135137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattLocalDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f48ebe06789d4a4b8652bd017b5d2fc6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattLocalDescriptor(ptr: Pointer?): WithDefault = IGattLocalDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattLocalDescriptor {
      val address = segment.toRawLongValue()
      return makeIGattLocalDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IGattLocalDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__932135137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattLocalDescriptor): Array<IGattLocalDescriptor?> =
        (elements as
        Array<IGattLocalDescriptor?>).castToImpl<IGattLocalDescriptor,IGattLocalDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattLocalDescriptor?> =
        arrayOfNulls<IGattLocalDescriptor_Impl>(size) as Array<IGattLocalDescriptor?>
  }
}
