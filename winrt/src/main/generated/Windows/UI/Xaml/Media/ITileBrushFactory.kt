package Windows.UI.Xaml.Media

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

@ABIMarker(ITileBrushFactory.ABI::class)
@Signature("{aa159f7c-ed6a-4fb3-b014-b5c7e379a4de}")
@Guid("aa159f7ced6a4fb3b014b5c7e379a4de")
@WinRTInterface("aa159f7ced6a4fb3b014b5c7e379a4de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileBrushFactory.ByReference::class)
public interface ITileBrushFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): TileBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileBrushFactory> {
    public override fun getValue() = ABI.makeITileBrushFactory(pointer.getPointer(0))

    public fun setValue(value: ITileBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileBrushFactory {
    public val __1335613382_Ptr: Pointer?

    public val _1335613382_VtblPtr: Pointer?
      get() = __1335613382_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TileBrush? {
      val fnPtr = _1335613382_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileBrush>()
      val hr = fn.invokeHR(arrayOf(__1335613382_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileBrush>(result.getValue())
      return resultValue
    }
  }

  public class ITileBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1335613382_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa159f7ced6a4fb3b014b5c7e379a4de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileBrushFactory(ptr: Pointer?): WithDefault = ITileBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileBrushFactory {
      val address = segment.toRawLongValue()
      return makeITileBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: ITileBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1335613382_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileBrushFactory): Array<ITileBrushFactory?> = (elements
        as Array<ITileBrushFactory?>).castToImpl<ITileBrushFactory,ITileBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileBrushFactory?> =
        arrayOfNulls<ITileBrushFactory_Impl>(size) as Array<ITileBrushFactory?>
  }
}
