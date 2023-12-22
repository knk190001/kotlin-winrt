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

@ABIMarker(IScrollingScrollOptions.ABI::class)
@Signature("{30b2e77b-2553-5b09-b308-b4b06fc8f9af}")
@Guid("30b2e77b25535b09b308b4b06fc8f9af")
@WinRTInterface("30b2e77b25535b09b308b4b06fc8f9af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollingScrollOptions.ByReference::class)
public interface IScrollingScrollOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnimationMode(): ScrollingAnimationMode?

  @InterfaceMethod(1)
  public fun put_AnimationMode(value: ScrollingAnimationMode?): Unit

  @InterfaceMethod(2)
  public fun get_SnapPointsMode(): ScrollingSnapPointsMode?

  @InterfaceMethod(3)
  public fun put_SnapPointsMode(value: ScrollingSnapPointsMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollingScrollOptions> {
    public override fun getValue() = ABI.makeIScrollingScrollOptions(pointer.getPointer(0))

    public fun setValue(value: IScrollingScrollOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollingScrollOptions {
    public val __1400977827_Ptr: Pointer?

    public val _1400977827_VtblPtr: Pointer?
      get() = __1400977827_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnimationMode(): ScrollingAnimationMode? {
      val fnPtr = _1400977827_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingAnimationMode>()
      val hr = fn.invokeHR(arrayOf(__1400977827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingAnimationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AnimationMode(value: ScrollingAnimationMode?): Unit {
      val fnPtr = _1400977827_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1400977827_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SnapPointsMode(): ScrollingSnapPointsMode? {
      val fnPtr = _1400977827_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingSnapPointsMode>()
      val hr = fn.invokeHR(arrayOf(__1400977827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingSnapPointsMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SnapPointsMode(value: ScrollingSnapPointsMode?): Unit {
      val fnPtr = _1400977827_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1400977827_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollingScrollOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1400977827_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollingScrollOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30b2e77b25535b09b308b4b06fc8f9af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollingScrollOptions(ptr: Pointer?): WithDefault =
        IScrollingScrollOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollingScrollOptions {
      val address = segment.toRawLongValue()
      return makeIScrollingScrollOptions(Pointer(address))
    }

    public override fun toNative(obj: IScrollingScrollOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1400977827_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollingScrollOptions): Array<IScrollingScrollOptions?>
        = (elements as
        Array<IScrollingScrollOptions?>).castToImpl<IScrollingScrollOptions,IScrollingScrollOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollingScrollOptions?> =
        arrayOfNulls<IScrollingScrollOptions_Impl>(size) as Array<IScrollingScrollOptions?>
  }
}
