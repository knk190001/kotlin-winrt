package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IScrollingZoomOptions.ABI::class)
@Signature("{e4ace0b2-9b0c-5eda-88a2-c31b1b84f829}")
@Guid("e4ace0b29b0c5eda88a2c31b1b84f829")
@WinRTInterface("e4ace0b29b0c5eda88a2c31b1b84f829")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollingZoomOptions.ByReference::class)
public interface IScrollingZoomOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnimationMode(): ScrollingAnimationMode?

  @InterfaceMethod(1)
  public fun put_AnimationMode(value: ScrollingAnimationMode?): Unit

  @InterfaceMethod(2)
  public fun get_SnapPointsMode(): ScrollingSnapPointsMode?

  @InterfaceMethod(3)
  public fun put_SnapPointsMode(value: ScrollingSnapPointsMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollingZoomOptions> {
    public override fun getValue() = ABI.makeIScrollingZoomOptions(pointer.getPointer(0))

    public fun setValue(value: IScrollingZoomOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollingZoomOptions {
    public val __987620957_Ptr: Pointer?

    public val _987620957_VtblPtr: Pointer?
      get() = __987620957_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnimationMode(): ScrollingAnimationMode? {
      val fnPtr = _987620957_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingAnimationMode>()
      val hr = fn.invokeHR(arrayOf(__987620957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingAnimationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AnimationMode(value: ScrollingAnimationMode?): Unit {
      val fnPtr = _987620957_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987620957_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SnapPointsMode(): ScrollingSnapPointsMode? {
      val fnPtr = _987620957_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingSnapPointsMode>()
      val hr = fn.invokeHR(arrayOf(__987620957_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingSnapPointsMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SnapPointsMode(value: ScrollingSnapPointsMode?): Unit {
      val fnPtr = _987620957_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987620957_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollingZoomOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __987620957_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollingZoomOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4ace0b29b0c5eda88a2c31b1b84f829")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollingZoomOptions(ptr: Pointer?): WithDefault =
        IScrollingZoomOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollingZoomOptions {
      val address = segment.toRawLongValue()
      return makeIScrollingZoomOptions(Pointer(address))
    }

    public override fun toNative(obj: IScrollingZoomOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__987620957_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollingZoomOptions): Array<IScrollingZoomOptions?> =
        (elements as
        Array<IScrollingZoomOptions?>).castToImpl<IScrollingZoomOptions,IScrollingZoomOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollingZoomOptions?> =
        arrayOfNulls<IScrollingZoomOptions_Impl>(size) as Array<IScrollingZoomOptions?>
  }
}
