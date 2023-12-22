package Windows.ApplicationModel.Background

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBackgroundWorkCostStatics.ABI::class)
@Signature("{c740a662-c310-4b82-b3e3-3bcfb9e4c77d}")
@Guid("c740a662c3104b82b3e33bcfb9e4c77d")
@WinRTInterface("c740a662c3104b82b3e33bcfb9e4c77d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundWorkCostStatics.ByReference::class)
public interface IBackgroundWorkCostStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentBackgroundWorkCost(): BackgroundWorkCostValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundWorkCostStatics> {
    public override fun getValue() = ABI.makeIBackgroundWorkCostStatics(pointer.getPointer(0))

    public fun setValue(value: IBackgroundWorkCostStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundWorkCostStatics {
    public val __1620693112_Ptr: Pointer?

    public val _1620693112_VtblPtr: Pointer?
      get() = __1620693112_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentBackgroundWorkCost(): BackgroundWorkCostValue? {
      val fnPtr = _1620693112_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BackgroundWorkCostValue>()
      val hr = fn.invokeHR(arrayOf(__1620693112_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BackgroundWorkCostValue>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundWorkCostStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1620693112_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundWorkCostStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c740a662c3104b82b3e33bcfb9e4c77d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundWorkCostStatics(ptr: Pointer?): WithDefault =
        IBackgroundWorkCostStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundWorkCostStatics {
      val address = segment.toRawLongValue()
      return makeIBackgroundWorkCostStatics(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundWorkCostStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1620693112_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundWorkCostStatics):
        Array<IBackgroundWorkCostStatics?> = (elements as
        Array<IBackgroundWorkCostStatics?>).castToImpl<IBackgroundWorkCostStatics,IBackgroundWorkCostStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundWorkCostStatics?> =
        arrayOfNulls<IBackgroundWorkCostStatics_Impl>(size) as Array<IBackgroundWorkCostStatics?>
  }
}
