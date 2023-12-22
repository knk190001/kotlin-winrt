package Windows.Devices.Usb

import Windows.Foundation.IReference
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbDeviceClass.ABI::class)
@Signature("{051942f9-845e-47eb-b12a-38f2f617afe7}")
@Guid("051942f9845e47ebb12a38f2f617afe7")
@WinRTInterface("051942f9845e47ebb12a38f2f617afe7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbDeviceClass.ByReference::class)
public interface IUsbDeviceClass : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClassCode(): Byte

  @InterfaceMethod(1)
  public fun put_ClassCode(value: Byte): Unit

  @InterfaceMethod(2)
  public fun get_SubclassCode(): IReference<Byte>?

  @InterfaceMethod(3)
  public fun put_SubclassCode(value: IReference<Byte>?): Unit

  @InterfaceMethod(4)
  public fun get_ProtocolCode(): IReference<Byte>?

  @InterfaceMethod(5)
  public fun put_ProtocolCode(value: IReference<Byte>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbDeviceClass> {
    public override fun getValue() = ABI.makeIUsbDeviceClass(pointer.getPointer(0))

    public fun setValue(value: IUsbDeviceClass_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbDeviceClass {
    public val __567250273_Ptr: Pointer?

    public val _567250273_VtblPtr: Pointer?
      get() = __567250273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClassCode(): Byte {
      val fnPtr = _567250273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__567250273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ClassCode(value: Byte): Unit {
      val fnPtr = _567250273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__567250273_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SubclassCode(): IReference<Byte>? {
      val fnPtr = _567250273_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Byte>>()
      val hr = fn.invokeHR(arrayOf(__567250273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Byte>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SubclassCode(value: IReference<Byte>?): Unit {
      val fnPtr = _567250273_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__567250273_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ProtocolCode(): IReference<Byte>? {
      val fnPtr = _567250273_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Byte>>()
      val hr = fn.invokeHR(arrayOf(__567250273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Byte>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ProtocolCode(value: IReference<Byte>?): Unit {
      val fnPtr = _567250273_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__567250273_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUsbDeviceClass_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __567250273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbDeviceClass, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("051942f9845e47ebb12a38f2f617afe7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbDeviceClass(ptr: Pointer?): WithDefault = IUsbDeviceClass_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbDeviceClass {
      val address = segment.toRawLongValue()
      return makeIUsbDeviceClass(Pointer(address))
    }

    public override fun toNative(obj: IUsbDeviceClass): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__567250273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbDeviceClass): Array<IUsbDeviceClass?> = (elements as
        Array<IUsbDeviceClass?>).castToImpl<IUsbDeviceClass,IUsbDeviceClass_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbDeviceClass?> =
        arrayOfNulls<IUsbDeviceClass_Impl>(size) as Array<IUsbDeviceClass?>
  }
}
