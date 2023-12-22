package Microsoft.UI.Input

import Microsoft.UI.Content.ContentIsland
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

@ABIMarker(IInputActivationListenerStatics2.ABI::class)
@Signature("{7ea26120-9636-5292-a7b1-56544ac51a22}")
@Guid("7ea2612096365292a7b156544ac51a22")
@WinRTInterface("7ea2612096365292a7b156544ac51a22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputActivationListenerStatics2.ByReference::class)
public interface IInputActivationListenerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForIsland(island: ContentIsland?): InputActivationListener?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputActivationListenerStatics2> {
    public override fun getValue() = ABI.makeIInputActivationListenerStatics2(pointer.getPointer(0))

    public fun setValue(value: IInputActivationListenerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputActivationListenerStatics2 {
    public val __1069197800_Ptr: Pointer?

    public val _1069197800_VtblPtr: Pointer?
      get() = __1069197800_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForIsland(island: ContentIsland?): InputActivationListener? {
      val fnPtr = _1069197800_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputActivationListener>()
      val hr = fn.invokeHR(arrayOf(__1069197800_Ptr, marshalToNative(island), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputActivationListener>(result.getValue())
      return resultValue
    }
  }

  public class IInputActivationListenerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1069197800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputActivationListenerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ea2612096365292a7b156544ac51a22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputActivationListenerStatics2(ptr: Pointer?): WithDefault =
        IInputActivationListenerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputActivationListenerStatics2 {
      val address = segment.toRawLongValue()
      return makeIInputActivationListenerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IInputActivationListenerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1069197800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputActivationListenerStatics2):
        Array<IInputActivationListenerStatics2?> = (elements as
        Array<IInputActivationListenerStatics2?>).castToImpl<IInputActivationListenerStatics2,IInputActivationListenerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputActivationListenerStatics2?> =
        arrayOfNulls<IInputActivationListenerStatics2_Impl>(size) as
        Array<IInputActivationListenerStatics2?>
  }
}
