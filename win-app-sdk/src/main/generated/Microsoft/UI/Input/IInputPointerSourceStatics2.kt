package Microsoft.UI.Input

import Microsoft.UI.Composition.Visual
import Microsoft.UI.WindowId
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

@ABIMarker(IInputPointerSourceStatics2.ABI::class)
@Signature("{76b37b4a-de02-531a-a9d2-185186159d31}")
@Guid("76b37b4ade02531aa9d2185186159d31")
@WinRTInterface("76b37b4ade02531aa9d2185186159d31")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputPointerSourceStatics2.ByReference::class)
public interface IInputPointerSourceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForVisual(visual: Visual?): InputPointerSource?

  @InterfaceMethod(1)
  public fun GetForWindowId(windowId: WindowId?): InputPointerSource?

  @InterfaceMethod(2)
  public fun RemoveForVisual(visual: Visual?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputPointerSourceStatics2> {
    public override fun getValue() = ABI.makeIInputPointerSourceStatics2(pointer.getPointer(0))

    public fun setValue(value: IInputPointerSourceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputPointerSourceStatics2 {
    public val __674204556_Ptr: Pointer?

    public val _674204556_VtblPtr: Pointer?
      get() = __674204556_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForVisual(visual: Visual?): InputPointerSource? {
      val fnPtr = _674204556_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputPointerSource>()
      val hr = fn.invokeHR(arrayOf(__674204556_Ptr, marshalToNative(visual), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputPointerSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForWindowId(windowId: WindowId?): InputPointerSource? {
      val fnPtr = _674204556_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputPointerSource>()
      val hr = fn.invokeHR(arrayOf(__674204556_Ptr, marshalToNative(windowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputPointerSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RemoveForVisual(visual: Visual?): Unit {
      val fnPtr = _674204556_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__674204556_Ptr, marshalToNative(visual),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputPointerSourceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __674204556_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputPointerSourceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76b37b4ade02531aa9d2185186159d31")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputPointerSourceStatics2(ptr: Pointer?): WithDefault =
        IInputPointerSourceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputPointerSourceStatics2 {
      val address = segment.toRawLongValue()
      return makeIInputPointerSourceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IInputPointerSourceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__674204556_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputPointerSourceStatics2):
        Array<IInputPointerSourceStatics2?> = (elements as
        Array<IInputPointerSourceStatics2?>).castToImpl<IInputPointerSourceStatics2,IInputPointerSourceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputPointerSourceStatics2?> =
        arrayOfNulls<IInputPointerSourceStatics2_Impl>(size) as Array<IInputPointerSourceStatics2?>
  }
}
