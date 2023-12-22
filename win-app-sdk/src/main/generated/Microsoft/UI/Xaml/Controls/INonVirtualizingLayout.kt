package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INonVirtualizingLayout.ABI::class)
@Signature("{0c24defd-f68f-51d9-998e-4cbad48be012}")
@Guid("0c24defdf68f51d9998e4cbad48be012")
@WinRTInterface("0c24defdf68f51d9998e4cbad48be012")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INonVirtualizingLayout.ByReference::class)
public interface INonVirtualizingLayout : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INonVirtualizingLayout> {
    public override fun getValue() = ABI.makeINonVirtualizingLayout(pointer.getPointer(0))

    public fun setValue(value: INonVirtualizingLayout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INonVirtualizingLayout {
    public val __853608970_Ptr: Pointer?

    public val _853608970_VtblPtr: Pointer?
      get() = __853608970_Ptr?.getPointer(0)
  }

  public class INonVirtualizingLayout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __853608970_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INonVirtualizingLayout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c24defdf68f51d9998e4cbad48be012")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINonVirtualizingLayout(ptr: Pointer?): WithDefault =
        INonVirtualizingLayout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INonVirtualizingLayout {
      val address = segment.toRawLongValue()
      return makeINonVirtualizingLayout(Pointer(address))
    }

    public override fun toNative(obj: INonVirtualizingLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__853608970_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INonVirtualizingLayout): Array<INonVirtualizingLayout?> =
        (elements as
        Array<INonVirtualizingLayout?>).castToImpl<INonVirtualizingLayout,INonVirtualizingLayout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INonVirtualizingLayout?> =
        arrayOfNulls<INonVirtualizingLayout_Impl>(size) as Array<INonVirtualizingLayout?>
  }
}
