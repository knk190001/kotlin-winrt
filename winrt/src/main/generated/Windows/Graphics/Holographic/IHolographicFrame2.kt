package Windows.Graphics.Holographic

import Windows.Graphics.Holographic.IHolographicFrame.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IHolographicFrame2.ABI::class)
@Signature("{283f37bf-3bf2-5e91-6633-870574e6f217}")
@Guid("283f37bf3bf25e916633870574e6f217")
@WinRTInterface("283f37bf3bf25e916633870574e6f217")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicFrame2.ByReference::class)
public interface IHolographicFrame2 : NativeMapped, IWinRTInterface, IHolographicFrame {
  @InterfaceMethod(0)
  public fun GetQuadLayerUpdateParameters(layer: HolographicQuadLayer?):
      HolographicQuadLayerUpdateParameters?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicFrame2> {
    public override fun getValue() = ABI.makeIHolographicFrame2(pointer.getPointer(0))

    public fun setValue(value: IHolographicFrame2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicFrame2, IHolographicFrame.WithDefault {
    public val __382971712_Ptr: Pointer?

    public val _382971712_VtblPtr: Pointer?
      get() = __382971712_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetQuadLayerUpdateParameters(layer: HolographicQuadLayer?):
        HolographicQuadLayerUpdateParameters? {
      val fnPtr = _382971712_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicQuadLayerUpdateParameters>()
      val hr = fn.invokeHR(arrayOf(__382971712_Ptr, marshalToNative(layer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicQuadLayerUpdateParameters>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicFrame2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IHolographicFrame {
    public override val __1927308722_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_382971712_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __382971712_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicFrame2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("283f37bf3bf25e916633870574e6f217")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicFrame2(ptr: Pointer?): WithDefault = IHolographicFrame2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicFrame2 {
      val address = segment.toRawLongValue()
      return makeIHolographicFrame2(Pointer(address))
    }

    public override fun toNative(obj: IHolographicFrame2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__382971712_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicFrame2): Array<IHolographicFrame2?> =
        (elements as
        Array<IHolographicFrame2?>).castToImpl<IHolographicFrame2,IHolographicFrame2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicFrame2?> =
        arrayOfNulls<IHolographicFrame2_Impl>(size) as Array<IHolographicFrame2?>
  }
}
