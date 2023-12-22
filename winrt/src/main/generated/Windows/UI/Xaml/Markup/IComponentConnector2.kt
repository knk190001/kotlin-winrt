package Windows.UI.Xaml.Markup

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

@ABIMarker(IComponentConnector2.ABI::class)
@Signature("{dc8f368b-eccc-498e-b139-91142254d7ae}")
@Guid("dc8f368beccc498eb13991142254d7ae")
@WinRTInterface("dc8f368beccc498eb13991142254d7ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComponentConnector2.ByReference::class)
public interface IComponentConnector2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetBindingConnector(connectionId: Int, target: IUnknown?): IComponentConnector?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComponentConnector2> {
    public override fun getValue() = ABI.makeIComponentConnector2(pointer.getPointer(0))

    public fun setValue(value: IComponentConnector2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComponentConnector2 {
    public val __278400776_Ptr: Pointer?

    public val _278400776_VtblPtr: Pointer?
      get() = __278400776_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetBindingConnector(connectionId: Int, target: IUnknown?):
        IComponentConnector? {
      val fnPtr = _278400776_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IComponentConnector>()
      val hr = fn.invokeHR(arrayOf(__278400776_Ptr, connectionId, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IComponentConnector>(result.getValue())
      return resultValue
    }
  }

  public class IComponentConnector2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __278400776_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComponentConnector2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc8f368beccc498eb13991142254d7ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComponentConnector2(ptr: Pointer?): WithDefault = IComponentConnector2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComponentConnector2 {
      val address = segment.toRawLongValue()
      return makeIComponentConnector2(Pointer(address))
    }

    public override fun toNative(obj: IComponentConnector2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__278400776_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComponentConnector2): Array<IComponentConnector2?> =
        (elements as
        Array<IComponentConnector2?>).castToImpl<IComponentConnector2,IComponentConnector2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComponentConnector2?> =
        arrayOfNulls<IComponentConnector2_Impl>(size) as Array<IComponentConnector2?>
  }
}
