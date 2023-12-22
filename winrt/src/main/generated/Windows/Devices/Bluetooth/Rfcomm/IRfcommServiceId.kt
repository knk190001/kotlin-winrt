package Windows.Devices.Bluetooth.Rfcomm

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRfcommServiceId.ABI::class)
@Signature("{22629204-7e02-4017-8136-da1b6a1b9bbf}")
@Guid("226292047e0240178136da1b6a1b9bbf")
@WinRTInterface("226292047e0240178136da1b6a1b9bbf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommServiceId.ByReference::class)
public interface IRfcommServiceId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun AsShortId(): WinDef.UINT

  @InterfaceMethod(2)
  public fun AsString(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommServiceId> {
    public override fun getValue() = ABI.makeIRfcommServiceId(pointer.getPointer(0))

    public fun setValue(value: IRfcommServiceId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommServiceId {
    public val __498423613_Ptr: Pointer?

    public val _498423613_VtblPtr: Pointer?
      get() = __498423613_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _498423613_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__498423613_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AsShortId(): WinDef.UINT {
      val fnPtr = _498423613_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__498423613_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun AsString(): String? {
      val fnPtr = _498423613_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__498423613_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRfcommServiceId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __498423613_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommServiceId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("226292047e0240178136da1b6a1b9bbf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommServiceId(ptr: Pointer?): WithDefault = IRfcommServiceId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommServiceId {
      val address = segment.toRawLongValue()
      return makeIRfcommServiceId(Pointer(address))
    }

    public override fun toNative(obj: IRfcommServiceId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__498423613_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommServiceId): Array<IRfcommServiceId?> = (elements as
        Array<IRfcommServiceId?>).castToImpl<IRfcommServiceId,IRfcommServiceId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommServiceId?> =
        arrayOfNulls<IRfcommServiceId_Impl>(size) as Array<IRfcommServiceId?>
  }
}
