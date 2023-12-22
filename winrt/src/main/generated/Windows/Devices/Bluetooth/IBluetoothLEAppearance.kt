package Windows.Devices.Bluetooth

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

@ABIMarker(IBluetoothLEAppearance.ABI::class)
@Signature("{5d2079f2-66a8-4258-985e-02b4d9509f18}")
@Guid("5d2079f266a84258985e02b4d9509f18")
@WinRTInterface("5d2079f266a84258985e02b4d9509f18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAppearance.ByReference::class)
public interface IBluetoothLEAppearance : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RawValue(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_Category(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_SubCategory(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAppearance> {
    public override fun getValue() = ABI.makeIBluetoothLEAppearance(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAppearance_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAppearance {
    public val __1644799476_Ptr: Pointer?

    public val _1644799476_VtblPtr: Pointer?
      get() = __1644799476_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RawValue(): WinDef.USHORT {
      val fnPtr = _1644799476_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1644799476_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Category(): WinDef.USHORT {
      val fnPtr = _1644799476_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1644799476_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SubCategory(): WinDef.USHORT {
      val fnPtr = _1644799476_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1644799476_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IBluetoothLEAppearance_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1644799476_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAppearance, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d2079f266a84258985e02b4d9509f18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAppearance(ptr: Pointer?): WithDefault =
        IBluetoothLEAppearance_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBluetoothLEAppearance {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAppearance(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAppearance): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1644799476_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAppearance): Array<IBluetoothLEAppearance?> =
        (elements as
        Array<IBluetoothLEAppearance?>).castToImpl<IBluetoothLEAppearance,IBluetoothLEAppearance_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAppearance?> =
        arrayOfNulls<IBluetoothLEAppearance_Impl>(size) as Array<IBluetoothLEAppearance?>
  }
}
