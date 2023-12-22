package Windows.UI.Xaml.Media.Animation

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDropTargetItemThemeAnimation.ABI::class)
@Signature("{1881c968-1824-462b-87e8-c357212b977b}")
@Guid("1881c9681824462b87e8c357212b977b")
@WinRTInterface("1881c9681824462b87e8c357212b977b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropTargetItemThemeAnimation.ByReference::class)
public interface IDropTargetItemThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetName(): String?

  @InterfaceMethod(1)
  public fun put_TargetName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropTargetItemThemeAnimation> {
    public override fun getValue() = ABI.makeIDropTargetItemThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: IDropTargetItemThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropTargetItemThemeAnimation {
    public val __531743796_Ptr: Pointer?

    public val _531743796_VtblPtr: Pointer?
      get() = __531743796_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetName(): String? {
      val fnPtr = _531743796_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__531743796_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetName(value: String?): Unit {
      val fnPtr = _531743796_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__531743796_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDropTargetItemThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __531743796_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropTargetItemThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1881c9681824462b87e8c357212b977b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropTargetItemThemeAnimation(ptr: Pointer?): WithDefault =
        IDropTargetItemThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropTargetItemThemeAnimation {
      val address = segment.toRawLongValue()
      return makeIDropTargetItemThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: IDropTargetItemThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__531743796_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropTargetItemThemeAnimation):
        Array<IDropTargetItemThemeAnimation?> = (elements as
        Array<IDropTargetItemThemeAnimation?>).castToImpl<IDropTargetItemThemeAnimation,IDropTargetItemThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropTargetItemThemeAnimation?> =
        arrayOfNulls<IDropTargetItemThemeAnimation_Impl>(size) as
        Array<IDropTargetItemThemeAnimation?>
  }
}
