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

@ABIMarker(IHolographicFrame3.ABI::class)
@Signature("{e5e964c9-8a27-55d3-9f98-94530d369052}")
@Guid("e5e964c98a2755d39f9894530d369052")
@WinRTInterface("e5e964c98a2755d39f9894530d369052")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicFrame3.ByReference::class)
public interface IHolographicFrame3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): HolographicFrameId?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicFrame3> {
    public override fun getValue() = ABI.makeIHolographicFrame3(pointer.getPointer(0))

    public fun setValue(value: IHolographicFrame3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicFrame3 {
    public val __382971711_Ptr: Pointer?

    public val _382971711_VtblPtr: Pointer?
      get() = __382971711_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): HolographicFrameId? {
      val fnPtr = _382971711_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicFrameId>()
      val hr = fn.invokeHR(arrayOf(__382971711_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicFrameId>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicFrame3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __382971711_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicFrame3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5e964c98a2755d39f9894530d369052")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicFrame3(ptr: Pointer?): WithDefault = IHolographicFrame3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicFrame3 {
      val address = segment.toRawLongValue()
      return makeIHolographicFrame3(Pointer(address))
    }

    public override fun toNative(obj: IHolographicFrame3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__382971711_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicFrame3): Array<IHolographicFrame3?> =
        (elements as
        Array<IHolographicFrame3?>).castToImpl<IHolographicFrame3,IHolographicFrame3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicFrame3?> =
        arrayOfNulls<IHolographicFrame3_Impl>(size) as Array<IHolographicFrame3?>
  }
}
