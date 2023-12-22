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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHolographicSpaceStatics3.ABI::class)
@Signature("{3b00de3d-b1a3-4dfe-8e79-fec5909e6df8}")
@Guid("3b00de3db1a34dfe8e79fec5909e6df8")
@WinRTInterface("3b00de3db1a34dfe8e79fec5909e6df8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicSpaceStatics3.ByReference::class)
public interface IHolographicSpaceStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsConfigured(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicSpaceStatics3> {
    public override fun getValue() = ABI.makeIHolographicSpaceStatics3(pointer.getPointer(0))

    public fun setValue(value: IHolographicSpaceStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicSpaceStatics3 {
    public val __2132053881_Ptr: Pointer?

    public val _2132053881_VtblPtr: Pointer?
      get() = __2132053881_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsConfigured(): Boolean {
      val fnPtr = _2132053881_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2132053881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHolographicSpaceStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2132053881_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicSpaceStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b00de3db1a34dfe8e79fec5909e6df8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicSpaceStatics3(ptr: Pointer?): WithDefault =
        IHolographicSpaceStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicSpaceStatics3 {
      val address = segment.toRawLongValue()
      return makeIHolographicSpaceStatics3(Pointer(address))
    }

    public override fun toNative(obj: IHolographicSpaceStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2132053881_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicSpaceStatics3):
        Array<IHolographicSpaceStatics3?> = (elements as
        Array<IHolographicSpaceStatics3?>).castToImpl<IHolographicSpaceStatics3,IHolographicSpaceStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicSpaceStatics3?> =
        arrayOfNulls<IHolographicSpaceStatics3_Impl>(size) as Array<IHolographicSpaceStatics3?>
  }
}
