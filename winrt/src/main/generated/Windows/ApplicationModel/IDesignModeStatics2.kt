package Windows.ApplicationModel

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

@ABIMarker(IDesignModeStatics2.ABI::class)
@Signature("{80cf8137-b064-4858-bec8-3eba22357535}")
@Guid("80cf8137b0644858bec83eba22357535")
@WinRTInterface("80cf8137b0644858bec83eba22357535")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesignModeStatics2.ByReference::class)
public interface IDesignModeStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesignMode2Enabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesignModeStatics2> {
    public override fun getValue() = ABI.makeIDesignModeStatics2(pointer.getPointer(0))

    public fun setValue(value: IDesignModeStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesignModeStatics2 {
    public val __653273683_Ptr: Pointer?

    public val _653273683_VtblPtr: Pointer?
      get() = __653273683_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesignMode2Enabled(): Boolean {
      val fnPtr = _653273683_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__653273683_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDesignModeStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __653273683_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesignModeStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80cf8137b0644858bec83eba22357535")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesignModeStatics2(ptr: Pointer?): WithDefault = IDesignModeStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesignModeStatics2 {
      val address = segment.toRawLongValue()
      return makeIDesignModeStatics2(Pointer(address))
    }

    public override fun toNative(obj: IDesignModeStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__653273683_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesignModeStatics2): Array<IDesignModeStatics2?> =
        (elements as
        Array<IDesignModeStatics2?>).castToImpl<IDesignModeStatics2,IDesignModeStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesignModeStatics2?> =
        arrayOfNulls<IDesignModeStatics2_Impl>(size) as Array<IDesignModeStatics2?>
  }
}
