package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Input.PointerPoint
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

@ABIMarker(IScrollControllerPanRequestedEventArgsFactory.ABI::class)
@Signature("{c3b0a6c1-6732-5832-be50-4ecade585cbc}")
@Guid("c3b0a6c167325832be504ecade585cbc")
@WinRTInterface("c3b0a6c167325832be504ecade585cbc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollControllerPanRequestedEventArgsFactory.ByReference::class)
public interface IScrollControllerPanRequestedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(pointerPoint: PointerPoint?): ScrollControllerPanRequestedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollControllerPanRequestedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIScrollControllerPanRequestedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollControllerPanRequestedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollControllerPanRequestedEventArgsFactory {
    public val __971559326_Ptr: Pointer?

    public val _971559326_VtblPtr: Pointer?
      get() = __971559326_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(pointerPoint: PointerPoint?):
        ScrollControllerPanRequestedEventArgs? {
      val fnPtr = _971559326_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollControllerPanRequestedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__971559326_Ptr, marshalToNative(pointerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollControllerPanRequestedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IScrollControllerPanRequestedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __971559326_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollControllerPanRequestedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3b0a6c167325832be504ecade585cbc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollControllerPanRequestedEventArgsFactory(ptr: Pointer?): WithDefault =
        IScrollControllerPanRequestedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IScrollControllerPanRequestedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIScrollControllerPanRequestedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollControllerPanRequestedEventArgsFactory): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__971559326_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollControllerPanRequestedEventArgsFactory):
        Array<IScrollControllerPanRequestedEventArgsFactory?> = (elements as
        Array<IScrollControllerPanRequestedEventArgsFactory?>).castToImpl<IScrollControllerPanRequestedEventArgsFactory,IScrollControllerPanRequestedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollControllerPanRequestedEventArgsFactory?> =
        arrayOfNulls<IScrollControllerPanRequestedEventArgsFactory_Impl>(size) as
        Array<IScrollControllerPanRequestedEventArgsFactory?>
  }
}
