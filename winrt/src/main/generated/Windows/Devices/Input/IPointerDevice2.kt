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

@ABIMarker(IPointerDevice2.ABI::class)
@Signature("{f8a6d2a0-c484-489f-ae3e-30d2ee1ffd3e}")
@Guid("f8a6d2a0c484489fae3e30d2ee1ffd3e")
@WinRTInterface("f8a6d2a0c484489fae3e30d2ee1ffd3e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerDevice2.ByReference::class)
public interface IPointerDevice2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxPointersWithZDistance(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerDevice2> {
    public override fun getValue() = ABI.makeIPointerDevice2(pointer.getPointer(0))

    public fun setValue(value: IPointerDevice2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerDevice2 {
    public val __571323290_Ptr: Pointer?

    public val _571323290_VtblPtr: Pointer?
      get() = __571323290_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxPointersWithZDistance(): WinDef.UINT {
      val fnPtr = _571323290_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__571323290_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPointerDevice2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __571323290_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerDevice2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8a6d2a0c484489fae3e30d2ee1ffd3e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerDevice2(ptr: Pointer?): WithDefault = IPointerDevice2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerDevice2 {
      val address = segment.toRawLongValue()
      return makeIPointerDevice2(Pointer(address))
    }

    public override fun toNative(obj: IPointerDevice2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__571323290_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerDevice2): Array<IPointerDevice2?> = (elements as
        Array<IPointerDevice2?>).castToImpl<IPointerDevice2,IPointerDevice2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerDevice2?> =
        arrayOfNulls<IPointerDevice2_Impl>(size) as Array<IPointerDevice2?>
  }
}
