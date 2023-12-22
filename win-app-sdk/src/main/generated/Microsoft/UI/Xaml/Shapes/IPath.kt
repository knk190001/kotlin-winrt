package Microsoft.UI.Xaml.Shapes

import Microsoft.UI.Xaml.Media.Geometry
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

@ABIMarker(IPath.ABI::class)
@Signature("{757d1cd8-0ec0-55c5-b400-66657e493e78}")
@Guid("757d1cd80ec055c5b40066657e493e78")
@WinRTInterface("757d1cd80ec055c5b40066657e493e78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPath.ByReference::class)
public interface IPath : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Data(): Geometry?

  @InterfaceMethod(1)
  public fun put_Data(value: Geometry?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPath> {
    public override fun getValue() = ABI.makeIPath(pointer.getPointer(0))

    public fun setValue(value: IPath_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPath {
    public val __855368368_Ptr: Pointer?

    public val _855368368_VtblPtr: Pointer?
      get() = __855368368_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Data(): Geometry? {
      val fnPtr = _855368368_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geometry>()
      val hr = fn.invokeHR(arrayOf(__855368368_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geometry>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Data(value: Geometry?): Unit {
      val fnPtr = _855368368_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__855368368_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPath_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __855368368_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPath, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("757d1cd80ec055c5b40066657e493e78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPath(ptr: Pointer?): WithDefault = IPath_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPath {
      val address = segment.toRawLongValue()
      return makeIPath(Pointer(address))
    }

    public override fun toNative(obj: IPath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__855368368_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPath): Array<IPath?> = (elements as
        Array<IPath?>).castToImpl<IPath,IPath_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPath?> = arrayOfNulls<IPath_Impl>(size) as
        Array<IPath?>
  }
}
