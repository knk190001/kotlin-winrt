package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IBackEaseStatics.ABI::class)
@Signature("{3c70a2ff-a0a0-4786-926c-22321f8f25b7}")
@Guid("3c70a2ffa0a04786926c22321f8f25b7")
@WinRTInterface("3c70a2ffa0a04786926c22321f8f25b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackEaseStatics.ByReference::class)
public interface IBackEaseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AmplitudeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackEaseStatics> {
    public override fun getValue() = ABI.makeIBackEaseStatics(pointer.getPointer(0))

    public fun setValue(value: IBackEaseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackEaseStatics {
    public val __1784834614_Ptr: Pointer?

    public val _1784834614_VtblPtr: Pointer?
      get() = __1784834614_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AmplitudeProperty(): DependencyProperty? {
      val fnPtr = _1784834614_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1784834614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IBackEaseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1784834614_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackEaseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c70a2ffa0a04786926c22321f8f25b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackEaseStatics(ptr: Pointer?): WithDefault = IBackEaseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackEaseStatics {
      val address = segment.toRawLongValue()
      return makeIBackEaseStatics(Pointer(address))
    }

    public override fun toNative(obj: IBackEaseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1784834614_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackEaseStatics): Array<IBackEaseStatics?> = (elements as
        Array<IBackEaseStatics?>).castToImpl<IBackEaseStatics,IBackEaseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackEaseStatics?> =
        arrayOfNulls<IBackEaseStatics_Impl>(size) as Array<IBackEaseStatics?>
  }
}
