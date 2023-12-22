package Windows.Devices.Usb

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

@ABIMarker(IUsbInterfaceDescriptor.ABI::class)
@Signature("{199670c7-b7ee-4f90-8cd5-94a2e257598a}")
@Guid("199670c7b7ee4f908cd594a2e257598a")
@WinRTInterface("199670c7b7ee4f908cd594a2e257598a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbInterfaceDescriptor.ByReference::class)
public interface IUsbInterfaceDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClassCode(): Byte

  @InterfaceMethod(1)
  public fun get_SubclassCode(): Byte

  @InterfaceMethod(2)
  public fun get_ProtocolCode(): Byte

  @InterfaceMethod(3)
  public fun get_AlternateSettingNumber(): Byte

  @InterfaceMethod(4)
  public fun get_InterfaceNumber(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbInterfaceDescriptor> {
    public override fun getValue() = ABI.makeIUsbInterfaceDescriptor(pointer.getPointer(0))

    public fun setValue(value: IUsbInterfaceDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbInterfaceDescriptor {
    public val __500944485_Ptr: Pointer?

    public val _500944485_VtblPtr: Pointer?
      get() = __500944485_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClassCode(): Byte {
      val fnPtr = _500944485_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__500944485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SubclassCode(): Byte {
      val fnPtr = _500944485_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__500944485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ProtocolCode(): Byte {
      val fnPtr = _500944485_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__500944485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_AlternateSettingNumber(): Byte {
      val fnPtr = _500944485_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__500944485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_InterfaceNumber(): Byte {
      val fnPtr = _500944485_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__500944485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IUsbInterfaceDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __500944485_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbInterfaceDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("199670c7b7ee4f908cd594a2e257598a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbInterfaceDescriptor(ptr: Pointer?): WithDefault =
        IUsbInterfaceDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbInterfaceDescriptor {
      val address = segment.toRawLongValue()
      return makeIUsbInterfaceDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IUsbInterfaceDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__500944485_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbInterfaceDescriptor): Array<IUsbInterfaceDescriptor?>
        = (elements as
        Array<IUsbInterfaceDescriptor?>).castToImpl<IUsbInterfaceDescriptor,IUsbInterfaceDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbInterfaceDescriptor?> =
        arrayOfNulls<IUsbInterfaceDescriptor_Impl>(size) as Array<IUsbInterfaceDescriptor?>
  }
}
