package Windows.Devices.Usb

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbDescriptor.ABI::class)
@Signature("{0a89f216-5f9d-4874-8904-da9ad3f5528f}")
@Guid("0a89f2165f9d48748904da9ad3f5528f")
@WinRTInterface("0a89f2165f9d48748904da9ad3f5528f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbDescriptor.ByReference::class)
public interface IUsbDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Length(): Byte

  @InterfaceMethod(1)
  public fun get_DescriptorType(): Byte

  @InterfaceMethod(2)
  public fun ReadDescriptorBuffer(buffer: IBuffer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUsbDescriptor>
      {
    public override fun getValue() = ABI.makeIUsbDescriptor(pointer.getPointer(0))

    public fun setValue(value: IUsbDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbDescriptor {
    public val __1962978830_Ptr: Pointer?

    public val _1962978830_VtblPtr: Pointer?
      get() = __1962978830_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Length(): Byte {
      val fnPtr = _1962978830_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1962978830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DescriptorType(): Byte {
      val fnPtr = _1962978830_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1962978830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun ReadDescriptorBuffer(buffer: IBuffer?): Unit {
      val fnPtr = _1962978830_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1962978830_Ptr, marshalToNative(buffer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUsbDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1962978830_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a89f2165f9d48748904da9ad3f5528f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbDescriptor(ptr: Pointer?): WithDefault = IUsbDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbDescriptor {
      val address = segment.toRawLongValue()
      return makeIUsbDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IUsbDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1962978830_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbDescriptor): Array<IUsbDescriptor?> = (elements as
        Array<IUsbDescriptor?>).castToImpl<IUsbDescriptor,IUsbDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbDescriptor?> =
        arrayOfNulls<IUsbDescriptor_Impl>(size) as Array<IUsbDescriptor?>
  }
}
