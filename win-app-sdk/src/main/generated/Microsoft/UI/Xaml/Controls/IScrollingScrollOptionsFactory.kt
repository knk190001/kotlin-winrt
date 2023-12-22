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

@ABIMarker(IScrollingScrollOptionsFactory.ABI::class)
@Signature("{31eb58fe-0f6a-51ec-90db-5ccaa0a288a6}")
@Guid("31eb58fe0f6a51ec90db5ccaa0a288a6")
@WinRTInterface("31eb58fe0f6a51ec90db5ccaa0a288a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollingScrollOptionsFactory.ByReference::class)
public interface IScrollingScrollOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    animationMode: ScrollingAnimationMode?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ScrollingScrollOptions?

  @InterfaceMethod(1)
  public fun CreateInstance2(
    animationMode: ScrollingAnimationMode?,
    snapPointsMode: ScrollingSnapPointsMode?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ScrollingScrollOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollingScrollOptionsFactory> {
    public override fun getValue() = ABI.makeIScrollingScrollOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollingScrollOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollingScrollOptionsFactory {
    public val __1390412263_Ptr: Pointer?

    public val _1390412263_VtblPtr: Pointer?
      get() = __1390412263_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      animationMode: ScrollingAnimationMode?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ScrollingScrollOptions? {
      val fnPtr = _1390412263_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingScrollOptions>()
      val hr = fn.invokeHR(arrayOf(__1390412263_Ptr, marshalToNative(animationMode),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingScrollOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstance2(
      animationMode: ScrollingAnimationMode?,
      snapPointsMode: ScrollingSnapPointsMode?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ScrollingScrollOptions? {
      val fnPtr = _1390412263_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingScrollOptions>()
      val hr = fn.invokeHR(arrayOf(__1390412263_Ptr, marshalToNative(animationMode),
          marshalToNative(snapPointsMode), marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingScrollOptions>(result.getValue())
      return resultValue
    }
  }

  public class IScrollingScrollOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1390412263_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollingScrollOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("31eb58fe0f6a51ec90db5ccaa0a288a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollingScrollOptionsFactory(ptr: Pointer?): WithDefault =
        IScrollingScrollOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollingScrollOptionsFactory {
      val address = segment.toRawLongValue()
      return makeIScrollingScrollOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollingScrollOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1390412263_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollingScrollOptionsFactory):
        Array<IScrollingScrollOptionsFactory?> = (elements as
        Array<IScrollingScrollOptionsFactory?>).castToImpl<IScrollingScrollOptionsFactory,IScrollingScrollOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollingScrollOptionsFactory?> =
        arrayOfNulls<IScrollingScrollOptionsFactory_Impl>(size) as
        Array<IScrollingScrollOptionsFactory?>
  }
}
