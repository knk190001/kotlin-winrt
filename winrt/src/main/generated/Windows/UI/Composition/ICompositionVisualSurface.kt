package Windows.UI.Composition

import Windows.Foundation.Numerics.Vector2
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

@ABIMarker(ICompositionVisualSurface.ABI::class)
@Signature("{b224d803-4f6e-4a3f-8cae-3dc1cda74fc6}")
@Guid("b224d8034f6e4a3f8cae3dc1cda74fc6")
@WinRTInterface("b224d8034f6e4a3f8cae3dc1cda74fc6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionVisualSurface.ByReference::class)
public interface ICompositionVisualSurface : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceVisual(): Visual?

  @InterfaceMethod(1)
  public fun put_SourceVisual(value: Visual?): Unit

  @InterfaceMethod(2)
  public fun get_SourceOffset(): Vector2?

  @InterfaceMethod(3)
  public fun put_SourceOffset(value: Vector2?): Unit

  @InterfaceMethod(4)
  public fun get_SourceSize(): Vector2?

  @InterfaceMethod(5)
  public fun put_SourceSize(value: Vector2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionVisualSurface> {
    public override fun getValue() = ABI.makeICompositionVisualSurface(pointer.getPointer(0))

    public fun setValue(value: ICompositionVisualSurface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionVisualSurface {
    public val __589905265_Ptr: Pointer?

    public val _589905265_VtblPtr: Pointer?
      get() = __589905265_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceVisual(): Visual? {
      val fnPtr = _589905265_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__589905265_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SourceVisual(value: Visual?): Unit {
      val fnPtr = _589905265_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__589905265_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SourceOffset(): Vector2? {
      val fnPtr = _589905265_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__589905265_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SourceOffset(value: Vector2?): Unit {
      val fnPtr = _589905265_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__589905265_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SourceSize(): Vector2? {
      val fnPtr = _589905265_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__589905265_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SourceSize(value: Vector2?): Unit {
      val fnPtr = _589905265_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__589905265_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionVisualSurface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __589905265_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionVisualSurface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b224d8034f6e4a3f8cae3dc1cda74fc6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionVisualSurface(ptr: Pointer?): WithDefault =
        ICompositionVisualSurface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionVisualSurface {
      val address = segment.toRawLongValue()
      return makeICompositionVisualSurface(Pointer(address))
    }

    public override fun toNative(obj: ICompositionVisualSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__589905265_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionVisualSurface):
        Array<ICompositionVisualSurface?> = (elements as
        Array<ICompositionVisualSurface?>).castToImpl<ICompositionVisualSurface,ICompositionVisualSurface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionVisualSurface?> =
        arrayOfNulls<ICompositionVisualSurface_Impl>(size) as Array<ICompositionVisualSurface?>
  }
}
