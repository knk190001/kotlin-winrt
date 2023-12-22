package Windows.Phone.System.Profile

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

@ABIMarker(IRetailModeStatics.ABI::class)
@Signature("{d7ded029-fdda-43e7-93fb-e53ab6e89ec3}")
@Guid("d7ded029fdda43e793fbe53ab6e89ec3")
@WinRTInterface("d7ded029fdda43e793fbe53ab6e89ec3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRetailModeStatics.ByReference::class)
public interface IRetailModeStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RetailModeEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRetailModeStatics> {
    public override fun getValue() = ABI.makeIRetailModeStatics(pointer.getPointer(0))

    public fun setValue(value: IRetailModeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRetailModeStatics {
    public val __1087812427_Ptr: Pointer?

    public val _1087812427_VtblPtr: Pointer?
      get() = __1087812427_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RetailModeEnabled(): Boolean {
      val fnPtr = _1087812427_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1087812427_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRetailModeStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1087812427_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRetailModeStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7ded029fdda43e793fbe53ab6e89ec3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRetailModeStatics(ptr: Pointer?): WithDefault = IRetailModeStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRetailModeStatics {
      val address = segment.toRawLongValue()
      return makeIRetailModeStatics(Pointer(address))
    }

    public override fun toNative(obj: IRetailModeStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1087812427_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRetailModeStatics): Array<IRetailModeStatics?> =
        (elements as
        Array<IRetailModeStatics?>).castToImpl<IRetailModeStatics,IRetailModeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRetailModeStatics?> =
        arrayOfNulls<IRetailModeStatics_Impl>(size) as Array<IRetailModeStatics?>
  }
}
