package Windows.System.UserProfile

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdvertisingManagerStatics.ABI::class)
@Signature("{add3468c-a273-48cb-b346-3544522d5581}")
@Guid("add3468ca27348cbb3463544522d5581")
@WinRTInterface("add3468ca27348cbb3463544522d5581")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvertisingManagerStatics.ByReference::class)
public interface IAdvertisingManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AdvertisingId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvertisingManagerStatics> {
    public override fun getValue() = ABI.makeIAdvertisingManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IAdvertisingManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvertisingManagerStatics {
    public val __153431459_Ptr: Pointer?

    public val _153431459_VtblPtr: Pointer?
      get() = __153431459_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AdvertisingId(): String? {
      val fnPtr = _153431459_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__153431459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAdvertisingManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __153431459_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvertisingManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("add3468ca27348cbb3463544522d5581")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvertisingManagerStatics(ptr: Pointer?): WithDefault =
        IAdvertisingManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvertisingManagerStatics {
      val address = segment.toRawLongValue()
      return makeIAdvertisingManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAdvertisingManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__153431459_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvertisingManagerStatics):
        Array<IAdvertisingManagerStatics?> = (elements as
        Array<IAdvertisingManagerStatics?>).castToImpl<IAdvertisingManagerStatics,IAdvertisingManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvertisingManagerStatics?> =
        arrayOfNulls<IAdvertisingManagerStatics_Impl>(size) as Array<IAdvertisingManagerStatics?>
  }
}
