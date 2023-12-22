package Windows.Graphics.Holographic

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

@ABIMarker(IHolographicDisplayStatics.ABI::class)
@Signature("{cb374983-e7b0-4841-8355-3ae5b536e9a4}")
@Guid("cb374983e7b0484183553ae5b536e9a4")
@WinRTInterface("cb374983e7b0484183553ae5b536e9a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicDisplayStatics.ByReference::class)
public interface IHolographicDisplayStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): HolographicDisplay?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicDisplayStatics> {
    public override fun getValue() = ABI.makeIHolographicDisplayStatics(pointer.getPointer(0))

    public fun setValue(value: IHolographicDisplayStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicDisplayStatics {
    public val __1473658370_Ptr: Pointer?

    public val _1473658370_VtblPtr: Pointer?
      get() = __1473658370_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): HolographicDisplay? {
      val fnPtr = _1473658370_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicDisplay>()
      val hr = fn.invokeHR(arrayOf(__1473658370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicDisplay>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicDisplayStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1473658370_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicDisplayStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb374983e7b0484183553ae5b536e9a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicDisplayStatics(ptr: Pointer?): WithDefault =
        IHolographicDisplayStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicDisplayStatics {
      val address = segment.toRawLongValue()
      return makeIHolographicDisplayStatics(Pointer(address))
    }

    public override fun toNative(obj: IHolographicDisplayStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1473658370_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicDisplayStatics):
        Array<IHolographicDisplayStatics?> = (elements as
        Array<IHolographicDisplayStatics?>).castToImpl<IHolographicDisplayStatics,IHolographicDisplayStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicDisplayStatics?> =
        arrayOfNulls<IHolographicDisplayStatics_Impl>(size) as Array<IHolographicDisplayStatics?>
  }
}
