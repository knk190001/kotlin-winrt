package Windows.UI.Input.Preview

import Windows.UI.Input.InputActivationListener
import Windows.UI.WindowManagement.AppWindow
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

@ABIMarker(IInputActivationListenerPreviewStatics.ABI::class)
@Signature("{f0551ce5-0de6-5be0-a589-f737201a4582}")
@Guid("f0551ce50de65be0a589f737201a4582")
@WinRTInterface("f0551ce50de65be0a589f737201a4582")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputActivationListenerPreviewStatics.ByReference::class)
public interface IInputActivationListenerPreviewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForApplicationWindow(window: AppWindow?): InputActivationListener?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputActivationListenerPreviewStatics> {
    public override fun getValue() =
        ABI.makeIInputActivationListenerPreviewStatics(pointer.getPointer(0))

    public fun setValue(value: IInputActivationListenerPreviewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputActivationListenerPreviewStatics {
    public val __348124797_Ptr: Pointer?

    public val _348124797_VtblPtr: Pointer?
      get() = __348124797_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForApplicationWindow(window: AppWindow?): InputActivationListener? {
      val fnPtr = _348124797_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputActivationListener>()
      val hr = fn.invokeHR(arrayOf(__348124797_Ptr, marshalToNative(window), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputActivationListener>(result.getValue())
      return resultValue
    }
  }

  public class IInputActivationListenerPreviewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __348124797_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputActivationListenerPreviewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0551ce50de65be0a589f737201a4582")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputActivationListenerPreviewStatics(ptr: Pointer?): WithDefault =
        IInputActivationListenerPreviewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputActivationListenerPreviewStatics {
      val address = segment.toRawLongValue()
      return makeIInputActivationListenerPreviewStatics(Pointer(address))
    }

    public override fun toNative(obj: IInputActivationListenerPreviewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__348124797_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputActivationListenerPreviewStatics):
        Array<IInputActivationListenerPreviewStatics?> = (elements as
        Array<IInputActivationListenerPreviewStatics?>).castToImpl<IInputActivationListenerPreviewStatics,IInputActivationListenerPreviewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputActivationListenerPreviewStatics?> =
        arrayOfNulls<IInputActivationListenerPreviewStatics_Impl>(size) as
        Array<IInputActivationListenerPreviewStatics?>
  }
}
