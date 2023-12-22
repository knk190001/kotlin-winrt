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

@ABIMarker(IPathKeyFrameAnimation.ABI::class)
@Signature("{2b692808-43da-5118-b66d-904a3ec74fd9}")
@Guid("2b69280843da5118b66d904a3ec74fd9")
@WinRTInterface("2b69280843da5118b66d904a3ec74fd9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathKeyFrameAnimation.ByReference::class)
public interface IPathKeyFrameAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InsertKeyFrame(normalizedProgressKey: Float, path: CompositionPath?): Unit

  @InterfaceMethod(1)
  public fun InsertKeyFrame(
    normalizedProgressKey: Float,
    path: CompositionPath?,
    easingFunction: CompositionEasingFunction?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPathKeyFrameAnimation> {
    public override fun getValue() = ABI.makeIPathKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: IPathKeyFrameAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathKeyFrameAnimation {
    public val __190820536_Ptr: Pointer?

    public val _190820536_VtblPtr: Pointer?
      get() = __190820536_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InsertKeyFrame(normalizedProgressKey: Float, path: CompositionPath?): Unit {
      val fnPtr = _190820536_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__190820536_Ptr, normalizedProgressKey, marshalToNative(path),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InsertKeyFrame(
      normalizedProgressKey: Float,
      path: CompositionPath?,
      easingFunction: CompositionEasingFunction?
    ): Unit {
      val fnPtr = _190820536_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__190820536_Ptr, normalizedProgressKey, marshalToNative(path),
          marshalToNative(easingFunction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPathKeyFrameAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __190820536_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathKeyFrameAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b69280843da5118b66d904a3ec74fd9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathKeyFrameAnimation(ptr: Pointer?): WithDefault =
        IPathKeyFrameAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return makeIPathKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: IPathKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__190820536_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathKeyFrameAnimation): Array<IPathKeyFrameAnimation?> =
        (elements as
        Array<IPathKeyFrameAnimation?>).castToImpl<IPathKeyFrameAnimation,IPathKeyFrameAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathKeyFrameAnimation?> =
        arrayOfNulls<IPathKeyFrameAnimation_Impl>(size) as Array<IPathKeyFrameAnimation?>
  }
}
