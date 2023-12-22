package Microsoft.UI.Composition

import Windows.Graphics.IGeometrySource2D
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

@ABIMarker(ICompositionPathFactory.ABI::class)
@Signature("{87143312-d280-51d2-b75b-5d76ea86c285}")
@Guid("87143312d28051d2b75b5d76ea86c285")
@WinRTInterface("87143312d28051d2b75b5d76ea86c285")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionPathFactory.ByReference::class)
public interface ICompositionPathFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(source: IGeometrySource2D?): CompositionPath?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionPathFactory> {
    public override fun getValue() = ABI.makeICompositionPathFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionPathFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionPathFactory {
    public val __463212428_Ptr: Pointer?

    public val _463212428_VtblPtr: Pointer?
      get() = __463212428_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(source: IGeometrySource2D?): CompositionPath? {
      val fnPtr = _463212428_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionPath>()
      val hr = fn.invokeHR(arrayOf(__463212428_Ptr, marshalToNative(source), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionPath>(result.getValue())
      return resultValue
    }
  }

  public class ICompositionPathFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __463212428_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionPathFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87143312d28051d2b75b5d76ea86c285")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionPathFactory(ptr: Pointer?): WithDefault =
        ICompositionPathFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionPathFactory {
      val address = segment.toRawLongValue()
      return makeICompositionPathFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionPathFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__463212428_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionPathFactory): Array<ICompositionPathFactory?>
        = (elements as
        Array<ICompositionPathFactory?>).castToImpl<ICompositionPathFactory,ICompositionPathFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionPathFactory?> =
        arrayOfNulls<ICompositionPathFactory_Impl>(size) as Array<ICompositionPathFactory?>
  }
}
