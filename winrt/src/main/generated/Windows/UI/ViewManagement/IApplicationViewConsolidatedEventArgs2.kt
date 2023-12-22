package Windows.UI.ViewManagement

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

@ABIMarker(IApplicationViewConsolidatedEventArgs2.ABI::class)
@Signature("{1c199ecc-6dc1-40f4-afee-07d9ea296430}")
@Guid("1c199ecc6dc140f4afee07d9ea296430")
@WinRTInterface("1c199ecc6dc140f4afee07d9ea296430")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewConsolidatedEventArgs2.ByReference::class)
public interface IApplicationViewConsolidatedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsAppInitiated(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewConsolidatedEventArgs2> {
    public override fun getValue() =
        ABI.makeIApplicationViewConsolidatedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewConsolidatedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewConsolidatedEventArgs2 {
    public val __2084788231_Ptr: Pointer?

    public val _2084788231_VtblPtr: Pointer?
      get() = __2084788231_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsAppInitiated(): Boolean {
      val fnPtr = _2084788231_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2084788231_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IApplicationViewConsolidatedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2084788231_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewConsolidatedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c199ecc6dc140f4afee07d9ea296430")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewConsolidatedEventArgs2(ptr: Pointer?): WithDefault =
        IApplicationViewConsolidatedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewConsolidatedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIApplicationViewConsolidatedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewConsolidatedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2084788231_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewConsolidatedEventArgs2):
        Array<IApplicationViewConsolidatedEventArgs2?> = (elements as
        Array<IApplicationViewConsolidatedEventArgs2?>).castToImpl<IApplicationViewConsolidatedEventArgs2,IApplicationViewConsolidatedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewConsolidatedEventArgs2?> =
        arrayOfNulls<IApplicationViewConsolidatedEventArgs2_Impl>(size) as
        Array<IApplicationViewConsolidatedEventArgs2?>
  }
}
