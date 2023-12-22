package Windows.UI.Xaml.Controls

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

@ABIMarker(ITreeViewExpandingEventArgs2.ABI::class)
@Signature("{a12f54c3-87b9-5623-9c74-e6dd443cde18}")
@Guid("a12f54c387b956239c74e6dd443cde18")
@WinRTInterface("a12f54c387b956239c74e6dd443cde18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewExpandingEventArgs2.ByReference::class)
public interface ITreeViewExpandingEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Item(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewExpandingEventArgs2> {
    public override fun getValue() = ABI.makeITreeViewExpandingEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ITreeViewExpandingEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewExpandingEventArgs2 {
    public val __155567012_Ptr: Pointer?

    public val _155567012_VtblPtr: Pointer?
      get() = __155567012_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Item(): IUnknown? {
      val fnPtr = _155567012_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__155567012_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewExpandingEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __155567012_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewExpandingEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a12f54c387b956239c74e6dd443cde18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewExpandingEventArgs2(ptr: Pointer?): WithDefault =
        ITreeViewExpandingEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewExpandingEventArgs2 {
      val address = segment.toRawLongValue()
      return makeITreeViewExpandingEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewExpandingEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__155567012_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewExpandingEventArgs2):
        Array<ITreeViewExpandingEventArgs2?> = (elements as
        Array<ITreeViewExpandingEventArgs2?>).castToImpl<ITreeViewExpandingEventArgs2,ITreeViewExpandingEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewExpandingEventArgs2?> =
        arrayOfNulls<ITreeViewExpandingEventArgs2_Impl>(size) as
        Array<ITreeViewExpandingEventArgs2?>
  }
}
