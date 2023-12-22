package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.Animation.NavigationTransitionInfo
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

@ABIMarker(IFrame3.ABI::class)
@Signature("{648a2b4d-53ca-4b5a-aa8e-3cc7440f4a67}")
@Guid("648a2b4d53ca4b5aaa8e3cc7440f4a67")
@WinRTInterface("648a2b4d53ca4b5aaa8e3cc7440f4a67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrame3.ByReference::class)
public interface IFrame3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GoBack(transitionInfoOverride: NavigationTransitionInfo?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFrame3> {
    public override fun getValue() = ABI.makeIFrame3(pointer.getPointer(0))

    public fun setValue(value: IFrame3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrame3 {
    public val __368728962_Ptr: Pointer?

    public val _368728962_VtblPtr: Pointer?
      get() = __368728962_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GoBack(transitionInfoOverride: NavigationTransitionInfo?): Unit {
      val fnPtr = _368728962_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__368728962_Ptr, marshalToNative(transitionInfoOverride),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrame3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __368728962_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrame3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("648a2b4d53ca4b5aaa8e3cc7440f4a67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrame3(ptr: Pointer?): WithDefault = IFrame3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrame3 {
      val address = segment.toRawLongValue()
      return makeIFrame3(Pointer(address))
    }

    public override fun toNative(obj: IFrame3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__368728962_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrame3): Array<IFrame3?> = (elements as
        Array<IFrame3?>).castToImpl<IFrame3,IFrame3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrame3?> = arrayOfNulls<IFrame3_Impl>(size) as
        Array<IFrame3?>
  }
}
