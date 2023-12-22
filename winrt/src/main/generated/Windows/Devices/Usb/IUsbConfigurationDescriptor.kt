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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbConfigurationDescriptor.ABI::class)
@Signature("{f2176d92-b442-407a-8207-7d646c0385f3}")
@Guid("f2176d92b442407a82077d646c0385f3")
@WinRTInterface("f2176d92b442407a82077d646c0385f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbConfigurationDescriptor.ByReference::class)
public interface IUsbConfigurationDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConfigurationValue(): Byte

  @InterfaceMethod(1)
  public fun get_MaxPowerMilliamps(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_SelfPowered(): Boolean

  @InterfaceMethod(3)
  public fun get_RemoteWakeup(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbConfigurationDescriptor> {
    public override fun getValue() = ABI.makeIUsbConfigurationDescriptor(pointer.getPointer(0))

    public fun setValue(value: IUsbConfigurationDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbConfigurationDescriptor {
    public val __20097182_Ptr: Pointer?

    public val _20097182_VtblPtr: Pointer?
      get() = __20097182_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConfigurationValue(): Byte {
      val fnPtr = _20097182_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__20097182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MaxPowerMilliamps(): WinDef.UINT {
      val fnPtr = _20097182_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__20097182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SelfPowered(): Boolean {
      val fnPtr = _20097182_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__20097182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_RemoteWakeup(): Boolean {
      val fnPtr = _20097182_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__20097182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IUsbConfigurationDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __20097182_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbConfigurationDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f2176d92b442407a82077d646c0385f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbConfigurationDescriptor(ptr: Pointer?): WithDefault =
        IUsbConfigurationDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbConfigurationDescriptor {
      val address = segment.toRawLongValue()
      return makeIUsbConfigurationDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IUsbConfigurationDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__20097182_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbConfigurationDescriptor):
        Array<IUsbConfigurationDescriptor?> = (elements as
        Array<IUsbConfigurationDescriptor?>).castToImpl<IUsbConfigurationDescriptor,IUsbConfigurationDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbConfigurationDescriptor?> =
        arrayOfNulls<IUsbConfigurationDescriptor_Impl>(size) as Array<IUsbConfigurationDescriptor?>
  }
}
