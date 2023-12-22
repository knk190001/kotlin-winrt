package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.Foundation.Deferral
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INewWebUIViewCreatedEventArgs.ABI::class)
@Signature("{e8e1b216-be2b-4c9e-85e7-083143ec4be7}")
@Guid("e8e1b216be2b4c9e85e7083143ec4be7")
@WinRTInterface("e8e1b216be2b4c9e85e7083143ec4be7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INewWebUIViewCreatedEventArgs.ByReference::class)
public interface INewWebUIViewCreatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WebUIView(): WebUIView?

  @InterfaceMethod(1)
  public fun get_ActivatedEventArgs(): IActivatedEventArgs?

  @InterfaceMethod(2)
  public fun get_HasPendingNavigate(): Boolean

  @InterfaceMethod(3)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INewWebUIViewCreatedEventArgs> {
    public override fun getValue() = ABI.makeINewWebUIViewCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INewWebUIViewCreatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INewWebUIViewCreatedEventArgs {
    public val __2105389044_Ptr: Pointer?

    public val _2105389044_VtblPtr: Pointer?
      get() = __2105389044_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WebUIView(): WebUIView? {
      val fnPtr = _2105389044_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebUIView>()
      val hr = fn.invokeHR(arrayOf(__2105389044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebUIView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ActivatedEventArgs(): IActivatedEventArgs? {
      val fnPtr = _2105389044_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IActivatedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__2105389044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IActivatedEventArgs>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HasPendingNavigate(): Boolean {
      val fnPtr = _2105389044_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2105389044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _2105389044_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__2105389044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class INewWebUIViewCreatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2105389044_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INewWebUIViewCreatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8e1b216be2b4c9e85e7083143ec4be7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINewWebUIViewCreatedEventArgs(ptr: Pointer?): WithDefault =
        INewWebUIViewCreatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INewWebUIViewCreatedEventArgs {
      val address = segment.toRawLongValue()
      return makeINewWebUIViewCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INewWebUIViewCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2105389044_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INewWebUIViewCreatedEventArgs):
        Array<INewWebUIViewCreatedEventArgs?> = (elements as
        Array<INewWebUIViewCreatedEventArgs?>).castToImpl<INewWebUIViewCreatedEventArgs,INewWebUIViewCreatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INewWebUIViewCreatedEventArgs?> =
        arrayOfNulls<INewWebUIViewCreatedEventArgs_Impl>(size) as
        Array<INewWebUIViewCreatedEventArgs?>
  }
}
