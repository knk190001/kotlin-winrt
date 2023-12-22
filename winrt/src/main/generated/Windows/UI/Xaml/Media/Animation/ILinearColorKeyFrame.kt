package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(ILinearColorKeyFrame.ABI::class)
@Signature("{66fdb6ef-ac81-4611-b1d2-61f545983f03}")
@Guid("66fdb6efac814611b1d261f545983f03")
@WinRTInterface("66fdb6efac814611b1d261f545983f03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinearColorKeyFrame.ByReference::class)
public interface ILinearColorKeyFrame : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinearColorKeyFrame> {
    public override fun getValue() = ABI.makeILinearColorKeyFrame(pointer.getPointer(0))

    public fun setValue(value: ILinearColorKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinearColorKeyFrame {
    public val __886479898_Ptr: Pointer?

    public val _886479898_VtblPtr: Pointer?
      get() = __886479898_Ptr?.getPointer(0)
  }

  public class ILinearColorKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __886479898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinearColorKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66fdb6efac814611b1d261f545983f03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinearColorKeyFrame(ptr: Pointer?): WithDefault = ILinearColorKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILinearColorKeyFrame {
      val address = segment.toRawLongValue()
      return makeILinearColorKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: ILinearColorKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__886479898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinearColorKeyFrame): Array<ILinearColorKeyFrame?> =
        (elements as
        Array<ILinearColorKeyFrame?>).castToImpl<ILinearColorKeyFrame,ILinearColorKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinearColorKeyFrame?> =
        arrayOfNulls<ILinearColorKeyFrame_Impl>(size) as Array<ILinearColorKeyFrame?>
  }
}
