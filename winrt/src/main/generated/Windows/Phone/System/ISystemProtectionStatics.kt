package Windows.Phone.System

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

@ABIMarker(ISystemProtectionStatics.ABI::class)
@Signature("{49c36560-97e1-4d99-8bfb-befeaa6ace6d}")
@Guid("49c3656097e14d998bfbbefeaa6ace6d")
@WinRTInterface("49c3656097e14d998bfbbefeaa6ace6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemProtectionStatics.ByReference::class)
public interface ISystemProtectionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ScreenLocked(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemProtectionStatics> {
    public override fun getValue() = ABI.makeISystemProtectionStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemProtectionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemProtectionStatics {
    public val __1933814862_Ptr: Pointer?

    public val _1933814862_VtblPtr: Pointer?
      get() = __1933814862_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ScreenLocked(): Boolean {
      val fnPtr = _1933814862_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1933814862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISystemProtectionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1933814862_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemProtectionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49c3656097e14d998bfbbefeaa6ace6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemProtectionStatics(ptr: Pointer?): WithDefault =
        ISystemProtectionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemProtectionStatics {
      val address = segment.toRawLongValue()
      return makeISystemProtectionStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemProtectionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1933814862_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemProtectionStatics):
        Array<ISystemProtectionStatics?> = (elements as
        Array<ISystemProtectionStatics?>).castToImpl<ISystemProtectionStatics,ISystemProtectionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemProtectionStatics?> =
        arrayOfNulls<ISystemProtectionStatics_Impl>(size) as Array<ISystemProtectionStatics?>
  }
}
