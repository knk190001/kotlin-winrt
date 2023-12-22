package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(IAppInstallManager7.ABI::class)
@Signature("{a5ee7b30-d5e4-49a3-9853-3db03203321d}")
@Guid("a5ee7b30d5e449a398533db03203321d")
@WinRTInterface("a5ee7b30d5e449a398533db03203321d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallManager7.ByReference::class)
public interface IAppInstallManager7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanInstallForAllUsers(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallManager7> {
    public override fun getValue() = ABI.makeIAppInstallManager7(pointer.getPointer(0))

    public fun setValue(value: IAppInstallManager7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallManager7 {
    public val __697290130_Ptr: Pointer?

    public val _697290130_VtblPtr: Pointer?
      get() = __697290130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanInstallForAllUsers(): Boolean {
      val fnPtr = _697290130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__697290130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppInstallManager7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697290130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallManager7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5ee7b30d5e449a398533db03203321d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallManager7(ptr: Pointer?): WithDefault = IAppInstallManager7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallManager7 {
      val address = segment.toRawLongValue()
      return makeIAppInstallManager7(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallManager7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697290130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallManager7): Array<IAppInstallManager7?> =
        (elements as
        Array<IAppInstallManager7?>).castToImpl<IAppInstallManager7,IAppInstallManager7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallManager7?> =
        arrayOfNulls<IAppInstallManager7_Impl>(size) as Array<IAppInstallManager7?>
  }
}
