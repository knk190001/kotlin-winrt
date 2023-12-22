package Windows.Devices.Input

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

@ABIMarker(IMouseCapabilities.ABI::class)
@Signature("{bca5e023-7dd9-4b6b-9a92-55d43cb38f73}")
@Guid("bca5e0237dd94b6b9a9255d43cb38f73")
@WinRTInterface("bca5e0237dd94b6b9a9255d43cb38f73")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMouseCapabilities.ByReference::class)
public interface IMouseCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MousePresent(): Int

  @InterfaceMethod(1)
  public fun get_VerticalWheelPresent(): Int

  @InterfaceMethod(2)
  public fun get_HorizontalWheelPresent(): Int

  @InterfaceMethod(3)
  public fun get_SwapButtons(): Int

  @InterfaceMethod(4)
  public fun get_NumberOfButtons(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMouseCapabilities> {
    public override fun getValue() = ABI.makeIMouseCapabilities(pointer.getPointer(0))

    public fun setValue(value: IMouseCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMouseCapabilities {
    public val __1095520032_Ptr: Pointer?

    public val _1095520032_VtblPtr: Pointer?
      get() = __1095520032_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MousePresent(): Int {
      val fnPtr = _1095520032_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1095520032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_VerticalWheelPresent(): Int {
      val fnPtr = _1095520032_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1095520032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_HorizontalWheelPresent(): Int {
      val fnPtr = _1095520032_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1095520032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SwapButtons(): Int {
      val fnPtr = _1095520032_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1095520032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_NumberOfButtons(): WinDef.UINT {
      val fnPtr = _1095520032_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1095520032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IMouseCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1095520032_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMouseCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bca5e0237dd94b6b9a9255d43cb38f73")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMouseCapabilities(ptr: Pointer?): WithDefault = IMouseCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMouseCapabilities {
      val address = segment.toRawLongValue()
      return makeIMouseCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IMouseCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1095520032_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMouseCapabilities): Array<IMouseCapabilities?> =
        (elements as
        Array<IMouseCapabilities?>).castToImpl<IMouseCapabilities,IMouseCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMouseCapabilities?> =
        arrayOfNulls<IMouseCapabilities_Impl>(size) as Array<IMouseCapabilities?>
  }
}
