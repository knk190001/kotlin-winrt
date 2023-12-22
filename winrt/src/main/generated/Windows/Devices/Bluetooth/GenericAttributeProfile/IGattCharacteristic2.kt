package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Devices.Bluetooth.GenericAttributeProfile.IGattCharacteristic.ABI.IID
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IGattCharacteristic2.ABI::class)
@Signature("{ae1ab578-ec06-4764-b780-9835a1d35d6e}")
@Guid("ae1ab578ec064764b7809835a1d35d6e")
@WinRTInterface("ae1ab578ec064764b7809835a1d35d6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristic2.ByReference::class)
public interface IGattCharacteristic2 : NativeMapped, IWinRTInterface, IGattCharacteristic {
  @InterfaceMethod(0)
  public fun get_Service(): GattDeviceService?

  @InterfaceMethod(1)
  public fun GetAllDescriptors(): IVectorView<GattDescriptor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristic2> {
    public override fun getValue() = ABI.makeIGattCharacteristic2(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristic2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristic2, IGattCharacteristic.WithDefault {
    public val __1407380444_Ptr: Pointer?

    public val _1407380444_VtblPtr: Pointer?
      get() = __1407380444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Service(): GattDeviceService? {
      val fnPtr = _1407380444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattDeviceService>()
      val hr = fn.invokeHR(arrayOf(__1407380444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattDeviceService>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAllDescriptors(): IVectorView<GattDescriptor?>? {
      val fnPtr = _1407380444_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattDescriptor?>>()
      val hr = fn.invokeHR(arrayOf(__1407380444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattDescriptor?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristic2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGattCharacteristic {
    public override val __1617168618_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1407380444_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1407380444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristic2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae1ab578ec064764b7809835a1d35d6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristic2(ptr: Pointer?): WithDefault = IGattCharacteristic2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattCharacteristic2 {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristic2(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristic2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1407380444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristic2): Array<IGattCharacteristic2?> =
        (elements as
        Array<IGattCharacteristic2?>).castToImpl<IGattCharacteristic2,IGattCharacteristic2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristic2?> =
        arrayOfNulls<IGattCharacteristic2_Impl>(size) as Array<IGattCharacteristic2?>
  }
}
