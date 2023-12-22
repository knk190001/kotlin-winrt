package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.Visual
import Microsoft.UI.Input.PointerPoint
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

@ABIMarker(IVisualInteractionSource.ABI::class)
@Signature("{ea595c95-b9cb-5cd4-bb9c-4934ff329063}")
@Guid("ea595c95b9cb5cd4bb9c4934ff329063")
@WinRTInterface("ea595c95b9cb5cd4bb9c4934ff329063")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualInteractionSource.ByReference::class)
public interface IVisualInteractionSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPositionXRailsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsPositionXRailsEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsPositionYRailsEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsPositionYRailsEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_ManipulationRedirectionMode(): VisualInteractionSourceRedirectionMode?

  @InterfaceMethod(5)
  public fun put_ManipulationRedirectionMode(value: VisualInteractionSourceRedirectionMode?): Unit

  @InterfaceMethod(6)
  public fun get_PositionXChainingMode(): InteractionChainingMode?

  @InterfaceMethod(7)
  public fun put_PositionXChainingMode(value: InteractionChainingMode?): Unit

  @InterfaceMethod(8)
  public fun get_PositionXSourceMode(): InteractionSourceMode?

  @InterfaceMethod(9)
  public fun put_PositionXSourceMode(value: InteractionSourceMode?): Unit

  @InterfaceMethod(10)
  public fun get_PositionYChainingMode(): InteractionChainingMode?

  @InterfaceMethod(11)
  public fun put_PositionYChainingMode(value: InteractionChainingMode?): Unit

  @InterfaceMethod(12)
  public fun get_PositionYSourceMode(): InteractionSourceMode?

  @InterfaceMethod(13)
  public fun put_PositionYSourceMode(value: InteractionSourceMode?): Unit

  @InterfaceMethod(14)
  public fun get_ScaleChainingMode(): InteractionChainingMode?

  @InterfaceMethod(15)
  public fun put_ScaleChainingMode(value: InteractionChainingMode?): Unit

  @InterfaceMethod(16)
  public fun get_ScaleSourceMode(): InteractionSourceMode?

  @InterfaceMethod(17)
  public fun put_ScaleSourceMode(value: InteractionSourceMode?): Unit

  @InterfaceMethod(18)
  public fun get_Source(): Visual?

  @InterfaceMethod(19)
  public fun TryRedirectForManipulation(pointerPoint: PointerPoint?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualInteractionSource> {
    public override fun getValue() = ABI.makeIVisualInteractionSource(pointer.getPointer(0))

    public fun setValue(value: IVisualInteractionSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualInteractionSource {
    public val __1213924739_Ptr: Pointer?

    public val _1213924739_VtblPtr: Pointer?
      get() = __1213924739_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPositionXRailsEnabled(): Boolean {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsPositionXRailsEnabled(value: Boolean): Unit {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsPositionYRailsEnabled(): Boolean {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsPositionYRailsEnabled(value: Boolean): Unit {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ManipulationRedirectionMode(): VisualInteractionSourceRedirectionMode? {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualInteractionSourceRedirectionMode>()
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualInteractionSourceRedirectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override
        fun put_ManipulationRedirectionMode(value: VisualInteractionSourceRedirectionMode?): Unit {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PositionXChainingMode(): InteractionChainingMode? {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionChainingMode>()
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionChainingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PositionXChainingMode(value: InteractionChainingMode?): Unit {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PositionXSourceMode(): InteractionSourceMode? {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionSourceMode>()
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionSourceMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_PositionXSourceMode(value: InteractionSourceMode?): Unit {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_PositionYChainingMode(): InteractionChainingMode? {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionChainingMode>()
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionChainingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_PositionYChainingMode(value: InteractionChainingMode?): Unit {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_PositionYSourceMode(): InteractionSourceMode? {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionSourceMode>()
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionSourceMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_PositionYSourceMode(value: InteractionSourceMode?): Unit {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ScaleChainingMode(): InteractionChainingMode? {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionChainingMode>()
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionChainingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ScaleChainingMode(value: InteractionChainingMode?): Unit {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ScaleSourceMode(): InteractionSourceMode? {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InteractionSourceMode>()
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InteractionSourceMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_ScaleSourceMode(value: InteractionSourceMode?): Unit {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Source(): Visual? {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun TryRedirectForManipulation(pointerPoint: PointerPoint?): Unit {
      val fnPtr = _1213924739_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1213924739_Ptr, marshalToNative(pointerPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualInteractionSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1213924739_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualInteractionSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea595c95b9cb5cd4bb9c4934ff329063")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualInteractionSource(ptr: Pointer?): WithDefault =
        IVisualInteractionSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualInteractionSource {
      val address = segment.toRawLongValue()
      return makeIVisualInteractionSource(Pointer(address))
    }

    public override fun toNative(obj: IVisualInteractionSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1213924739_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualInteractionSource):
        Array<IVisualInteractionSource?> = (elements as
        Array<IVisualInteractionSource?>).castToImpl<IVisualInteractionSource,IVisualInteractionSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualInteractionSource?> =
        arrayOfNulls<IVisualInteractionSource_Impl>(size) as Array<IVisualInteractionSource?>
  }
}
