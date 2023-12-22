package Microsoft.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExpCompositionProjectedShadow.ABI::class)
@Signature("{da7447bf-78a8-5023-b1d5-4eb090d3ce25}")
@Guid("da7447bf78a85023b1d54eb090d3ce25")
@WinRTInterface("da7447bf78a85023b1d54eb090d3ce25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpCompositionProjectedShadow.ByReference::class)
public interface IExpCompositionProjectedShadow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxOpacity(): Float

  @InterfaceMethod(1)
  public fun put_MaxOpacity(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_MinOpacity(): Float

  @InterfaceMethod(3)
  public fun put_MinOpacity(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_OpacityFalloff(): Float

  @InterfaceMethod(5)
  public fun put_OpacityFalloff(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpCompositionProjectedShadow> {
    public override fun getValue() = ABI.makeIExpCompositionProjectedShadow(pointer.getPointer(0))

    public fun setValue(value: IExpCompositionProjectedShadow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpCompositionProjectedShadow {
    public val __1171010510_Ptr: Pointer?

    public val _1171010510_VtblPtr: Pointer?
      get() = __1171010510_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxOpacity(): Float {
      val fnPtr = _1171010510_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1171010510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MaxOpacity(value: Float): Unit {
      val fnPtr = _1171010510_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1171010510_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MinOpacity(): Float {
      val fnPtr = _1171010510_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1171010510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MinOpacity(value: Float): Unit {
      val fnPtr = _1171010510_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1171010510_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OpacityFalloff(): Float {
      val fnPtr = _1171010510_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1171010510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_OpacityFalloff(value: Float): Unit {
      val fnPtr = _1171010510_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1171010510_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExpCompositionProjectedShadow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1171010510_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpCompositionProjectedShadow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da7447bf78a85023b1d54eb090d3ce25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpCompositionProjectedShadow(ptr: Pointer?): WithDefault =
        IExpCompositionProjectedShadow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpCompositionProjectedShadow {
      val address = segment.toRawLongValue()
      return makeIExpCompositionProjectedShadow(Pointer(address))
    }

    public override fun toNative(obj: IExpCompositionProjectedShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1171010510_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpCompositionProjectedShadow):
        Array<IExpCompositionProjectedShadow?> = (elements as
        Array<IExpCompositionProjectedShadow?>).castToImpl<IExpCompositionProjectedShadow,IExpCompositionProjectedShadow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpCompositionProjectedShadow?> =
        arrayOfNulls<IExpCompositionProjectedShadow_Impl>(size) as
        Array<IExpCompositionProjectedShadow?>
  }
}
