package Windows.UI.Input.Inking.Core

import Windows.Foundation.Numerics.Matrix3x2
import Windows.UI.Input.Inking.InkDrawingAttributes
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

@ABIMarker(ICoreIncrementalInkStrokeFactory.ABI::class)
@Signature("{d7c59f46-8da8-4f70-9751-e53bb6df4596}")
@Guid("d7c59f468da84f709751e53bb6df4596")
@WinRTInterface("d7c59f468da84f709751e53bb6df4596")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreIncrementalInkStrokeFactory.ByReference::class)
public interface ICoreIncrementalInkStrokeFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(drawingAttributes: InkDrawingAttributes?, pointTransform: Matrix3x2?):
      CoreIncrementalInkStroke?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreIncrementalInkStrokeFactory> {
    public override fun getValue() = ABI.makeICoreIncrementalInkStrokeFactory(pointer.getPointer(0))

    public fun setValue(value: ICoreIncrementalInkStrokeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreIncrementalInkStrokeFactory {
    public val __1966524836_Ptr: Pointer?

    public val _1966524836_VtblPtr: Pointer?
      get() = __1966524836_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(drawingAttributes: InkDrawingAttributes?,
        pointTransform: Matrix3x2?): CoreIncrementalInkStroke? {
      val fnPtr = _1966524836_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreIncrementalInkStroke>()
      val hr = fn.invokeHR(arrayOf(__1966524836_Ptr, marshalToNative(drawingAttributes),
          marshalToNative(pointTransform), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreIncrementalInkStroke>(result.getValue())
      return resultValue
    }
  }

  public class ICoreIncrementalInkStrokeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1966524836_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreIncrementalInkStrokeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7c59f468da84f709751e53bb6df4596")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreIncrementalInkStrokeFactory(ptr: Pointer?): WithDefault =
        ICoreIncrementalInkStrokeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreIncrementalInkStrokeFactory {
      val address = segment.toRawLongValue()
      return makeICoreIncrementalInkStrokeFactory(Pointer(address))
    }

    public override fun toNative(obj: ICoreIncrementalInkStrokeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1966524836_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreIncrementalInkStrokeFactory):
        Array<ICoreIncrementalInkStrokeFactory?> = (elements as
        Array<ICoreIncrementalInkStrokeFactory?>).castToImpl<ICoreIncrementalInkStrokeFactory,ICoreIncrementalInkStrokeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreIncrementalInkStrokeFactory?> =
        arrayOfNulls<ICoreIncrementalInkStrokeFactory_Impl>(size) as
        Array<ICoreIncrementalInkStrokeFactory?>
  }
}
