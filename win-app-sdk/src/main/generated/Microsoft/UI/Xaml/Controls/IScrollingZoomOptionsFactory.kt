package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IScrollingZoomOptionsFactory.ABI::class)
@Signature("{d1c82e57-d5e8-58f5-a2c0-ee70c64143be}")
@Guid("d1c82e57d5e858f5a2c0ee70c64143be")
@WinRTInterface("d1c82e57d5e858f5a2c0ee70c64143be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollingZoomOptionsFactory.ByReference::class)
public interface IScrollingZoomOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    animationMode: ScrollingAnimationMode?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ScrollingZoomOptions?

  @InterfaceMethod(1)
  public fun CreateInstance2(
    animationMode: ScrollingAnimationMode?,
    snapPointsMode: ScrollingSnapPointsMode?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ScrollingZoomOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollingZoomOptionsFactory> {
    public override fun getValue() = ABI.makeIScrollingZoomOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollingZoomOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollingZoomOptionsFactory {
    public val __1875144685_Ptr: Pointer?

    public val _1875144685_VtblPtr: Pointer?
      get() = __1875144685_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      animationMode: ScrollingAnimationMode?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ScrollingZoomOptions? {
      val fnPtr = _1875144685_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingZoomOptions>()
      val hr = fn.invokeHR(arrayOf(__1875144685_Ptr, marshalToNative(animationMode),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingZoomOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstance2(
      animationMode: ScrollingAnimationMode?,
      snapPointsMode: ScrollingSnapPointsMode?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ScrollingZoomOptions? {
      val fnPtr = _1875144685_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingZoomOptions>()
      val hr = fn.invokeHR(arrayOf(__1875144685_Ptr, marshalToNative(animationMode),
          marshalToNative(snapPointsMode), marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingZoomOptions>(result.getValue())
      return resultValue
    }
  }

  public class IScrollingZoomOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1875144685_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollingZoomOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1c82e57d5e858f5a2c0ee70c64143be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollingZoomOptionsFactory(ptr: Pointer?): WithDefault =
        IScrollingZoomOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollingZoomOptionsFactory {
      val address = segment.toRawLongValue()
      return makeIScrollingZoomOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollingZoomOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1875144685_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollingZoomOptionsFactory):
        Array<IScrollingZoomOptionsFactory?> = (elements as
        Array<IScrollingZoomOptionsFactory?>).castToImpl<IScrollingZoomOptionsFactory,IScrollingZoomOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollingZoomOptionsFactory?> =
        arrayOfNulls<IScrollingZoomOptionsFactory_Impl>(size) as
        Array<IScrollingZoomOptionsFactory?>
  }
}
