package Windows.Phone.Notification.Management

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBinaryId.ABI::class)
@Signature("{4f0da531-5595-44b4-9181-ce4efa3fc168}")
@Guid("4f0da531559544b49181ce4efa3fc168")
@WinRTInterface("4f0da531559544b49181ce4efa3fc168")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBinaryId.ByReference::class)
public interface IBinaryId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): Byte

  @InterfaceMethod(1)
  public fun get_Length(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBinaryId> {
    public override fun getValue() = ABI.makeIBinaryId(pointer.getPointer(0))

    public fun setValue(value: IBinaryId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBinaryId {
    public val __535006070_Ptr: Pointer?

    public val _535006070_VtblPtr: Pointer?
      get() = __535006070_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): Byte {
      val fnPtr = _535006070_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__535006070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Length(): WinDef.UINT {
      val fnPtr = _535006070_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__535006070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IBinaryId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __535006070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBinaryId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f0da531559544b49181ce4efa3fc168")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBinaryId(ptr: Pointer?): WithDefault = IBinaryId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBinaryId {
      val address = segment.toRawLongValue()
      return makeIBinaryId(Pointer(address))
    }

    public override fun toNative(obj: IBinaryId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__535006070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBinaryId): Array<IBinaryId?> = (elements as
        Array<IBinaryId?>).castToImpl<IBinaryId,IBinaryId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBinaryId?> = arrayOfNulls<IBinaryId_Impl>(size)
        as Array<IBinaryId?>
  }
}
