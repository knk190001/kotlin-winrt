package Windows.Devices.Custom

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

@ABIMarker(IIOControlCode.ABI::class)
@Signature("{0e9559e7-60c8-4375-a761-7f8808066c60}")
@Guid("0e9559e760c84375a7617f8808066c60")
@WinRTInterface("0e9559e760c84375a7617f8808066c60")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIOControlCode.ByReference::class)
public interface IIOControlCode : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AccessMode(): IOControlAccessMode?

  @InterfaceMethod(1)
  public fun get_BufferingMethod(): IOControlBufferingMethod?

  @InterfaceMethod(2)
  public fun get_Function(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_DeviceType(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun get_ControlCode(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IIOControlCode>
      {
    public override fun getValue() = ABI.makeIIOControlCode(pointer.getPointer(0))

    public fun setValue(value: IIOControlCode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIOControlCode {
    public val __7564216_Ptr: Pointer?

    public val _7564216_VtblPtr: Pointer?
      get() = __7564216_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AccessMode(): IOControlAccessMode? {
      val fnPtr = _7564216_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOControlAccessMode>()
      val hr = fn.invokeHR(arrayOf(__7564216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOControlAccessMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BufferingMethod(): IOControlBufferingMethod? {
      val fnPtr = _7564216_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOControlBufferingMethod>()
      val hr = fn.invokeHR(arrayOf(__7564216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOControlBufferingMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Function(): WinDef.USHORT {
      val fnPtr = _7564216_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__7564216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_DeviceType(): WinDef.USHORT {
      val fnPtr = _7564216_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__7564216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ControlCode(): WinDef.UINT {
      val fnPtr = _7564216_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__7564216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IIOControlCode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __7564216_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIOControlCode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e9559e760c84375a7617f8808066c60")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIOControlCode(ptr: Pointer?): WithDefault = IIOControlCode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIOControlCode {
      val address = segment.toRawLongValue()
      return makeIIOControlCode(Pointer(address))
    }

    public override fun toNative(obj: IIOControlCode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__7564216_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIOControlCode): Array<IIOControlCode?> = (elements as
        Array<IIOControlCode?>).castToImpl<IIOControlCode,IIOControlCode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIOControlCode?> =
        arrayOfNulls<IIOControlCode_Impl>(size) as Array<IIOControlCode?>
  }
}
