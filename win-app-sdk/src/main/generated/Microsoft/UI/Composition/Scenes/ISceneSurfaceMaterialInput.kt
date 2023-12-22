package Microsoft.UI.Composition.Scenes

import Microsoft.UI.Composition.CompositionBitmapInterpolationMode
import Microsoft.UI.Composition.ICompositionSurface
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

@ABIMarker(ISceneSurfaceMaterialInput.ABI::class)
@Signature("{b9854b4f-286c-50cd-a734-491a251d5fd3}")
@Guid("b9854b4f286c50cda734491a251d5fd3")
@WinRTInterface("b9854b4f286c50cda734491a251d5fd3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneSurfaceMaterialInput.ByReference::class)
public interface ISceneSurfaceMaterialInput : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BitmapInterpolationMode(): CompositionBitmapInterpolationMode?

  @InterfaceMethod(1)
  public fun put_BitmapInterpolationMode(value: CompositionBitmapInterpolationMode?): Unit

  @InterfaceMethod(2)
  public fun get_Surface(): ICompositionSurface?

  @InterfaceMethod(3)
  public fun put_Surface(value: ICompositionSurface?): Unit

  @InterfaceMethod(4)
  public fun get_WrappingUMode(): SceneWrappingMode?

  @InterfaceMethod(5)
  public fun put_WrappingUMode(value: SceneWrappingMode?): Unit

  @InterfaceMethod(6)
  public fun get_WrappingVMode(): SceneWrappingMode?

  @InterfaceMethod(7)
  public fun put_WrappingVMode(value: SceneWrappingMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneSurfaceMaterialInput> {
    public override fun getValue() = ABI.makeISceneSurfaceMaterialInput(pointer.getPointer(0))

    public fun setValue(value: ISceneSurfaceMaterialInput_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneSurfaceMaterialInput {
    public val __1227452354_Ptr: Pointer?

    public val _1227452354_VtblPtr: Pointer?
      get() = __1227452354_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BitmapInterpolationMode(): CompositionBitmapInterpolationMode? {
      val fnPtr = _1227452354_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBitmapInterpolationMode>()
      val hr = fn.invokeHR(arrayOf(__1227452354_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBitmapInterpolationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BitmapInterpolationMode(value: CompositionBitmapInterpolationMode?):
        Unit {
      val fnPtr = _1227452354_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1227452354_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Surface(): ICompositionSurface? {
      val fnPtr = _1227452354_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICompositionSurface>()
      val hr = fn.invokeHR(arrayOf(__1227452354_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICompositionSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Surface(value: ICompositionSurface?): Unit {
      val fnPtr = _1227452354_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1227452354_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_WrappingUMode(): SceneWrappingMode? {
      val fnPtr = _1227452354_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneWrappingMode>()
      val hr = fn.invokeHR(arrayOf(__1227452354_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneWrappingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_WrappingUMode(value: SceneWrappingMode?): Unit {
      val fnPtr = _1227452354_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1227452354_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_WrappingVMode(): SceneWrappingMode? {
      val fnPtr = _1227452354_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneWrappingMode>()
      val hr = fn.invokeHR(arrayOf(__1227452354_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneWrappingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_WrappingVMode(value: SceneWrappingMode?): Unit {
      val fnPtr = _1227452354_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1227452354_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISceneSurfaceMaterialInput_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1227452354_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneSurfaceMaterialInput, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9854b4f286c50cda734491a251d5fd3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneSurfaceMaterialInput(ptr: Pointer?): WithDefault =
        ISceneSurfaceMaterialInput_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneSurfaceMaterialInput {
      val address = segment.toRawLongValue()
      return makeISceneSurfaceMaterialInput(Pointer(address))
    }

    public override fun toNative(obj: ISceneSurfaceMaterialInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1227452354_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneSurfaceMaterialInput):
        Array<ISceneSurfaceMaterialInput?> = (elements as
        Array<ISceneSurfaceMaterialInput?>).castToImpl<ISceneSurfaceMaterialInput,ISceneSurfaceMaterialInput_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneSurfaceMaterialInput?> =
        arrayOfNulls<ISceneSurfaceMaterialInput_Impl>(size) as Array<ISceneSurfaceMaterialInput?>
  }
}
