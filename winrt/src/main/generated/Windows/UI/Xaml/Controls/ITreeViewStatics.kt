package Windows.UI.Xaml.Controls

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

@ABIMarker(ITreeViewStatics.ABI::class)
@Signature("{ef913e08-83f2-4e16-bfb1-1577b98355f5}")
@Guid("ef913e0883f24e16bfb11577b98355f5")
@WinRTInterface("ef913e0883f24e16bfb11577b98355f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewStatics.ByReference::class)
public interface ITreeViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionModeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewStatics> {
    public override fun getValue() = ABI.makeITreeViewStatics(pointer.getPointer(0))

    public fun setValue(value: ITreeViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewStatics {
    public val __455989062_Ptr: Pointer?

    public val _455989062_VtblPtr: Pointer?
      get() = __455989062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionModeProperty(): DependencyProperty? {
      val fnPtr = _455989062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__455989062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __455989062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef913e0883f24e16bfb11577b98355f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewStatics(ptr: Pointer?): WithDefault = ITreeViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewStatics {
      val address = segment.toRawLongValue()
      return makeITreeViewStatics(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__455989062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewStatics): Array<ITreeViewStatics?> = (elements as
        Array<ITreeViewStatics?>).castToImpl<ITreeViewStatics,ITreeViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewStatics?> =
        arrayOfNulls<ITreeViewStatics_Impl>(size) as Array<ITreeViewStatics?>
  }
}
