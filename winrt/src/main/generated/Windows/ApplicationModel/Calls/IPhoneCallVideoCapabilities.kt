package Windows.ApplicationModel.Calls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallVideoCapabilities.ABI::class)
@Signature("{02382786-b16a-4fdb-be3b-c4240e13ad0d}")
@Guid("02382786b16a4fdbbe3bc4240e13ad0d")
@WinRTInterface("02382786b16a4fdbbe3bc4240e13ad0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallVideoCapabilities.ByReference::class)
public interface IPhoneCallVideoCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsVideoCallingCapable(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallVideoCapabilities> {
    public override fun getValue() = ABI.makeIPhoneCallVideoCapabilities(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallVideoCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallVideoCapabilities {
    public val __1555988803_Ptr: Pointer?

    public val _1555988803_VtblPtr: Pointer?
      get() = __1555988803_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsVideoCallingCapable(): Boolean {
      val fnPtr = _1555988803_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1555988803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPhoneCallVideoCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1555988803_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallVideoCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02382786b16a4fdbbe3bc4240e13ad0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallVideoCapabilities(ptr: Pointer?): WithDefault =
        IPhoneCallVideoCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallVideoCapabilities {
      val address = segment.toRawLongValue()
      return makeIPhoneCallVideoCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallVideoCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1555988803_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallVideoCapabilities):
        Array<IPhoneCallVideoCapabilities?> = (elements as
        Array<IPhoneCallVideoCapabilities?>).castToImpl<IPhoneCallVideoCapabilities,IPhoneCallVideoCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallVideoCapabilities?> =
        arrayOfNulls<IPhoneCallVideoCapabilities_Impl>(size) as Array<IPhoneCallVideoCapabilities?>
  }
}
