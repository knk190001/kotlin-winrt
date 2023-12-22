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

@ABIMarker(ICompositor6.ABI::class)
@Signature("{5fd20200-c188-5737-b567-5e61741af19c}")
@Guid("5fd20200c1885737b5675e61741af19c")
@WinRTInterface("5fd20200c1885737b5675e61741af19c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositor6.ByReference::class)
public interface ICompositor6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateGeometricClip(): CompositionGeometricClip?

  @InterfaceMethod(1)
  public fun CreateGeometricClip(geometry: CompositionGeometry?): CompositionGeometricClip?

  @InterfaceMethod(2)
  public fun CreateRedirectVisual(): RedirectVisual?

  @InterfaceMethod(3)
  public fun CreateRedirectVisual(source: Visual?): RedirectVisual?

  @InterfaceMethod(4)
  public fun CreateBooleanKeyFrameAnimation(): BooleanKeyFrameAnimation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICompositor6> {
    public override fun getValue() = ABI.makeICompositor6(pointer.getPointer(0))

    public fun setValue(value: ICompositor6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositor6 {
    public val __359760228_Ptr: Pointer?

    public val _359760228_VtblPtr: Pointer?
      get() = __359760228_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateGeometricClip(): CompositionGeometricClip? {
      val fnPtr = _359760228_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGeometricClip>()
      val hr = fn.invokeHR(arrayOf(__359760228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGeometricClip>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateGeometricClip(geometry: CompositionGeometry?):
        CompositionGeometricClip? {
      val fnPtr = _359760228_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionGeometricClip>()
      val hr = fn.invokeHR(arrayOf(__359760228_Ptr, marshalToNative(geometry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionGeometricClip>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateRedirectVisual(): RedirectVisual? {
      val fnPtr = _359760228_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RedirectVisual>()
      val hr = fn.invokeHR(arrayOf(__359760228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RedirectVisual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateRedirectVisual(source: Visual?): RedirectVisual? {
      val fnPtr = _359760228_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RedirectVisual>()
      val hr = fn.invokeHR(arrayOf(__359760228_Ptr, marshalToNative(source), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RedirectVisual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateBooleanKeyFrameAnimation(): BooleanKeyFrameAnimation? {
      val fnPtr = _359760228_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BooleanKeyFrameAnimation>()
      val hr = fn.invokeHR(arrayOf(__359760228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BooleanKeyFrameAnimation>(result.getValue())
      return resultValue
    }
  }

  public class ICompositor6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __359760228_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositor6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5fd20200c1885737b5675e61741af19c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositor6(ptr: Pointer?): WithDefault = ICompositor6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositor6 {
      val address = segment.toRawLongValue()
      return makeICompositor6(Pointer(address))
    }

    public override fun toNative(obj: ICompositor6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__359760228_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositor6): Array<ICompositor6?> = (elements as
        Array<ICompositor6?>).castToImpl<ICompositor6,ICompositor6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositor6?> =
        arrayOfNulls<ICompositor6_Impl>(size) as Array<ICompositor6?>
  }
}
