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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExpCompositionProjectedShadowCaster.ABI::class)
@Signature("{201f3a32-b715-5a3b-af0c-570f1dae4f1b}")
@Guid("201f3a32b7155a3baf0c570f1dae4f1b")
@WinRTInterface("201f3a32b7155a3baf0c570f1dae4f1b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpCompositionProjectedShadowCaster.ByReference::class)
public interface IExpCompositionProjectedShadowCaster : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AncestorClip(): Visual?

  @InterfaceMethod(1)
  public fun put_AncestorClip(value: Visual?): Unit

  @InterfaceMethod(2)
  public fun get_Mask(): CompositionBrush?

  @InterfaceMethod(3)
  public fun put_Mask(value: CompositionBrush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpCompositionProjectedShadowCaster> {
    public override fun getValue() =
        ABI.makeIExpCompositionProjectedShadowCaster(pointer.getPointer(0))

    public fun setValue(value: IExpCompositionProjectedShadowCaster_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpCompositionProjectedShadowCaster {
    public val __1275330302_Ptr: Pointer?

    public val _1275330302_VtblPtr: Pointer?
      get() = __1275330302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AncestorClip(): Visual? {
      val fnPtr = _1275330302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__1275330302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AncestorClip(value: Visual?): Unit {
      val fnPtr = _1275330302_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275330302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Mask(): CompositionBrush? {
      val fnPtr = _1275330302_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__1275330302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Mask(value: CompositionBrush?): Unit {
      val fnPtr = _1275330302_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275330302_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExpCompositionProjectedShadowCaster_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1275330302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpCompositionProjectedShadowCaster, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("201f3a32b7155a3baf0c570f1dae4f1b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpCompositionProjectedShadowCaster(ptr: Pointer?): WithDefault =
        IExpCompositionProjectedShadowCaster_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpCompositionProjectedShadowCaster {
      val address = segment.toRawLongValue()
      return makeIExpCompositionProjectedShadowCaster(Pointer(address))
    }

    public override fun toNative(obj: IExpCompositionProjectedShadowCaster): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1275330302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpCompositionProjectedShadowCaster):
        Array<IExpCompositionProjectedShadowCaster?> = (elements as
        Array<IExpCompositionProjectedShadowCaster?>).castToImpl<IExpCompositionProjectedShadowCaster,IExpCompositionProjectedShadowCaster_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpCompositionProjectedShadowCaster?> =
        arrayOfNulls<IExpCompositionProjectedShadowCaster_Impl>(size) as
        Array<IExpCompositionProjectedShadowCaster?>
  }
}
